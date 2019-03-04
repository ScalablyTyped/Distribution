package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var target: java.lang.String
  var `type`: java.lang.String
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Unit
  def stopImmediatePropagation(): scala.Unit
  def stopPropagation(): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

