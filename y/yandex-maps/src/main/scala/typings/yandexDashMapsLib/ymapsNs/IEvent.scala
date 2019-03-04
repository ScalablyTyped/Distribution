package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  def allowMapEvent(): scala.Unit
  def callMethod(name: java.lang.String): scala.Unit
  def get(name: java.lang.String): js.Object
  def getSourceEvent(): IEvent | scala.Null
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isMapEventAllowed(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Boolean
  def stopImmediatePropagation(): scala.Boolean
  def stopPropagation(): scala.Boolean
}

object IEvent {
  @scala.inline
  def apply(
    allowMapEvent: js.Function0[scala.Unit],
    callMethod: js.Function1[java.lang.String, scala.Unit],
    get: js.Function1[java.lang.String, js.Object],
    getSourceEvent: js.Function0[IEvent | scala.Null],
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isMapEventAllowed: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Boolean],
    stopImmediatePropagation: js.Function0[scala.Boolean],
    stopPropagation: js.Function0[scala.Boolean]
  ): IEvent = {
    val __obj = js.Dynamic.literal(allowMapEvent = allowMapEvent, callMethod = callMethod, get = get, getSourceEvent = getSourceEvent, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isMapEventAllowed = isMapEventAllowed, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[IEvent]
  }
}

