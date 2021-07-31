package typings.webdriver.WebDriver

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
  
  @scala.inline
  def apply(): LoggingPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingPreferences]
  }
  
  @scala.inline
  implicit class LoggingPreferencesMutableBuilder[Self <: LoggingPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: LoggingPreferenceType): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    @scala.inline
    def setClient(value: LoggingPreferenceType): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setDriver(value: LoggingPreferenceType): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setServer(value: LoggingPreferenceType): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
