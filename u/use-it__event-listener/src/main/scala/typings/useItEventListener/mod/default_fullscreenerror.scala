package typings.useItEventListener.mod

import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.useItEventListener.useItEventListenerStrings.fullscreenerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_fullscreenerror extends js.Object {
  
  def apply(eventName: fullscreenerror, handler: Event): Unit = js.native
  def apply(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: fullscreenerror, handler: Event, element: Document): Unit = js.native
  def apply(eventName: fullscreenerror, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: fullscreenerror,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
}
