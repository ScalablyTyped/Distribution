package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * 位置精度
    */
  var accuracy: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  /**
    * 速度，以米/每秒计
    */
  var speed: scala.Double
}

object Location {
  @scala.inline
  def apply(accuracy: scala.Double, latitude: scala.Double, longitude: scala.Double, speed: scala.Double): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("speed")(speed)
    __obj.asInstanceOf[Location]
  }
}

