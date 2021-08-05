package typings.stripeV3.stripe

import typings.stripeV3.anon.Url
import typings.stripeV3.stripeV3Strings.off_session
import typings.stripeV3.stripeV3Strings.on_session
import typings.stripeV3.stripeV3Strings.redirect_to_url
import typings.stripeV3.stripeV3Strings.setup_intent
import typings.stripeV3.stripeV3Strings.use_stripe_sdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupIntents {
  
  trait SetupIntent extends StObject {
    
    /**
      * ID of the Connect application that created the SetupIntent.
      */
    var application: String | Null
    
    /**
      * Reason for cancellation of this SetupIntent.
      */
    var cancelation_reason: SetupIntentCancelationReason | Null
    
    /**
      * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
      * The client secret can be used to complete payment setup from your frontend.
      * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
      * Make sure that you have TLS enabled on any page that includes the client secret.
      */
    var client_secret: String
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * ID of the Customer this SetupIntent belongs to, if one exists.
      * If present, payment methods used with this SetupIntent can only be attached
      * to this Customer, and payment methods attached to other Customers cannot be
      * used with this SetupIntent.
      */
    var customer: String | Null
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier for the object.
      */
    var id: String
    
    /**
      * The error encountered in the previous SetupIntent confirmation.
      */
    var last_payment_error: Error | Null
    
    /**
      * Has the value true if the object exists in live mode or the value
      * false if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be
      * useful for storing additional information about the object in a structured format.
      */
    var metadata: Metadata
    
    /**
      * If present, this property tells you what actions you need to take in
      * order for your customer to continue payment setup.
      */
    var next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl
    
    /**
      * Value is "setup_intent".
      */
    var `object`: setup_intent
    
    /**
      * The account (if any) for which the setup is intended.
      */
    var on_behalf_of: String | Null
    
    /**
      * ID of the payment method used with this SetupIntent.
      */
    var payment_method: String | Null
    
    /**
      * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up.
      */
    var payment_method_types: js.Array[String]
    
    /**
      * Status of this SetupIntent
      */
    var status: SetupIntentStatus
    
    /**
      * Indicates how the payment method is intended to be used in the future.
      * Use on_session if you intend to only reuse the payment method
      * when the customer is in your checkout flow. Use off_session if your
      * customer may or may not be in your checkout flow. If not provided,
      * this value defaults to off_session.
      */
    var usage: on_session | off_session
  }
  object SetupIntent {
    
    inline def apply(
      client_secret: String,
      created: Double,
      id: String,
      livemode: Boolean,
      metadata: Metadata,
      next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl,
      payment_method_types: js.Array[String],
      status: SetupIntentStatus,
      usage: on_session | off_session
    ): SetupIntent = {
      val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], application = null, cancelation_reason = null, customer = null, last_payment_error = null, on_behalf_of = null, payment_method = null)
      __obj.updateDynamic("object")("setup_intent")
      __obj.asInstanceOf[SetupIntent]
    }
    
    extension [Self <: SetupIntent](x: Self) {
      
      inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationNull: Self = StObject.set(x, "application", null)
      
      inline def setCancelation_reason(value: SetupIntentCancelationReason): Self = StObject.set(x, "cancelation_reason", value.asInstanceOf[js.Any])
      
      inline def setCancelation_reasonNull: Self = StObject.set(x, "cancelation_reason", null)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_payment_error(value: Error): Self = StObject.set(x, "last_payment_error", value.asInstanceOf[js.Any])
      
      inline def setLast_payment_errorNull: Self = StObject.set(x, "last_payment_error", null)
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setNext_action(value: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
      
      inline def setObject(value: setup_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      inline def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      inline def setPayment_method_types(value: js.Array[String]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      inline def setPayment_method_typesVarargs(value: String*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
      
      inline def setStatus(value: SetupIntentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: on_session | off_session): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.abandoned
    - typings.stripeV3.stripeV3Strings.requested_by_customer
    - typings.stripeV3.stripeV3Strings.duplicate
  */
  trait SetupIntentCancelationReason extends StObject
  object SetupIntentCancelationReason {
    
    inline def abandoned: typings.stripeV3.stripeV3Strings.abandoned = "abandoned".asInstanceOf[typings.stripeV3.stripeV3Strings.abandoned]
    
    inline def duplicate: typings.stripeV3.stripeV3Strings.duplicate = "duplicate".asInstanceOf[typings.stripeV3.stripeV3Strings.duplicate]
    
    inline def requested_by_customer: typings.stripeV3.stripeV3Strings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripeV3.stripeV3Strings.requested_by_customer]
  }
  
  trait SetupIntentNextActionRedirectToUrl extends StObject {
    
    /**
      * Contains instructions for authenticating a payment by
      * redirecting your customer to another page or application.
      */
    var redirect_to_url: Url
    
    /**
      * Type of the next action to perform
      */
    var `type`: redirect_to_url
  }
  object SetupIntentNextActionRedirectToUrl {
    
    inline def apply(redirect_to_url: Url): SetupIntentNextActionRedirectToUrl = {
      val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("redirect_to_url")
      __obj.asInstanceOf[SetupIntentNextActionRedirectToUrl]
    }
    
    extension [Self <: SetupIntentNextActionRedirectToUrl](x: Self) {
      
      inline def setRedirect_to_url(value: Url): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetupIntentNextActionUseStripeSdk extends StObject {
    
    /**
      * Type of the next action to perform
      */
    var `type`: use_stripe_sdk
    
    /**
      * When confirming a SetupIntent with Stripe.js, Stripe.js depends on
      * the contents of this dictionary to invoke authentication flows. The
      * shape of the contents is subject to change and is only intended to
      * be used by Stripe.js.
      */
    var use_stripe_sdk: js.Any
  }
  object SetupIntentNextActionUseStripeSdk {
    
    inline def apply(use_stripe_sdk: js.Any): SetupIntentNextActionUseStripeSdk = {
      val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("use_stripe_sdk")
      __obj.asInstanceOf[SetupIntentNextActionUseStripeSdk]
    }
    
    extension [Self <: SetupIntentNextActionUseStripeSdk](x: Self) {
      
      inline def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUse_stripe_sdk(value: js.Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripeV3.stripeV3Strings.requires_payment_method
    - typings.stripeV3.stripeV3Strings.requires_confirmation
    - typings.stripeV3.stripeV3Strings.requires_action
    - typings.stripeV3.stripeV3Strings.processing
    - typings.stripeV3.stripeV3Strings.canceled
    - typings.stripeV3.stripeV3Strings.succeeded
  */
  trait SetupIntentStatus extends StObject
  object SetupIntentStatus {
    
    inline def canceled: typings.stripeV3.stripeV3Strings.canceled = "canceled".asInstanceOf[typings.stripeV3.stripeV3Strings.canceled]
    
    inline def processing: typings.stripeV3.stripeV3Strings.processing = "processing".asInstanceOf[typings.stripeV3.stripeV3Strings.processing]
    
    inline def requires_action: typings.stripeV3.stripeV3Strings.requires_action = "requires_action".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_action]
    
    inline def requires_confirmation: typings.stripeV3.stripeV3Strings.requires_confirmation = "requires_confirmation".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_confirmation]
    
    inline def requires_payment_method: typings.stripeV3.stripeV3Strings.requires_payment_method = "requires_payment_method".asInstanceOf[typings.stripeV3.stripeV3Strings.requires_payment_method]
    
    inline def succeeded: typings.stripeV3.stripeV3Strings.succeeded = "succeeded".asInstanceOf[typings.stripeV3.stripeV3Strings.succeeded]
  }
}
