package typings.stripe.mod

import typings.stripe.stripeStrings.ephemeral_key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ephemeralKeys {
  
  trait IAssociatedObject extends StObject {
    
    var id: String
    
    var `type`: String
  }
  object IAssociatedObject {
    
    inline def apply(id: String, `type`: String): IAssociatedObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAssociatedObject]
    }
    
    extension [Self <: IAssociatedObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICustomer extends StObject {
    
    /**
      * customer id
      */
    var customer: String
  }
  object ICustomer {
    
    inline def apply(customer: String): ICustomer = {
      val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomer]
    }
    
    extension [Self <: ICustomer](x: Self) {
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEphemeralKey
    extends StObject
       with IResourceObject {
    
    var associated_objects: js.Array[IAssociatedObject]
    
    var created: Double
    
    var expires: Double
    
    var livemode: Boolean
    
    @JSName("object")
    var object_IEphemeralKey: ephemeral_key
    
    var secret: String
  }
  object IEphemeralKey {
    
    inline def apply(
      associated_objects: js.Array[IAssociatedObject],
      created: Double,
      expires: Double,
      id: String,
      livemode: Boolean,
      secret: String
    ): IEphemeralKey = {
      val __obj = js.Dynamic.literal(associated_objects = associated_objects.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("ephemeral_key")
      __obj.asInstanceOf[IEphemeralKey]
    }
    
    extension [Self <: IEphemeralKey](x: Self) {
      
      inline def setAssociated_objects(value: js.Array[IAssociatedObject]): Self = StObject.set(x, "associated_objects", value.asInstanceOf[js.Any])
      
      inline def setAssociated_objectsVarargs(value: IAssociatedObject*): Self = StObject.set(x, "associated_objects", js.Array(value :_*))
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ephemeral_key): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStripeVersion extends StObject {
    
    /**
      * https://stripe.com/docs/upgrades#api-changelog
      */
    var stripe_version: String
  }
  object IStripeVersion {
    
    inline def apply(stripe_version: String): IStripeVersion = {
      val __obj = js.Dynamic.literal(stripe_version = stripe_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStripeVersion]
    }
    
    extension [Self <: IStripeVersion](x: Self) {
      
      inline def setStripe_version(value: String): Self = StObject.set(x, "stripe_version", value.asInstanceOf[js.Any])
    }
  }
}
