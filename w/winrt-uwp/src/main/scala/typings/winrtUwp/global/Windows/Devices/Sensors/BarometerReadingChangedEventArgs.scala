package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the barometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.BarometerReadingChangedEventArgs")
@js.native
abstract class BarometerReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.BarometerReadingChangedEventArgs {
  /** Gets the most recent barometer reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.BarometerReading = js.native
}

