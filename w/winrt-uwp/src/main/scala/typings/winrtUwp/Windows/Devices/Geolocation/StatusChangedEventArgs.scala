package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the StatusChanged event. */
@JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
@js.native
abstract class StatusChangedEventArgs () extends js.Object {
  /** The updated status of the Geolocator object. */
  var status: PositionStatus = js.native
}

