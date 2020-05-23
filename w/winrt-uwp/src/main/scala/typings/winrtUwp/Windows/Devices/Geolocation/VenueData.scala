package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the venue associated with a geographic location. */
trait VenueData extends js.Object {
  /** Gets the identifier (ID) of the venue. */
  var id: String
  /** Gets the identifier (ID) of the building level. */
  var level: String
}

object VenueData {
  @scala.inline
  def apply(id: String, level: String): VenueData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[VenueData]
  }
}

