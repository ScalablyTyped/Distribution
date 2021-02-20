package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalTrackOptions extends StObject {
  
  var logLevel: LogLevel | LogLevels = js.native
  
  var name: js.UndefOr[String] = js.native
}
object LocalTrackOptions {
  
  @scala.inline
  def apply(logLevel: LogLevel | LogLevels): LocalTrackOptions = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalTrackOptions]
  }
  
  @scala.inline
  implicit class LocalTrackOptionsMutableBuilder[Self <: LocalTrackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
