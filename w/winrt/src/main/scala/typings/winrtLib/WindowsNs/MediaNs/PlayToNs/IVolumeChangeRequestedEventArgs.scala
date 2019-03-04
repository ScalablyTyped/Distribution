package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVolumeChangeRequestedEventArgs extends js.Object {
  var volume: scala.Double
}

object IVolumeChangeRequestedEventArgs {
  @scala.inline
  def apply(volume: scala.Double): IVolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume)
  
    __obj.asInstanceOf[IVolumeChangeRequestedEventArgs]
  }
}

