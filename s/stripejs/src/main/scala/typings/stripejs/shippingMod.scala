package typings.stripejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shippingMod {
  
  trait ShippingAddress extends StObject {
    
    /**
      * An array of address line items
      * @example ['185 Berry St.', 'Suite 500', 'P.O. Box 12345']
      */
    var addressLine: js.Array[String]
    
    /**
      * The name of a city, town, village, etc
      */
    var city: String
    
    /**
      * Two-letter country code, capitalized
      * NOTE: The codes are specified by the ISO3166 alpha-2
      */
    var country: String
    
    /**
      * A logical subdivision of a city
      * NOTE: Not present on Apple platforms
      */
    var dependentLocality: String
    
    /**
      * The phone number of the recipient
      * NOTE: This is only filled if `requestPayerPhone` was set to `true`
      *
      * @see PaymentOptions.requestPayerPhone
      */
    var phone: String
    
    /**
      * The postal code or ZIP code
      * NOTE: This is known as the PIN code in India
      */
    var postalCode: String
    
    /**
      * The name of the recipient.
      * NOTE: This might be a person, a business name, or contain “care of” (c/o) instructions
      */
    var recipient: String
    
    /**
      * The most coarse subdivision of a country
      * NOTE: Depending on the country, this might correspond to a state, a province, an oblast, a prefecture,
      * or something else along these lines.
      */
    var region: String
    
    /**
      * The sorting code as used in, for example, France
      * NOTE: Not present on Apple platforms
      */
    var sortingCode: String
  }
  object ShippingAddress {
    
    @scala.inline
    def apply(
      addressLine: js.Array[String],
      city: String,
      country: String,
      dependentLocality: String,
      phone: String,
      postalCode: String,
      recipient: String,
      region: String,
      sortingCode: String
    ): ShippingAddress = {
      val __obj = js.Dynamic.literal(addressLine = addressLine.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], dependentLocality = dependentLocality.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], sortingCode = sortingCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingAddress]
    }
    
    @scala.inline
    implicit class ShippingAddressMutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressLine(value: js.Array[String]): Self = StObject.set(x, "addressLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressLineVarargs(value: String*): Self = StObject.set(x, "addressLine", js.Array(value :_*))
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependentLocality(value: String): Self = StObject.set(x, "dependentLocality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingCode(value: String): Self = StObject.set(x, "sortingCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShippingOption extends StObject {
    
    /**
      * The shipping costs for this option
      * NOTE: If the cost of this shipping option depends on the shipping address the customer enters,
      * listen for the `shippingaddresschange` event.
      */
    var amount: Double
    
    /**
      * A longer description of this shipping option.
      */
    var detail: String
    
    /**
      * A unique ID you create to keep track of this shipping option.
      * NOTE: You‘ll be told the ID of the selected option on changes and on completion.
      */
    var id: String
    
    /**
      * A short “title” for this shipping option.
      */
    var label: String
  }
  object ShippingOption {
    
    @scala.inline
    def apply(amount: Double, detail: String, id: String, label: String): ShippingOption = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShippingOption]
    }
    
    @scala.inline
    implicit class ShippingOptionMutableBuilder[Self <: ShippingOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
}
