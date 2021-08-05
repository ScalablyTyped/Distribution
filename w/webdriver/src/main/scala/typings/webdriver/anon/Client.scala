package typings.webdriver.anon

import typings.webdriver.WebDriver.LoggingPreferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var browser: js.UndefOr[LoggingPreferences] = js.undefined
  
  var client: js.UndefOr[LoggingPreferences] = js.undefined
  
  var driver: js.UndefOr[LoggingPreferences] = js.undefined
  
  var server: js.UndefOr[LoggingPreferences] = js.undefined
}
object Client {
  
  inline def apply(): Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setBrowser(value: LoggingPreferences): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setClient(value: LoggingPreferences): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDriver(value: LoggingPreferences): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setServer(value: LoggingPreferences): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
