package typings.wonderJs.domEventListenerMapMod

import typings.std.HTMLElement
import typings.wonderJs.eventListenerMapMod.EventListenerMap
import typings.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
@js.native
class DomEventListenerMap () extends EventListenerMap {
  def appendChild(dom: HTMLElement, eventName: EEventName, data: js.Any): Unit = js.native
  def getChild(dom: HTMLElement): js.Any = js.native
  def getChild(dom: HTMLElement, eventName: EEventName): js.Any = js.native
  def hasChild(dom: HTMLElement, eventName: EEventName): Boolean = js.native
  def removeChild(dom: HTMLElement, eventName: EEventName): js.Any = js.native
  def removeChild(dom: HTMLElement, eventName: EEventName, handler: js.Function): js.Any = js.native
  def removeChild(eventName: EEventName): js.Any = js.native
  def removeChild(eventName: EEventName, handler: js.Function): js.Any = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
@js.native
object DomEventListenerMap extends js.Object {
  def create(): DomEventListenerMap = js.native
}

