package typings.subscribeDashUiDashEvent.subscribeDashUiDashEventMod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.subscribeDashUiDashEvent.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def listen(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Anon_Remove = js.native
  def listen(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Anon_Remove = js.native
  def subscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Subscription = js.native
  def subscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T], options: SubscribeOptions): Subscription = js.native
  @JSName("subscribe")
  def subscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): Subscription = js.native
  @JSName("subscribe")
  def subscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T], options: SubscribeOptions): Subscription = js.native
  def unsubscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_T_TouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): Unit = js.native
}

