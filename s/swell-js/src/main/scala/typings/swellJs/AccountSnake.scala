package typings.swellJs

import typings.swellJs.mod.BaseModel
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSnake
  extends StObject
     with BaseModel {
  
  var addresses: js.UndefOr[js.Array[AddressSnake]] = js.undefined
  
  var balance: js.UndefOr[Double] = js.undefined
  
  var billing: js.UndefOr[AddressSnake] = js.undefined
  
  var cards: js.UndefOr[js.Array[Card]] = js.undefined
  
  var date_first_order: js.UndefOr[String] = js.undefined
  
  var date_last_order: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_optin: js.UndefOr[Boolean] = js.undefined
  
  var first_name: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Object] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var order_count: js.UndefOr[Double] = js.undefined
  
  var order_value: js.UndefOr[Double] = js.undefined
  
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var password_reset_url: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var shipping: js.UndefOr[AddressSnake] = js.undefined
  
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var vat_number: js.UndefOr[String] = js.undefined
}
object AccountSnake {
  
  inline def apply(): AccountSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSnake] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[AddressSnake]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: AddressSnake*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setBilling(value: AddressSnake): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCards(value: js.Array[Card]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsVarargs(value: Card*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setDate_first_order(value: String): Self = StObject.set(x, "date_first_order", value.asInstanceOf[js.Any])
    
    inline def setDate_first_orderUndefined: Self = StObject.set(x, "date_first_order", js.undefined)
    
    inline def setDate_last_order(value: String): Self = StObject.set(x, "date_last_order", value.asInstanceOf[js.Any])
    
    inline def setDate_last_orderUndefined: Self = StObject.set(x, "date_last_order", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_optin(value: Boolean): Self = StObject.set(x, "email_optin", value.asInstanceOf[js.Any])
    
    inline def setEmail_optinUndefined: Self = StObject.set(x, "email_optin", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder_count(value: Double): Self = StObject.set(x, "order_count", value.asInstanceOf[js.Any])
    
    inline def setOrder_countUndefined: Self = StObject.set(x, "order_count", js.undefined)
    
    inline def setOrder_value(value: Double): Self = StObject.set(x, "order_value", value.asInstanceOf[js.Any])
    
    inline def setOrder_valueUndefined: Self = StObject.set(x, "order_value", js.undefined)
    
    inline def setOrders(value: js.Array[Order]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setOrdersVarargs(value: Order*): Self = StObject.set(x, "orders", js.Array(value*))
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPassword_reset_url(value: String): Self = StObject.set(x, "password_reset_url", value.asInstanceOf[js.Any])
    
    inline def setPassword_reset_urlUndefined: Self = StObject.set(x, "password_reset_url", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setShipping(value: AddressSnake): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVat_number(value: String): Self = StObject.set(x, "vat_number", value.asInstanceOf[js.Any])
    
    inline def setVat_numberUndefined: Self = StObject.set(x, "vat_number", js.undefined)
  }
}
