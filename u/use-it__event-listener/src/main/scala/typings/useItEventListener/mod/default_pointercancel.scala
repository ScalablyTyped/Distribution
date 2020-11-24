package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.PointerEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.pointercancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_pointercancel extends js.Object {
  
  def apply(eventName: pointercancel, handler: PointerEvent): Unit = js.native
  def apply(
    eventName: pointercancel,
    handler: PointerEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: pointercancel, handler: PointerEvent, element: Document): Unit = js.native
  def apply(eventName: pointercancel, handler: PointerEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: pointercancel,
    handler: PointerEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: pointercancel, handler: PointerEvent, element: Window): Unit = js.native
  def apply(eventName: pointercancel, handler: PointerEvent, element: Window, options: Options): Unit = js.native
}
