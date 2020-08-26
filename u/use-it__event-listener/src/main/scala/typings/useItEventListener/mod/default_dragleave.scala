package typings.useItEventListener.mod

import typings.std.Document
import typings.std.DragEvent
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.dragleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_dragleave extends js.Object {
  def apply(eventName: dragleave, handler: DragEvent): Unit = js.native
  def apply(eventName: dragleave, handler: DragEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: dragleave, handler: DragEvent, element: Document): Unit = js.native
  def apply(eventName: dragleave, handler: DragEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: dragleave,
    handler: DragEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: dragleave, handler: DragEvent, element: Window): Unit = js.native
  def apply(eventName: dragleave, handler: DragEvent, element: Window, options: Options): Unit = js.native
}

