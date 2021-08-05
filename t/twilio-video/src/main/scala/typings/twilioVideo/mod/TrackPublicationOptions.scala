package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackPublicationOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels
}
object TrackPublicationOptions {
  
  inline def apply(logLevel: LogLevel | LogLevels): TrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackPublicationOptions]
  }
  
  extension [Self <: TrackPublicationOptions](x: Self) {
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
  }
}
