package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfo extends StObject {
  
  /**
    * The country that TV broadcasts. If the value does not exist, undefined is returned
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The country where the Smart service is provided. If the value does not exist, undefined is returned
    */
  var smartServiceCountry: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone that TV broadcasts. If the value does not exist, undefined is returned
    */
  var timezone: js.UndefOr[String] = js.undefined
}
object SystemInfo {
  
  inline def apply(): SystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInfo]
  }
  
  extension [Self <: SystemInfo](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setSmartServiceCountry(value: String): Self = StObject.set(x, "smartServiceCountry", value.asInstanceOf[js.Any])
    
    inline def setSmartServiceCountryUndefined: Self = StObject.set(x, "smartServiceCountry", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
