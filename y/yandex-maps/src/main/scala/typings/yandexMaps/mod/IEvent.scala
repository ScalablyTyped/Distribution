package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  def allowMapEvent(): Unit
  def callMethod(name: String): Unit
  def get(name: String): js.Object
  def getSourceEvent(): IEvent | Null
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isMapEventAllowed(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Boolean
  def stopImmediatePropagation(): Boolean
  def stopPropagation(): Boolean
}

object IEvent {
  @scala.inline
  def apply(
    allowMapEvent: () => Unit,
    callMethod: String => Unit,
    get: String => js.Object,
    getSourceEvent: () => IEvent | Null,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isMapEventAllowed: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Boolean,
    stopImmediatePropagation: () => Boolean,
    stopPropagation: () => Boolean
  ): IEvent = {
    val __obj = js.Dynamic.literal(allowMapEvent = js.Any.fromFunction0(allowMapEvent), callMethod = js.Any.fromFunction1(callMethod), get = js.Any.fromFunction1(get), getSourceEvent = js.Any.fromFunction0(getSourceEvent), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isMapEventAllowed = js.Any.fromFunction0(isMapEventAllowed), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[IEvent]
  }
}

