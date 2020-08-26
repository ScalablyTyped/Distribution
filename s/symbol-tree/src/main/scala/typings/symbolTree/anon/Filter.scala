package typings.symbolTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter[THIS, T /* <: js.Object */] extends js.Object {
  var thisArg: THIS = js.native
  def filter(`object`: T): js.Any = js.native
}

object Filter {
  @scala.inline
  def apply[THIS, /* <: js.Object */ T](filter: T => js.Any, thisArg: THIS): Filter[THIS, T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter[THIS, T]]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter[_, _], THIS, /* <: js.Object */ T] (val x: Self with (Filter[THIS, T])) extends AnyVal {
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
    def setFilter(value: T => js.Any): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setThisArg(value: THIS): Self = this.set("thisArg", value.asInstanceOf[js.Any])
  }
  
}

