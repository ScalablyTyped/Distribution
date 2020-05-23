package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lastnote extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var first_note: typings.vexflow.Vex.Flow.Note
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var last_note: typings.vexflow.Vex.Flow.Note
}

object Lastnote {
  @scala.inline
  def apply(
    first_note: typings.vexflow.Vex.Flow.Note,
    last_note: typings.vexflow.Vex.Flow.Note,
    first_indices: js.Array[Double] = null,
    last_indices: js.Array[Double] = null
  ): Lastnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices.asInstanceOf[js.Any])
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastnote]
  }
}

