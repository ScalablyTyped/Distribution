package typings.tslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get[T /* <: js.Object */, V] extends js.Object {
  def get(o: T): js.UndefOr[V] = js.native
  def has(o: T): Boolean = js.native
}

object Get {
  @scala.inline
  def apply[/* <: js.Object */ T, V](get: T => js.UndefOr[V], has: T => Boolean): Get[T, V] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Get[T, V]]
  }
  @scala.inline
  implicit class GetOps[Self <: Get[_, _], /* <: js.Object */ T, V] (val x: Self with (Get[T, V])) extends AnyVal {
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
    def setGet(value: T => js.UndefOr[V]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
  
}

