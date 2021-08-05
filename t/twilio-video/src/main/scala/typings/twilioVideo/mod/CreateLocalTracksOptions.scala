package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalTracksOptions extends StObject {
  
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}
object CreateLocalTracksOptions {
  
  inline def apply(): CreateLocalTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTracksOptions]
  }
  
  extension [Self <: CreateLocalTracksOptions](x: Self) {
    
    inline def setAudio(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setVideo(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
