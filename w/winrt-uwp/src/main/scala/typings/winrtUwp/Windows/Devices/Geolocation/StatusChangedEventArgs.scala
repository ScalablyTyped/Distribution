package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for the StatusChanged event. */
trait StatusChangedEventArgs extends js.Object {
  /** The updated status of the Geolocator object. */
  var status: PositionStatus
}

object StatusChangedEventArgs {
  @scala.inline
  def apply(status: PositionStatus): StatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusChangedEventArgs]
  }
}

