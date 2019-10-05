package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
class SimpleOrientationSensor () extends ISimpleOrientationSensor {
  /* CompleteClass */
  override var onorientationchanged: js.Any = js.native
  /* CompleteClass */
  override def getCurrentOrientation(): SimpleOrientation = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  def getDefault(): SimpleOrientationSensor = js.native
}

