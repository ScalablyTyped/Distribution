package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeOptions extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var betas: js.UndefOr[js.Array[String]] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var stripeAccount: js.UndefOr[String] = js.undefined
}
object StripeOptions {
  
  inline def apply(): StripeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeOptions] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setBetas(value: js.Array[String]): Self = StObject.set(x, "betas", value.asInstanceOf[js.Any])
    
    inline def setBetasUndefined: Self = StObject.set(x, "betas", js.undefined)
    
    inline def setBetasVarargs(value: String*): Self = StObject.set(x, "betas", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
    
    inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
  }
}
