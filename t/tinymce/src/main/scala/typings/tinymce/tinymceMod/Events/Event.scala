package typings.tinymce.tinymceMod.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var target: String
  var `type`: String
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

