package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAcssDebit extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val BacsDebit: Any
  
  val Boleto: Any
  
  val Card: TypeofCardInstallments
  
  val CustomerBalance: TypeofCustomerBalanceBankTransfer
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccount
  
  val WechatPay: Any
}
object TypeofPaymentMethodOptionAcssDebit {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    BacsDebit: Any,
    Boleto: Any,
    Card: TypeofCardInstallments,
    CustomerBalance: TypeofCustomerBalanceBankTransfer,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccount,
    WechatPay: Any
  ): TypeofPaymentMethodOptionAcssDebit = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Boleto = Boleto.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any], WechatPay = WechatPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAcssDebit]
  }
  
  extension [Self <: TypeofPaymentMethodOptionAcssDebit](x: Self) {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBoleto(value: Any): Self = StObject.set(x, "Boleto", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardInstallments): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalanceBankTransfer): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccount): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
    
    inline def setWechatPay(value: Any): Self = StObject.set(x, "WechatPay", value.asInstanceOf[js.Any])
  }
}
