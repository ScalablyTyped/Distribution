package typings.stripe.mod

import typings.stripe.anon.Personalidnumber
import typings.stripe.mod.bankAccounts.IBankAccountHash
import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import typings.stripe.mod.cards.ICardHash
import typings.stripe.mod.cards.ICardSourceCreationOptions
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokens {
  
  @js.native
  trait IBankAccountToken extends ITokenBase {
    
    /**
      * Hash describing the bank account
      */
    var bank_account: js.UndefOr[IBankAccountHash] = js.native
  }
  object IBankAccountToken {
    
    @scala.inline
    def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `object`: token,
      `type`: card | bank_account,
      used: Boolean
    ): IBankAccountToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountToken]
    }
    
    @scala.inline
    implicit class IBankAccountTokenMutableBuilder[Self <: IBankAccountToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_account(value: IBankAccountHash): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    }
  }
  
  @js.native
  trait IBankAccountTokenCreationOptions extends ITokenCreationOptionsBase {
    
    /**
      * The bank account this token will represent. If you also pass in
      * a customer, the bank account must be the ID of a bank account
      * belonging to the customer.  Otherwise, if you do not pass a
      * customer, a object containing a user's bank account details,
      * with the options described below.
      */
    var bank_account: String | ISourceCreationOptions = js.native
  }
  object IBankAccountTokenCreationOptions {
    
    @scala.inline
    def apply(bank_account: String | ISourceCreationOptions): IBankAccountTokenCreationOptions = {
      val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountTokenCreationOptions]
    }
    
    @scala.inline
    implicit class IBankAccountTokenCreationOptionsMutableBuilder[Self <: IBankAccountTokenCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_account(value: String | ISourceCreationOptions): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICardToken extends ITokenBase {
    
    /**
      * Hash describing the card used to make the charge
      */
    var card: js.UndefOr[ICardHash] = js.native
  }
  object ICardToken {
    
    @scala.inline
    def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `object`: token,
      `type`: card | bank_account,
      used: Boolean
    ): ICardToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardToken]
    }
    
    @scala.inline
    implicit class ICardTokenMutableBuilder[Self <: ICardToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: ICardHash): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  @js.native
  trait ICardTokenCreationOptions extends ITokenCreationOptionsBase {
    
    /**
      * The card this token will represent. If you also pass in a customer,
      * the card must be the ID of a card belonging to the customer.
      * Otherwise, if you do not pass a customer, a object containing a
      * user's credit card details, with the options described below.
      */
    var card: js.UndefOr[String | ICardSourceCreationOptions] = js.native
  }
  object ICardTokenCreationOptions {
    
    @scala.inline
    def apply(): ICardTokenCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardTokenCreationOptions]
    }
    
    @scala.inline
    implicit class ICardTokenCreationOptionsMutableBuilder[Self <: ICardTokenCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: String | ICardSourceCreationOptions): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  @js.native
  trait IPiiTokenCreationOptions extends IDataOptions {
    
    var pii: Personalidnumber = js.native
  }
  object IPiiTokenCreationOptions {
    
    @scala.inline
    def apply(pii: Personalidnumber): IPiiTokenCreationOptions = {
      val __obj = js.Dynamic.literal(pii = pii.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPiiTokenCreationOptions]
    }
    
    @scala.inline
    implicit class IPiiTokenCreationOptionsMutableBuilder[Self <: IPiiTokenCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPii(value: Personalidnumber): Self = StObject.set(x, "pii", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.stripe.mod.IObject because Already inherited
  - typings.stripe.mod.IResourceObject because Already inherited
  - typings.stripe.mod.tokens.ITokenBase because Already inherited
  - typings.stripe.mod.tokens.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ @js.native
  trait IToken extends ICardToken {
    
    /**
      * Hash describing the bank account
      */
    var bank_account: js.UndefOr[IBankAccountHash] = js.native
  }
  object IToken {
    
    @scala.inline
    def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `object`: token,
      `type`: card | bank_account,
      used: Boolean
    ): IToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    @scala.inline
    implicit class ITokenMutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBank_account(value: IBankAccountHash): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    }
  }
  
  @js.native
  trait ITokenBase extends IResourceObject {
    
    /**
      * IP address of the client that generated the token
      */
    var client_ip: String = js.native
    
    var created: Double = js.native
    
    var livemode: Boolean = js.native
    
    /**
      * Value is "token""
      */
    @JSName("object")
    var object_ITokenBase: token = js.native
    
    /**
      * Type of the token: card or bank_account
      */
    var `type`: card | bank_account = js.native
    
    /**
      * Whether or not this token has already been used (tokens can be used only once)
      */
    var used: Boolean = js.native
  }
  object ITokenBase {
    
    @scala.inline
    def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `object`: token,
      `type`: card | bank_account,
      used: Boolean
    ): ITokenBase = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenBase]
    }
    
    @scala.inline
    implicit class ITokenBaseMutableBuilder[Self <: ITokenBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: token): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: card | bank_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITokenCreationOptionsBase extends IDataOptions {
    
    /**
      * The customer (owned by the application's account) to create a
      * token for. For use with Stripe Connect only; this can only be used
      * with an OAuth access token or Stripe-Account header. For more
      * details, see the shared customers documentation.
      *
      * Stripe connect only
      */
    var customer: js.UndefOr[String] = js.native
  }
  object ITokenCreationOptionsBase {
    
    @scala.inline
    def apply(): ITokenCreationOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITokenCreationOptionsBase]
    }
    
    @scala.inline
    implicit class ITokenCreationOptionsBaseMutableBuilder[Self <: ITokenCreationOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    }
  }
}
