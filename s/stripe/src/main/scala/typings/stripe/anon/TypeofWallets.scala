package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWallets extends StObject {
  
  val ApplePay: Any
  
  val GooglePay: Any
}
object TypeofWallets {
  
  inline def apply(ApplePay: Any, GooglePay: Any): TypeofWallets = {
    val __obj = js.Dynamic.literal(ApplePay = ApplePay.asInstanceOf[js.Any], GooglePay = GooglePay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWallets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofWallets] (val x: Self) extends AnyVal {
    
    inline def setApplePay(value: Any): Self = StObject.set(x, "ApplePay", value.asInstanceOf[js.Any])
    
    inline def setGooglePay(value: Any): Self = StObject.set(x, "GooglePay", value.asInstanceOf[js.Any])
  }
}
