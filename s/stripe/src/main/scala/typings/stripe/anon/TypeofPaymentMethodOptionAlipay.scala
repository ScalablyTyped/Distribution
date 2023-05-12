package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAlipay extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val Alipay: Any
  
  val AuBecsDebit: Any
  
  val BacsDebit: Any
  
  val Bancontact: Any
  
  val Boleto: Any
  
  val Card: TypeofCardInstallments
  
  val Cashapp: Any
  
  val CustomerBalance: TypeofCustomerBalance
  
  val Ideal: Any
  
  val Klarna: Any
  
  val Link: Any
  
  val Paypal: Any
  
  val SepaDebit: Any
  
  val Sofort: Any
  
  val UsBankAccount: TypeofUsBankAccountFinancialConnections
  
  val WechatPay: Any
}
object TypeofPaymentMethodOptionAlipay {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    Alipay: Any,
    AuBecsDebit: Any,
    BacsDebit: Any,
    Bancontact: Any,
    Boleto: Any,
    Card: TypeofCardInstallments,
    Cashapp: Any,
    CustomerBalance: TypeofCustomerBalance,
    Ideal: Any,
    Klarna: Any,
    Link: Any,
    Paypal: Any,
    SepaDebit: Any,
    Sofort: Any,
    UsBankAccount: TypeofUsBankAccountFinancialConnections,
    WechatPay: Any
  ): TypeofPaymentMethodOptionAlipay = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], Alipay = Alipay.asInstanceOf[js.Any], AuBecsDebit = AuBecsDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Bancontact = Bancontact.asInstanceOf[js.Any], Boleto = Boleto.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], Cashapp = Cashapp.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Klarna = Klarna.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Paypal = Paypal.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any], WechatPay = WechatPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAlipay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionAlipay] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setAlipay(value: Any): Self = StObject.set(x, "Alipay", value.asInstanceOf[js.Any])
    
    inline def setAuBecsDebit(value: Any): Self = StObject.set(x, "AuBecsDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setBoleto(value: Any): Self = StObject.set(x, "Boleto", value.asInstanceOf[js.Any])
    
    inline def setCard(value: TypeofCardInstallments): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCashapp(value: Any): Self = StObject.set(x, "Cashapp", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalance): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setKlarna(value: Any): Self = StObject.set(x, "Klarna", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setPaypal(value: Any): Self = StObject.set(x, "Paypal", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccountFinancialConnections): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
    
    inline def setWechatPay(value: Any): Self = StObject.set(x, "WechatPay", value.asInstanceOf[js.Any])
  }
}
