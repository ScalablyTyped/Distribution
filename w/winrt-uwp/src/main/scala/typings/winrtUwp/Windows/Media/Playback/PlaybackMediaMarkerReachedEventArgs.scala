package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for PlaybackMediaMarkerReached events. */
trait PlaybackMediaMarkerReachedEventArgs extends js.Object {
  /** Gets the PlaybackMediaMarker that was reached. */
  var playbackMediaMarker: PlaybackMediaMarker
}

object PlaybackMediaMarkerReachedEventArgs {
  @scala.inline
  def apply(playbackMediaMarker: PlaybackMediaMarker): PlaybackMediaMarkerReachedEventArgs = {
    val __obj = js.Dynamic.literal(playbackMediaMarker = playbackMediaMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerReachedEventArgs]
  }
}

