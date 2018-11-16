package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

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

@JSGlobal("Windows.Devices.Sensors.SimpleOrientationSensor")
@js.native
object SimpleOrientationSensor extends js.Object {
  def getDefault(): winrtLib.WindowsNs.DevicesNs.SensorsNs.SimpleOrientationSensor = js.native
}

