package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Empty[Finite, Tuple /* <: js.Array[_] */, Infinite] extends js.Object {
  var empty: Finite = js.native
  var infinite: Infinite = js.native
  var nonEmpty: js.Any = js.native
}

object Empty {
  @scala.inline
  def apply[Finite, /* <: js.Array[_] */ Tuple, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): Empty[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Empty[Finite, Tuple, Infinite]]
  }
  @scala.inline
  implicit class EmptyOps[Self <: Empty[_, _, _], Finite, /* <: js.Array[_] */ Tuple, Infinite] (val x: Self with (Empty[Finite, Tuple, Infinite])) extends AnyVal {
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
    def setEmpty(value: Finite): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinite(value: Infinite): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonEmpty(value: js.Any): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
  
}

