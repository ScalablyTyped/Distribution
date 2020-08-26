package typings.sweetalert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reject extends js.Object {
  var reject: js.UndefOr[js.Function0[Unit]] = js.native
  var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
}

object Reject {
  @scala.inline
  def apply(): Reject = {
    val __obj = js.Dynamic.literal()
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
    def setReject(value: () => Unit): Self = this.set("reject", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    @scala.inline
    def setResolve(value: /* value */ String => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

