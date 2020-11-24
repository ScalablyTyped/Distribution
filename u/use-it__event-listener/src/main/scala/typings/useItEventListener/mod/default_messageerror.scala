package typings.useItEventListener.mod

import typings.std.MessageEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_messageerror extends js.Object {
  
  def apply(eventName: messageerror, handler: MessageEvent[_]): Unit = js.native
  def apply(
    eventName: messageerror,
    handler: MessageEvent[_],
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: messageerror, handler: MessageEvent[_], element: Window): Unit = js.native
  def apply(eventName: messageerror, handler: MessageEvent[_], element: Window, options: Options): Unit = js.native
}
