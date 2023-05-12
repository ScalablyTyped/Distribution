package typings.swellJs

import typings.swellJs.swellJsStrings.checked
import typings.swellJs.swellJsStrings.failed
import typings.swellJs.swellJsStrings.pass
import typings.swellJs.swellJsStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenResponseSnake extends StObject {
  
  var address_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
  
  var brand: js.UndefOr[String] = js.undefined
  
  var cvc_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
  
  var exp_month: js.UndefOr[Double] = js.undefined
  
  var exp_year: js.UndefOr[Double] = js.undefined
  
  var last4: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var zip_check: js.UndefOr[pass | failed | checked | unchecked] = js.undefined
}
object TokenResponseSnake {
  
  inline def apply(): TokenResponseSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResponseSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenResponseSnake] (val x: Self) extends AnyVal {
    
    inline def setAddress_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "address_check", value.asInstanceOf[js.Any])
    
    inline def setAddress_checkUndefined: Self = StObject.set(x, "address_check", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCvc_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    inline def setCvc_checkUndefined: Self = StObject.set(x, "cvc_check", js.undefined)
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setLast4Undefined: Self = StObject.set(x, "last4", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setZip_check(value: pass | failed | checked | unchecked): Self = StObject.set(x, "zip_check", value.asInstanceOf[js.Any])
    
    inline def setZip_checkUndefined: Self = StObject.set(x, "zip_check", js.undefined)
  }
}
