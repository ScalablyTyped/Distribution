package typings.stripe.mod

import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.string
import typings.stripe.stripeStrings.tax_id
import typings.stripe.stripeStrings.unavailable
import typings.stripe.stripeStrings.unknown_
import typings.stripe.stripeStrings.unverified
import typings.stripe.stripeStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerTaxIds {
  
  @js.native
  trait ITaxId extends StObject {
    
    /**
      * Two-letter ISO code representing the country of the tax ID.
      */
    var country: string = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * ID of the customer.
      */
    var customer: String = js.native
    
    /**
      * Unique identifier for the object.
      */
    var id: String = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the
      * object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    var `object`: tax_id = js.native
    
    /**
      * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, nz_gst, or unknown.
      */
    var `type`: TaxIdType = js.native
    
    /**
      * Value of the tax ID.
      */
    var value: String = js.native
    
    /**
      * Tax ID verification information.
      */
    var verification: ITaxIdVerification = js.native
  }
  object ITaxId {
    
    @scala.inline
    def apply(
      country: string,
      created: Double,
      customer: String,
      id: String,
      livemode: Boolean,
      `object`: tax_id,
      `type`: TaxIdType,
      value: String,
      verification: ITaxIdVerification
    ): ITaxId = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxId]
    }
    
    @scala.inline
    implicit class ITaxIdMutableBuilder[Self <: ITaxId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: string): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: tax_id): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: TaxIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerification(value: ITaxIdVerification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITaxIdCreationOptions extends StObject {
    
    /**
      * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, or nz_gst
      */
    var `type`: TaxIdType = js.native
    
    /**
      * Value of the tax ID.
      */
    var value: String = js.native
  }
  object ITaxIdCreationOptions {
    
    @scala.inline
    def apply(`type`: TaxIdType, value: String): ITaxIdCreationOptions = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxIdCreationOptions]
    }
    
    @scala.inline
    implicit class ITaxIdCreationOptionsMutableBuilder[Self <: ITaxIdCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: TaxIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITaxIdVerification extends StObject {
    
    /**
      * Verification status, one of pending, unavailable, unverified, or verified.
      */
    var status: pending | unavailable | unverified | verified = js.native
    
    /**
      * Verified address.
      */
    var verified_address: String = js.native
    
    /**
      * Verified name.
      */
    var verified_name: String = js.native
  }
  object ITaxIdVerification {
    
    @scala.inline
    def apply(
      status: pending | unavailable | unverified | verified,
      verified_address: String,
      verified_name: String
    ): ITaxIdVerification = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxIdVerification]
    }
    
    @scala.inline
    implicit class ITaxIdVerificationMutableBuilder[Self <: ITaxIdVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: pending | unavailable | unverified | verified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_address(value: String): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.au_abn
    - typings.stripe.stripeStrings.eu_vat
    - typings.stripe.stripeStrings.in_gst
    - typings.stripe.stripeStrings.no_vat
    - typings.stripe.stripeStrings.nz_gst
    - typings.stripe.stripeStrings.unknown_
  */
  trait TaxIdType extends StObject
  object TaxIdType {
    
    @scala.inline
    def au_abn: typings.stripe.stripeStrings.au_abn = "au_abn".asInstanceOf[typings.stripe.stripeStrings.au_abn]
    
    @scala.inline
    def eu_vat: typings.stripe.stripeStrings.eu_vat = "eu_vat".asInstanceOf[typings.stripe.stripeStrings.eu_vat]
    
    @scala.inline
    def in_gst: typings.stripe.stripeStrings.in_gst = "in_gst".asInstanceOf[typings.stripe.stripeStrings.in_gst]
    
    @scala.inline
    def no_vat: typings.stripe.stripeStrings.no_vat = "no_vat".asInstanceOf[typings.stripe.stripeStrings.no_vat]
    
    @scala.inline
    def nz_gst: typings.stripe.stripeStrings.nz_gst = "nz_gst".asInstanceOf[typings.stripe.stripeStrings.nz_gst]
    
    @scala.inline
    def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
}
