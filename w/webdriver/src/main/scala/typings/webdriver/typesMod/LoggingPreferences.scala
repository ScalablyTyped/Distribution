package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingPreferences extends StObject {
  
  var browser: js.UndefOr[LoggingPreferenceType] = js.undefined
  
  var client: js.UndefOr[LoggingPreferenceType] = js.undefined
  
  var driver: js.UndefOr[LoggingPreferenceType] = js.undefined
  
  var server: js.UndefOr[LoggingPreferenceType] = js.undefined
}
object LoggingPreferences {
  
  inline def apply(): LoggingPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingPreferences]
  }
  
  extension [Self <: LoggingPreferences](x: Self) {
    
    inline def setBrowser(value: LoggingPreferenceType): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setClient(value: LoggingPreferenceType): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDriver(value: LoggingPreferenceType): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setServer(value: LoggingPreferenceType): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
