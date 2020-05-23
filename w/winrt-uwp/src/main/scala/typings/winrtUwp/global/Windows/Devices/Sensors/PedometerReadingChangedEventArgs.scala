package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the pedometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.PedometerReadingChangedEventArgs")
@js.native
abstract class PedometerReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.PedometerReadingChangedEventArgs {
  /** Gets the most recent pedometer reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.PedometerReading = js.native
}

