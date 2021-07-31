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
    
    @scala.inline
    def apply(id: String, `type`: String): IAssociatedObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAssociatedObject]
    }
    
    @scala.inline
    implicit class IAssociatedObjectMutableBuilder[Self <: IAssociatedObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICustomer extends StObject {
    
    /**
      * customer id
      */
    var customer: String
  }
  object ICustomer {
    
    @scala.inline
    def apply(customer: String): ICustomer = {
      val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomer]
    }
    
    @scala.inline
    implicit class ICustomerMutableBuilder[Self <: ICustomer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IEphemeralKeyMutableBuilder[Self <: IEphemeralKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociated_objects(value: js.Array[IAssociatedObject]): Self = StObject.set(x, "associated_objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociated_objectsVarargs(value: IAssociatedObject*): Self = StObject.set(x, "associated_objects", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: ephemeral_key): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStripeVersion extends StObject {
    
    /**
      * https://stripe.com/docs/upgrades#api-changelog
      */
    var stripe_version: String
  }
  object IStripeVersion {
    
    @scala.inline
    def apply(stripe_version: String): IStripeVersion = {
      val __obj = js.Dynamic.literal(stripe_version = stripe_version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStripeVersion]
    }
    
    @scala.inline
    implicit class IStripeVersionMutableBuilder[Self <: IStripeVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripe_version(value: String): Self = StObject.set(x, "stripe_version", value.asInstanceOf[js.Any])
    }
  }
}
