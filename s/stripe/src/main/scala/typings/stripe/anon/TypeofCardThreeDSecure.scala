package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardThreeDSecure extends StObject {
  
  val Installments: Any
  
  val ThreeDSecure: Any
  
  val Wallet: Any
}
object TypeofCardThreeDSecure {
  
  inline def apply(Installments: Any, ThreeDSecure: Any, Wallet: Any): TypeofCardThreeDSecure = {
    val __obj = js.Dynamic.literal(Installments = Installments.asInstanceOf[js.Any], ThreeDSecure = ThreeDSecure.asInstanceOf[js.Any], Wallet = Wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardThreeDSecure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCardThreeDSecure] (val x: Self) extends AnyVal {
    
    inline def setInstallments(value: Any): Self = StObject.set(x, "Installments", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecure(value: Any): Self = StObject.set(x, "ThreeDSecure", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: Any): Self = StObject.set(x, "Wallet", value.asInstanceOf[js.Any])
  }
}
