package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Source.AchCreditTransfer
import typings.stripe.mod.Stripe.Source.AchDebit
import typings.stripe.mod.Stripe.Source.AcssDebit
import typings.stripe.mod.Stripe.Source.Alipay
import typings.stripe.mod.Stripe.Source.AuBecsDebit
import typings.stripe.mod.Stripe.Source.Bancontact
import typings.stripe.mod.Stripe.Source.Card
import typings.stripe.mod.Stripe.Source.CardPresent
import typings.stripe.mod.Stripe.Source.CodeVerification
import typings.stripe.mod.Stripe.Source.Eps
import typings.stripe.mod.Stripe.Source.Giropay
import typings.stripe.mod.Stripe.Source.Ideal
import typings.stripe.mod.Stripe.Source.Klarna
import typings.stripe.mod.Stripe.Source.Multibanco
import typings.stripe.mod.Stripe.Source.Owner
import typings.stripe.mod.Stripe.Source.P24
import typings.stripe.mod.Stripe.Source.Receiver
import typings.stripe.mod.Stripe.Source.Redirect
import typings.stripe.mod.Stripe.Source.SepaCreditTransfer
import typings.stripe.mod.Stripe.Source.SepaDebit
import typings.stripe.mod.Stripe.Source.Sofort
import typings.stripe.mod.Stripe.Source.SourceOrder
import typings.stripe.mod.Stripe.Source.ThreeDSecure
import typings.stripe.mod.Stripe.Source.Wechat
import typings.stripe.stripeStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Source> */
trait ResponseSource extends StObject {
  
  var ach_credit_transfer: js.UndefOr[AchCreditTransfer] = js.undefined
  
  var ach_debit: js.UndefOr[AchDebit] = js.undefined
  
  var acss_debit: js.UndefOr[AcssDebit] = js.undefined
  
  var alipay: js.UndefOr[Alipay] = js.undefined
  
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a zero-decimal currency) representing the total amount associated with the source. This is the amount for which the source will be chargeable once ready. Required for `single_use` sources.
    */
  var amount: Double | Null
  
  var au_becs_debit: js.UndefOr[AuBecsDebit] = js.undefined
  
  var bancontact: js.UndefOr[Bancontact] = js.undefined
  
  var card: js.UndefOr[Card] = js.undefined
  
  var card_present: js.UndefOr[CardPresent] = js.undefined
  
  /**
    * The client secret of the source. Used for client-side retrieval using a publishable key.
    */
  var client_secret: String
  
  var code_verification: js.UndefOr[CodeVerification] = js.undefined
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with the source. This is the currency for which the source will be chargeable once ready. Required for `single_use` sources.
    */
  var currency: String | Null
  
  /**
    * The ID of the customer to which this source is attached. This will not be present when the source has not been attached to a customer.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  var eps: js.UndefOr[Eps] = js.undefined
  
  /**
    * The authentication `flow` of the source. `flow` is one of `redirect`, `receiver`, `code_verification`, `none`.
    */
  var flow: String
  
  var giropay: js.UndefOr[Giropay] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var ideal: js.UndefOr[Ideal] = js.undefined
  
  var klarna: js.UndefOr[Klarna] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  var multibanco: js.UndefOr[Multibanco] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: source
  
  /**
    * Information about the owner of the payment instrument that may be used or required by particular source types.
    */
  var owner: Owner | Null
  
  var p24: js.UndefOr[P24] = js.undefined
  
  var receiver: js.UndefOr[Receiver] = js.undefined
  
  var redirect: js.UndefOr[Redirect] = js.undefined
  
  var sepa_credit_transfer: js.UndefOr[SepaCreditTransfer] = js.undefined
  
  var sepa_debit: js.UndefOr[SepaDebit] = js.undefined
  
  var sofort: js.UndefOr[Sofort] = js.undefined
  
  var source_order: js.UndefOr[SourceOrder] = js.undefined
  
  /**
    * Extra information about a source. This will appear on your customer's statement every time you charge the source.
    */
  var statement_descriptor: String | Null
  
  /**
    * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`, or `pending`. Only `chargeable` sources can be used to create a charge.
    */
  var status: String
  
  var three_d_secure: js.UndefOr[ThreeDSecure] = js.undefined
  
  /**
    * The `type` of the source. The `type` is a payment method, one of `ach_credit_transfer`, `ach_debit`, `alipay`, `bancontact`, `card`, `card_present`, `eps`, `giropay`, `ideal`, `multibanco`, `klarna`, `p24`, `sepa_debit`, `sofort`, `three_d_secure`, or `wechat`. An additional hash is included on the source with a name matching this value. It contains additional information specific to the [payment method](https://stripe.com/docs/sources) used.
    */
  var `type`: typings.stripe.mod.Stripe.Source.Type
  
  /**
    * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source types may or may not be reusable by construction, while others may leave the option at creation. If an incompatible value is passed, an error will be returned.
    */
  var usage: String | Null
  
  var wechat: js.UndefOr[Wechat] = js.undefined
}
object ResponseSource {
  
