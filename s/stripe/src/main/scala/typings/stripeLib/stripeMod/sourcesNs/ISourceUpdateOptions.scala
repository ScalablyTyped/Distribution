package typings
package stripeLib.stripeMod.sourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  var mandate: js.UndefOr[stripeLib.Anon_AcceptanceAmount] = js.undefined
  var owner: js.UndefOr[stripeLib.Anon_AddressEmailName] = js.undefined
}

object ISourceUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    mandate: stripeLib.Anon_AcceptanceAmount = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    owner: stripeLib.Anon_AddressEmailName = null
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

