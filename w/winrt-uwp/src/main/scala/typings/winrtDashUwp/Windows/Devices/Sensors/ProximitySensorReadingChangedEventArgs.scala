package typings.winrtDashUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the reading–changed event of the proximity sensor. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensorReadingChangedEventArgs")
@js.native
abstract class ProximitySensorReadingChangedEventArgs () extends js.Object {
  /** Gets or sets the most recent proximity sensor reading. */
  var reading: ProximitySensorReading = js.native
}

