package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalTrackOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels
  
  var name: js.UndefOr[String] = js.undefined
}
object LocalTrackOptions {
  
  inline def apply(logLevel: LogLevel | LogLevels): LocalTrackOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalTrackOptions]
  }
  
  extension [Self <: LocalTrackOptions](x: Self) {
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
