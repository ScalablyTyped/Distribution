package typings.videoJs.mod.videojs

import typings.std.SourceBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideojsAudioTrack extends js.Object {
  
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
  implicit class VideojsAudioTrackOps[Self <: VideojsAudioTrack] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuffer(value: SourceBuffer): Self = this.set("sourceBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBufferNull: Self = this.set("sourceBuffer", null)
  }
}
