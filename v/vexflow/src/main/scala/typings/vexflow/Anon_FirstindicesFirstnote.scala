package typings.vexflow

import typings.vexflow.VexNs.FlowNs.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstindicesFirstnote extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var first_note: Note
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  var last_note: Note
}

object Anon_FirstindicesFirstnote {
  @scala.inline
  def apply(
    first_note: Note,
    last_note: Note,
    first_indices: js.Array[Double] = null,
    last_indices: js.Array[Double] = null
  ): Anon_FirstindicesFirstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note, last_note = last_note)
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices)
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices)
    __obj.asInstanceOf[Anon_FirstindicesFirstnote]
  }
}