  inline def apply(
    client_secret: String,
    created: Double,
    flow: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    status: String,
    `type`: typings.stripe.mod.Stripe.Source.Type
  ): ResponseSource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], amount = null, currency = null, metadata = null, owner = null, statement_descriptor = null, usage = null)
    __obj.updateDynamic("object")("source")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSource] (val x: Self) extends AnyVal {
    
    inline def setAch_credit_transfer(value: AchCreditTransfer): Self = StObject.set(x, "ach_credit_transfer", value.asInstanceOf[js.Any])
    
    inline def setAch_credit_transferUndefined: Self = StObject.set(x, "ach_credit_transfer", js.undefined)
    
    inline def setAch_debit(value: AchDebit): Self = StObject.set(x, "ach_debit", value.asInstanceOf[js.Any])
    
    inline def setAch_debitUndefined: Self = StObject.set(x, "ach_debit", js.undefined)
    
    inline def setAcss_debit(value: AcssDebit): Self = StObject.set(x, "acss_debit", value.asInstanceOf[js.Any])
    
    inline def setAcss_debitUndefined: Self = StObject.set(x, "acss_debit", js.undefined)
    
    inline def setAlipay(value: Alipay): Self = StObject.set(x, "alipay", value.asInstanceOf[js.Any])
    
    inline def setAlipayUndefined: Self = StObject.set(x, "alipay", js.undefined)
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAu_becs_debit(value: AuBecsDebit): Self = StObject.set(x, "au_becs_debit", value.asInstanceOf[js.Any])
    
    inline def setAu_becs_debitUndefined: Self = StObject.set(x, "au_becs_debit", js.undefined)
    
    inline def setBancontact(value: Bancontact): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
    
    inline def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCard_present(value: CardPresent): Self = StObject.set(x, "card_present", value.asInstanceOf[js.Any])
    
    inline def setCard_presentUndefined: Self = StObject.set(x, "card_present", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setCode_verification(value: CodeVerification): Self = StObject.set(x, "code_verification", value.asInstanceOf[js.Any])
    
    inline def setCode_verificationUndefined: Self = StObject.set(x, "code_verification", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setEps(value: Eps): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
    
    inline def setEpsUndefined: Self = StObject.set(x, "eps", js.undefined)
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setGiropay(value: Giropay): Self = StObject.set(x, "giropay", value.asInstanceOf[js.Any])
    
    inline def setGiropayUndefined: Self = StObject.set(x, "giropay", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Ideal): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setKlarna(value: Klarna): Self = StObject.set(x, "klarna", value.asInstanceOf[js.Any])
    
    inline def setKlarnaUndefined: Self = StObject.set(x, "klarna", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMultibanco(value: Multibanco): Self = StObject.set(x, "multibanco", value.asInstanceOf[js.Any])
    
    inline def setMultibancoUndefined: Self = StObject.set(x, "multibanco", js.undefined)
    
    inline def setObject(value: source): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setP24(value: P24): Self = StObject.set(x, "p24", value.asInstanceOf[js.Any])
    
    inline def setP24Undefined: Self = StObject.set(x, "p24", js.undefined)
    
    inline def setReceiver(value: Receiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSepa_credit_transfer(value: SepaCreditTransfer): Self = StObject.set(x, "sepa_credit_transfer", value.asInstanceOf[js.Any])
    
    inline def setSepa_credit_transferUndefined: Self = StObject.set(x, "sepa_credit_transfer", js.undefined)
    
    inline def setSepa_debit(value: SepaDebit): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    inline def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    inline def setSofort(value: Sofort): Self = StObject.set(x, "sofort", value.asInstanceOf[js.Any])
    
    inline def setSofortUndefined: Self = StObject.set(x, "sofort", js.undefined)
    
    inline def setSource_order(value: SourceOrder): Self = StObject.set(x, "source_order", value.asInstanceOf[js.Any])
    
    inline def setSource_orderUndefined: Self = StObject.set(x, "source_order", js.undefined)
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secure(value: ThreeDSecure): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.Source.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageNull: Self = StObject.set(x, "usage", null)
    
    inline def setWechat(value: Wechat): Self = StObject.set(x, "wechat", value.asInstanceOf[js.Any])
    
    inline def setWechatUndefined: Self = StObject.set(x, "wechat", js.undefined)
  }
}
