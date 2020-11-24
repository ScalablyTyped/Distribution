package typings.useItEventListener.mod

import typings.std.Document
import typings.std.Event
import typings.std.ProgressEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_readystatechange extends js.Object {
  
  def apply(eventName: readystatechange, handler: Event, element: Document): Unit = js.native
  def apply(eventName: readystatechange, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent[Window]): Unit = js.native
  def apply(
    eventName: readystatechange,
    handler: ProgressEvent[Window],
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent[Window], element: Window): Unit = js.native
  def apply(eventName: readystatechange, handler: ProgressEvent[Window], element: Window, options: Options): Unit = js.native
}
