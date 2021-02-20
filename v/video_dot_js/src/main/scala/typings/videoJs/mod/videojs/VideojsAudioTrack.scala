package typings.videoJs.mod.videojs

import typings.std.SourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideojsAudioTrack extends StObject {
  
  var enabled: Boolean = js.native
  
  val id: String = js.native
  
  var kind: String = js.native
  
  val label: String = js.native
  
  var language: String = js.native
  
  val sourceBuffer: SourceBuffer | Null = js.native
}
object VideojsAudioTrack {
  
  @scala.inline
  def apply(enabled: Boolean, id: String, kind: String, label: String, language: String): VideojsAudioTrack = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
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
