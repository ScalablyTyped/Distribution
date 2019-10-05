package typings.subscribeDashUiDashEvent.subscribeDashUiDashEventMod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.subscribeDashUiDashEvent.Anon_Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Anon_Remove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Anon_Remove = js.native
}

