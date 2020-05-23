package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a barometer reading. */
@JSGlobal("Windows.Devices.Sensors.BarometerReading")
@js.native
abstract class BarometerReading ()
  extends typings.winrtUwp.Windows.Devices.Sensors.BarometerReading {
  /** Gets the barometric pressure determined by the barometer sensor. */
  /* CompleteClass */
  override var stationPressureInHectopascals: Double = js.native
  /** Gets the time for the most recent barometer reading. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

