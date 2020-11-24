package typings.useItEventListener.mod

import typings.std.Event
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_unload extends js.Object {
  
  def apply(eventName: unload, handler: Event): Unit = js.native
  def apply(eventName: unload, handler: Event, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(eventName: unload, handler: Event, element: Window): Unit = js.native
  def apply(eventName: unload, handler: Event, element: Window, options: Options): Unit = js.native
}
