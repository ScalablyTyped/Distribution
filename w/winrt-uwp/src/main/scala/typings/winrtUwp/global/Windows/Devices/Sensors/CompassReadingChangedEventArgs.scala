package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the compass reading–changed event. */
@JSGlobal("Windows.Devices.Sensors.CompassReadingChangedEventArgs")
@js.native
abstract class CompassReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.CompassReadingChangedEventArgs {
  /** Gets the current compass reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.CompassReading = js.native
}

