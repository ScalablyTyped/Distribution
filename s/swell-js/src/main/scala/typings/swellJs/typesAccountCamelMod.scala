package typings.swellJs

import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccountCamelMod {
  
  /* Inlined {[ K in keyof swell-js.AccountSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.AccountSnake[K]} */
  trait AccountCamel extends StObject {
    
    var addresses: js.UndefOr[js.Array[AddressSnake]] = js.undefined
    
    var balance: js.UndefOr[Double] = js.undefined
    
    var billing: js.UndefOr[AddressSnake] = js.undefined
    
    var cards: js.UndefOr[js.Array[Card]] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_first_order: js.UndefOr[String] = js.undefined
    
    var date_last_order: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var email_optin: js.UndefOr[Boolean] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
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
  object AccountCamel {
    
    inline def apply(): AccountCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccountCamel] (val x: Self) extends AnyVal {
      
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
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_first_order(value: String): Self = StObject.set(x, "date_first_order", value.asInstanceOf[js.Any])
      
      inline def setDate_first_orderUndefined: Self = StObject.set(x, "date_first_order", js.undefined)
      
      inline def setDate_last_order(value: String): Self = StObject.set(x, "date_last_order", value.asInstanceOf[js.Any])
      
      inline def setDate_last_orderUndefined: Self = StObject.set(x, "date_last_order", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmail_optin(value: Boolean): Self = StObject.set(x, "email_optin", value.asInstanceOf[js.Any])
      
      inline def setEmail_optinUndefined: Self = StObject.set(x, "email_optin", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
  
  /* Inlined {[ K in keyof swell-js.AddressSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.AddressSnake[K]} */
  trait AddressCamel extends StObject {
    
    var account_address_id: js.UndefOr[String] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var address1: String
    
    var address2: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var fingerprint: js.UndefOr[String] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parent_id: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object AddressCamel {
    
    inline def apply(address1: String): AddressCamel = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount_address_id(value: String): Self = StObject.set(x, "account_address_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_address_idUndefined: Self = StObject.set(x, "account_address_id", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
      
      inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.PasswordTokenInputSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.PasswordTokenInputSnake[K]} */
  trait PasswordTokenInputCamel extends StObject {
    
    var password_token: js.UndefOr[String] = js.undefined
  }
  object PasswordTokenInputCamel {
    
    inline def apply(): PasswordTokenInputCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordTokenInputCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasswordTokenInputCamel] (val x: Self) extends AnyVal {
      
      inline def setPassword_token(value: String): Self = StObject.set(x, "password_token", value.asInstanceOf[js.Any])
      
      inline def setPassword_tokenUndefined: Self = StObject.set(x, "password_token", js.undefined)
    }
  }
}
