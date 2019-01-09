package typings
package wonderDotJsLib.distEs2015EventDispatcherCustomEventDispatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/dispatcher/CustomEventDispatcher", "CustomEventDispatcher")
@js.native
class CustomEventDispatcher ()
  extends wonderDotJsLib.distEs2015EventDispatcherEventDispatcherMod.EventDispatcher {
  def broadcast(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventObject: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): scala.Unit = js.native
  def broadcast(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventObject: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): scala.Unit = js.native
  def emit(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventObject: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): scala.Unit = js.native
  def emit(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    eventObject: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): scala.Unit = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event): scala.Boolean = js.native
  def trigger(event: wonderDotJsLib.distEs2015EventObjectEventMod.Event, userData: js.Any): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event
  ): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    notSetTarget: scala.Boolean
  ): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any
  ): scala.Boolean = js.native
  def trigger(
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject,
    event: wonderDotJsLib.distEs2015EventObjectEventMod.Event,
    userData: js.Any,
    notSetTarget: scala.Boolean
  ): scala.Boolean = js.native
}

@JSImport("wonder.js/dist/es2015/event/dispatcher/CustomEventDispatcher", "CustomEventDispatcher")
@js.native
object CustomEventDispatcher extends js.Object {
  def getInstance(): js.Any = js.native
}

