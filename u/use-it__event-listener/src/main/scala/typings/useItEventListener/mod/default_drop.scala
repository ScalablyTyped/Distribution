package typings.useItEventListener.mod

import typings.std.Document
import typings.std.DragEvent
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_drop extends js.Object {
  
  def apply(eventName: drop, handler: DragEvent): Unit = js.native
  def apply(eventName: drop, handler: DragEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: drop, handler: DragEvent, element: Document): Unit = js.native
  def apply(eventName: drop, handler: DragEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: drop,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: drop, handler: DragEvent, element: Window): Unit = js.native
  def apply(eventName: drop, handler: DragEvent, element: Window, options: Options): Unit = js.native
}
