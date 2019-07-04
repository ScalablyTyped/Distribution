package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceFinalizeOptions
  extends stripeLib.stripeMod.IDataOptions {
  /**
    * Controls whether Stripe will perform
    * [automatic collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance)
    * of the invoice. When `false`, the invoice’s state will not automatically advance
    * without an explicit action.
    */
  var auto_advance: scala.Boolean
}

object IInvoiceFinalizeOptions {
  @scala.inline
  def apply(
    auto_advance: scala.Boolean,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null
  ): IInvoiceFinalizeOptions = {
    val __obj = js.Dynamic.literal(auto_advance = auto_advance)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[IInvoiceFinalizeOptions]
  }
}

