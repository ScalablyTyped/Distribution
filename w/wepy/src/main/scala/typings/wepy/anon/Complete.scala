package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete[T] extends js.Object {
  def complete(): Unit = js.native
  def fail(): Unit = js.native
  def success(res: T): Unit = js.native
}

object Complete {
  @scala.inline
  def apply[T](complete: () => Unit, fail: () => Unit, success: T => Unit): Complete[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Complete[T]]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete[_], T] (val x: Self with Complete[T]) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def setSuccess(value: T => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

