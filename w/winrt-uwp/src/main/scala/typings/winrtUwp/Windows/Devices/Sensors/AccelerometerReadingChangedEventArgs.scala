package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the accelerometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.AccelerometerReadingChangedEventArgs")
@js.native
abstract class AccelerometerReadingChangedEventArgs () extends js.Object {
  /** Gets the most recent accelerometer reading. */
  var reading: AccelerometerReading = js.native
}

