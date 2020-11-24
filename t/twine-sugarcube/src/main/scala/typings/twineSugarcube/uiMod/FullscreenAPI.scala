package typings.twineSugarcube.uiMod

import typings.jquery.JQuery.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenAPI extends js.Object {
  
  /**
    * Current fullscreen element or, if fullscreen mode is not active, null.
    * @since 2.31.0
    */
  val element: HTMLElement = js.native
  
  /**
    * Request that the browser exit fullscreen mode.
    * @since 2.31.0
    */
  def exit(): js.Promise[Unit] = js.native
  
  /**
    * Returns whether fullscreen is both supported and enabled.
    * @since 2.31.0
    */
  def isEnabled(): Boolean = js.native
  
  /**
    * Returns whether fullscreen mode is currently active.
    * @since 2.31.0
    */
  def isFullscreen(): Boolean = js.native
  
  /**
    * Removes fullscreen change event handlers.
    * @param handlerFn The function to remove. If omitted, will remove all handler functions.
    * @param requestedEl The element to remove the handler(s) from.
    * @since 2.31.0
    */
  def offChange(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def offChange(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
  
  /**
    * Removes fullscreen error event handlers.
    * @param handlerFn The function to remove. If omitted, will remove all handler functions.
    * @param requestedEl The element to remove the handler(s) from.
    * @since 2.31.0
    */
  def offError(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def offError(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
  
  /**
    * Attaches fullscreen change event handlers.
    * @param handlerFn The function to invoke when fullscreen mode is changed.
    * @param requestedEl The element to attach the handler to.
    * @since 2.31.0
    */
  def onChange(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def onChange(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
  
  /**
    * Attaches fullscreen error event handlers.
    * @param handlerFn The function to invoke when fullscreen mode encounters an error.
    * @param requestedEl The element to attach the handler to.
    * @since 2.31.0
    */
  def onError(handlerFn: js.Function1[/* ev */ Event, Unit]): Unit = js.native
  def onError(handlerFn: js.Function1[/* ev */ Event, Unit], requestedEl: HTMLElement): Unit = js.native
  
  /**
    * Request that the browser enter fullscreen mode.
    * @param options The fullscreen options object.
    * @param requestedEl The element to enter fullscreen mode with. If omitted, defaults to the entire page.
    * @since 2.31.0
    */
  def request(): js.Promise[Unit] = js.native
  def request(options: js.UndefOr[scala.Nothing], requestedEl: HTMLElement): js.Promise[Unit] = js.native
  def request(options: FullscreenRequestOptions): js.Promise[Unit] = js.native
  def request(options: FullscreenRequestOptions, requestedEl: HTMLElement): js.Promise[Unit] = js.native
  
  /**
    * Request that the browser toggle fullscreen mode—i.e., enter or exit as appropriate.
    * @param options The fullscreen options object. See Fullscreen.request() for more information.
    * @param requestedEl The element to toggle fullscreen mode with. If omitted, defaults to the entire page.
    * @since 2.31.0
    */
  def toggle(): js.Promise[Unit] = js.native
  def toggle(options: js.UndefOr[scala.Nothing], requestedEl: HTMLElement): js.Promise[Unit] = js.native
  def toggle(options: FullscreenRequestOptions): js.Promise[Unit] = js.native
  def toggle(options: FullscreenRequestOptions, requestedEl: HTMLElement): js.Promise[Unit] = js.native
}
