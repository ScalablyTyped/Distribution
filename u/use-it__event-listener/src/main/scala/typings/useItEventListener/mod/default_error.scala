package typings.useItEventListener.mod

import typings.std.Document
import typings.std.ErrorEvent
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_error extends js.Object {
  
  def apply(eventName: error, handler: ErrorEvent): Unit = js.native
  def apply(eventName: error, handler: ErrorEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: error, handler: ErrorEvent, element: Document): Unit = js.native
  def apply(eventName: error, handler: ErrorEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: error,
    handler: ErrorEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: error, handler: ErrorEvent, element: Window): Unit = js.native
  def apply(eventName: error, handler: ErrorEvent, element: Window, options: Options): Unit = js.native
}
