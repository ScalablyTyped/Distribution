package typings.useItEventListener.mod

import typings.std.AnimationEvent
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.animationstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_animationstart extends js.Object {
  
  def apply(eventName: animationstart, handler: AnimationEvent): Unit = js.native
  def apply(
    eventName: animationstart,
    handler: AnimationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationstart, handler: AnimationEvent, element: Document): Unit = js.native
  def apply(eventName: animationstart, handler: AnimationEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: animationstart,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationstart, handler: AnimationEvent, element: Window): Unit = js.native
  def apply(eventName: animationstart, handler: AnimationEvent, element: Window, options: Options): Unit = js.native
}
