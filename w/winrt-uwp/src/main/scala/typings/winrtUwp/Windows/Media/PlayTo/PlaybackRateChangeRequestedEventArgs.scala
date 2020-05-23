package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the PlaybackRateChangeRequested event. */
trait PlaybackRateChangeRequestedEventArgs extends js.Object {
  /** Gets the new playback rate. */
  var rate: Double
}

object PlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(rate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
}

