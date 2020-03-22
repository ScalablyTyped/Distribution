package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastindices extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var first_note: Note
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var last_note: Note
}

object AnonLastindices {
  @scala.inline
  def apply(
    first_note: Note,
    last_note: Note,
    first_indices: js.Array[Double] = null,
    last_indices: js.Array[Double] = null
  ): AnonLastindices = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices.asInstanceOf[js.Any])
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastindices]
  }
}

