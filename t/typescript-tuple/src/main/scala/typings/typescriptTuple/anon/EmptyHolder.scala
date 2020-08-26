package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyHolder[Holder /* <: js.Array[js.Array[_]] */, Types /* <: js.Array[_] */] extends js.Object {
  var empty: Holder = js.native
  var infinite: js.Any = js.native
  var nonEmpty: js.Any = js.native
}

object EmptyHolder {
  @scala.inline
  def apply[/* <: js.Array[js.Array[_]] */ Holder, /* <: js.Array[_] */ Types](empty: Holder, infinite: js.Any, nonEmpty: js.Any): EmptyHolder[Holder, Types] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyHolder[Holder, Types]]
  }
  @scala.inline
  implicit class EmptyHolderOps[Self <: EmptyHolder[_, _], /* <: js.Array[js.Array[_]] */ Holder, /* <: js.Array[_] */ Types] (val x: Self with (EmptyHolder[Holder, Types])) extends AnyVal {
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
    def setEmpty(value: Holder): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinite(value: js.Any): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonEmpty(value: js.Any): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
  
}

