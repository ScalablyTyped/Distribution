package typings
package wonderDotJsLib.distEs2015EventStructureDomEventListenerMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
@js.native
class DomEventListenerMap ()
  extends wonderDotJsLib.distEs2015EventStructureEventListenerMapMod.EventListenerMap {
  def appendChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    data: js.Any
  ): scala.Unit = js.native
  def getChild(dom: stdLib.HTMLElement): js.Any = js.native
  def getChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def hasChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Boolean = js.native
  def removeChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def removeChild(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
  def removeChild(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def removeChild(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
}

@JSImport("wonder.js/dist/es2015/event/structure/DomEventListenerMap", "DomEventListenerMap")
@js.native
object DomEventListenerMap extends js.Object {
  def create(): wonderDotJsLib.distEs2015EventStructureDomEventListenerMapMod.DomEventListenerMap = js.native
}

