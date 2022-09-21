package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionSepaDebit extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val Card: TypeofCard0
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccountFinancialConnections
}
object TypeofPaymentMethodOptionSepaDebit {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    Card: TypeofCard0,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccountFinancialConnections
  ): TypeofPaymentMethodOptionSepaDebit = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionSepaDebit]
  }
  
  extension [Self <: TypeofPaymentMethodOptionSepaDebit](x: Self) {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCard0): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccountFinancialConnections): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
