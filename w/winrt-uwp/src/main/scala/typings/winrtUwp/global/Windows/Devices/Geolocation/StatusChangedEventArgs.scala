package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the StatusChanged event. */
@JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
@js.native
abstract class StatusChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.StatusChangedEventArgs {
  /** The updated status of the Geolocator object. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus = js.native
}

