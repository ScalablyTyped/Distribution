package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackPublicationOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels = js.native
}
object TrackPublicationOptions {
  
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): TrackPublicationOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackPublicationOptions]
  }
  
  @scala.inline
  implicit class TrackPublicationOptionsMutableBuilder[Self <: TrackPublicationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
  }
}
