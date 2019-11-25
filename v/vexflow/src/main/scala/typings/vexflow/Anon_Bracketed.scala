package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bracketed extends js.Object {
  var bracketed: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var notes_occupied: js.UndefOr[Double] = js.undefined
  var num_notes: js.UndefOr[Double] = js.undefined
  var ratioed: Boolean
  var y_offset: js.UndefOr[Double] = js.undefined
}

object Anon_Bracketed {
  @scala.inline
  def apply(
    ratioed: Boolean,
    bracketed: js.UndefOr[Boolean] = js.undefined,
    location: Int | Double = null,
    notes_occupied: Int | Double = null,
    num_notes: Int | Double = null,
    y_offset: Int | Double = null
  ): Anon_Bracketed = {
    val __obj = js.Dynamic.literal(ratioed = ratioed.asInstanceOf[js.Any])
    if (!js.isUndefined(bracketed)) __obj.updateDynamic("bracketed")(bracketed.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (notes_occupied != null) __obj.updateDynamic("notes_occupied")(notes_occupied.asInstanceOf[js.Any])
    if (num_notes != null) __obj.updateDynamic("num_notes")(num_notes.asInstanceOf[js.Any])
    if (y_offset != null) __obj.updateDynamic("y_offset")(y_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bracketed]
  }
}

