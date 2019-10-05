package typings.stripe.stripeMod.creditNotes

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Credit note memo. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.undefined
}

object ICreditNoteUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    memo: String = null,
    metadata: IOptionsMetadata = null
  ): ICreditNoteUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[ICreditNoteUpdateOptions]
  }
}

