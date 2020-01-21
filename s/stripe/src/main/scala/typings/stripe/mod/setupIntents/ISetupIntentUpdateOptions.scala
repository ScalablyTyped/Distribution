package typings.stripe.mod.setupIntents

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentUpdateOptions extends js.Object {
  /**
    * ID of the customer this SetupIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to `null` and then saving.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.undefined
}

object ISetupIntentUpdateOptions {
  @scala.inline
  def apply(
    customer: String = null,
    description: String = null,
    metadata: IOptionsMetadata = null,
    payment_method: String = null,
    payment_method_types: js.Array[SetupIntentPaymentMethodType] = null
  ): ISetupIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_types != null) __obj.updateDynamic("payment_method_types")(payment_method_types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentUpdateOptions]
  }
}

