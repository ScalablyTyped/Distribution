package typings
package wonderDotJsLib.distEs2015EventBinderCustomEventBinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/CustomEventBinder", "CustomEventBinder")
@js.native
class CustomEventBinder ()
  extends wonderDotJsLib.distEs2015EventBinderEventBinderMod.EventBinder {
  def off(): scala.Unit = js.native
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def off(eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName): scala.Unit = js.native
  def off(
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def off(target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName
  ): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
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
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function
  ): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: wonderDotJsLib.distEs2015EventObjectEventNameHandlerMod.EEventName,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/binder/CustomEventBinder", "CustomEventBinder")
@js.native
object CustomEventBinder extends js.Object {
  def getInstance(): js.Any = js.native
}

