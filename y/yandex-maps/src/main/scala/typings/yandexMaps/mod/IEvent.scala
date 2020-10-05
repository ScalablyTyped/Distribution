package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends js.Object {
  def allowMapEvent(): Unit = js.native
  def callMethod(name: String): Unit = js.native
  def get(name: String): js.Object = js.native
  def getSourceEvent(): IEvent | Null = js.native
  def isDefaultPrevented(): Boolean = js.native
  def isImmediatePropagationStopped(): Boolean = js.native
  def isMapEventAllowed(): Boolean = js.native
  def isPropagationStopped(): Boolean = js.native
  def preventDefault(): Boolean = js.native
  def stopImmediatePropagation(): Boolean = js.native
  def stopPropagation(): Boolean = js.native
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
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
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
    def setAllowMapEvent(value: () => Unit): Self = this.set("allowMapEvent", js.Any.fromFunction0(value))
    @scala.inline
    def setCallMethod(value: String => Unit): Self = this.set("callMethod", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.Object): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSourceEvent(value: () => IEvent | Null): Self = this.set("getSourceEvent", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    @scala.inline
    def setIsImmediatePropagationStopped(value: () => Boolean): Self = this.set("isImmediatePropagationStopped", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMapEventAllowed(value: () => Boolean): Self = this.set("isMapEventAllowed", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPropagationStopped(value: () => Boolean): Self = this.set("isPropagationStopped", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: () => Boolean): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStopImmediatePropagation(value: () => Boolean): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Boolean): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

