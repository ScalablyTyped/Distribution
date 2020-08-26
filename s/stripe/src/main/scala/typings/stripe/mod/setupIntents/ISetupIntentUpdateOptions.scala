package typings.stripe.mod.setupIntents

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentUpdateOptions extends js.Object {
  /**
    * ID of the customer this SetupIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to `null` and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.native
}

object ISetupIntentUpdateOptions {
  @scala.inline
  def apply(): ISetupIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentUpdateOptions]
  }
  @scala.inline
  implicit class ISetupIntentUpdateOptionsOps[Self <: ISetupIntentUpdateOptions] (val x: Self) extends AnyVal {
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
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPayment_method(value: String): Self = this.set("payment_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method: Self = this.set("payment_method", js.undefined)
    @scala.inline
    def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = this.set("payment_method_types", js.Array(value :_*))
    @scala.inline
    def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = this.set("payment_method_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_method_types: Self = this.set("payment_method_types", js.undefined)
  }
  
}

