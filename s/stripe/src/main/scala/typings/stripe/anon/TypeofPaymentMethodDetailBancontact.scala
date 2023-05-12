package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodDetailBancontact extends StObject {
  
  val Bancontact: Any
  
  val Card: TypeofCardThreeDSecureWallet
  
  val Ideal: Any
  
  val Sofort: Any
}
object TypeofPaymentMethodDetailBancontact {
  
  inline def apply(Bancontact: Any, Card: TypeofCardThreeDSecureWallet, Ideal: Any, Sofort: Any): TypeofPaymentMethodDetailBancontact = {
    val __obj = js.Dynamic.literal(Bancontact = Bancontact.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodDetailBancontact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodDetailBancontact] (val x: Self) extends AnyVal {
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardThreeDSecureWallet): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
  }
}
