package typings
package wonderDotJsLib.distEs2015EventBinderDomEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
@js.native
class DomEventRegister ()
  extends wonderDotJsLib.distEs2015EventBinderEventRegisterMod.EventRegister {
  @JSName("listenerMap")
  var listenerMap_DomEventRegister: wonderDotJsLib.distEs2015EventStructureDomEventListenerMapMod.DomEventListenerMap = js.native
  def getDomHandler(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Function = js.native
  def isBinded(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Boolean = js.native
  def register(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    eventData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def remove(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def remove(
    dom: stdLib.HTMLElement,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
  def remove(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def remove(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
}

@JSImport("wonder.js/dist/es2015/event/binder/DomEventRegister", "DomEventRegister")
@js.native
object DomEventRegister extends js.Object {
  def getInstance(): js.Any = js.native
}

