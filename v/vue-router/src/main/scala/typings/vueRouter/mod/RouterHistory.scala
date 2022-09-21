package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterHistory extends StObject {
  
  /**
    * Base path that is prepended to every url. This allows hosting an SPA at a
    * sub-folder of a domain like `example.com/sub-folder` by having a `base` of
    * `/sub-folder`
    */
  val base: String = js.native
  
  /**
    * Generates the corresponding href to be used in an anchor tag.
    *
    * @param location - history location that should create an href
    */
  def createHref(location: HistoryLocation): String = js.native
  
  /**
    * Clears any event listener attached by the history implementation.
    */
  def destroy(): Unit = js.native
  
  /**
    * Traverses history in a given direction.
    *
    * @example
    * ```js
    * myHistory.go(-1) // equivalent to window.history.back()
    * myHistory.go(1) // equivalent to window.history.forward()
    * ```
    *
    * @param delta - distance to travel. If delta is \< 0, it will go back,
    * if it's \> 0, it will go forward by that amount of entries.
    * @param triggerListeners - whether this should trigger listeners attached to
    * the history
    */
  def go(delta: Double): Unit = js.native
  def go(delta: Double, triggerListeners: Boolean): Unit = js.native
  
  /**
    * Attach a listener to the History implementation that is triggered when the
    * navigation is triggered from outside (like the Browser back and forward
    * buttons) or when passing `true` to {@link RouterHistory.back} and
    * {@link RouterHistory.forward}
    *
    * @param callback - listener to attach
    * @returns a callback to remove the listener
    */
  def listen(callback: NavigationCallback): js.Function0[Unit] = js.native
  
  /**
    * Current History location
    */
  val location: HistoryLocation = js.native
  
  /**
    * Navigates to a location. In the case of an HTML5 History implementation,
    * this will call `history.pushState` to effectively change the URL.
    *
    * @param to - location to push
    * @param data - optional {@link HistoryState} to be associated with the
    * navigation entry
    */
  def push(to: HistoryLocation): Unit = js.native
  def push(to: HistoryLocation, data: HistoryState): Unit = js.native
  
  /**
    * Same as {@link RouterHistory.push} but performs a `history.replaceState`
    * instead of `history.pushState`
    *
    * @param to - location to set
    * @param data - optional {@link HistoryState} to be associated with the
    * navigation entry
    */
  def replace(to: HistoryLocation): Unit = js.native
  def replace(to: HistoryLocation, data: HistoryState): Unit = js.native
  
  /**
    * Current History state
    */
  val state: HistoryState = js.native
}
