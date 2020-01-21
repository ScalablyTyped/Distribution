package typings.subscribeUiEvent.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.subscribeUiEvent.AnonRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): AnonRemove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): AnonRemove = js.native
}

