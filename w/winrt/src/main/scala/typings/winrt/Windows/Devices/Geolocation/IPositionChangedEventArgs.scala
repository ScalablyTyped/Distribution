package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionChangedEventArgs extends js.Object {
  var position: Geoposition
}

object IPositionChangedEventArgs {
  @scala.inline
  def apply(position: Geoposition): IPositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPositionChangedEventArgs]
  }
}

