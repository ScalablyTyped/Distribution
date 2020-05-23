package typings.subscribeUiEvent.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.subscribeUiEvent.anon.Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Remove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Remove = js.native
}

