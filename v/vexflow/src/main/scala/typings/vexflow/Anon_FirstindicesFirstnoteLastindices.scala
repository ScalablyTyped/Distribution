package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstindicesFirstnoteLastindices extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var first_note: js.UndefOr[Note] = js.undefined
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var last_note: js.UndefOr[Note] = js.undefined
}

object Anon_FirstindicesFirstnoteLastindices {
  @scala.inline
  def apply(
    first_indices: js.Array[Double] = null,
    first_note: Note = null,
    last_indices: js.Array[Double] = null,
    last_note: Note = null
  ): Anon_FirstindicesFirstnoteLastindices = {
    val __obj = js.Dynamic.literal()
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices.asInstanceOf[js.Any])
    if (first_note != null) __obj.updateDynamic("first_note")(first_note.asInstanceOf[js.Any])
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices.asInstanceOf[js.Any])
    if (last_note != null) __obj.updateDynamic("last_note")(last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FirstindicesFirstnoteLastindices]
  }
}

