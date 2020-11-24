package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioPlayerEventMap extends ProxyEventMap {
  
  var change: AudioPlayerChangeEvent = js.native
  
  var complete: AudioPlayerCompleteEvent = js.native
  
  var error: AudioPlayerErrorEvent = js.native
  
  var metadata: AudioPlayerMetadataEvent = js.native
  
  var progress: AudioPlayerProgressEvent = js.native
  
  var seek: AudioPlayerSeekEvent = js.native
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
  
  @scala.inline
  implicit class AudioPlayerEventMapOps[Self <: AudioPlayerEventMap] (val x: Self) extends AnyVal {
    
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
    def setChange(value: AudioPlayerChangeEvent): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: AudioPlayerCompleteEvent): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: AudioPlayerErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: AudioPlayerMetadataEvent): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: AudioPlayerProgressEvent): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: AudioPlayerSeekEvent): Self = this.set("seek", value.asInstanceOf[js.Any])
  }
}
