package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firstindices extends js.Object {
  var first_indices: js.Array[Double] = js.native
  var first_note: typings.vexflow.Vex.Flow.Note = js.native
  var last_indices: js.Array[Double] = js.native
  var last_note: typings.vexflow.Vex.Flow.Note = js.native
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
  @scala.inline
  implicit class FirstindicesOps[Self <: Firstindices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirst_indicesVarargs(value: Double*): Self = this.set("first_indices", js.Array(value :_*))
    @scala.inline
    def setFirst_indices(value: js.Array[Double]): Self = this.set("first_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("first_note", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_indicesVarargs(value: Double*): Self = this.set("last_indices", js.Array(value :_*))
    @scala.inline
    def setLast_indices(value: js.Array[Double]): Self = this.set("last_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("last_note", value.asInstanceOf[js.Any])
  }
  
}

