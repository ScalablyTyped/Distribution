package typings
package wonderDotJsLib.distEs2015EventBinderCustomEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
@js.native
class CustomEventRegister ()
  extends wonderDotJsLib.distEs2015EventBinderEventRegisterMod.EventRegister {
  @JSName("listenerMap")
  var listenerMap_CustomEventRegister: wonderDotJsLib.distEs2015EventStructureCustomEventListenerMapMod.CustomEventListenerMap = js.native
  def register(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: scala.Double
  ): js.Any = js.native
  def register(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: scala.Double
  ): js.Any = js.native
  def remove(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def remove(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
  def remove(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): js.Any = js.native
  def remove(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): js.Any = js.native
  def remove(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): js.Any = js.native
  def remove(uid: scala.Double, eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): js.Any = js.native
  def setBubbleParent(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    parent: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
@js.native
object CustomEventRegister extends js.Object {
  def getInstance(): js.Any = js.native
}

