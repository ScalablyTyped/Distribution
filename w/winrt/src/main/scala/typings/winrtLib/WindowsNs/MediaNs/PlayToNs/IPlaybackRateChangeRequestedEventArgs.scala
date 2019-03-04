package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaybackRateChangeRequestedEventArgs extends js.Object {
  var rate: scala.Double
}

object IPlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(rate: scala.Double): IPlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate)
  
    __obj.asInstanceOf[IPlaybackRateChangeRequestedEventArgs]
  }
}

