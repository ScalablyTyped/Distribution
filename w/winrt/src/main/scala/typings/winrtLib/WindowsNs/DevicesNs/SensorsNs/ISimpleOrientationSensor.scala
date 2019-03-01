package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensor extends js.Object {
  var onorientationchanged: js.Any
  def getCurrentOrientation(): SimpleOrientation
}

object ISimpleOrientationSensor {
  @scala.inline
  def apply(getCurrentOrientation: js.Function0[SimpleOrientation], onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentOrientation")(getCurrentOrientation)
    __obj.updateDynamic("onorientationchanged")(onorientationchanged)
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
}

