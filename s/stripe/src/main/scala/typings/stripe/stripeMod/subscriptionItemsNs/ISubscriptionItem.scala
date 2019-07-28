package typings.stripe.stripeMod.subscriptionItemsNs

import typings.stripe.Anon_Usagegte
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.plansNs.IPlan
import typings.stripe.stripeStrings.subscription_item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription items allow you to create customer subscriptions with more than one plan, making it easy to represent
  * complex billing relationships.
  */
trait ISubscriptionItem extends IResourceObject {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: Null | Anon_Usagegte
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
  var quantity: Double
  /**
    * The subscription this subscription_item belongs to.
    */
  var subscription: String
}

object ISubscriptionItem {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    metadata: IMetadata,
    `object`: subscription_item,
    plan: IPlan,
    quantity: Double,
    subscription: String,
    billing_thresholds: Anon_Usagegte = null
  ): ISubscriptionItem = {
    val __obj = js.Dynamic.literal(created = created, id = id, metadata = metadata, plan = plan, quantity = quantity, subscription = subscription)
    __obj.updateDynamic("object")(`object`)
    if (billing_thresholds != null) __obj.updateDynamic("billing_thresholds")(billing_thresholds)
    __obj.asInstanceOf[ISubscriptionItem]
  }
}

