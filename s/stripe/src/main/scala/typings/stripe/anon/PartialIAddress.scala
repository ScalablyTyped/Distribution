package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<stripe.stripe.IAddress> */
trait PartialIAddress extends StObject {
  
  var city: js.UndefOr[String | Null] = js.undefined
  
  var country: js.UndefOr[String | Null] = js.undefined
  
  var line1: js.UndefOr[String] = js.undefined
  
  var line2: js.UndefOr[String | Null] = js.undefined
  
  var postal_code: js.UndefOr[String | Null] = js.undefined
  
  var state: js.UndefOr[String | Null] = js.undefined
}
object PartialIAddress {
  
  inline def apply(): PartialIAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIAddress]
  }
  
  extension [Self <: PartialIAddress](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    inline def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
    
    inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    inline def setLine2Null: Self = StObject.set(x, "line2", null)
    
    inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
