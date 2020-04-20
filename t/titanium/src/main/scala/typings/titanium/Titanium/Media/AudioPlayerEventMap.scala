package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayerEventMap extends ProxyEventMap {
  var change: AudioPlayerChangeEvent
  var complete: AudioPlayerCompleteEvent
  var error: AudioPlayerErrorEvent
  var metadata: AudioPlayerMetadataEvent
  var progress: AudioPlayerProgressEvent
  var seek: AudioPlayerSeekEvent
}

object AudioPlayerEventMap {
  @scala.inline
  def apply(
    change: AudioPlayerChangeEvent,
    complete: AudioPlayerCompleteEvent,
    error: AudioPlayerErrorEvent,
    metadata: AudioPlayerMetadataEvent,
    progress: AudioPlayerProgressEvent,
    seek: AudioPlayerSeekEvent
  ): AudioPlayerEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerEventMap]
  }
}

