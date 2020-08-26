package typings.urqlCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToPromise[T] extends js.Object {
  def toPromise(): js.Promise[T] = js.native
}

object ToPromise {
  @scala.inline
  def apply[T](toPromise: () => js.Promise[T]): ToPromise[T] = {
    val __obj = js.Dynamic.literal(toPromise = js.Any.fromFunction0(toPromise))
    __obj.asInstanceOf[ToPromise[T]]
  }
  @scala.inline
  implicit class ToPromiseOps[Self <: ToPromise[_], T] (val x: Self with ToPromise[T]) extends AnyVal {
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
    def setToPromise(value: () => js.Promise[T]): Self = this.set("toPromise", js.Any.fromFunction0(value))
  }
  
}

