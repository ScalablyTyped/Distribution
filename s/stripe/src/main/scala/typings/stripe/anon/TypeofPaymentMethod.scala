package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethod extends StObject {
  
  val Card: TypeofCardWallet
  
  val Eps: Any
  
  val Fpx: Any
  
  val Ideal: Any
  
  val Klarna: Any
  
  val P24: Any
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccountNetworks
}
object TypeofPaymentMethod {
  
  inline def apply(
    Card: TypeofCardWallet,
    Eps: Any,
    Fpx: Any,
    Ideal: Any,
    Klarna: Any,
    P24: Any,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccountNetworks
  ): TypeofPaymentMethod = {
    val __obj = js.Dynamic.literal(Card = Card.asInstanceOf[js.Any], Eps = Eps.asInstanceOf[js.Any], Fpx = Fpx.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Klarna = Klarna.asInstanceOf[js.Any], P24 = P24.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethod]
  }
  
  extension [Self <: TypeofPaymentMethod](x: Self) {
    
    inline def setCard(value: TypeofCardWallet): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setEps(value: Any): Self = StObject.set(x, "Eps", value.asInstanceOf[js.Any])
    
    inline def setFpx(value: Any): Self = StObject.set(x, "Fpx", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setKlarna(value: Any): Self = StObject.set(x, "Klarna", value.asInstanceOf[js.Any])
    
    inline def setP24(value: Any): Self = StObject.set(x, "P24", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccountNetworks): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
