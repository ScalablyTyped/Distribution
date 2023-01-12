package typings.twilioVideo.tsdefTypesMod

import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalTrackOptions
  extends StObject
     with MediaTrackConstraints {
  
  /**
    * @deprecated
    */
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var workaroundWebKitBug1208516: js.UndefOr[Boolean] = js.undefined
  
  var workaroundWebKitBug180748: js.UndefOr[Boolean] = js.undefined
}
object CreateLocalTrackOptions {
  
  inline def apply(): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocalTrackOptions] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWorkaroundWebKitBug1208516(value: Boolean): Self = StObject.set(x, "workaroundWebKitBug1208516", value.asInstanceOf[js.Any])
    
    inline def setWorkaroundWebKitBug1208516Undefined: Self = StObject.set(x, "workaroundWebKitBug1208516", js.undefined)
    
    inline def setWorkaroundWebKitBug180748(value: Boolean): Self = StObject.set(x, "workaroundWebKitBug180748", value.asInstanceOf[js.Any])
    
    inline def setWorkaroundWebKitBug180748Undefined: Self = StObject.set(x, "workaroundWebKitBug180748", js.undefined)
  }
}
