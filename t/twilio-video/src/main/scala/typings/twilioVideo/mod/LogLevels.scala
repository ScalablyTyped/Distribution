package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogLevels extends StObject {
  
  var default: LogLevel
  
  var media: LogLevel
  
  var signaling: LogLevel
  
  var webrtc: LogLevel
}
object LogLevels {
  
  inline def apply(default: LogLevel, media: LogLevel, signaling: LogLevel, webrtc: LogLevel): LogLevels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], signaling = signaling.asInstanceOf[js.Any], webrtc = webrtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
  
  extension [Self <: LogLevels](x: Self) {
    
    inline def setDefault(value: LogLevel): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: LogLevel): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setSignaling(value: LogLevel): Self = StObject.set(x, "signaling", value.asInstanceOf[js.Any])
    
    inline def setWebrtc(value: LogLevel): Self = StObject.set(x, "webrtc", value.asInstanceOf[js.Any])
  }
}
