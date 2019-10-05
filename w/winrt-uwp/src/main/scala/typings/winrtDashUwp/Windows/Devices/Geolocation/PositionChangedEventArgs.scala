package typings.winrtDashUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PositionChanged event. */
@JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
@js.native
abstract class PositionChangedEventArgs () extends js.Object {
  /** The location data associated with the PositionChanged event. */
  var position: Geoposition = js.native
}

