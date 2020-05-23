package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the altimeter reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.AltimeterReadingChangedEventArgs")
@js.native
abstract class AltimeterReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.AltimeterReadingChangedEventArgs {
  /** Gets the most recent barometer reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.AltimeterReading = js.native
}

