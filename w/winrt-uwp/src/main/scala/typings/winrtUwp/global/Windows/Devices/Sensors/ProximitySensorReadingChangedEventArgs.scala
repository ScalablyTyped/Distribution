package typings.winrtUwp.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the reading–changed event of the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs")
@js.native
abstract class ProximitySensorReadingChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs {
  /** Gets or sets the most recent proximity sensor reading. */
  /* CompleteClass */
  override var reading: typings.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading = js.native
}

