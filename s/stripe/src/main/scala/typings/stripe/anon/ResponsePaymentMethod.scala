package typings.stripe.anon

import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.PaymentMethod.AcssDebit
import typings.stripe.mod.Stripe.PaymentMethod.Affirm
import typings.stripe.mod.Stripe.PaymentMethod.AfterpayClearpay
import typings.stripe.mod.Stripe.PaymentMethod.Alipay
import typings.stripe.mod.Stripe.PaymentMethod.AuBecsDebit
import typings.stripe.mod.Stripe.PaymentMethod.BacsDebit
import typings.stripe.mod.Stripe.PaymentMethod.Bancontact
import typings.stripe.mod.Stripe.PaymentMethod.BillingDetails
import typings.stripe.mod.Stripe.PaymentMethod.Blik
import typings.stripe.mod.Stripe.PaymentMethod.Boleto
import typings.stripe.mod.Stripe.PaymentMethod.Card
import typings.stripe.mod.Stripe.PaymentMethod.CardPresent
import typings.stripe.mod.Stripe.PaymentMethod.Cashapp
import typings.stripe.mod.Stripe.PaymentMethod.CustomerBalance
import typings.stripe.mod.Stripe.PaymentMethod.Eps
import typings.stripe.mod.Stripe.PaymentMethod.Fpx
import typings.stripe.mod.Stripe.PaymentMethod.Giropay
import typings.stripe.mod.Stripe.PaymentMethod.Grabpay
import typings.stripe.mod.Stripe.PaymentMethod.Ideal
import typings.stripe.mod.Stripe.PaymentMethod.InteracPresent
import typings.stripe.mod.Stripe.PaymentMethod.Klarna
import typings.stripe.mod.Stripe.PaymentMethod.Konbini
import typings.stripe.mod.Stripe.PaymentMethod.Link
import typings.stripe.mod.Stripe.PaymentMethod.Oxxo
import typings.stripe.mod.Stripe.PaymentMethod.P24
import typings.stripe.mod.Stripe.PaymentMethod.Paynow
import typings.stripe.mod.Stripe.PaymentMethod.Paypal
import typings.stripe.mod.Stripe.PaymentMethod.Pix
import typings.stripe.mod.Stripe.PaymentMethod.Promptpay
import typings.stripe.mod.Stripe.PaymentMethod.RadarOptions
import typings.stripe.mod.Stripe.PaymentMethod.SepaDebit
import typings.stripe.mod.Stripe.PaymentMethod.Sofort
import typings.stripe.mod.Stripe.PaymentMethod.UsBankAccount
import typings.stripe.mod.Stripe.PaymentMethod.WechatPay
import typings.stripe.stripeStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.PaymentMethod> */
trait ResponsePaymentMethod extends StObject {
  
  var acss_debit: js.UndefOr[AcssDebit] = js.undefined
  
  var affirm: js.UndefOr[Affirm] = js.undefined
  
  var afterpay_clearpay: js.UndefOr[AfterpayClearpay] = js.undefined
  
  var alipay: js.UndefOr[Alipay] = js.undefined
  
  var au_becs_debit: js.UndefOr[AuBecsDebit] = js.undefined
  
  var bacs_debit: js.UndefOr[BacsDebit] = js.undefined
  
  var bancontact: js.UndefOr[Bancontact] = js.undefined
  
  var billing_details: BillingDetails
  
  var blik: js.UndefOr[Blik] = js.undefined
  
  var boleto: js.UndefOr[Boleto] = js.undefined
  
  var card: js.UndefOr[Card] = js.undefined
  
  var card_present: js.UndefOr[CardPresent] = js.undefined
  
  var cashapp: js.UndefOr[Cashapp] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: String | Customer | Null
  
  var customer_balance: js.UndefOr[CustomerBalance] = js.undefined
  
  var eps: js.UndefOr[Eps] = js.undefined
  
  var fpx: js.UndefOr[Fpx] = js.undefined
  
  var giropay: js.UndefOr[Giropay] = js.undefined
  
