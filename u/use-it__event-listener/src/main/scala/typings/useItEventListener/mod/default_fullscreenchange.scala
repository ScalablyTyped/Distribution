package typings.useItEventListener.mod

import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.useItEventListener.useItEventListenerStrings.fullscreenchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_fullscreenchange extends js.Object {
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  def apply(eventName: fullscreenchange, handler: Event): Unit = js.native
  def apply(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: fullscreenchange, handler: Event, element: Document): Unit = js.native
  def apply(eventName: fullscreenchange, handler: Event, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: fullscreenchange,
    handler: Event,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
}

