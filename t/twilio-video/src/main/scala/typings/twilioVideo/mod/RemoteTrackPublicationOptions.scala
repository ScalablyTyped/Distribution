package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteTrackPublicationOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels
}
object RemoteTrackPublicationOptions {
  
  inline def apply(logLevel: LogLevel | LogLevels): RemoteTrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteTrackPublicationOptions]
  }
  
  extension [Self <: RemoteTrackPublicationOptions](x: Self) {
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
  }
}
