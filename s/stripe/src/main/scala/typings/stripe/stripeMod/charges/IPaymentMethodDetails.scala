package typings.stripe.stripeMod.charges

import typings.stripe.Anon_Accountnumber
import typings.stripe.Anon_Brand
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeMod.charges.IAchCreditTransferPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IAchDebitPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IAlipayPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IBancontactPaymentMethodDetails
  - typings.stripe.stripeMod.charges.ICardPaymentMethodDetails
  - typings.stripe.stripeMod.charges.ICardPresentPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IEpsPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IGiropayPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IIdealPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IKlarnaPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IP24PaymentMethodDetails
  - typings.stripe.stripeMod.charges.ISofortPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IStripeAccountPaymentMethodDetails
  - typings.stripe.stripeMod.charges.IWechatPaymentMethodDetails
*/
trait IPaymentMethodDetails extends js.Object

object IPaymentMethodDetails {
  @scala.inline
  def ICardPresentPaymentMethodDetails(`type`: card_present): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IEpsPaymentMethodDetails(`type`: eps): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IBancontactPaymentMethodDetails(`type`: bancontact): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ISofortPaymentMethodDetails(`type`: sofort): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IGiropayPaymentMethodDetails(`type`: giropay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IStripeAccountPaymentMethodDetails(`type`: stripe_account): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAlipayPaymentMethodDetails(`type`: alipay): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IKlarnaPaymentMethodDetails(`type`: klarna): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IIdealPaymentMethodDetails(`type`: ideal): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchCreditTransferPaymentMethodDetails(ach_credit_transfer: Anon_Accountnumber, `type`: ach_credit_transfer): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IAchDebitPaymentMethodDetails(`type`: ach_debit): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def ICardPaymentMethodDetails(card: Anon_Brand, `type`: card): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IP24PaymentMethodDetails(`type`: p24): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
  @scala.inline
  def IWechatPaymentMethodDetails(`type`: wechat): IPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodDetails]
  }
}

