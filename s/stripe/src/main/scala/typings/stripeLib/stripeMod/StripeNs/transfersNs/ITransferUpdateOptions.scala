package typings
package stripeLib.stripeMod.StripeNs.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a transfer object. It is
    * displayed when in the web interface alongside the transfer. This
    * can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object ITransferUpdateOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null
  ): ITransferUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ITransferUpdateOptions]
  }
}

