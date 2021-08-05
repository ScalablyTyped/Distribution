package typings.stripe.mod

import typings.stripe.anon.Usagegte
import typings.stripe.mod.plans.IPlan
import typings.stripe.stripeStrings.always_invoice
import typings.stripe.stripeStrings.create_prorations
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.subscription_item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionItems {
  
  /**
    * Subscription items allow you to create customer subscriptions with more than one plan, making it easy to represent
    * complex billing relationships.
    */
  trait ISubscriptionItem
    extends StObject
       with IResourceObject {
    
    /**
      * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
      */
    var billing_thresholds: Null | Usagegte
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information
      * about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * Value is "subscription_item"
      */
    @JSName("object")
    var object_ISubscriptionItem: subscription_item
    
    /**
      * Hash describing the plan the customer is subscribed to
      */
    var plan: IPlan
    
    /**
      * The quantity of the plan to which the customer should be subscribed.
      */
    var quantity: js.UndefOr[Double] = js.undefined
    
    /**
      * The subscription this subscription_item belongs to.
      */
    var subscription: String
  }
  object ISubscriptionItem {
    
    inline def apply(created: Double, id: String, metadata: IMetadata, plan: IPlan, subscription: String): ISubscriptionItem = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], billing_thresholds = null)
      __obj.updateDynamic("object")("subscription_item")
      __obj.asInstanceOf[ISubscriptionItem]
    }
    
    extension [Self <: ISubscriptionItem](x: Self) {
      
      inline def setBilling_thresholds(value: Usagegte): Self = StObject.set(x, "billing_thresholds", value.asInstanceOf[js.Any])
      
      inline def setBilling_thresholdsNull: Self = StObject.set(x, "billing_thresholds", null)
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: subscription_item): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: IPlan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISubscriptionItemCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * The identifier of the plan to add to the subscription.
      */
    var plan: String
    
    /**
      * Flag indicating whether to prorate switching plans during a billing cycle.
      */
    var prorate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
      * proration that was previewed with the upcoming invoice endpoint.
      */
    var proration_date: js.UndefOr[Double] = js.undefined
    
    /**
      * The quantity you’d like to apply to the subscription item you’re creating.
      */
    var quantity: js.UndefOr[Double] = js.undefined
    
    /**
      * The identifier of the subscription to modify.
      */
    var subscription: String
  }
  object ISubscriptionItemCreationOptions {
    
    inline def apply(plan: String, subscription: String): ISubscriptionItemCreationOptions = {
      val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubscriptionItemCreationOptions]
    }
    
    extension [Self <: ISubscriptionItemCreationOptions](x: Self) {
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setProrate(value: Boolean): Self = StObject.set(x, "prorate", value.asInstanceOf[js.Any])
      
      inline def setProrateUndefined: Self = StObject.set(x, "prorate", js.undefined)
      
      inline def setProration_date(value: Double): Self = StObject.set(x, "proration_date", value.asInstanceOf[js.Any])
      
      inline def setProration_dateUndefined: Self = StObject.set(x, "proration_date", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISubscriptionItemDeleteOptions
    extends StObject
       with IDataOptions {
    
    /**
      * Flag indicating whether to prorate switching plans during a billing cycle.
      */
    var prorate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines how to handle prorations when the billing cycle changes or if an item’s quantity changes.
      * Prorations can be disabled by passing none.
      */
    var proration_behavior: js.UndefOr[create_prorations | always_invoice | none] = js.undefined
    
    /**
      * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
      * proration that was previewed with the upcoming invoice endpoint.
      */
    var proration_date: js.UndefOr[Double] = js.undefined
  }
  object ISubscriptionItemDeleteOptions {
    
    inline def apply(): ISubscriptionItemDeleteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubscriptionItemDeleteOptions]
    }
    
    extension [Self <: ISubscriptionItemDeleteOptions](x: Self) {
      
      inline def setProrate(value: Boolean): Self = StObject.set(x, "prorate", value.asInstanceOf[js.Any])
      
      inline def setProrateUndefined: Self = StObject.set(x, "prorate", js.undefined)
      
      inline def setProration_behavior(value: create_prorations | always_invoice | none): Self = StObject.set(x, "proration_behavior", value.asInstanceOf[js.Any])
      
      inline def setProration_behaviorUndefined: Self = StObject.set(x, "proration_behavior", js.undefined)
      
      inline def setProration_date(value: Double): Self = StObject.set(x, "proration_date", value.asInstanceOf[js.Any])
      
      inline def setProration_dateUndefined: Self = StObject.set(x, "proration_date", js.undefined)
    }
  }
  
  trait ISubscriptionItemListOptions
    extends StObject
       with IListOptionsCreated {
    
    /**
      * The ID of the subscription whose items will be retrieved.
      */
    var subscription: String
  }
  object ISubscriptionItemListOptions {
    
    inline def apply(subscription: String): ISubscriptionItemListOptions = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubscriptionItemListOptions]
    }
    
    extension [Self <: ISubscriptionItemListOptions](x: Self) {
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISubscriptionItemUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * The identifier of the new plan for this subscription item.
      */
    var plan: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating whether to prorate switching plans during a billing cycle.
      */
    var prorate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
      * proration that was previewed with the upcoming invoice endpoint.
      */
    var proration_date: js.UndefOr[Double] = js.undefined
    
    /**
      * The quantity you’d like to apply to the subscription item you’re creating.
      */
    var quantity: js.UndefOr[Double] = js.undefined
  }
  object ISubscriptionItemUpdateOptions {
    
    inline def apply(): ISubscriptionItemUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubscriptionItemUpdateOptions]
    }
    
    extension [Self <: ISubscriptionItemUpdateOptions](x: Self) {
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setProrate(value: Boolean): Self = StObject.set(x, "prorate", value.asInstanceOf[js.Any])
      
      inline def setProrateUndefined: Self = StObject.set(x, "prorate", js.undefined)
      
      inline def setProration_date(value: Double): Self = StObject.set(x, "proration_date", value.asInstanceOf[js.Any])
      
      inline def setProration_dateUndefined: Self = StObject.set(x, "proration_date", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
}
