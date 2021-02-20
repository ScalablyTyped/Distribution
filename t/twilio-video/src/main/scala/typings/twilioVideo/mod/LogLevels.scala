package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevels extends StObject {
  
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
  implicit class LogLevelsMutableBuilder[Self <: LogLevels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: LogLevel): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: LogLevel): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaling(value: LogLevel): Self = StObject.set(x, "signaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebrtc(value: LogLevel): Self = StObject.set(x, "webrtc", value.asInstanceOf[js.Any])
  }
}
