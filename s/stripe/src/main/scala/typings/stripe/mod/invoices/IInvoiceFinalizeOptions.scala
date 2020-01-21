package typings.stripe.mod.invoices

import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceFinalizeOptions extends IDataOptions {
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: Boolean
}

object IInvoiceFinalizeOptions {
  @scala.inline
  def apply(auto_advance: Boolean, expand: js.Array[String] = null, include: js.Array[String] = null): IInvoiceFinalizeOptions = {
    val __obj = js.Dynamic.literal(auto_advance = auto_advance.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceFinalizeOptions]
  }
}

