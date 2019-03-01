package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerCardSourceCreationOptions extends ICustomerSourceCreationOptions {
  @JSName("source")
  var source_ICustomerCardSourceCreationOptions: stripeLib.stripeMod.StripeNs.cardsNs.ISourceCreationOptions
}

object ICustomerCardSourceCreationOptions {
  @scala.inline
  def apply(
    source: stripeLib.stripeMod.StripeNs.cardsNs.ISourceCreationOptions,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null
  ): ICustomerCardSourceCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICustomerCardSourceCreationOptions]
  }
}

