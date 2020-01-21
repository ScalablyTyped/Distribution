package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the compass reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.CompassReadingChangedEventArgs")
@js.native
abstract class CompassReadingChangedEventArgs () extends js.Object {
  /** Gets the current compass reading. */
  var reading: CompassReading = js.native
}

