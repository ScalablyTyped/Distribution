package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOption extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val BacsDebit: Any
  
  val Boleto: Any
  
  val Card: Any
  
  val Cashapp: Any
  
  val CustomerBalance: TypeofCustomerBalance
  
  val Link: Any
  
  val Paypal: Any
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccount
  
  val WechatPay: Any
}
object TypeofPaymentMethodOption {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    BacsDebit: Any,
    Boleto: Any,
    Card: Any,
    Cashapp: Any,
    CustomerBalance: TypeofCustomerBalance,
    Link: Any,
    Paypal: Any,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccount,
    WechatPay: Any
  ): TypeofPaymentMethodOption = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Boleto = Boleto.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], Cashapp = Cashapp.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Paypal = Paypal.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any], WechatPay = WechatPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOption] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBoleto(value: Any): Self = StObject.set(x, "Boleto", value.asInstanceOf[js.Any])
    
    inline def setCard(value: Any): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCashapp(value: Any): Self = StObject.set(x, "Cashapp", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalance): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setPaypal(value: Any): Self = StObject.set(x, "Paypal", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccount): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
    
    inline def setWechatPay(value: Any): Self = StObject.set(x, "WechatPay", value.asInstanceOf[js.Any])
  }
}
