package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryCode_ extends StObject {
  
  var countryCode: String
  
  var merchantIdentifier: String
}
object CountryCode_ {
  
  inline def apply(countryCode: String, merchantIdentifier: String): CountryCode_ = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], merchantIdentifier = merchantIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryCode_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryCode_] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdentifier(value: String): Self = StObject.set(x, "merchantIdentifier", value.asInstanceOf[js.Any])
  }
}
