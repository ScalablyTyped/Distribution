package typings.stripe.stripeMod.creditNotes

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteListOptions extends IListOptions {
  /**
    * ID of the invoice.
    */
  var invoice: js.UndefOr[String] = js.undefined
}

object ICreditNoteListOptions {
  @scala.inline
  def apply(
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice: String = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): ICreditNoteListOptions = {
    val __obj = js.Dynamic.literal()
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (invoice != null) __obj.updateDynamic("invoice")(invoice.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteListOptions]
  }
}

