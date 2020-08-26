package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.native
  var onSuccess: js.UndefOr[SuccessCallback] = js.native
}

object CallCallbacksHash {
  @scala.inline
  def apply(): CallCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallCallbacksHash]
  }
  @scala.inline
  implicit class CallCallbacksHashOps[Self <: CallCallbacksHash] (val x: Self) extends AnyVal {
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
    def setOnError(value: /* args */ ErrorArgs => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* args */ DataArgs => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

