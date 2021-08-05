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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerTaxIds {
  
  trait ITaxId extends StObject {
    
    /**
      * Two-letter ISO code representing the country of the tax ID.
      */
    var country: string
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * ID of the customer.
      */
    var customer: String
    
    /**
      * Unique identifier for the object.
      */
    var id: String
    
    /**
      * Has the value true if the object exists in live mode or the value false if the
      * object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    var `object`: tax_id
    
    /**
      * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, nz_gst, or unknown.
      */
    var `type`: TaxIdType
    
    /**
      * Value of the tax ID.
      */
    var value: String
    
    /**
      * Tax ID verification information.
      */
    var verification: ITaxIdVerification
  }
  object ITaxId {
    
    inline def apply(
      created: Double,
      customer: String,
      id: String,
      livemode: Boolean,
      `type`: TaxIdType,
      value: String,
      verification: ITaxIdVerification
    ): ITaxId = {
      val __obj = js.Dynamic.literal(country = "string", created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("tax_id")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxId]
    }
    
    extension [Self <: ITaxId](x: Self) {
      
      inline def setCountry(value: string): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setObject(value: tax_id): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: TaxIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVerification(value: ITaxIdVerification): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITaxIdCreationOptions extends StObject {
    
    /**
      * Type of the tax ID, one of au_abn, eu_vat, in_gst, no_vat, or nz_gst
      */
    var `type`: TaxIdType
    
    /**
      * Value of the tax ID.
      */
    var value: String
  }
  object ITaxIdCreationOptions {
    
    inline def apply(`type`: TaxIdType, value: String): ITaxIdCreationOptions = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxIdCreationOptions]
    }
    
    extension [Self <: ITaxIdCreationOptions](x: Self) {
      
      inline def setType(value: TaxIdType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITaxIdVerification extends StObject {
    
    /**
      * Verification status, one of pending, unavailable, unverified, or verified.
      */
    var status: pending | unavailable | unverified | verified
    
    /**
      * Verified address.
      */
    var verified_address: String
    
    /**
      * Verified name.
      */
    var verified_name: String
  }
  object ITaxIdVerification {
    
    inline def apply(
      status: pending | unavailable | unverified | verified,
      verified_address: String,
      verified_name: String
    ): ITaxIdVerification = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], verified_address = verified_address.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaxIdVerification]
    }
    
    extension [Self <: ITaxIdVerification](x: Self) {
      
      inline def setStatus(value: pending | unavailable | unverified | verified): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setVerified_address(value: String): Self = StObject.set(x, "verified_address", value.asInstanceOf[js.Any])
      
      inline def setVerified_name(value: String): Self = StObject.set(x, "verified_name", value.asInstanceOf[js.Any])
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
    
    inline def au_abn: typings.stripe.stripeStrings.au_abn = "au_abn".asInstanceOf[typings.stripe.stripeStrings.au_abn]
    
    inline def eu_vat: typings.stripe.stripeStrings.eu_vat = "eu_vat".asInstanceOf[typings.stripe.stripeStrings.eu_vat]
    
    inline def in_gst: typings.stripe.stripeStrings.in_gst = "in_gst".asInstanceOf[typings.stripe.stripeStrings.in_gst]
    
    inline def no_vat: typings.stripe.stripeStrings.no_vat = "no_vat".asInstanceOf[typings.stripe.stripeStrings.no_vat]
    
    inline def nz_gst: typings.stripe.stripeStrings.nz_gst = "nz_gst".asInstanceOf[typings.stripe.stripeStrings.nz_gst]
    
    inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  }
}
