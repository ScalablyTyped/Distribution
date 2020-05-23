package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackRateChangeRequested event. */
trait PlaybackRateChangeRequestedEventArgs extends js.Object {
  /** Gets the requested playback rate. */
  var requestedPlaybackRate: Double
}

object PlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(requestedPlaybackRate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackRate = requestedPlaybackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
}

