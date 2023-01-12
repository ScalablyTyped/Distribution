package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAfterpayClearpay extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val AfterpayClearpay: Any
  
  val Alipay: Any
  
  val Bancontact: Any
  
  val Card: Any
  
  val CustomerBalance: TypeofCustomerBalance
  
  val Ideal: Any
  
  val Link: Any
  
  val SepaDebit: Any
  
  val Sofort: Any
  
  val WechatPay: Any
}
object TypeofPaymentMethodOptionAfterpayClearpay {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    AfterpayClearpay: Any,
    Alipay: Any,
    Bancontact: Any,
    Card: Any,
    CustomerBalance: TypeofCustomerBalance,
    Ideal: Any,
    Link: Any,
    SepaDebit: Any,
    Sofort: Any,
    WechatPay: Any
  ): TypeofPaymentMethodOptionAfterpayClearpay = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], AfterpayClearpay = AfterpayClearpay.asInstanceOf[js.Any], Alipay = Alipay.asInstanceOf[js.Any], Bancontact = Bancontact.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any], WechatPay = WechatPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAfterpayClearpay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionAfterpayClearpay] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setAfterpayClearpay(value: Any): Self = StObject.set(x, "AfterpayClearpay", value.asInstanceOf[js.Any])
    
    inline def setAlipay(value: Any): Self = StObject.set(x, "Alipay", value.asInstanceOf[js.Any])
    
    inline def setBancontact(value: Any): Self = StObject.set(x, "Bancontact", value.asInstanceOf[js.Any])
    
    inline def setCard(value: Any): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalance): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
    
    inline def setWechatPay(value: Any): Self = StObject.set(x, "WechatPay", value.asInstanceOf[js.Any])
  }
}
