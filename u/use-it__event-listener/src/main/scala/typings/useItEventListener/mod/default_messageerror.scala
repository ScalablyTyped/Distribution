package typings.useItEventListener.mod

import typings.std.MessageEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_messageerror extends js.Object {
  def apply(eventName: messageerror, handler: MessageEvent): Unit = js.native
  def apply(
    eventName: messageerror,
    handler: MessageEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: messageerror, handler: MessageEvent, element: Window): Unit = js.native
  def apply(eventName: messageerror, handler: MessageEvent, element: Window, options: Options): Unit = js.native
}

