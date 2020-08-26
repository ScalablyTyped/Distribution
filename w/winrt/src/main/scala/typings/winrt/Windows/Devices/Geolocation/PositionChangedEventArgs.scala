package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionChangedEventArgs extends IPositionChangedEventArgs

object PositionChangedEventArgs {
  @scala.inline
  def apply(position: Geoposition): PositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionChangedEventArgs]
  }
}

