package typings.stripe.mod.charges

import typings.stripe.anon.Accountnumber
import typings.stripe.anon.Brand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails
  - typings.stripe.mod.charges.IAchDebitPaymentMethodDetails
  - typings.stripe.mod.charges.IAlipayPaymentMethodDetails
  - typings.stripe.mod.charges.IBancontactPaymentMethodDetails
  - typings.stripe.mod.charges.ICardPaymentMethodDetails
  - typings.stripe.mod.charges.ICardPresentPaymentMethodDetails
  - typings.stripe.mod.charges.IEpsPaymentMethodDetails
  - typings.stripe.mod.charges.IGiropayPaymentMethodDetails
  - typings.stripe.mod.charges.IIdealPaymentMethodDetails
  - typings.stripe.mod.charges.IKlarnaPaymentMethodDetails
  - typings.stripe.mod.charges.IP24PaymentMethodDetails
  - typings.stripe.mod.charges.ISofortPaymentMethodDetails
  - typings.stripe.mod.charges.IStripeAccountPaymentMethodDetails
  - typings.stripe.mod.charges.IWechatPaymentMethodDetails
*/
trait IPaymentMethodDetails extends StObject
object IPaymentMethodDetails {
  
  @scala.inline
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: Accountnumber): typings.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ach_credit_transfer")
    __obj.asInstanceOf[typings.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails]
  }
  
  @scala.inline
  def IAchDebitPaymentMethodDetails(): typings.stripe.mod.charges.IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ach_debit")
    __obj.asInstanceOf[typings.stripe.mod.charges.IAchDebitPaymentMethodDetails]
  }
  
  @scala.inline
  def IAlipayPaymentMethodDetails(): typings.stripe.mod.charges.IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("alipay")
    __obj.asInstanceOf[typings.stripe.mod.charges.IAlipayPaymentMethodDetails]
  }
  
  @scala.inline
  def IBancontactPaymentMethodDetails(): typings.stripe.mod.charges.IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bancontact")
    __obj.asInstanceOf[typings.stripe.mod.charges.IBancontactPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPaymentMethodDetails(card: Brand): typings.stripe.mod.charges.ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("card")
    __obj.asInstanceOf[typings.stripe.mod.charges.ICardPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPresentPaymentMethodDetails(): typings.stripe.mod.charges.ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("card_present")
    __obj.asInstanceOf[typings.stripe.mod.charges.ICardPresentPaymentMethodDetails]
  }
  
  @scala.inline
  def IEpsPaymentMethodDetails(): typings.stripe.mod.charges.IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("eps")
    __obj.asInstanceOf[typings.stripe.mod.charges.IEpsPaymentMethodDetails]
  }
  
  @scala.inline
  def IGiropayPaymentMethodDetails(): typings.stripe.mod.charges.IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("giropay")
    __obj.asInstanceOf[typings.stripe.mod.charges.IGiropayPaymentMethodDetails]
  }
  
  @scala.inline
  def IIdealPaymentMethodDetails(): typings.stripe.mod.charges.IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ideal")
    __obj.asInstanceOf[typings.stripe.mod.charges.IIdealPaymentMethodDetails]
  }
  
  @scala.inline
  def IKlarnaPaymentMethodDetails(): typings.stripe.mod.charges.IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("klarna")
    __obj.asInstanceOf[typings.stripe.mod.charges.IKlarnaPaymentMethodDetails]
  }
  
  @scala.inline
  def IP24PaymentMethodDetails(): typings.stripe.mod.charges.IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("p24")
    __obj.asInstanceOf[typings.stripe.mod.charges.IP24PaymentMethodDetails]
  }
  
  @scala.inline
  def ISofortPaymentMethodDetails(): typings.stripe.mod.charges.ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("sofort")
    __obj.asInstanceOf[typings.stripe.mod.charges.ISofortPaymentMethodDetails]
  }
  
  @scala.inline
  def IStripeAccountPaymentMethodDetails(): typings.stripe.mod.charges.IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stripe_account")
    __obj.asInstanceOf[typings.stripe.mod.charges.IStripeAccountPaymentMethodDetails]
  }
  
  @scala.inline
  def IWechatPaymentMethodDetails(): typings.stripe.mod.charges.IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wechat")
    __obj.asInstanceOf[typings.stripe.mod.charges.IWechatPaymentMethodDetails]
  }
}
