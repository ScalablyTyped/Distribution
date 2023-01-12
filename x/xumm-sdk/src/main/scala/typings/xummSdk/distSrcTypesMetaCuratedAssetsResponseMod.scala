package typings.xummSdk

import org.scalablytyped.runtime.StringDictionary
import typings.xummSdk.anon.Currencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaCuratedAssetsResponseMod {
  
  trait CuratedAssetsResponse extends StObject {
    
    var currencies: js.Array[String]
    
    var details: StringDictionary[Currencies]
    
    var issuers: js.Array[String]
  }
  object CuratedAssetsResponse {
    
    inline def apply(currencies: js.Array[String], details: StringDictionary[Currencies], issuers: js.Array[String]): CuratedAssetsResponse = {
      val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], issuers = issuers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CuratedAssetsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CuratedAssetsResponse] (val x: Self) extends AnyVal {
      
      inline def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value*))
      
      inline def setDetails(value: StringDictionary[Currencies]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setIssuers(value: js.Array[String]): Self = StObject.set(x, "issuers", value.asInstanceOf[js.Any])
      
      inline def setIssuersVarargs(value: String*): Self = StObject.set(x, "issuers", js.Array(value*))
    }
  }
}
