package typings.stripe.mod.sources

import typings.stripe.anon.Currency
import typings.stripe.anon.EmailName
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
  var mandate: js.UndefOr[Currency] = js.undefined
  var owner: js.UndefOr[EmailName] = js.undefined
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    mandate: Currency = null,
    metadata: IOptionsMetadata = null,
    owner: EmailName = null
  ): ISourceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (mandate != null) __obj.updateDynamic("mandate")(mandate.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceUpdateOptions]
  }
}