  var grabpay: js.UndefOr[Grabpay] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var ideal: js.UndefOr[Ideal] = js.undefined
  
  var interac_present: js.UndefOr[InteracPresent] = js.undefined
  
  var klarna: js.UndefOr[Klarna] = js.undefined
  
  var konbini: js.UndefOr[Konbini] = js.undefined
  
  var lastResponse: ApiVersion
  
  var link: js.UndefOr[Link] = js.undefined
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: payment_method
  
  var oxxo: js.UndefOr[Oxxo] = js.undefined
  
  var p24: js.UndefOr[P24] = js.undefined
  
  var paynow: js.UndefOr[Paynow] = js.undefined
  
  var paypal: js.UndefOr[Paypal] = js.undefined
  
  var pix: js.UndefOr[Pix] = js.undefined
  
  var promptpay: js.UndefOr[Promptpay] = js.undefined
  
  /**
    * Options to configure Radar. See [Radar Session](https://stripe.com/docs/radar/radar-session) for more information.
    */
  var radar_options: js.UndefOr[RadarOptions] = js.undefined
  
  var sepa_debit: js.UndefOr[SepaDebit] = js.undefined
  
  var sofort: js.UndefOr[Sofort] = js.undefined
  
  /**
    * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name matching this value. It contains additional information specific to the PaymentMethod type.
    */
  var `type`: typings.stripe.mod.Stripe.PaymentMethod.Type
  
  var us_bank_account: js.UndefOr[UsBankAccount] = js.undefined
  
  var wechat_pay: js.UndefOr[WechatPay] = js.undefined
}
object ResponsePaymentMethod {
  
