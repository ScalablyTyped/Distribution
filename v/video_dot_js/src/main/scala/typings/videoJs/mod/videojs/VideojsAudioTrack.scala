package typings.videoJs.mod.videojs

import typings.std.SourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideojsAudioTrack extends StObject {
  
  var enabled: Boolean
  
  val id: String
  
  var kind: String
  
  val label: String
  
  var language: String
  
  val sourceBuffer: SourceBuffer | Null
}
object VideojsAudioTrack {
  
  @scala.inline
  def apply(enabled: Boolean, id: String, kind: String, label: String, language: String): VideojsAudioTrack = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sourceBuffer = null)
    __obj.asInstanceOf[VideojsAudioTrack]
  }
  
  @scala.inline
  implicit class VideojsAudioTrackMutableBuilder[Self <: VideojsAudioTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuffer(value: SourceBuffer): Self = StObject.set(x, "sourceBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBufferNull: Self = StObject.set(x, "sourceBuffer", null)
  }
}
