package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the gyrometer reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.GyrometerReadingChangedEventArgs")
@js.native
abstract class GyrometerReadingChangedEventArgs () extends js.Object {
  /** Gets the current gyrometer reading. */
  var reading: GyrometerReading = js.native
}

