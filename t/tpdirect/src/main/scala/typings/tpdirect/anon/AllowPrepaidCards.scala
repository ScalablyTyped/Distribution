package typings.tpdirect.anon

import typings.tpdirect.AuthMethods
import typings.tpdirect.tpdirectStrings.FULL
import typings.tpdirect.tpdirectStrings.MIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPrepaidCards extends StObject {
  
  var allowPrepaidCards: Boolean
  
  var allowedCardAuthMethods: js.Array[AuthMethods]
  
  var allowedCountryCodes: js.Array[String]
  
  var billingAddressFormat: FULL | MIN
  
  var billingAddressRequired: js.UndefOr[Boolean] = js.undefined
  
  var emailRequired: js.UndefOr[Boolean] = js.undefined
  
  var googleMerchantId: String
  
  var merchantName: String
  
  var phoneNumberRequired: js.UndefOr[Boolean] = js.undefined
  
  var shippingAddressRequired: js.UndefOr[Boolean] = js.undefined
}
object AllowPrepaidCards {
  
  inline def apply(
    allowPrepaidCards: Boolean,
    allowedCardAuthMethods: js.Array[AuthMethods],
    allowedCountryCodes: js.Array[String],
    billingAddressFormat: FULL | MIN,
    googleMerchantId: String,
    merchantName: String
  ): AllowPrepaidCards = {
    val __obj = js.Dynamic.literal(allowPrepaidCards = allowPrepaidCards.asInstanceOf[js.Any], allowedCardAuthMethods = allowedCardAuthMethods.asInstanceOf[js.Any], allowedCountryCodes = allowedCountryCodes.asInstanceOf[js.Any], billingAddressFormat = billingAddressFormat.asInstanceOf[js.Any], googleMerchantId = googleMerchantId.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPrepaidCards]
  }
  
  extension [Self <: AllowPrepaidCards](x: Self) {
    
    inline def setAllowPrepaidCards(value: Boolean): Self = StObject.set(x, "allowPrepaidCards", value.asInstanceOf[js.Any])
    
    inline def setAllowedCardAuthMethods(value: js.Array[AuthMethods]): Self = StObject.set(x, "allowedCardAuthMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedCardAuthMethodsVarargs(value: AuthMethods*): Self = StObject.set(x, "allowedCardAuthMethods", js.Array(value*))
    
    inline def setAllowedCountryCodes(value: js.Array[String]): Self = StObject.set(x, "allowedCountryCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedCountryCodesVarargs(value: String*): Self = StObject.set(x, "allowedCountryCodes", js.Array(value*))
    
    inline def setBillingAddressFormat(value: FULL | MIN): Self = StObject.set(x, "billingAddressFormat", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressRequired(value: Boolean): Self = StObject.set(x, "billingAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressRequiredUndefined: Self = StObject.set(x, "billingAddressRequired", js.undefined)
    
    inline def setEmailRequired(value: Boolean): Self = StObject.set(x, "emailRequired", value.asInstanceOf[js.Any])
    
    inline def setEmailRequiredUndefined: Self = StObject.set(x, "emailRequired", js.undefined)
    
    inline def setGoogleMerchantId(value: String): Self = StObject.set(x, "googleMerchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberRequired(value: Boolean): Self = StObject.set(x, "phoneNumberRequired", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberRequiredUndefined: Self = StObject.set(x, "phoneNumberRequired", js.undefined)
    
    inline def setShippingAddressRequired(value: Boolean): Self = StObject.set(x, "shippingAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressRequiredUndefined: Self = StObject.set(x, "shippingAddressRequired", js.undefined)
  }
}
