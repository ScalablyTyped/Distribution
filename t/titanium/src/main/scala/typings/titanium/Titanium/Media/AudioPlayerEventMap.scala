package typings.titanium.Titanium.Media

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
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
  implicit class AudioPlayerEventMapMutableBuilder[Self <: AudioPlayerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: AudioPlayerChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: AudioPlayerCompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: AudioPlayerErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: AudioPlayerMetadataEvent): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: AudioPlayerProgressEvent): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: AudioPlayerSeekEvent): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
  }
}
