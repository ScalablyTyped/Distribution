package typings
package subscribeDashUiDashEventLib.subscribeDashUiDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def subscribe[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventType */](
    eventType: T,
    callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventCallback[T]
  ): subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.Subscription = js.native
  def subscribe[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventType */](
    eventType: T,
    callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventCallback[T],
    options: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.SubscribeOptions
  ): subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.Subscription = js.native
  @JSName("subscribe")
  def subscribe_TUIEventType[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventType */](eventType: T, callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventCallback[T]): subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.Subscription = js.native
  @JSName("subscribe")
  def subscribe_TUIEventType[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventType */](
    eventType: T,
    callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventCallback[T],
    options: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.SubscribeOptions
  ): subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.Subscription = js.native
  def unsubscribe[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventType */](eventType: T, callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.UIEventCallback[T]): scala.Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_TTouchEventType[T /* <: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventType */](
    eventType: T,
    callback: subscribeDashUiDashEventLib.subscribeDashUiDashEventMod.TouchEventCallback[T]
  ): scala.Unit = js.native
}

