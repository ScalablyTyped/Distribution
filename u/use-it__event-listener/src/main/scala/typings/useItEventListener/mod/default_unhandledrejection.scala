package typings.useItEventListener.mod

import typings.std.PromiseRejectionEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_unhandledrejection extends js.Object {
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent): Unit = js.native
  def apply(
    eventName: unhandledrejection,
    handler: PromiseRejectionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window): Unit = js.native
  def apply(eventName: unhandledrejection, handler: PromiseRejectionEvent, element: Window, options: Options): Unit = js.native
}

