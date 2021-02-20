package typings.stripe.mod.charges

import typings.stripe.anon.Accountnumber
import typings.stripe.anon.Brand
import typings.stripe.stripeStrings.ach_credit_transfer
import typings.stripe.stripeStrings.ach_debit
import typings.stripe.stripeStrings.alipay
import typings.stripe.stripeStrings.bancontact
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.eps
import typings.stripe.stripeStrings.giropay
import typings.stripe.stripeStrings.ideal
import typings.stripe.stripeStrings.klarna
import typings.stripe.stripeStrings.p24
import typings.stripe.stripeStrings.sofort
import typings.stripe.stripeStrings.stripe_account
import typings.stripe.stripeStrings.wechat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: Accountnumber, `type`: ach_credit_transfer): typings.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IAchCreditTransferPaymentMethodDetails]
  }
  
  @scala.inline
  def IAchDebitPaymentMethodDetails(`type`: ach_debit): typings.stripe.mod.charges.IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IAchDebitPaymentMethodDetails]
  }
  
  @scala.inline
  def IAlipayPaymentMethodDetails(`type`: alipay): typings.stripe.mod.charges.IAlipayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IAlipayPaymentMethodDetails]
  }
  
  @scala.inline
  def IBancontactPaymentMethodDetails(`type`: bancontact): typings.stripe.mod.charges.IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IBancontactPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPaymentMethodDetails(card: Brand, `type`: card): typings.stripe.mod.charges.ICardPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.ICardPaymentMethodDetails]
  }
  
  @scala.inline
  def ICardPresentPaymentMethodDetails(`type`: card_present): typings.stripe.mod.charges.ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.ICardPresentPaymentMethodDetails]
  }
  
  @scala.inline
  def IEpsPaymentMethodDetails(`type`: eps): typings.stripe.mod.charges.IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IEpsPaymentMethodDetails]
  }
  
  @scala.inline
  def IGiropayPaymentMethodDetails(`type`: giropay): typings.stripe.mod.charges.IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IGiropayPaymentMethodDetails]
  }
  
  @scala.inline
  def IIdealPaymentMethodDetails(`type`: ideal): typings.stripe.mod.charges.IIdealPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IIdealPaymentMethodDetails]
  }
  
  @scala.inline
  def IKlarnaPaymentMethodDetails(`type`: klarna): typings.stripe.mod.charges.IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IKlarnaPaymentMethodDetails]
  }
  
  @scala.inline
  def IP24PaymentMethodDetails(`type`: p24): typings.stripe.mod.charges.IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IP24PaymentMethodDetails]
  }
  
  @scala.inline
  def ISofortPaymentMethodDetails(`type`: sofort): typings.stripe.mod.charges.ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.ISofortPaymentMethodDetails]
  }
  
  @scala.inline
  def IStripeAccountPaymentMethodDetails(`type`: stripe_account): typings.stripe.mod.charges.IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IStripeAccountPaymentMethodDetails]
  }
  
  @scala.inline
  def IWechatPaymentMethodDetails(`type`: wechat): typings.stripe.mod.charges.IWechatPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.charges.IWechatPaymentMethodDetails]
  }
}
