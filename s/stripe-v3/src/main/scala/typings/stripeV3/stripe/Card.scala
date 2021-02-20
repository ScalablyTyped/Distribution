package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.not_supported
import typings.stripeV3.stripeV3Strings.optional
import typings.stripeV3.stripeV3Strings.recommended
import typings.stripeV3.stripeV3Strings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends StObject {
  
  var address_city: js.UndefOr[String] = js.native
  
  var address_country: js.UndefOr[String] = js.native
  
  var address_line1: js.UndefOr[String] = js.native
  
  var address_line1_check: js.UndefOr[checkType] = js.native
  
  var address_line2: js.UndefOr[String] = js.native
  
  var address_state: js.UndefOr[String] = js.native
  
  var address_zip: js.UndefOr[String] = js.native
  
  var address_zip_check: js.UndefOr[checkType] = js.native
  
  var brand: brandType = js.native
  
  var country: String = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var cvc_check: js.UndefOr[checkType] = js.native
  
  var dynamic_last4: String = js.native
  
  var exp_month: Double = js.native
  
  var exp_year: Double = js.native
  
  var fingerprint: String = js.native
  
  var funding: fundingType = js.native
  
  var id: String = js.native
  
  var last4: String = js.native
  
  var metadata: js.Any = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `object`: String = js.native
  
  var three_d_secure: js.UndefOr[required | recommended | optional | not_supported] = js.native
  
  var tokenization_method: js.UndefOr[tokenizationType] = js.native
}
object Card {
  
  @scala.inline
  def apply(
    brand: brandType,
    country: String,
    dynamic_last4: String,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: fundingType,
    id: String,
    last4: String,
    metadata: js.Any,
    `object`: String
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dynamic_last4 = dynamic_last4.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_city(value: String): Self = StObject.set(x, "address_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_cityUndefined: Self = StObject.set(x, "address_city", js.undefined)
    
    @scala.inline
    def setAddress_country(value: String): Self = StObject.set(x, "address_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_countryUndefined: Self = StObject.set(x, "address_country", js.undefined)
    
    @scala.inline
    def setAddress_line1(value: String): Self = StObject.set(x, "address_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1Undefined: Self = StObject.set(x, "address_line1", js.undefined)
    
    @scala.inline
    def setAddress_line1_check(value: checkType): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line1_checkUndefined: Self = StObject.set(x, "address_line1_check", js.undefined)
    
    @scala.inline
    def setAddress_line2(value: String): Self = StObject.set(x, "address_line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_line2Undefined: Self = StObject.set(x, "address_line2", js.undefined)
    
    @scala.inline
    def setAddress_state(value: String): Self = StObject.set(x, "address_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_stateUndefined: Self = StObject.set(x, "address_state", js.undefined)
    
    @scala.inline
    def setAddress_zip(value: String): Self = StObject.set(x, "address_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zipUndefined: Self = StObject.set(x, "address_zip", js.undefined)
    
    @scala.inline
    def setAddress_zip_check(value: checkType): Self = StObject.set(x, "address_zip_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_zip_checkUndefined: Self = StObject.set(x, "address_zip_check", js.undefined)
    
    @scala.inline
    def setBrand(value: brandType): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setCvc_check(value: checkType): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvc_checkUndefined: Self = StObject.set(x, "cvc_check", js.undefined)
    
    @scala.inline
    def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunding(value: fundingType): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThree_d_secure(value: required | recommended | optional | not_supported): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
    
    @scala.inline
    def setTokenization_method(value: tokenizationType): Self = StObject.set(x, "tokenization_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenization_methodUndefined: Self = StObject.set(x, "tokenization_method", js.undefined)
  }
}
