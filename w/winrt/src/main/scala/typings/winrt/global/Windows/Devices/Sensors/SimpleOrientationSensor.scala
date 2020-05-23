package typings.winrt.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
class SimpleOrientationSensor ()
  extends typings.winrt.Windows.Devices.Sensors.SimpleOrientationSensor {
  /* CompleteClass */
  override var onorientationchanged: js.Any = js.native
  /* CompleteClass */
  override def getCurrentOrientation(): typings.winrt.Windows.Devices.Sensors.SimpleOrientation = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  def getDefault(): typings.winrt.Windows.Devices.Sensors.SimpleOrientationSensor = js.native
}

