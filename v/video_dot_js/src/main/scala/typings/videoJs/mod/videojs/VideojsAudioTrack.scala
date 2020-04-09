package typings.videoJs.mod.videojs

import typings.std.SourceBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideojsAudioTrack extends js.Object {
  var enabled: Boolean
  val id: String
  var kind: String
  val label: String
  var language: String
  val sourceBuffer: SourceBuffer | Null
}

object VideojsAudioTrack {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: String,
    kind: String,
    label: String,
    language: String,
    sourceBuffer: SourceBuffer = null
  ): VideojsAudioTrack = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    if (sourceBuffer != null) __obj.updateDynamic("sourceBuffer")(sourceBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideojsAudioTrack]
  }
}

