package typings.stripe.stripeMod.coupons

import typings.stripe.stripeMod.IObject
import typings.stripe.stripeStrings.discount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A discount represents the actual application of a coupon to a particular customer. It contains information
  * about when the discount began and when it will end.
  */
trait IDiscount extends IObject {
  /**
    * Hash describing the coupon applied to create this discount
    */
  var coupon: ICoupon
  var customer: String
  /**
    * If the coupon has a duration of once or repeating, the date that this discount will end. If the coupon
    * used has a forever duration, this attribute will be null.
    */
  var end: Double
  /**
    * Value is 'discount'
    */
  @JSName("object")
  var object_IDiscount: discount
  /**
    * Date that the coupon was applied
    */
  var start: Double
  /**
    * The subscription that this coupon is applied to, if it is applied to a particular subscription
    */
  var subscription: String
}

object IDiscount {
  @scala.inline
  def apply(
    coupon: ICoupon,
    customer: String,
    end: Double,
    `object`: discount,
    start: Double,
    subscription: String
  ): IDiscount = {
    val __obj = js.Dynamic.literal(coupon = coupon.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiscount]
  }
}

