package typings
package wonderDotJsLib.distEs2015EventHandlerDomEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/DomEventHandler", "DomEventHandler")
@js.native
abstract class DomEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerEventHandlerMod.EventHandler {
  /* protected */ def addEngineHandler(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
  /* protected */ def buildDomHandler(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Function1[/* event */ js.Any, _] = js.native
  /* protected */ def clearHandler(): scala.Unit = js.native
  /* protected */ def createEventData(): js.Any = js.native
  /* protected */ def getDefaultDom(): stdLib.HTMLElement = js.native
  /* protected */ def handler(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
  def off(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def trigger(dom: stdLib.HTMLElement, event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Unit = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Unit = js.native
  /* protected */ def triggerDomEvent(
    dom: stdLib.HTMLElement,
    event: wonderDotJsLib.distEs2015EventInterfaceIEventDataMod.IEventData,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
}

