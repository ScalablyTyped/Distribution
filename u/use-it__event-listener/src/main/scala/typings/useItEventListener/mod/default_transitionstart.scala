package typings.useItEventListener.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.TransitionEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.transitionstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_transitionstart extends js.Object {
  
  def apply(eventName: transitionstart, handler: TransitionEvent): Unit = js.native
  def apply(
    eventName: transitionstart,
    handler: TransitionEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitionstart, handler: TransitionEvent, element: Document): Unit = js.native
  def apply(eventName: transitionstart, handler: TransitionEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: transitionstart,
    handler: TransitionEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: transitionstart, handler: TransitionEvent, element: Window): Unit = js.native
  def apply(eventName: transitionstart, handler: TransitionEvent, element: Window, options: Options): Unit = js.native
}
