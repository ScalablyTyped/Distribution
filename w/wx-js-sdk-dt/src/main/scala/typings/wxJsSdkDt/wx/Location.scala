package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * 位置精度
    */
  var accuracy: Double
  var latitude: Double
  var longitude: Double
  /**
    * 速度，以米/每秒计
    */
  var speed: Double
}

object Location {
  @scala.inline
  def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

