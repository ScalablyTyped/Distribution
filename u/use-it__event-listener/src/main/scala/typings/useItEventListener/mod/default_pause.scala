package typings.useItEventListener.mod

import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.pause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_pause extends js.Object {
  
  def apply(eventName: pause, handler: Event): Unit = js.native
  def apply(eventName: pause, handler: Event, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: pause, handler: Event, element: Document): Unit = js.native
  def apply(eventName: pause, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: pause,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: pause, handler: Event, element: Window): Unit = js.native
  def apply(eventName: pause, handler: Event, element: Window, options: Options): Unit = js.native
}
