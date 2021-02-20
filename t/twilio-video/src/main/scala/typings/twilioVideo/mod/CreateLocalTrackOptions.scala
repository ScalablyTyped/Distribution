package typings.twilioVideo.mod

import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocalTrackOptions extends MediaTrackConstraints {
  
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var workaroundWebKitBug180748: js.UndefOr[Boolean] = js.native
}
object CreateLocalTrackOptions {
  
  @scala.inline
  def apply(): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
  
  @scala.inline
  implicit class CreateLocalTrackOptionsMutableBuilder[Self <: CreateLocalTrackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setWorkaroundWebKitBug180748(value: Boolean): Self = StObject.set(x, "workaroundWebKitBug180748", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkaroundWebKitBug180748Undefined: Self = StObject.set(x, "workaroundWebKitBug180748", js.undefined)
  }
}
