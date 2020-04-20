package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensor extends js.Object {
  var onorientationchanged: js.Any
  def getCurrentOrientation(): SimpleOrientation
}

object ISimpleOrientationSensor {
  @scala.inline
  def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
}

