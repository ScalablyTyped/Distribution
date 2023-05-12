package typings.stripe.anon

import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.DeletedApplication
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Subscription
import typings.stripe.mod.Stripe.SubscriptionSchedule.CurrentPhase
import typings.stripe.mod.Stripe.SubscriptionSchedule.DefaultSettings
import typings.stripe.mod.Stripe.SubscriptionSchedule.EndBehavior
import typings.stripe.mod.Stripe.SubscriptionSchedule.Phase
import typings.stripe.mod.Stripe.SubscriptionSchedule.Status
import typings.stripe.mod.Stripe.TestHelpers.TestClock
import typings.stripe.stripeStrings.subscription_schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.SubscriptionSchedule> */
trait ResponseSubscriptionSched extends StObject {
  
  /**
    * ID of the Connect Application that created the schedule.
    */
  var application: String | Application | DeletedApplication | Null
  
  /**
    * Time at which the subscription schedule was canceled. Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null
  
  /**
    * Time at which the subscription schedule was completed. Measured in seconds since the Unix epoch.
    */
  var completed_at: Double | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Object representing the start and end dates for the current phase of the subscription schedule, if it is `active`.
    */
  var current_phase: CurrentPhase | Null
  
  /**
    * ID of the customer who owns the subscription schedule.
    */
  var customer: String | Customer | DeletedCustomer
  
  var default_settings: DefaultSettings
  
  /**
    * Behavior of the subscription schedule and underlying subscription when it ends. Possible values are `release` or `cancel` with the default being `release`. `release` will end the subscription schedule and keep the underlying subscription running.`cancel` will end the subscription schedule and cancel the underlying subscription.
    */
  var end_behavior: EndBehavior
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: subscription_schedule
  
  /**
    * Configuration for the subscription schedule's phases.
    */
  var phases: js.Array[Phase]
  
  /**
    * Time at which the subscription schedule was released. Measured in seconds since the Unix epoch.
    */
  var released_at: Double | Null
  
  /**
    * ID of the subscription once managed by the subscription schedule (if it is released).
    */
  var released_subscription: String | Null
  
  /**
    * The present status of the subscription schedule. Possible values are `not_started`, `active`, `completed`, `released`, and `canceled`. You can read more about the different states in our [behavior guide](https://stripe.com/docs/billing/subscriptions/subscription-schedules).
    */
  var status: Status
  
  /**
    * ID of the subscription managed by the subscription schedule.
    */
  var subscription: String | Subscription | Null
  
  /**
    * ID of the test clock this subscription schedule belongs to.
    */
  var test_clock: String | TestClock | Null
}
object ResponseSubscriptionSched {
  
  inline def apply(
    created: Double,
    customer: String | Customer | DeletedCustomer,
    default_settings: DefaultSettings,
    end_behavior: EndBehavior,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    phases: js.Array[Phase],
    status: Status
  ): ResponseSubscriptionSched = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], default_settings = default_settings.asInstanceOf[js.Any], end_behavior = end_behavior.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], application = null, canceled_at = null, completed_at = null, current_phase = null, metadata = null, released_at = null, released_subscription = null, subscription = null, test_clock = null)
    __obj.updateDynamic("object")("subscription_schedule")
    __obj.asInstanceOf[ResponseSubscriptionSched]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSubscriptionSched] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: String | Application | DeletedApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setCanceled_at(value: Double): Self = StObject.set(x, "canceled_at", value.asInstanceOf[js.Any])
    
    inline def setCanceled_atNull: Self = StObject.set(x, "canceled_at", null)
    
    inline def setCompleted_at(value: Double): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrent_phase(value: CurrentPhase): Self = StObject.set(x, "current_phase", value.asInstanceOf[js.Any])
    
    inline def setCurrent_phaseNull: Self = StObject.set(x, "current_phase", null)
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setDefault_settings(value: DefaultSettings): Self = StObject.set(x, "default_settings", value.asInstanceOf[js.Any])
    
    inline def setEnd_behavior(value: EndBehavior): Self = StObject.set(x, "end_behavior", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: subscription_schedule): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPhases(value: js.Array[Phase]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesVarargs(value: Phase*): Self = StObject.set(x, "phases", js.Array(value*))
    
    inline def setReleased_at(value: Double): Self = StObject.set(x, "released_at", value.asInstanceOf[js.Any])
    
    inline def setReleased_atNull: Self = StObject.set(x, "released_at", null)
    
    inline def setReleased_subscription(value: String): Self = StObject.set(x, "released_subscription", value.asInstanceOf[js.Any])
    
    inline def setReleased_subscriptionNull: Self = StObject.set(x, "released_subscription", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String | Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setTest_clock(value: String | TestClock): Self = StObject.set(x, "test_clock", value.asInstanceOf[js.Any])
    
    inline def setTest_clockNull: Self = StObject.set(x, "test_clock", null)
  }
}
