package typings.xummSdk

import typings.xummSdk.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaRatesResponseMod {
  
  trait RatesResponse extends StObject {
    
    var USD: Double
    
    var XRP: Double
    
    var __meta: Currency
  }
  object RatesResponse {
    
    inline def apply(USD: Double, XRP: Double, __meta: Currency): RatesResponse = {
      val __obj = js.Dynamic.literal(USD = USD.asInstanceOf[js.Any], XRP = XRP.asInstanceOf[js.Any], __meta = __meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatesResponse] (val x: Self) extends AnyVal {
      
      inline def setUSD(value: Double): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
      
      inline def setXRP(value: Double): Self = StObject.set(x, "XRP", value.asInstanceOf[js.Any])
      
      inline def set__meta(value: Currency): Self = StObject.set(x, "__meta", value.asInstanceOf[js.Any])
    }
  }
}
