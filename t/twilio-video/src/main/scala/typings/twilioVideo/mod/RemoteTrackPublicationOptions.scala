package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteTrackPublicationOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels
}
object RemoteTrackPublicationOptions {
  
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): RemoteTrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteTrackPublicationOptions]
  }
  
  @scala.inline
  implicit class RemoteTrackPublicationOptionsMutableBuilder[Self <: RemoteTrackPublicationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
  }
}
