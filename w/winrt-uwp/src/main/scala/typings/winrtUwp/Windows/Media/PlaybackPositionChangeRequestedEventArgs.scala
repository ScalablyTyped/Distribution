package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackPositionChangeRequested event. */
trait PlaybackPositionChangeRequestedEventArgs extends js.Object {
  /** Gets a value indicating the requested offset into the media item. */
  var requestedPlaybackPosition: Double
}

object PlaybackPositionChangeRequestedEventArgs {
  @scala.inline
  def apply(requestedPlaybackPosition: Double): PlaybackPositionChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackPosition = requestedPlaybackPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackPositionChangeRequestedEventArgs]
  }
}

