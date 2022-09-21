package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCard extends StObject {
  
  val Installments: Any
  
  val ThreeDSecure: Any
  
  val Wallet: Any
}
object TypeofCard {
  
  inline def apply(Installments: Any, ThreeDSecure: Any, Wallet: Any): TypeofCard = {
    val __obj = js.Dynamic.literal(Installments = Installments.asInstanceOf[js.Any], ThreeDSecure = ThreeDSecure.asInstanceOf[js.Any], Wallet = Wallet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCard]
  }
  
  extension [Self <: TypeofCard](x: Self) {
    
    inline def setInstallments(value: Any): Self = StObject.set(x, "Installments", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecure(value: Any): Self = StObject.set(x, "ThreeDSecure", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: Any): Self = StObject.set(x, "Wallet", value.asInstanceOf[js.Any])
  }
}
