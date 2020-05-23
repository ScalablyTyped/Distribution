package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track. */
trait AudioTrack extends js.Object {
  /** Gets or sets the identifier for the audio track. */
  var id: String
  /** Gets or sets the label for the audio track. */
  var label: String
  /** Gets or sets a string indicating the language of the audio track. */
  var language: String
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  var trackKind: MediaTrackKind
}

object AudioTrack {
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): AudioTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
}

