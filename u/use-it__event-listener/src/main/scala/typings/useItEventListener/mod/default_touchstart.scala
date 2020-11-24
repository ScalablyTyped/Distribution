package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_touchstart extends js.Object {
  
  def apply(eventName: touchstart, handler: TouchEvent): Unit = js.native
  def apply(eventName: touchstart, handler: TouchEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchstart, handler: TouchEvent, element: Document): Unit = js.native
  def apply(eventName: touchstart, handler: TouchEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: touchstart,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchstart, handler: TouchEvent, element: Window): Unit = js.native
  def apply(eventName: touchstart, handler: TouchEvent, element: Window, options: Options): Unit = js.native
}
