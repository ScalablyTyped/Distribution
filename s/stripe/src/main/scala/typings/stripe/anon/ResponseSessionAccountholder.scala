package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.FinancialConnections.Account
import typings.stripe.mod.Stripe.FinancialConnections.Session.AccountHolder
import typings.stripe.mod.Stripe.FinancialConnections.Session.Filters
import typings.stripe.mod.Stripe.FinancialConnections.Session.Permission
import typings.stripe.stripeStrings.financial_connectionsDotsession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.FinancialConnections.Session> */
trait ResponseSessionAccountholder extends StObject {
  
  /**
    * The account holder for whom accounts are collected in this session.
    */
  var account_holder: AccountHolder | Null
  
  /**
    * The accounts that were collected as part of this Session.
    */
  var accounts: ApiList[Account]
  
  /**
    * A value that will be passed to the client to launch the authentication flow.
    */
  var client_secret: String
  
  var filters: js.UndefOr[Filters] = js.undefined
  
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
  var `object`: financial_connectionsDotsession
  
  /**
    * Permissions requested for accounts collected during this session.
    */
  var permissions: js.Array[Permission]
  
  /**
    * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to this URL to return to your app.
    */
  var return_url: js.UndefOr[String] = js.undefined
}
object ResponseSessionAccountholder {
  
  inline def apply(
    accounts: ApiList[Account],
    client_secret: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    permissions: js.Array[Permission]
  ): ResponseSessionAccountholder = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], account_holder = null)
    __obj.updateDynamic("object")("financial_connections.session")
    __obj.asInstanceOf[ResponseSessionAccountholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSessionAccountholder] (val x: Self) extends AnyVal {
    
    inline def setAccount_holder(value: AccountHolder): Self = StObject.set(x, "account_holder", value.asInstanceOf[js.Any])
    
    inline def setAccount_holderNull: Self = StObject.set(x, "account_holder", null)
    
    inline def setAccounts(value: ApiList[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: financial_connectionsDotsession): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
  }
}
