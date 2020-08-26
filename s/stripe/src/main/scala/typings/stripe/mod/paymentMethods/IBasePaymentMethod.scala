package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Email
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.customers.ICustomer
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePaymentMethod extends IResourceObject {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: Null | Email = js.native
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  var created: Double = js.native
  /** The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer. [Expandable] */
  var customer: String | ICustomer | Null = js.native
  /** Has the value true if the object exists in live mode or the value false if the object exists in test mode. */
  var livemode: Boolean = js.native
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: IMetadata = js.native
  @JSName("object")
  var object_IBasePaymentMethod: payment_method = js.native
}

object IBasePaymentMethod {
  @scala.inline
  def apply(created: Double, id: String, livemode: Boolean, metadata: IMetadata, `object`: payment_method): IBasePaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePaymentMethod]
  }
  @scala.inline
  implicit class IBasePaymentMethodOps[Self <: IBasePaymentMethod] (val x: Self) extends AnyVal {
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
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: payment_method): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_details(value: Email): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_detailsNull: Self = this.set("billing_details", null)
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
  }
  
}

