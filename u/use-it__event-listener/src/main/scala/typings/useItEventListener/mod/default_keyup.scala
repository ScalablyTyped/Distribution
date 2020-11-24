package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_keyup extends js.Object {
  
  def apply(eventName: keyup, handler: KeyboardEvent): Unit = js.native
  def apply(eventName: keyup, handler: KeyboardEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: keyup, handler: KeyboardEvent, element: Document): Unit = js.native
  def apply(eventName: keyup, handler: KeyboardEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: keyup,
    handler: KeyboardEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: keyup, handler: KeyboardEvent, element: Window): Unit = js.native
  def apply(eventName: keyup, handler: KeyboardEvent, element: Window, options: Options): Unit = js.native
}
