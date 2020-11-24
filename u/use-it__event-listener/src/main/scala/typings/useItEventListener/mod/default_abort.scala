package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.UIEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_abort extends js.Object {
  
  def apply(eventName: abort, handler: UIEvent): Unit = js.native
  def apply(eventName: abort, handler: UIEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: abort, handler: UIEvent, element: Document): Unit = js.native
  def apply(eventName: abort, handler: UIEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: abort,
    handler: UIEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: abort, handler: UIEvent, element: Window): Unit = js.native
  def apply(eventName: abort, handler: UIEvent, element: Window, options: Options): Unit = js.native
}
