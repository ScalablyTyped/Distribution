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
    allowMapEvent: () => scala.Unit,
    callMethod: java.lang.String => scala.Unit,
    get: java.lang.String => js.Object,
    getSourceEvent: () => IEvent | scala.Null,
    isDefaultPrevented: () => scala.Boolean,
    isImmediatePropagationStopped: () => scala.Boolean,
    isMapEventAllowed: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    preventDefault: () => scala.Boolean,
    stopImmediatePropagation: () => scala.Boolean,
    stopPropagation: () => scala.Boolean
  ): IEvent = {
    val __obj = js.Dynamic.literal(allowMapEvent = js.Any.fromFunction0(allowMapEvent), callMethod = js.Any.fromFunction1(callMethod), get = js.Any.fromFunction1(get), getSourceEvent = js.Any.fromFunction0(getSourceEvent), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isMapEventAllowed = js.Any.fromFunction0(isMapEventAllowed), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[IEvent]
  }
}

