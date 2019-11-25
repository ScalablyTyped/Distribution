package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlaybackRateChangeRequestedEventArgs extends js.Object {
  var rate: Double
}

object IPlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(rate: Double): IPlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlaybackRateChangeRequestedEventArgs]
  }
}

