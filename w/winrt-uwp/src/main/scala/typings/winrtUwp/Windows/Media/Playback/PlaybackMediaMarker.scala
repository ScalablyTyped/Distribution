package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
@js.native
trait PlaybackMediaMarker extends js.Object {
  /** Gets the type of the media marker. */
  var mediaMarkerType: String = js.native
  /** Gets the text associated with the marker. */
  var text: String = js.native
  /** Gets the offset in the media timeline where the marker occurs. */
  var time: Double = js.native
}

object PlaybackMediaMarker {
  @scala.inline
  def apply(mediaMarkerType: String, text: String, time: Double): PlaybackMediaMarker = {
    val __obj = js.Dynamic.literal(mediaMarkerType = mediaMarkerType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarker]
  }
  @scala.inline
  implicit class PlaybackMediaMarkerOps[Self <: PlaybackMediaMarker] (val x: Self) extends AnyVal {
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
    def setMediaMarkerType(value: String): Self = this.set("mediaMarkerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

