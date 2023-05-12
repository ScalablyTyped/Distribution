package typings.stripe.anon

import typings.stripe.mod.Stripe.BankAccount
import typings.stripe.mod.Stripe.Card
import typings.stripe.stripeStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Token> */
trait ResponseToken extends StObject {
  
  /**
    * These bank accounts are payment methods on `Customer` objects.
    *
    * On the other hand [External Accounts](https://stripe.com/docs/api#external_accounts) are transfer
    * destinations on `Account` objects for [Custom accounts](https://stripe.com/docs/connect/custom-accounts).
    * They can be bank accounts or debit cards as well, and are documented in the links above.
    *
    * Related guide: [Bank Debits and Transfers](https://stripe.com/docs/payments/bank-debits-transfers).
    */
  var bank_account: js.UndefOr[BankAccount] = js.undefined
  
  /**
    * You can store multiple cards on a customer in order to charge the customer
    * later. You can also store multiple debit cards on a recipient in order to
    * transfer to those cards later.
    *
    * Related guide: [Card Payments with Sources](https://stripe.com/docs/sources/cards).
    */
  var card: js.UndefOr[Card] = js.undefined
  
  /**
    * IP address of the client that generated the token.
    */
  var client_ip: String | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: token
  
  /**
    * Type of the token: `account`, `bank_account`, `card`, or `pii`.
    */
  var `type`: String
  
  /**
    * Whether this token has already been used (tokens can be used only once).
    */
  var used: Boolean
}
object ResponseToken {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    `type`: String,
    used: Boolean
  ): ResponseToken = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any], client_ip = null)
    __obj.updateDynamic("object")("token")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseToken] (val x: Self) extends AnyVal {
    
    inline def setBank_account(value: BankAccount): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
    
    inline def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setClient_ipNull: Self = StObject.set(x, "client_ip", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: token): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
