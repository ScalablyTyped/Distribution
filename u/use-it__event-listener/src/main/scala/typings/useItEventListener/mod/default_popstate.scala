package typings.useItEventListener.mod

import typings.std.PopStateEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_popstate extends js.Object {
  def apply(eventName: popstate, handler: PopStateEvent): Unit = js.native
  def apply(eventName: popstate, handler: PopStateEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(eventName: popstate, handler: PopStateEvent, element: Window): Unit = js.native
  def apply(eventName: popstate, handler: PopStateEvent, element: Window, options: Options): Unit = js.native
}

