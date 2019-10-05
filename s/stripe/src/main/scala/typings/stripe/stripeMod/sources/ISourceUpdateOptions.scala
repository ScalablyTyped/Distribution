package typings.stripe.stripeMod.sources

import typings.stripe.Anon_AcceptanceAmount
import typings.stripe.Anon_AddressEmailNamePhoneIAddress
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceUpdateOptions extends IDataOptionsWithMetadata {
  var mandate: js.UndefOr[Anon_AcceptanceAmount] = js.undefined
  var owner: js.UndefOr[Anon_AddressEmailNamePhoneIAddress] = js.undefined
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    mandate: Anon_AcceptanceAmount = null,
    metadata: IOptionsMetadata = null,
    owner: Anon_AddressEmailNamePhoneIAddress = null
  ): ISourceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (mandate != null) __obj.updateDynamic("mandate")(mandate)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ISourceUpdateOptions]
  }
}

