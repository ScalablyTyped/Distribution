package typings.stripe.mod

import typings.stripe.anon.Company
import typings.stripe.stripeStrings.country_spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countrySpecs {
  
  @js.native
  trait ICountrySpec extends IResourceObject {
    
    /**
      * The default currency for this country. This applies to both payment methods and bank accounts.
      */
    var default_currency: String = js.native
    
    /**
      * Value is "country_spec"
      */
    @JSName("object")
    var object_ICountrySpec: country_spec = js.native
    
    /**
      * Currencies that can be accepted in the specified country (for payments).
      */
    var supported_payment_currencies: js.Array[String] = js.native
    
    /**
      * Payment methods available in the specified country. You will need to enable bitcoin and ACH payments on your account for those methods to
      * appear in this list. The stripe payment method refers to charging through your platform.
      */
    var supported_payment_methods: js.Array[String] = js.native
    
    /**
      * Lists the types of verification data needed to keep an account open. Includes 'minimum' fields, which every account must eventually
      * provide, as well as a 'additional' fields, which are only required for some merchants.
      */
    var verification_fields: Company = js.native
  }
  object ICountrySpec {
    
    @scala.inline
    def apply(
      default_currency: String,
      id: String,
      `object`: country_spec,
      supported_payment_currencies: js.Array[String],
      supported_payment_methods: js.Array[String],
      verification_fields: Company
    ): ICountrySpec = {
      val __obj = js.Dynamic.literal(default_currency = default_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], supported_payment_currencies = supported_payment_currencies.asInstanceOf[js.Any], supported_payment_methods = supported_payment_methods.asInstanceOf[js.Any], verification_fields = verification_fields.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICountrySpec]
    }
    
    @scala.inline
    implicit class ICountrySpecMutableBuilder[Self <: ICountrySpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault_currency(value: String): Self = StObject.set(x, "default_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: country_spec): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported_payment_currencies(value: js.Array[String]): Self = StObject.set(x, "supported_payment_currencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported_payment_currenciesVarargs(value: String*): Self = StObject.set(x, "supported_payment_currencies", js.Array(value :_*))
      
      @scala.inline
      def setSupported_payment_methods(value: js.Array[String]): Self = StObject.set(x, "supported_payment_methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported_payment_methodsVarargs(value: String*): Self = StObject.set(x, "supported_payment_methods", js.Array(value :_*))
      
      @scala.inline
      def setVerification_fields(value: Company): Self = StObject.set(x, "verification_fields", value.asInstanceOf[js.Any])
    }
  }
}
