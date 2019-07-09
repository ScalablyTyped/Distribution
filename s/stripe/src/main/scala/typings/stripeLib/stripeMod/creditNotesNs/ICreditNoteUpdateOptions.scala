package typings
package stripeLib.stripeMod.creditNotesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * Credit note memo. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[java.lang.String] = js.undefined
}

object ICreditNoteUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    memo: java.lang.String = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null
  ): ICreditNoteUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICreditNoteUpdateOptions]
  }
}

