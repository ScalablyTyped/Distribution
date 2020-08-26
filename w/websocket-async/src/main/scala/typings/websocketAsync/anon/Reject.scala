package typings.websocketAsync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reject extends js.Object {
  def reject(reason: js.Any): Unit = js.native
  def resolve(data: js.Any): Unit = js.native
}

object Reject {
  @scala.inline
  def apply(reject: js.Any => Unit, resolve: js.Any => Unit): Reject = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Reject]
  }
  @scala.inline
  implicit class RejectOps[Self <: Reject] (val x: Self) extends AnyVal {
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
    def setReject(value: js.Any => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: js.Any => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

