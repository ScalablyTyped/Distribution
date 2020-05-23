package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a marker at specific location in a media stream time-line. */
trait PlaybackMediaMarker extends js.Object {
  /** Gets the type of the media marker. */
  var mediaMarkerType: String
  /** Gets the text associated with the marker. */
  var text: String
  /** Gets the offset in the media timeline where the marker occurs. */
  var time: Double
}

object PlaybackMediaMarker {
  @scala.inline
  def apply(mediaMarkerType: String, text: String, time: Double): PlaybackMediaMarker = {
    val __obj = js.Dynamic.literal(mediaMarkerType = mediaMarkerType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarker]
  }
}

