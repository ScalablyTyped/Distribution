package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackRateChangeRequestedEventArgs extends IPlaybackRateChangeRequestedEventArgs

object PlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(rate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
}

