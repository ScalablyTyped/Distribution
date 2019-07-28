package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.CompassReading")
@js.native
class CompassReading () extends ICompassReading {
  /* CompleteClass */
  override var headingMagneticNorth: Double = js.native
  /* CompleteClass */
  override var headingTrueNorth: Double = js.native
  /* CompleteClass */
  override var timestamp: Date = js.native
}

