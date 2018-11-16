package typings
package stripeLib.stripeMod.StripeNs.couponsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * A discount represents the actual application of a coupon to a particular customer. It contains information
         * about when the discount began and when it will end.
         */

trait IDiscount
  extends stripeLib.stripeMod.StripeNs.IObject {
  /**
               * Hash describing the coupon applied to create this discount
               */
  var coupon: ICoupon
  var customer: java.lang.String
  /**
               * If the coupon has a duration of once or repeating, the date that this discount will end. If the coupon
               * used has a forever duration, this attribute will be null.
               */
  var end: scala.Double
  /**
               * Value is 'discount'
               */
  @JSName("object")
  var object_IDiscount: stripeLib.stripeLibStrings.discount
  /**
               * Date that the coupon was applied
               */
  var start: scala.Double
  /**
               * The subscription that this coupon is applied to, if it is applied to a particular subscription
               */
  var subscription: java.lang.String
}

