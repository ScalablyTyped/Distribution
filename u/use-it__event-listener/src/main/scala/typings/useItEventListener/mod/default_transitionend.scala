package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.TransitionEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_transitionend extends js.Object {
  def apply(eventName: transitionend, handler: TransitionEvent): Unit = js.native
  def apply(
    eventName: transitionend,
    handler: TransitionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitionend, handler: TransitionEvent, element: Document): Unit = js.native
  def apply(eventName: transitionend, handler: TransitionEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: transitionend,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitionend, handler: TransitionEvent, element: Window): Unit = js.native
  def apply(eventName: transitionend, handler: TransitionEvent, element: Window, options: Options): Unit = js.native
}

