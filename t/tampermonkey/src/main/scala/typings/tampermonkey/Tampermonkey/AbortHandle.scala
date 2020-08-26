package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortHandle[TReturn] extends js.Object {
  def abort(): TReturn = js.native
}

object AbortHandle {
  @scala.inline
  def apply[TReturn](abort: () => TReturn): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
  @scala.inline
  implicit class AbortHandleOps[Self <: AbortHandle[_], TReturn] (val x: Self with AbortHandle[TReturn]) extends AnyVal {
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
    def setAbort(value: () => TReturn): Self = this.set("abort", js.Any.fromFunction0(value))
  }
  
}

