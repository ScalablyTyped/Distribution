package typings
package atUifabricUtilitiesLib.libFabricPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfData extends js.Object {
  var duration: scala.Double
  var timeStamp: scala.Double
}

object IPerfData {
  @scala.inline
  def apply(duration: scala.Double, timeStamp: scala.Double): IPerfData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[IPerfData]
  }
}

