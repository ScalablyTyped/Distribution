package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lastindices extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var first_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.undefined
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var last_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.undefined
}

object Lastindices {
  @scala.inline
  def apply(
    first_indices: js.Array[Double] = null,
    first_note: typings.vexflow.Vex.Flow.Note = null,
    last_indices: js.Array[Double] = null,
    last_note: typings.vexflow.Vex.Flow.Note = null
  ): Lastindices = {
    val __obj = js.Dynamic.literal()
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices.asInstanceOf[js.Any])
    if (first_note != null) __obj.updateDynamic("first_note")(first_note.asInstanceOf[js.Any])
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices.asInstanceOf[js.Any])
    if (last_note != null) __obj.updateDynamic("last_note")(last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastindices]
  }
}

