package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleLineMenuResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisePromise extends js.Object {
  var promise: js.Promise[SingleLineMenuResponse] = js.native
}

object PromisePromise {
  @scala.inline
  def apply(promise: js.Promise[SingleLineMenuResponse]): PromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisePromise]
  }
  @scala.inline
  implicit class PromisePromiseOps[Self <: PromisePromise] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Promise[SingleLineMenuResponse]): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
  
}

