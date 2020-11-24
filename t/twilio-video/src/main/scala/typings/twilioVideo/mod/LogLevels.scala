package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevels extends js.Object {
  
  var default: LogLevel = js.native
  
  var media: LogLevel = js.native
  
  var signaling: LogLevel = js.native
  
  var webrtc: LogLevel = js.native
}
object LogLevels {
  
  @scala.inline
  def apply(default: LogLevel, media: LogLevel, signaling: LogLevel, webrtc: LogLevel): LogLevels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], signaling = signaling.asInstanceOf[js.Any], webrtc = webrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
  
  @scala.inline
  implicit class LogLevelsOps[Self <: LogLevels] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: LogLevel): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: LogLevel): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaling(value: LogLevel): Self = this.set("signaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebrtc(value: LogLevel): Self = this.set("webrtc", value.asInstanceOf[js.Any])
  }
}
