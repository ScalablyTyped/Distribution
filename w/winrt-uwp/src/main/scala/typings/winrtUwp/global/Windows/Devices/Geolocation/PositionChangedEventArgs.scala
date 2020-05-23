package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PositionChanged event. */
@JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
@js.native
abstract class PositionChangedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.PositionChangedEventArgs {
  /** The location data associated with the PositionChanged event. */
  /* CompleteClass */
  override var position: typings.winrtUwp.Windows.Devices.Geolocation.Geoposition = js.native
}

