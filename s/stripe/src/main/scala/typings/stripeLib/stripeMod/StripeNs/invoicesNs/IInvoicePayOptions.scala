package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoicePayOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A payment source to be charged. The source must be the ID of a source
    * belonging to the customer associated with the invoice being paid.
    */
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions] = js.undefined
}

object IInvoicePayOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    source: stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions = null
  ): IInvoicePayOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoicePayOptions]
  }
}

