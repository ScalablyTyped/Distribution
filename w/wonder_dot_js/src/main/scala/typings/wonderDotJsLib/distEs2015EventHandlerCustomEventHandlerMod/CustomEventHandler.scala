package typings
package wonderDotJsLib.distEs2015EventHandlerCustomEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/CustomEventHandler", "CustomEventHandler")
@js.native
class CustomEventHandler ()
  extends wonderDotJsLib.distEs2015EventHandlerEventHandlerMod.EventHandler {
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  def off(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function
  ): scala.Unit = js.native
  def off(uid: scala.Double, eventName: java.lang.String): scala.Unit = js.native
  def on(eventName: java.lang.String, handler: js.Function, priority: scala.Double): scala.Unit = js.native
  def on(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventName: java.lang.String,
    handler: js.Function,
    priority: scala.Double
  ): scala.Unit = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Boolean = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event, userData: js.Any): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    notSetTarget: scala.Boolean
  ): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any,
    notSetTarget: scala.Boolean
  ): scala.Boolean = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/handler/CustomEventHandler", "CustomEventHandler")
@js.native
object CustomEventHandler extends js.Object {
  def getInstance(): js.Any = js.native
}

