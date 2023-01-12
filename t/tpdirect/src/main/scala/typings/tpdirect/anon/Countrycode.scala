package typings.tpdirect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countrycode extends StObject {
  
  var country_code: String
}
object Countrycode {
  
  inline def apply(country_code: String): Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countrycode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Countrycode] (val x: Self) extends AnyVal {
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
  }
}
