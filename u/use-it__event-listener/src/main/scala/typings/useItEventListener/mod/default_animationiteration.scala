package typings.useItEventListener.mod

import typings.std.AnimationEvent
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.animationiteration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_animationiteration extends js.Object {
  
  def apply(eventName: animationiteration, handler: AnimationEvent): Unit = js.native
  def apply(
    eventName: animationiteration,
    handler: AnimationEvent,
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationiteration, handler: AnimationEvent, element: Document): Unit = js.native
  def apply(eventName: animationiteration, handler: AnimationEvent, element: Document, options: Options): Unit = js.native
  def apply(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: animationiteration,
    handler: AnimationEvent,
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: animationiteration, handler: AnimationEvent, element: Window): Unit = js.native
  def apply(eventName: animationiteration, handler: AnimationEvent, element: Window, options: Options): Unit = js.native
}
