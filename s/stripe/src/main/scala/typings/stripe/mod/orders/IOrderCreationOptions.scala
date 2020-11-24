package typings.stripe.mod.orders

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrderCreationOptions extends IDataOptionsWithMetadata {
  
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[String] = js.native
  
  /**
    * 3-letter ISO code representing the currency in which the order should be made. Stripe will validate that all entries in items match
    * the currency specified here.
    */
  var currency: String = js.native
  
  /**
    * The ID of an existing customer to use for this order. If provided, the customer email and shipping address will be used to create
    * the order. Subsequently, the customer will also be charged to pay the order. If email or shipping are also provided, they will
    * override the values retrieved from the customer object.
    */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * The email address of the customer placing the order.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * List of items constituting the order.
    */
  var items: js.UndefOr[js.Array[IOrderItemCreationHash]] = js.native
  
  /**
    * Shipping address for the order. Required if any of the SKUs are for products that have shippable set to true.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.native
}
object IOrderCreationOptions {
  
  @scala.inline
  def apply(currency: String): IOrderCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderCreationOptions]
  }
  
  @scala.inline
  implicit class IOrderCreationOptionsOps[Self <: IOrderCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: IOrderItemCreationHash*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IOrderItemCreationHash]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
  }
}
