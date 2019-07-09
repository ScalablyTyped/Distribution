package typings
package stripeLib.stripeMod.creditNotesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteListOptions
  extends stripeLib.stripeMod.IListOptions {
  /**
    * ID of the invoice.
    */
  var invoice: js.UndefOr[java.lang.String] = js.undefined
}

object ICreditNoteListOptions {
  @scala.inline
  def apply(
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    invoice: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): ICreditNoteListOptions = {
    val __obj = js.Dynamic.literal()
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[ICreditNoteListOptions]
  }
}

