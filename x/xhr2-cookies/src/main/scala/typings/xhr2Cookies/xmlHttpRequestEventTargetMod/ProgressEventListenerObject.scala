package typings.xhr2Cookies.xmlHttpRequestEventTargetMod

import typings.xhr2Cookies.progressEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventListenerObject extends js.Object {
  def handleEvent(event: ProgressEvent): Unit
}

object ProgressEventListenerObject {
  @scala.inline
  def apply(handleEvent: ProgressEvent => Unit): ProgressEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[ProgressEventListenerObject]
  }
}

