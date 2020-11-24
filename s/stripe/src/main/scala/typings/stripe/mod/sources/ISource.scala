package typings.stripe.mod.sources

import typings.stripe.anon.Amountcharged
import typings.stripe.anon.Attemptsremaining
import typings.stripe.anon.Bankname
import typings.stripe.anon.Failurereason
import typings.stripe.anon.Phone
import typings.stripe.mod.ICardHashInfo
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IStripeSource
import typings.stripe.stripeStrings.ach_credit_transfer
import typings.stripe.stripeStrings.ach_debit
import typings.stripe.stripeStrings.alipay
import typings.stripe.stripeStrings.bancontact
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.chargeable
import typings.stripe.stripeStrings.code_verification
import typings.stripe.stripeStrings.consumed
import typings.stripe.stripeStrings.eps
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.giropay
import typings.stripe.stripeStrings.ideal
import typings.stripe.stripeStrings.multibanco
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.p24
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.receiver
import typings.stripe.stripeStrings.redirect
import typings.stripe.stripeStrings.reusable
import typings.stripe.stripeStrings.sepa_debit
import typings.stripe.stripeStrings.single_use
import typings.stripe.stripeStrings.sofort
import typings.stripe.stripeStrings.source
import typings.stripe.stripeStrings.three_d_secure
import typings.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Source object: https://stripe.com/docs/api/sources/object */
@js.native
trait ISource
  extends IResourceObject
     with IStripeSource {
  
  var ach_credit_transfer: js.UndefOr[Bankname] = js.native
  
  var amount: js.UndefOr[Double | Null] = js.native
  
  var card: js.UndefOr[ICardHashInfo] = js.native
  
  var client_secret: String = js.native
  
  var code_verification: js.UndefOr[Attemptsremaining] = js.native
  
  var created: Double = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var customer: js.UndefOr[String] = js.native
  
  var flow: redirect | receiver | code_verification | none = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  @JSName("object")
  var object_ISource: source = js.native
  
  var owner: Phone = js.native
  
  var receiver: js.UndefOr[Amountcharged] = js.native
  
  var redirect: js.UndefOr[Failurereason] = js.native
  
  var statement_descriptor: js.UndefOr[String | Null] = js.native
  
  var status: canceled | chargeable | consumed | failed | pending = js.native
  
  var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat = js.native
  
  var usage: reusable | single_use = js.native
}
object ISource {
  
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: source,
    owner: Phone,
    status: canceled | chargeable | consumed | failed | pending,
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    usage: reusable | single_use
  ): ISource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISource]
  }
  
  @scala.inline
  implicit class ISourceOps[Self <: ISource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: source): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Phone): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: canceled | chargeable | consumed | failed | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: reusable | single_use): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAch_credit_transfer(value: Bankname): Self = this.set("ach_credit_transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAch_credit_transfer: Self = this.set("ach_credit_transfer", js.undefined)
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAmountNull: Self = this.set("amount", null)
    
    @scala.inline
    def setCard(value: ICardHashInfo): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCode_verification(value: Attemptsremaining): Self = this.set("code_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_verification: Self = this.set("code_verification", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setReceiver(value: Amountcharged): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setRedirect(value: Failurereason): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    
    @scala.inline
    def setStatement_descriptorNull: Self = this.set("statement_descriptor", null)
  }
}
