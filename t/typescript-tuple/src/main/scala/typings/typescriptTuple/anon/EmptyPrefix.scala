package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyPrefix[Prefix /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Prefix = js.native
  var infinite: CODENAME = js.native
  var nonEmpty: js.Any = js.native
}

object EmptyPrefix {
  @scala.inline
  def apply[/* <: js.Array[_] */ Prefix, /* <: js.Array[_] */ Tuple](empty: Prefix, infinite: CODENAME, nonEmpty: js.Any): EmptyPrefix[Prefix, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyPrefix[Prefix, Tuple]]
  }
  @scala.inline
  implicit class EmptyPrefixOps[Self <: EmptyPrefix[_, _], /* <: js.Array[_] */ Prefix, /* <: js.Array[_] */ Tuple] (val x: Self with (EmptyPrefix[Prefix, Tuple])) extends AnyVal {
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
    def setEmpty(value: Prefix): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinite(value: CODENAME): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonEmpty(value: js.Any): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
  
}

