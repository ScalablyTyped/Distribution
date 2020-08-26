package typings.tarn.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  def reject[T](err: T): js.Any = js.native
  def resolve(`val`: T): js.Any = js.native
}

object Deferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => js.Any, resolve: T => js.Any): Deferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
  @scala.inline
  implicit class DeferredOps[Self <: Deferred[_], T] (val x: Self with Deferred[T]) extends AnyVal {
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
    def setPromise(value: js.Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: js.Any => js.Any): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: T => js.Any): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

