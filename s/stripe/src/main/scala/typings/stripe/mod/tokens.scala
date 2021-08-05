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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokens {
  
  trait IBankAccountToken
    extends StObject
       with ITokenBase {
    
    /**
      * Hash describing the bank account
      */
    var bank_account: js.UndefOr[IBankAccountHash] = js.undefined
  }
  object IBankAccountToken {
    
    inline def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `type`: card | bank_account,
      used: Boolean
    ): IBankAccountToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("token")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountToken]
    }
    
    extension [Self <: IBankAccountToken](x: Self) {
      
      inline def setBank_account(value: IBankAccountHash): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
      
      inline def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    }
  }
  
  trait IBankAccountTokenCreationOptions
    extends StObject
       with ITokenCreationOptionsBase {
    
    /**
      * The bank account this token will represent. If you also pass in
      * a customer, the bank account must be the ID of a bank account
      * belonging to the customer.  Otherwise, if you do not pass a
      * customer, a object containing a user's bank account details,
      * with the options described below.
      */
    var bank_account: String | ISourceCreationOptions
  }
  object IBankAccountTokenCreationOptions {
    
    inline def apply(bank_account: String | ISourceCreationOptions): IBankAccountTokenCreationOptions = {
      val __obj = js.Dynamic.literal(bank_account = bank_account.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountTokenCreationOptions]
    }
    
    extension [Self <: IBankAccountTokenCreationOptions](x: Self) {
      
      inline def setBank_account(value: String | ISourceCreationOptions): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICardToken
    extends StObject
       with ITokenBase {
    
    /**
      * Hash describing the card used to make the charge
      */
    var card: js.UndefOr[ICardHash] = js.undefined
  }
  object ICardToken {
    
    inline def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `type`: card | bank_account,
      used: Boolean
    ): ICardToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("token")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardToken]
    }
    
    extension [Self <: ICardToken](x: Self) {
      
      inline def setCard(value: ICardHash): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  trait ICardTokenCreationOptions
    extends StObject
       with ITokenCreationOptionsBase {
    
    /**
      * The card this token will represent. If you also pass in a customer,
      * the card must be the ID of a card belonging to the customer.
      * Otherwise, if you do not pass a customer, a object containing a
      * user's credit card details, with the options described below.
      */
    var card: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
  }
  object ICardTokenCreationOptions {
    
    inline def apply(): ICardTokenCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardTokenCreationOptions]
    }
    
    extension [Self <: ICardTokenCreationOptions](x: Self) {
      
      inline def setCard(value: String | ICardSourceCreationOptions): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  trait IPiiTokenCreationOptions
    extends StObject
       with IDataOptions {
    
    var pii: Personalidnumber
  }
  object IPiiTokenCreationOptions {
    
    inline def apply(pii: Personalidnumber): IPiiTokenCreationOptions = {
      val __obj = js.Dynamic.literal(pii = pii.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPiiTokenCreationOptions]
    }
    
    extension [Self <: IPiiTokenCreationOptions](x: Self) {
      
      inline def setPii(value: Personalidnumber): Self = StObject.set(x, "pii", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.stripe.mod.IObject because Already inherited
  - typings.stripe.mod.IResourceObject because Already inherited
  - typings.stripe.mod.tokens.ITokenBase because Already inherited
  - typings.stripe.mod.tokens.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ trait IToken
    extends StObject
       with ICardToken {
    
    /**
      * Hash describing the bank account
      */
    var bank_account: js.UndefOr[IBankAccountHash] = js.undefined
  }
  object IToken {
    
    inline def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `type`: card | bank_account,
      used: Boolean
    ): IToken = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("token")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    extension [Self <: IToken](x: Self) {
      
      inline def setBank_account(value: IBankAccountHash): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
      
      inline def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    }
  }
  
  trait ITokenBase
    extends StObject
       with IResourceObject {
    
    /**
      * IP address of the client that generated the token
      */
    var client_ip: String
    
    var created: Double
    
    var livemode: Boolean
    
    /**
      * Value is "token""
      */
    @JSName("object")
    var object_ITokenBase: token
    
    /**
      * Type of the token: card or bank_account
      */
    var `type`: card | bank_account
    
    /**
      * Whether or not this token has already been used (tokens can be used only once)
      */
    var used: Boolean
  }
  object ITokenBase {
    
    inline def apply(
      client_ip: String,
      created: Double,
      id: String,
      livemode: Boolean,
      `type`: card | bank_account,
      used: Boolean
    ): ITokenBase = {
      val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("token")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenBase]
    }
    
    extension [Self <: ITokenBase](x: Self) {
      
      inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setObject(value: token): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: card | bank_account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITokenCreationOptionsBase
    extends StObject
       with IDataOptions {
    
    /**
      * The customer (owned by the application's account) to create a
      * token for. For use with Stripe Connect only; this can only be used
      * with an OAuth access token or Stripe-Account header. For more
      * details, see the shared customers documentation.
      *
      * Stripe connect only
      */
    var customer: js.UndefOr[String] = js.undefined
  }
  object ITokenCreationOptionsBase {
    
    inline def apply(): ITokenCreationOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITokenCreationOptionsBase]
    }
    
    extension [Self <: ITokenCreationOptionsBase](x: Self) {
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    }
  }
}
