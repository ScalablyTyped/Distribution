package typings.twilioVideo.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalTracksOptions extends StObject {
  
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions | CreateLocalAudioTrackOptions] = js.undefined
  
  /**
    * @deprecated
    */
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  
  var loggerName: js.UndefOr[String] = js.undefined
  
  var tracks: js.UndefOr[js.Array[LocalTrack]] = js.undefined
  
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}
object CreateLocalTracksOptions {
  
  inline def apply(): CreateLocalTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTracksOptions]
  }
  
  extension [Self <: CreateLocalTracksOptions](x: Self) {
    
    inline def setAudio(value: Boolean | CreateLocalTrackOptions | CreateLocalAudioTrackOptions): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLoggerName(value: String): Self = StObject.set(x, "loggerName", value.asInstanceOf[js.Any])
    
    inline def setLoggerNameUndefined: Self = StObject.set(x, "loggerName", js.undefined)
    
    inline def setTracks(value: js.Array[LocalTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: LocalTrack*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVideo(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
