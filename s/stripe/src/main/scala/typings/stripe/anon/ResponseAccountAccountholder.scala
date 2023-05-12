package typings.stripe.anon

import typings.stripe.mod.Stripe.FinancialConnections.Account.AccountHolder
import typings.stripe.mod.Stripe.FinancialConnections.Account.Balance
import typings.stripe.mod.Stripe.FinancialConnections.Account.BalanceRefresh
import typings.stripe.mod.Stripe.FinancialConnections.Account.Category
import typings.stripe.mod.Stripe.FinancialConnections.Account.OwnershipRefresh
import typings.stripe.mod.Stripe.FinancialConnections.Account.Permission
import typings.stripe.mod.Stripe.FinancialConnections.Account.Status
import typings.stripe.mod.Stripe.FinancialConnections.Account.Subcategory
import typings.stripe.mod.Stripe.FinancialConnections.Account.SupportedPaymentMethodType
import typings.stripe.mod.Stripe.FinancialConnections.AccountOwnership
import typings.stripe.stripeStrings.financial_connectionsDotaccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.FinancialConnections.Account> */
trait ResponseAccountAccountholder extends StObject {
  
  /**
    * The account holder that this account belongs to.
    */
  var account_holder: AccountHolder | Null
  
  /**
    * The most recent information about the account's balance.
    */
  var balance: Balance | Null
  
  /**
    * The state of the most recent attempt to refresh the account balance.
    */
  var balance_refresh: BalanceRefresh | Null
  
  /**
    * The type of the account. Account category is further divided in `subcategory`.
    */
  var category: Category
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * A human-readable name that has been assigned to this account, either by the account holder or by the institution.
    */
  var display_name: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The name of the institution that holds this account.
    */
  var institution_name: String
  
  /**
    * The last 4 digits of the account number. If present, this will be 4 numeric characters.
    */
  var last4: String | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: financial_connectionsDotaccount
  
  /**
    * The most recent information about the account's owners.
    */
  var ownership: String | AccountOwnership | Null
  
  /**
    * The state of the most recent attempt to refresh the account owners.
    */
  var ownership_refresh: OwnershipRefresh | Null
  
  /**
    * The list of permissions granted by this account.
    */
  var permissions: js.Array[Permission] | Null
  
  /**
    * The status of the link to the account.
    */
  var status: Status
  
  /**
    * If `category` is `cash`, one of:
    *
    *  - `checking`
    *  - `savings`
    *  - `other`
    *
    * If `category` is `credit`, one of:
    *
    *  - `mortgage`
    *  - `line_of_credit`
    *  - `credit_card`
    *  - `other`
    *
    * If `category` is `investment` or `other`, this will be `other`.
    */
  var subcategory: Subcategory
  
  /**
    * The [PaymentMethod type](https://stripe.com/docs/api/payment_methods/object#payment_method_object-type)(s) that can be created from this account.
    */
  var supported_payment_method_types: js.Array[SupportedPaymentMethodType]
}
object ResponseAccountAccountholder {
  
  inline def apply(
    category: Category,
    created: Double,
    id: String,
    institution_name: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    status: Status,
    subcategory: Subcategory,
    supported_payment_method_types: js.Array[SupportedPaymentMethodType]
  ): ResponseAccountAccountholder = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], institution_name = institution_name.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subcategory = subcategory.asInstanceOf[js.Any], supported_payment_method_types = supported_payment_method_types.asInstanceOf[js.Any], account_holder = null, balance = null, balance_refresh = null, display_name = null, last4 = null, ownership = null, ownership_refresh = null, permissions = null)
    __obj.updateDynamic("object")("financial_connections.account")
    __obj.asInstanceOf[ResponseAccountAccountholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAccountAccountholder] (val x: Self) extends AnyVal {
    
    inline def setAccount_holder(value: AccountHolder): Self = StObject.set(x, "account_holder", value.asInstanceOf[js.Any])
    
    inline def setAccount_holderNull: Self = StObject.set(x, "account_holder", null)
    
    inline def setBalance(value: Balance): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceNull: Self = StObject.set(x, "balance", null)
    
    inline def setBalance_refresh(value: BalanceRefresh): Self = StObject.set(x, "balance_refresh", value.asInstanceOf[js.Any])
    
    inline def setBalance_refreshNull: Self = StObject.set(x, "balance_refresh", null)
    
    inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstitution_name(value: String): Self = StObject.set(x, "institution_name", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setLast4Null: Self = StObject.set(x, "last4", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: financial_connectionsDotaccount): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOwnership(value: String | AccountOwnership): Self = StObject.set(x, "ownership", value.asInstanceOf[js.Any])
    
    inline def setOwnershipNull: Self = StObject.set(x, "ownership", null)
    
    inline def setOwnership_refresh(value: OwnershipRefresh): Self = StObject.set(x, "ownership_refresh", value.asInstanceOf[js.Any])
    
    inline def setOwnership_refreshNull: Self = StObject.set(x, "ownership_refresh", null)
    
    inline def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubcategory(value: Subcategory): Self = StObject.set(x, "subcategory", value.asInstanceOf[js.Any])
    
    inline def setSupported_payment_method_types(value: js.Array[SupportedPaymentMethodType]): Self = StObject.set(x, "supported_payment_method_types", value.asInstanceOf[js.Any])
    
    inline def setSupported_payment_method_typesVarargs(value: SupportedPaymentMethodType*): Self = StObject.set(x, "supported_payment_method_types", js.Array(value*))
  }
}
