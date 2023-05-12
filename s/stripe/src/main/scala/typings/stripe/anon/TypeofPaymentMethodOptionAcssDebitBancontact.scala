package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAcssDebitBancontact extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val Bancontact: Any
  
  val Card: TypeofCardMandateOptions
  
  val CustomerBalance: TypeofCustomerBalanceBankTransfer
  
  val UsBankAccount: TypeofUsBankAccount
}
object TypeofPaymentMethodOptionAcssDebitBancontact {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    Bancontact: Any,
    Card: TypeofCardMandateOptions,
    CustomerBalance: TypeofCustomerBalanceBankTransfer,
    UsBankAccount: TypeofUsBankAccount
  ): TypeofPaymentMethodOptionAcssDebitBancontact = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], Bancontact = Bancontact.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAcssDebitBancontact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionAcssDebitBancontact] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardMandateOptions): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalanceBankTransfer): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccount): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
