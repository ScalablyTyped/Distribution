package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.touchmove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_touchmove extends js.Object {
  def apply(eventName: touchmove, handler: TouchEvent): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Document): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: touchmove,
    handler: TouchEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Window): Unit = js.native
  def apply(eventName: touchmove, handler: TouchEvent, element: Window, options: Options): Unit = js.native
}

