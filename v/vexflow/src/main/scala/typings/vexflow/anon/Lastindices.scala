package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lastindices extends js.Object {
  var first_indices: js.UndefOr[js.Array[Double]] = js.native
  var first_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.native
  var last_indices: js.UndefOr[js.Array[Double]] = js.native
  var last_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.native
}

object Lastindices {
  @scala.inline
  def apply(): Lastindices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lastindices]
  }
  @scala.inline
  implicit class LastindicesOps[Self <: Lastindices] (val x: Self) extends AnyVal {
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
    def deleteFirst_indices: Self = this.set("first_indices", js.undefined)
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("first_note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_note: Self = this.set("first_note", js.undefined)
    @scala.inline
    def setLast_indicesVarargs(value: Double*): Self = this.set("last_indices", js.Array(value :_*))
    @scala.inline
    def setLast_indices(value: js.Array[Double]): Self = this.set("last_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_indices: Self = this.set("last_indices", js.undefined)
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("last_note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_note: Self = this.set("last_note", js.undefined)
  }
  
}

