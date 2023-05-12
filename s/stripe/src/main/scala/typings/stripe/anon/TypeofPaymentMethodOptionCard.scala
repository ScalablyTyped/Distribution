package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionCard extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val Card: TypeofCardMandateOptions
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccountFinancialConnections
}
object TypeofPaymentMethodOptionCard {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    Card: TypeofCardMandateOptions,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccountFinancialConnections
  ): TypeofPaymentMethodOptionCard = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionCard] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardMandateOptions): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccountFinancialConnections): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
