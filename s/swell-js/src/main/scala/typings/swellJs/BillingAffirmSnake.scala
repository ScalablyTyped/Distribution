package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingAffirmSnake extends StObject {
  
  var checkout_token: js.UndefOr[String] = js.undefined
}
object BillingAffirmSnake {
  
  inline def apply(): BillingAffirmSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAffirmSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingAffirmSnake] (val x: Self) extends AnyVal {
    
    inline def setCheckout_token(value: String): Self = StObject.set(x, "checkout_token", value.asInstanceOf[js.Any])
    
    inline def setCheckout_tokenUndefined: Self = StObject.set(x, "checkout_token", js.undefined)
  }
}
