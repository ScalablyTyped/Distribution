package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardThreeDSecureWallet extends StObject {
  
  val ThreeDSecure: Any
  
  val Wallet: Any
}
object TypeofCardThreeDSecureWallet {
  
  inline def apply(ThreeDSecure: Any, Wallet: Any): TypeofCardThreeDSecureWallet = {
    val __obj = js.Dynamic.literal(ThreeDSecure = ThreeDSecure.asInstanceOf[js.Any], Wallet = Wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardThreeDSecureWallet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardThreeDSecureWallet] (val x: Self) extends AnyVal {
    
    inline def setThreeDSecure(value: Any): Self = StObject.set(x, "ThreeDSecure", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: Any): Self = StObject.set(x, "Wallet", value.asInstanceOf[js.Any])
  }
}
