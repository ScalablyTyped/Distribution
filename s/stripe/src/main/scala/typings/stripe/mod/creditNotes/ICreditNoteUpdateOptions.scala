package typings.stripe.mod.creditNotes

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
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
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteUpdateOptions]
  }
}

