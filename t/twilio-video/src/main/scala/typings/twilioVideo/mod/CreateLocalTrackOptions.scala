package typings.twilioVideo.mod

import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalTrackOptions
  extends StObject
     with MediaTrackConstraints {
  
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var workaroundWebKitBug180748: js.UndefOr[Boolean] = js.undefined
}
object CreateLocalTrackOptions {
  
  inline def apply(): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
  
  extension [Self <: CreateLocalTrackOptions](x: Self) {
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWorkaroundWebKitBug180748(value: Boolean): Self = StObject.set(x, "workaroundWebKitBug180748", value.asInstanceOf[js.Any])
    
    inline def setWorkaroundWebKitBug180748Undefined: Self = StObject.set(x, "workaroundWebKitBug180748", js.undefined)
  }
}
