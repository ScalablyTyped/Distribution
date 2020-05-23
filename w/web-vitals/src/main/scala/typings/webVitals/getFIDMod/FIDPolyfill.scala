package typings.webVitals.getFIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FIDPolyfill extends js.Object {
  def onFirstInputDelay(onReport: FIDPolyfillCallback): Unit
}

object FIDPolyfill {
  @scala.inline
  def apply(onFirstInputDelay: FIDPolyfillCallback => Unit): FIDPolyfill = {
    val __obj = js.Dynamic.literal(onFirstInputDelay = js.Any.fromFunction1(onFirstInputDelay))
    __obj.asInstanceOf[FIDPolyfill]
  }
}

