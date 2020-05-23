package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bracketed extends js.Object {
  var bracketed: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var notes_occupied: js.UndefOr[Double] = js.undefined
  var num_notes: js.UndefOr[Double] = js.undefined
  var ratioed: Boolean
  var y_offset: js.UndefOr[Double] = js.undefined
}

object Bracketed {
  @scala.inline
  def apply(
    ratioed: Boolean,
    bracketed: js.UndefOr[Boolean] = js.undefined,
    location: js.UndefOr[Double] = js.undefined,
    notes_occupied: js.UndefOr[Double] = js.undefined,
    num_notes: js.UndefOr[Double] = js.undefined,
    y_offset: js.UndefOr[Double] = js.undefined
  ): Bracketed = {
    val __obj = js.Dynamic.literal(ratioed = ratioed.asInstanceOf[js.Any])
    if (!js.isUndefined(bracketed)) __obj.updateDynamic("bracketed")(bracketed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notes_occupied)) __obj.updateDynamic("notes_occupied")(notes_occupied.get.asInstanceOf[js.Any])
    if (!js.isUndefined(num_notes)) __obj.updateDynamic("num_notes")(num_notes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y_offset)) __obj.updateDynamic("y_offset")(y_offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bracketed]
  }
}

