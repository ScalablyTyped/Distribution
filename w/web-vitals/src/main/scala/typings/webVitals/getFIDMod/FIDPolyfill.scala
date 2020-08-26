package typings.webVitals.getFIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FIDPolyfill extends js.Object {
  def onFirstInputDelay(onReport: FIDPolyfillCallback): Unit = js.native
}

object FIDPolyfill {
  @scala.inline
  def apply(onFirstInputDelay: FIDPolyfillCallback => Unit): FIDPolyfill = {
    val __obj = js.Dynamic.literal(onFirstInputDelay = js.Any.fromFunction1(onFirstInputDelay))
    __obj.asInstanceOf[FIDPolyfill]
  }
  @scala.inline
  implicit class FIDPolyfillOps[Self <: FIDPolyfill] (val x: Self) extends AnyVal {
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
    def setOnFirstInputDelay(value: FIDPolyfillCallback => Unit): Self = this.set("onFirstInputDelay", js.Any.fromFunction1(value))
  }
  
}

