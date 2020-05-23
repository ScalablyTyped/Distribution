package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firstindices extends js.Object {
  var first_indices: js.Array[Double]
  var first_note: typings.vexflow.Vex.Flow.Note
  var last_indices: js.Array[Double]
  var last_note: typings.vexflow.Vex.Flow.Note
}

object Firstindices {
  @scala.inline
  def apply(
    first_indices: js.Array[Double],
    first_note: typings.vexflow.Vex.Flow.Note,
    last_indices: js.Array[Double],
    last_note: typings.vexflow.Vex.Flow.Note
  ): Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices.asInstanceOf[js.Any], first_note = first_note.asInstanceOf[js.Any], last_indices = last_indices.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstindices]
  }
}

