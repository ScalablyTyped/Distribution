package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bracketed extends js.Object {
  var bracketed: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[scala.Double] = js.undefined
  var notes_occupied: js.UndefOr[scala.Double] = js.undefined
  var num_notes: js.UndefOr[scala.Double] = js.undefined
  var ratioed: scala.Boolean
  var y_offset: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Bracketed {
  @scala.inline
  def apply(
    ratioed: scala.Boolean,
    bracketed: js.UndefOr[scala.Boolean] = js.undefined,
    location: scala.Int | scala.Double = null,
    notes_occupied: scala.Int | scala.Double = null,
    num_notes: scala.Int | scala.Double = null,
    y_offset: scala.Int | scala.Double = null
  ): Anon_Bracketed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ratioed")(ratioed)
    if (!js.isUndefined(bracketed)) __obj.updateDynamic("bracketed")(bracketed)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (notes_occupied != null) __obj.updateDynamic("notes_occupied")(notes_occupied.asInstanceOf[js.Any])
    if (num_notes != null) __obj.updateDynamic("num_notes")(num_notes.asInstanceOf[js.Any])
    if (y_offset != null) __obj.updateDynamic("y_offset")(y_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bracketed]
  }
}

