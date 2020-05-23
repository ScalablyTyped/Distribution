package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PositionChanged event. */
trait PositionChangedEventArgs extends js.Object {
  /** The location data associated with the PositionChanged event. */
  var position: Geoposition
}

object PositionChangedEventArgs {
  @scala.inline
  def apply(position: Geoposition): PositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionChangedEventArgs]
  }
}

