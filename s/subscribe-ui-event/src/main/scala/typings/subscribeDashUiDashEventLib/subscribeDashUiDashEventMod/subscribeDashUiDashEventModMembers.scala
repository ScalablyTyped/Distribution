package typings
package subscribeDashUiDashEventLib.subscribeDashUiDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", JSImport.Namespace)
@js.native
object subscribeDashUiDashEventModMembers extends js.Object {
  def listen(
    target: stdLib.EventTarget,
    eventType: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject
  ): subscribeDashUiDashEventLib.Anon_Remove = js.native
  def listen(
    target: stdLib.EventTarget,
    eventType: java.lang.String,
    handler: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): subscribeDashUiDashEventLib.Anon_Remove = js.native
  def subscribe[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): Subscription = js.native
  def subscribe[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T], options: SubscribeOptions): Subscription = js.native
  @JSName("subscribe")
  def subscribe_TUIEventType[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): Subscription = js.native
  @JSName("subscribe")
  def subscribe_TUIEventType[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T], options: SubscribeOptions): Subscription = js.native
  def unsubscribe[T /* <: UIEventType */](eventType: T, callback: UIEventCallback[T]): scala.Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_TTouchEventType[T /* <: TouchEventType */](eventType: T, callback: TouchEventCallback[T]): scala.Unit = js.native
}

