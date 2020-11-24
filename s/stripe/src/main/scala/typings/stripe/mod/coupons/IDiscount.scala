package typings.stripe.mod.coupons

import typings.stripe.mod.IObject
import typings.stripe.stripeStrings.discount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A discount represents the actual application of a coupon to a particular customer. It contains information
  * about when the discount began and when it will end.
  */
@js.native
trait IDiscount extends IObject {
  
  /**
    * Hash describing the coupon applied to create this discount
    */
  var coupon: ICoupon = js.native
  
  var customer: String = js.native
  
  /**
    * If the coupon has a duration of once or repeating, the date that this discount will end. If the coupon
    * used has a forever duration, this attribute will be null.
    */
  var end: Double = js.native
  
  /**
    * Value is 'discount'
    */
  @JSName("object")
  var object_IDiscount: discount = js.native
  
  /**
    * Date that the coupon was applied
    */
  var start: Double = js.native
  
  /**
    * The subscription that this coupon is applied to, if it is applied to a particular subscription
    */
  var subscription: String = js.native
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
  
  @scala.inline
  implicit class IDiscountOps[Self <: IDiscount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoupon(value: ICoupon): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: discount): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
}
