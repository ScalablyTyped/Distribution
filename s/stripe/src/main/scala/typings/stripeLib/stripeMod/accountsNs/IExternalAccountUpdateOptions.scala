package typings
package stripeLib.stripeMod.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExternalAccountUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * If set to true, this bank account will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
}

object IExternalAccountUpdateOptions {
  @scala.inline
  def apply(
    default_for_currency: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null
  ): IExternalAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IExternalAccountUpdateOptions]
  }
}