  inline def apply(
    billing_details: BillingDetails,
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    `type`: typings.stripe.mod.Stripe.PaymentMethod.Type
  ): ResponsePaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], customer = null, metadata = null)
    __obj.updateDynamic("object")("payment_method")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePaymentMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePaymentMethod] (val x: Self) extends AnyVal {
    
    inline def setAcss_debit(value: AcssDebit): Self = StObject.set(x, "acss_debit", value.asInstanceOf[js.Any])
    
    inline def setAcss_debitUndefined: Self = StObject.set(x, "acss_debit", js.undefined)
    
    inline def setAffirm(value: Affirm): Self = StObject.set(x, "affirm", value.asInstanceOf[js.Any])
    
    inline def setAffirmUndefined: Self = StObject.set(x, "affirm", js.undefined)
    
    inline def setAfterpay_clearpay(value: AfterpayClearpay): Self = StObject.set(x, "afterpay_clearpay", value.asInstanceOf[js.Any])
    
    inline def setAfterpay_clearpayUndefined: Self = StObject.set(x, "afterpay_clearpay", js.undefined)
    
    inline def setAlipay(value: Alipay): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    inline def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    inline def setAu_becs_debit(value: AuBecsDebit): Self = StObject.set(x, "au_becs_debit", value.asInstanceOf[js.Any])
    
    inline def setAu_becs_debitUndefined: Self = StObject.set(x, "au_becs_debit", js.undefined)
    
    inline def setBacs_debit(value: BacsDebit): Self = StObject.set(x, "bacs_debit", value.asInstanceOf[js.Any])
    
    inline def setBacs_debitUndefined: Self = StObject.set(x, "bacs_debit", js.undefined)
    
    inline def setBancontact(value: Bancontact): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
    
    inline def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
    
    inline def setBilling_details(value: BillingDetails): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    inline def setBlik(value: Blik): Self = StObject.set(x, "blik", value.asInstanceOf[js.Any])
    
    inline def setBlikUndefined: Self = StObject.set(x, "blik", js.undefined)
    
    inline def setBoleto(value: Boleto): Self = StObject.set(x, "boleto", value.asInstanceOf[js.Any])
    
    inline def setBoletoUndefined: Self = StObject.set(x, "boleto", js.undefined)
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCard_present(value: CardPresent): Self = StObject.set(x, "card_present", value.asInstanceOf[js.Any])
    
    inline def setCard_presentUndefined: Self = StObject.set(x, "card_present", js.undefined)
    
    inline def setCashapp(value: Cashapp): Self = StObject.set(x, "cashapp", value.asInstanceOf[js.Any])
    
    inline def setCashappUndefined: Self = StObject.set(x, "cashapp", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerNull: Self = StObject.set(x, "customer", null)
    
    inline def setCustomer_balance(value: CustomerBalance): Self = StObject.set(x, "customer_balance", value.asInstanceOf[js.Any])
    
    inline def setCustomer_balanceUndefined: Self = StObject.set(x, "customer_balance", js.undefined)
    
    inline def setEps(value: Eps): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    inline def setEpsUndefined: Self = StObject.set(x, "eps", js.undefined)
    
    inline def setFpx(value: Fpx): Self = StObject.set(x, "fpx", value.asInstanceOf[js.Any])
    
    inline def setFpxUndefined: Self = StObject.set(x, "fpx", js.undefined)
    
    inline def setGiropay(value: Giropay): Self = StObject.set(x, "giropay", value.asInstanceOf[js.Any])
    
    inline def setGiropayUndefined: Self = StObject.set(x, "giropay", js.undefined)
    
    inline def setGrabpay(value: Grabpay): Self = StObject.set(x, "grabpay", value.asInstanceOf[js.Any])
    
    inline def setGrabpayUndefined: Self = StObject.set(x, "grabpay", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Ideal): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setInterac_present(value: InteracPresent): Self = StObject.set(x, "interac_present", value.asInstanceOf[js.Any])
    
    inline def setInterac_presentUndefined: Self = StObject.set(x, "interac_present", js.undefined)
    
    inline def setKlarna(value: Klarna): Self = StObject.set(x, "klarna", value.asInstanceOf[js.Any])
    
    inline def setKlarnaUndefined: Self = StObject.set(x, "klarna", js.undefined)
    
    inline def setKonbini(value: Konbini): Self = StObject.set(x, "konbini", value.asInstanceOf[js.Any])
    
    inline def setKonbiniUndefined: Self = StObject.set(x, "konbini", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: payment_method): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOxxo(value: Oxxo): Self = StObject.set(x, "oxxo", value.asInstanceOf[js.Any])
    
    inline def setOxxoUndefined: Self = StObject.set(x, "oxxo", js.undefined)
    
    inline def setP24(value: P24): Self = StObject.set(x, "p24", value.asInstanceOf[js.Any])
    
    inline def setP24Undefined: Self = StObject.set(x, "p24", js.undefined)
    
    inline def setPaynow(value: Paynow): Self = StObject.set(x, "paynow", value.asInstanceOf[js.Any])
    
    inline def setPaynowUndefined: Self = StObject.set(x, "paynow", js.undefined)
    
    inline def setPaypal(value: Paypal): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    inline def setPix(value: Pix): Self = StObject.set(x, "pix", value.asInstanceOf[js.Any])
    
    inline def setPixUndefined: Self = StObject.set(x, "pix", js.undefined)
    
    inline def setPromptpay(value: Promptpay): Self = StObject.set(x, "promptpay", value.asInstanceOf[js.Any])
    
    inline def setPromptpayUndefined: Self = StObject.set(x, "promptpay", js.undefined)
    
    inline def setRadar_options(value: RadarOptions): Self = StObject.set(x, "radar_options", value.asInstanceOf[js.Any])
    
    inline def setRadar_optionsUndefined: Self = StObject.set(x, "radar_options", js.undefined)
    
    inline def setSepa_debit(value: SepaDebit): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setSofort(value: Sofort): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    inline def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.PaymentMethod.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUs_bank_account(value: UsBankAccount): Self = StObject.set(x, "us_bank_account", value.asInstanceOf[js.Any])
    
    inline def setUs_bank_accountUndefined: Self = StObject.set(x, "us_bank_account", js.undefined)
    
    inline def setWechat_pay(value: WechatPay): Self = StObject.set(x, "wechat_pay", value.asInstanceOf[js.Any])
    
    inline def setWechat_payUndefined: Self = StObject.set(x, "wechat_pay", js.undefined)
  }
}
