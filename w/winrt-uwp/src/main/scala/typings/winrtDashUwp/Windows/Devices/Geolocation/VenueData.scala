package typings.winrtDashUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the venue associated with a geographic location. */
@JSGlobal("Windows.Devices.Geolocation.VenueData")
@js.native
abstract class VenueData () extends js.Object {
  /** Gets the identifier (ID) of the venue. */
  var id: String = js.native
  /** Gets the identifier (ID) of the building level. */
  var level: String = js.native
}

