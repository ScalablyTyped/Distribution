package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAuBecsDebit extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val Alipay: Any
  
  val AuBecsDebit: Any
  
  val BacsDebit: Any
  
  val Bancontact: Any
  
  val Boleto: Any
  
  val Card: TypeofCardMandateOptions
  
  val CustomerBalance: TypeofCustomerBalance
  
  val Ideal: Any
  
  val Link: Any
  
  val SepaDebit: Any
  
  val Sofort: Any
  
  val UsBankAccount: TypeofUsBankAccount
  
  val WechatPay: Any
}
object TypeofPaymentMethodOptionAuBecsDebit {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    Alipay: Any,
    AuBecsDebit: Any,
    BacsDebit: Any,
    Bancontact: Any,
    Boleto: Any,
    Card: TypeofCardMandateOptions,
    CustomerBalance: TypeofCustomerBalance,
    Ideal: Any,
    Link: Any,
    SepaDebit: Any,
    Sofort: Any,
    UsBankAccount: TypeofUsBankAccount,
    WechatPay: Any
  ): TypeofPaymentMethodOptionAuBecsDebit = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], Alipay = Alipay.asInstanceOf[js.Any], AuBecsDebit = AuBecsDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Bancontact = Bancontact.asInstanceOf[js.Any], Boleto = Boleto.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any], WechatPay = WechatPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAuBecsDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionAuBecsDebit] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setAlipay(value: Any): Self = StObject.set(x, "Alipay", value.asInstanceOf[js.Any])
    
    inline def setAuBecsDebit(value: Any): Self = StObject.set(x, "AuBecsDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setBoleto(value: Any): Self = StObject.set(x, "Boleto", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardMandateOptions): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalance): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccount): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
    
    inline def setWechatPay(value: Any): Self = StObject.set(x, "WechatPay", value.asInstanceOf[js.Any])
  }
}
