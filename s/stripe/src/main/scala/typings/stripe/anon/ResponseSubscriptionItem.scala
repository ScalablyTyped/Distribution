package typings.stripe.anon

import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Plan
import typings.stripe.mod.Stripe.Price
import typings.stripe.mod.Stripe.SubscriptionItem.BillingThresholds
import typings.stripe.mod.Stripe.TaxRate
import typings.stripe.stripeStrings.subscription_item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.SubscriptionItem> */
trait ResponseSubscriptionItem extends StObject {
  
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period
    */
  var billing_thresholds: BillingThresholds | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  var deleted: js.UndefOr[Unit] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: subscription_item
  
  /**
    * You can now model subscriptions more flexibly using the [Prices API](https://stripe.com/docs/api#prices). It replaces the Plans API and is backwards compatible to simplify your migration.
    *
    * Plans define the base price, currency, and billing cycle for recurring purchases of products.
    * [Products](https://stripe.com/docs/api#products) help you track inventory or provisioning, and plans help you track pricing. Different physical goods or levels of service should be represented by products, and pricing options should be represented by plans. This approach lets you change prices without having to change your provisioning scheme.
    *
    * For example, you might have a single "gold" product that has plans for $10/month, $100/year, €9/month, and €90/year.
    *
    * Related guides: [Set up a subscription](https://stripe.com/docs/billing/subscriptions/set-up-subscription) and more about [products and prices](https://stripe.com/docs/products-prices/overview).
    */
  var plan: Plan
  
  /**
    * Prices define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of products.
    * [Products](https://stripe.com/docs/api#products) help you track inventory or provisioning, and prices help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing options should be represented by prices. This approach lets you change prices without having to change your provisioning scheme.
    *
    * For example, you might have a single "gold" product that has prices for $10/month, $100/year, and €9 once.
    *
    * Related guides: [Set up a subscription](https://stripe.com/docs/billing/subscriptions/set-up-subscription), [create an invoice](https://stripe.com/docs/billing/invoices/create), and more about [products and prices](https://stripe.com/docs/products-prices/overview).
    */
  var price: Price
  
  /**
    * The [quantity](https://stripe.com/docs/subscriptions/quantities) of the plan to which the customer should be subscribed.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The `subscription` this `subscription_item` belongs to.
    */
  var subscription: String
  
  /**
    * The tax rates which apply to this `subscription_item`. When set, the `default_tax_rates` on the subscription do not apply to this `subscription_item`.
    */
  var tax_rates: js.Array[TaxRate] | Null
}
object ResponseSubscriptionItem {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    metadata: Metadata,
    plan: Plan,
    price: Price,
    subscription: String
  ): ResponseSubscriptionItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], billing_thresholds = null, tax_rates = null)
    __obj.updateDynamic("object")("subscription_item")
    __obj.asInstanceOf[ResponseSubscriptionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSubscriptionItem] (val x: Self) extends AnyVal {
    
    inline def setBilling_thresholds(value: BillingThresholds): Self = StObject.set(x, "billing_thresholds", value.asInstanceOf[js.Any])
    
    inline def setBilling_thresholdsNull: Self = StObject.set(x, "billing_thresholds", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Unit): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: subscription_item): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Plan): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTax_rates(value: js.Array[TaxRate]): Self = StObject.set(x, "tax_rates", value.asInstanceOf[js.Any])
    
    inline def setTax_ratesNull: Self = StObject.set(x, "tax_rates", null)
    
    inline def setTax_ratesVarargs(value: TaxRate*): Self = StObject.set(x, "tax_rates", js.Array(value*))
  }
}
