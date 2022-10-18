package typings.twilioVideo

import typings.twilioVideo.tsdefTypesMod.LogLevel
import typings.twilioVideo.tsdefTypesMod.LogLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalTrackOptionsMod {
  
  trait LocalTrackOptions extends StObject {
    
    /**
      * @deprecated
      */
    var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var workaroundWebKitBug1208516: js.UndefOr[Boolean] = js.undefined
  }
  object LocalTrackOptions {
    
    inline def apply(): LocalTrackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalTrackOptions]
    }
    
    extension [Self <: LocalTrackOptions](x: Self) {
      
      inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWorkaroundWebKitBug1208516(value: Boolean): Self = StObject.set(x, "workaroundWebKitBug1208516", value.asInstanceOf[js.Any])
      
      inline def setWorkaroundWebKitBug1208516Undefined: Self = StObject.set(x, "workaroundWebKitBug1208516", js.undefined)
    }
  }
}
