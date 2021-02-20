package typings.stripe.mod

import typings.stripe.anon.Acceptance
import typings.stripe.anon.AddressEmail
import typings.stripe.anon.Amountcharged
import typings.stripe.anon.Attemptsremaining
import typings.stripe.anon.Bank
import typings.stripe.anon.Bankname
import typings.stripe.anon.Currency
import typings.stripe.anon.EmailName
import typings.stripe.anon.Failurereason
import typings.stripe.anon.Iban
import typings.stripe.anon.Phone
import typings.stripe.anon.Refundattributesmethod
import typings.stripe.anon.ReturnurlString
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stripe Sources documentation: https://stripe.com/docs/sources
  * Stripe Sources API documentation: https://stripe.com/docs/api/sources
  */
object sources {
  
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
    ): typings.stripe.mod.sources.ISource = {
      val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stripe.mod.sources.ISource]
    }
    
    @scala.inline
    implicit class ISourceMutableBuilder[Self <: typings.stripe.mod.sources.ISource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAch_credit_transfer(value: Bankname): Self = StObject.set(x, "ach_credit_transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAch_credit_transferUndefined: Self = StObject.set(x, "ach_credit_transfer", js.undefined)
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountNull: Self = StObject.set(x, "amount", null)
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setCard(value: ICardHashInfo): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode_verification(value: Attemptsremaining): Self = StObject.set(x, "code_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode_verificationUndefined: Self = StObject.set(x, "code_verification", js.undefined)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: source): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: Phone): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiver(value: Amountcharged): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
      
      @scala.inline
      def setRedirect(value: Failurereason): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setStatus(value: canceled | chargeable | consumed | failed | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(
        value: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: reusable | single_use): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISourceCreationOptions extends IDataOptionsWithMetadata {
    
    var amount: js.UndefOr[Double] = js.native
    
    var currency: js.UndefOr[String] = js.native
    
    var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.native
    
    var ideal: js.UndefOr[Bank] = js.native
    
    var mandate: js.UndefOr[Acceptance] = js.native
    
    @JSName("metadata")
    var metadata_ISourceCreationOptions: js.UndefOr[IMetadata] = js.native
    
    var owner: js.UndefOr[AddressEmail] = js.native
    
    var receiver: js.UndefOr[Refundattributesmethod] = js.native
    
    var redirect: js.UndefOr[ReturnurlString] = js.native
    
    var sepa_debit: js.UndefOr[Iban] = js.native
    
    var statement_descriptor: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
    
    var `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat = js.native
    
    var usage: js.UndefOr[reusable | single_use] = js.native
  }
  object ISourceCreationOptions {
    
    @scala.inline
    def apply(
      `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
    ): ISourceCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISourceCreationOptions]
    }
    
    @scala.inline
    implicit class ISourceCreationOptionsMutableBuilder[Self <: ISourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setFlow(value: redirect | receiver | code_verification | none): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      @scala.inline
      def setIdeal(value: Bank): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
      
      @scala.inline
      def setMandate(value: Acceptance): Self = StObject.set(x, "mandate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandateUndefined: Self = StObject.set(x, "mandate", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOwner(value: AddressEmail): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setReceiver(value: Refundattributesmethod): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
      
      @scala.inline
      def setRedirect(value: ReturnurlString): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSepa_debit(value: Iban): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
      
      @scala.inline
      def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setType(
        value: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: reusable | single_use): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait ISourceRetrieveOptions extends StObject {
    
    var client_secret: js.UndefOr[String] = js.native
  }
  object ISourceRetrieveOptions {
    
    @scala.inline
    def apply(): ISourceRetrieveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISourceRetrieveOptions]
    }
    
    @scala.inline
    implicit class ISourceRetrieveOptionsMutableBuilder[Self <: ISourceRetrieveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    }
  }
  
  @js.native
  trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
    
    var mandate: js.UndefOr[Currency] = js.native
    
    var owner: js.UndefOr[EmailName] = js.native
  }
  object ISourceUpdateOptions {
    
    @scala.inline
    def apply(): ISourceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISourceUpdateOptions]
    }
    
    @scala.inline
    implicit class ISourceUpdateOptionsMutableBuilder[Self <: ISourceUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMandate(value: Currency): Self = StObject.set(x, "mandate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandateUndefined: Self = StObject.set(x, "mandate", js.undefined)
      
      @scala.inline
      def setOwner(value: EmailName): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    }
  }
}
