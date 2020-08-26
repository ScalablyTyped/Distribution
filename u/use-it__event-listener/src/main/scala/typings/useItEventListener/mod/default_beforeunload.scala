package typings.useItEventListener.mod

import typings.std.BeforeUnloadEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_beforeunload extends js.Object {
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent): Unit = js.native
  def apply(
    eventName: beforeunload,
    handler: BeforeUnloadEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window): Unit = js.native
  def apply(eventName: beforeunload, handler: BeforeUnloadEvent, element: Window, options: Options): Unit = js.native
}

