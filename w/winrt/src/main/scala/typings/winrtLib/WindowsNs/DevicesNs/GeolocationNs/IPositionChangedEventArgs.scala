package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionChangedEventArgs extends js.Object {
  var position: Geoposition
}

object IPositionChangedEventArgs {
  @scala.inline
  def apply(position: Geoposition): IPositionChangedEventArgs = {
    val __obj = js.Dynamic.literal(position = position)
  
    __obj.asInstanceOf[IPositionChangedEventArgs]
  }
}

