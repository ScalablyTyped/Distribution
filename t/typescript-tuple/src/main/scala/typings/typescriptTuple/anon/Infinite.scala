package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Infinite[Default, Tuple /* <: js.Array[_] */] extends js.Object {
  var empty: Default = js.native
  var infinite: js.Any = js.native
  var multi: Default = js.native
  var single: js.Any = js.native
}

object Infinite {
  @scala.inline
  def apply[Default, /* <: js.Array[_] */ Tuple](empty: Default, infinite: js.Any, multi: Default, single: js.Any): Infinite[Default, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
    __obj.asInstanceOf[Infinite[Default, Tuple]]
  }
  @scala.inline
  implicit class InfiniteOps[Self <: Infinite[_, _], Default, /* <: js.Array[_] */ Tuple] (val x: Self with (Infinite[Default, Tuple])) extends AnyVal {
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
    def setEmpty(value: Default): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinite(value: js.Any): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulti(value: Default): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingle(value: js.Any): Self = this.set("single", value.asInstanceOf[js.Any])
  }
  
}

