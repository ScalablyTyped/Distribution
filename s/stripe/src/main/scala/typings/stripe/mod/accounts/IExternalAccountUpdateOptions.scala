package typings.stripe.mod.accounts

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExternalAccountUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * If set to true, this bank account will become the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.undefined
}

object IExternalAccountUpdateOptions {
  @scala.inline
  def apply(
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IExternalAccountUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalAccountUpdateOptions]
  }
}

