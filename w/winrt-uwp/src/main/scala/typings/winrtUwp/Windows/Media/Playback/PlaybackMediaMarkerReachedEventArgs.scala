package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for PlaybackMediaMarkerReached events. */
@js.native
trait PlaybackMediaMarkerReachedEventArgs extends js.Object {
  /** Gets the PlaybackMediaMarker that was reached. */
  var playbackMediaMarker: PlaybackMediaMarker = js.native
}

object PlaybackMediaMarkerReachedEventArgs {
  @scala.inline
  def apply(playbackMediaMarker: PlaybackMediaMarker): PlaybackMediaMarkerReachedEventArgs = {
    val __obj = js.Dynamic.literal(playbackMediaMarker = playbackMediaMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerReachedEventArgs]
  }
  @scala.inline
  implicit class PlaybackMediaMarkerReachedEventArgsOps[Self <: PlaybackMediaMarkerReachedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaybackMediaMarker(value: PlaybackMediaMarker): Self = this.set("playbackMediaMarker", value.asInstanceOf[js.Any])
  }
  
}

