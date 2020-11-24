package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.mouseout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_mouseout extends js.Object {
  
  def apply(eventName: mouseout, handler: MouseEvent): Unit = js.native
  def apply(eventName: mouseout, handler: MouseEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: mouseout, handler: MouseEvent, element: Document): Unit = js.native
  def apply(eventName: mouseout, handler: MouseEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: mouseout,
    handler: MouseEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: mouseout, handler: MouseEvent, element: Window): Unit = js.native
  def apply(eventName: mouseout, handler: MouseEvent, element: Window, options: Options): Unit = js.native
}
