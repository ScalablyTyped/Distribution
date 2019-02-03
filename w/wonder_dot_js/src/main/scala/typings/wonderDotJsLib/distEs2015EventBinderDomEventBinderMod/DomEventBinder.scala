package typings
package wonderDotJsLib.distEs2015EventBinderDomEventBinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/DomEventBinder", "DomEventBinder")
@js.native
class DomEventBinder ()
  extends wonderDotJsLib.distEs2015EventBinderEventBinderMod.EventBinder {
  def off(): scala.Unit = js.native
  def off(dom: stdLib.HTMLElement): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def off(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
  def off(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(dom: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(dom: stdLib.HTMLElement, eventName: java.lang.String, handler: js.Function, priority: scala.Double): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function, priority: scala.Double): scala.Unit = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/binder/DomEventBinder", "DomEventBinder")
@js.native
object DomEventBinder extends js.Object {
  def getInstance(): js.Any = js.native
}

