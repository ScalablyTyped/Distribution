package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressControl extends Component {
  
  /**
    * Disable all controls on the progress control and its children
    */
  def disable(): Unit = js.native
  
  /**
    * Enable all controls on the progress control and its children
    */
  def enable(): Unit = js.native
  
  /**
    * Are controls are currently enabled for this progress control.
    *
    * @return true if controls are enabled, false otherwise
    */
  def enabled(): Boolean = js.native
  
  /**
    * Handle `mousedown` or `touchstart` events on the `ProgressControl`.
    *
    * @param event
    *        `mousedown` or `touchstart` event that triggered this function
    *
    * @listens mousedown
    * @listens touchstart
    */
  def handleMouseDown(event: Event): Unit = js.native
  
  /**
    * When the mouse moves over the `ProgressControl`, the pointer position
    * gets passed down to the `MouseTimeDisplay` component.
    *
    * @param event
    *        The `mousemove` event that caused this function to run.
    *
    * @listen mousemove
    */
  def handleMouseMove(event: Event): Unit = js.native
  
  /**
    * Handle `mousemove` or `touchmove` events on the `ProgressControl`.
    *
    * @param event
    *        `mousedown` or `touchstart` event that triggered this function
    *
    * @listens mousemove
    * @listens touchmove
    */
  def handleMouseSeek(event: Event): Unit = js.native
  
  /**
    * Handle `mouseup` or `touchend` events on the `ProgressControl`.
    *
    * @param event
    *        `mouseup` or `touchend` event that triggered this function.
    *
    * @listens touchend
    * @listens mouseup
    */
  def handleMouseUp(event: Event): Unit = js.native
}
