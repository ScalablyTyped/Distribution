package typings.swellJs

import typings.swellJs.swellJsStrings.account
import typings.swellJs.swellJsStrings.amazon
import typings.swellJs.swellJsStrings.card
import typings.swellJs.swellJsStrings.paypal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBillingCamelMod {
  
  /* Inlined {[ K in keyof swell-js.BillingAffirmSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingAffirmSnake[K]} */
  trait BillingAffirmCamel extends StObject {
    
    var checkout_token: js.UndefOr[String] = js.undefined
  }
  object BillingAffirmCamel {
    
    inline def apply(): BillingAffirmCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingAffirmCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingAffirmCamel] (val x: Self) extends AnyVal {
      
      inline def setCheckout_token(value: String): Self = StObject.set(x, "checkout_token", value.asInstanceOf[js.Any])
      
      inline def setCheckout_tokenUndefined: Self = StObject.set(x, "checkout_token", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingAppleSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingAppleSnake[K]} */
  trait BillingAppleCamel extends StObject {
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object BillingAppleCamel {
    
    inline def apply(): BillingAppleCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingAppleCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingAppleCamel] (val x: Self) extends AnyVal {
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingBancontactSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingBancontactSnake[K]} */
  trait BillingBancontactCamel extends StObject {
    
    var source: js.UndefOr[String] = js.undefined
  }
  object BillingBancontactCamel {
    
    inline def apply(): BillingBancontactCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingBancontactCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingBancontactCamel] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingSnake[K]} */
  trait BillingCamel extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var account_card: js.UndefOr[Any] = js.undefined
    
    var account_card_id: js.UndefOr[String] = js.undefined
    
    var address1: js.UndefOr[String] = js.undefined
    
    var address2: js.UndefOr[String] = js.undefined
    
    var affirm: js.UndefOr[BillingAffirmSnake] = js.undefined
    
    var amazon: js.UndefOr[Any] = js.undefined
    
    var apple: js.UndefOr[BillingAppleSnake] = js.undefined
    
    var bancontact: js.UndefOr[BillingBancontactSnake] = js.undefined
    
    var card: js.UndefOr[Any] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var first_name: js.UndefOr[String] = js.undefined
    
    var google: js.UndefOr[BillingGoogleSnake] = js.undefined
    
    var ideal: js.UndefOr[BillingIdealSnake] = js.undefined
    
    var intent: js.UndefOr[Any] = js.undefined
    
    var klarna: js.UndefOr[BillingKlarnaSnake] = js.undefined
    
    var last_name: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[card | account | amazon | paypal] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var paypal: js.UndefOr[Any] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object BillingCamel {
    
    inline def apply(): BillingCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingCamel] (val x: Self) extends AnyVal {
      
      inline def setAccount_card(value: Any): Self = StObject.set(x, "account_card", value.asInstanceOf[js.Any])
      
      inline def setAccount_cardUndefined: Self = StObject.set(x, "account_card", js.undefined)
      
      inline def setAccount_card_id(value: String): Self = StObject.set(x, "account_card_id", value.asInstanceOf[js.Any])
      
      inline def setAccount_card_idUndefined: Self = StObject.set(x, "account_card_id", js.undefined)
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
      
      inline def setAffirm(value: BillingAffirmSnake): Self = StObject.set(x, "affirm", value.asInstanceOf[js.Any])
      
      inline def setAffirmUndefined: Self = StObject.set(x, "affirm", js.undefined)
      
      inline def setAmazon(value: Any): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      inline def setAmazonUndefined: Self = StObject.set(x, "amazon", js.undefined)
      
      inline def setApple(value: BillingAppleSnake): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
      
      inline def setAppleUndefined: Self = StObject.set(x, "apple", js.undefined)
      
      inline def setBancontact(value: BillingBancontactSnake): Self = StObject.set(x, "bancontact", value.asInstanceOf[js.Any])
      
      inline def setBancontactUndefined: Self = StObject.set(x, "bancontact", js.undefined)
      
      inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
      
      inline def setGoogle(value: BillingGoogleSnake): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
      
      inline def setIdeal(value: BillingIdealSnake): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
      
      inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
      
      inline def setIntent(value: Any): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setKlarna(value: BillingKlarnaSnake): Self = StObject.set(x, "klarna", value.asInstanceOf[js.Any])
      
      inline def setKlarnaUndefined: Self = StObject.set(x, "klarna", js.undefined)
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
      
      inline def setMethod(value: card | account | amazon | paypal): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaypal(value: Any): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
      
      inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingGoogleSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingGoogleSnake[K]} */
  trait BillingGoogleCamel extends StObject {
    
    var gateway: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object BillingGoogleCamel {
    
    inline def apply(): BillingGoogleCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingGoogleCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingGoogleCamel] (val x: Self) extends AnyVal {
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingIdealSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingIdealSnake[K]} */
  trait BillingIdealCamel extends StObject {
    
    var token: js.UndefOr[String] = js.undefined
  }
  object BillingIdealCamel {
    
    inline def apply(): BillingIdealCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingIdealCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingIdealCamel] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingKlarnaSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingKlarnaSnake[K]} */
  trait BillingKlarnaCamel extends StObject {
    
    var source: js.UndefOr[String] = js.undefined
  }
  object BillingKlarnaCamel {
    
    inline def apply(): BillingKlarnaCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingKlarnaCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingKlarnaCamel] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /* Inlined {[ K in keyof swell-js.BillingResolveSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.BillingResolveSnake[K]} */
  trait BillingResolveCamel extends StObject {
    
    var charge_id: js.UndefOr[String] = js.undefined
  }
  object BillingResolveCamel {
    
    inline def apply(): BillingResolveCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BillingResolveCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingResolveCamel] (val x: Self) extends AnyVal {
      
      inline def setCharge_id(value: String): Self = StObject.set(x, "charge_id", value.asInstanceOf[js.Any])
      
      inline def setCharge_idUndefined: Self = StObject.set(x, "charge_id", js.undefined)
    }
  }
}
