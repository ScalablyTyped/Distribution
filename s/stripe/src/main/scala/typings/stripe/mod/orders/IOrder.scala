package typings.stripe.mod.orders

import typings.stripe.anon.Canceled
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.customers.ICustomer
import typings.stripe.stripeStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrder extends IResourceObject {
  
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount for the order.
    */
  var amount: Double = js.native
  
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount returned for the order thus far.
    */
  var amount_returned: Double = js.native
  
  /**
    * ID of the Connect Application that created the order.
    */
  var application: String = js.native
  
  var application_fee: Double = js.native
  
  /**
    * The ID of the payment used to pay for the order. Present if the order status is paid, fulfilled, or refunded. [Expandable]
    */
  var charge: String | ICharge = js.native
  
  var created: Double = js.native
  
  /**
    * 3-letter ISO code representing the currency in which the order was made.
    */
  var currency: String = js.native
  
  /**
    * The customer used for the order. [Expandable]
    */
  var customer: String | ICustomer = js.native
  
  /**
    * The email address of the customer placing the order.
    */
  var email: String = js.native
  
  var external_coupon_code: String = js.native
  
  /**
    * List of items constituting the order.
    */
  var items: js.Array[IOrderItem] = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  /**
    * Value is "order"
    */
  @JSName("object")
  var object_IOrder: order = js.native
  
  /**
    * The shipping method that is currently selected for this order, if any. If present, it is equal to one of the ids of shipping methods
    * in the shipping_methods array. At order creation time, if there are multiple shipping methods, Stripe will automatically selected
    * the first method.
    */
  var selected_shipping_method: String = js.native
  
  /**
    * The shipping address for the order. Present if the order is for goods to be shipped.
    */
  var shipping: IShippingInformation = js.native
  
  /**
    * A list of supported shipping methods for this order. The desired shipping method can be specified either by updating the order, or
    * when paying it.
    */
  var shipping_methods: js.Array[IShippingMethod] = js.native
  
  var status: OrderStatus = js.native
  
  /**
    * The timestamps at which the order status was updated
    */
  var status_transitions: Canceled = js.native
  
  var updated: Double = js.native
}
object IOrder {
  
  @scala.inline
  def apply(
    amount: Double,
    amount_returned: Double,
    application: String,
    application_fee: Double,
    charge: String | ICharge,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    email: String,
    external_coupon_code: String,
    id: String,
    items: js.Array[IOrderItem],
    livemode: Boolean,
    metadata: IMetadata,
    `object`: order,
    selected_shipping_method: String,
    shipping: IShippingInformation,
    shipping_methods: js.Array[IShippingMethod],
    status: OrderStatus,
    status_transitions: Canceled,
    updated: Double
  ): IOrder = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_coupon_code = external_coupon_code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], selected_shipping_method = selected_shipping_method.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], shipping_methods = shipping_methods.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrder]
  }
  
  @scala.inline
  implicit class IOrderOps[Self <: IOrder] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_returned(value: Double): Self = this.set("amount_returned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee(value: Double): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharge(value: String | ICharge): Self = this.set("charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_coupon_code(value: String): Self = this.set("external_coupon_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: IOrderItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IOrderItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: order): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_shipping_method(value: String): Self = this.set("selected_shipping_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_methodsVarargs(value: IShippingMethod*): Self = this.set("shipping_methods", js.Array(value :_*))
    
    @scala.inline
    def setShipping_methods(value: js.Array[IShippingMethod]): Self = this.set("shipping_methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OrderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_transitions(value: Canceled): Self = this.set("status_transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
}
