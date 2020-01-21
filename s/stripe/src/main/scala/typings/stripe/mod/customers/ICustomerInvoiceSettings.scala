package typings.stripe.mod.customers

import typings.stripe.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerInvoiceSettings extends js.Object {
  /**
    * Default custom fields to be displayed on invoices for this customer.
    */
  var custom_fields: js.UndefOr[js.Array[AnonName]] = js.undefined
  /**
    * ID of the default payment method used for subscriptions and invoices for the customer.
    */
  var default_payment_method: js.UndefOr[String] = js.undefined
  /**
    * Default footer to be displayed on invoices for this customer.
    * This can be unset by updating the value to null and then saving.
    */
  var footer: js.UndefOr[String] = js.undefined
}

object ICustomerInvoiceSettings {
  @scala.inline
  def apply(
    custom_fields: js.Array[AnonName] = null,
    default_payment_method: String = null,
    footer: String = null
  ): ICustomerInvoiceSettings = {
    val __obj = js.Dynamic.literal()
    if (custom_fields != null) __obj.updateDynamic("custom_fields")(custom_fields.asInstanceOf[js.Any])
    if (default_payment_method != null) __obj.updateDynamic("default_payment_method")(default_payment_method.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomerInvoiceSettings]
  }
}

