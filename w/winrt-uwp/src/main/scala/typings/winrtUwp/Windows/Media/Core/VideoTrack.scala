package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video track. */
trait VideoTrack extends js.Object {
  /** Gets or sets the identifier for the video track. */
  var id: String
  /** Gets or sets the label for the video track. */
  var label: String
  /** Gets or sets a string indicating the language of the video track. */
  var language: String
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  var trackKind: MediaTrackKind
}

object VideoTrack {
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): VideoTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTrack]
  }
}

