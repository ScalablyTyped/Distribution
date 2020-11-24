package typings.useItEventListener.mod

import typings.std.Document
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.ProgressEvent
import typings.std.Window
import typings.useItEventListener.useItEventListenerStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@use-it/event-listener", JSImport.Default)
@js.native
object default_progress extends js.Object {
  
  def apply(eventName: progress, handler: ProgressEvent[EventTarget | Window]): Unit = js.native
  def apply(
    eventName: progress,
    handler: ProgressEvent[Window],
    element: js.UndefOr[scala.Nothing],
    options: Options
  ): Unit = js.native
  def apply(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: Null,
    options: Options
  ): Unit = js.native
  def apply(eventName: progress, handler: ProgressEvent[EventTarget], element: Document): Unit = js.native
  def apply(eventName: progress, handler: ProgressEvent[EventTarget], element: Document, options: Options): Unit = js.native
  def apply(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement
  ): Unit = js.native
  def apply(
    eventName: progress,
    handler: ProgressEvent[EventTarget],
    // allow null to support usage with `useRef<HTMLElement | null>(null)`
  element: HTMLElement,
    options: Options
  ): Unit = js.native
  def apply(eventName: progress, handler: ProgressEvent[Window], element: Window): Unit = js.native
  def apply(eventName: progress, handler: ProgressEvent[Window], element: Window, options: Options): Unit = js.native
}
