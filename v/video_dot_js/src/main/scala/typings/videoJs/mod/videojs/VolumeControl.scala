package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The component for controlling the volume level
  */
@js.native
trait VolumeControl
  extends StObject
     with Component {
  
  /**
    * Handle `mousedown` or `touchstart` events on the `VolumeControl`.
    *
    * @param event
    *        `mousedown` or `touchstart` event that triggered this function
    *
    * @listens mousedown
    * @listens touchstart
    */
  def handleMouseDown(event: Event): Unit = js.native
  
  /**
    * Handle `mousedown` or `touchstart` events on the `VolumeControl`.
    *
    * @param event
    *        `mousedown` or `touchstart` event that triggered this function
    *
    * @listens mousedown
    * @listens touchstart
    */
  def handleMouseMove(event: Event): Unit = js.native
  
  /**
    * Handle `mouseup` or `touchend` events on the `VolumeControl`.
    *
    * @param event
    *        `mouseup` or `touchend` event that triggered this function.
    *
    * @listens touchend
    * @listens mouseup
    */
  def handleMouseUp(event: Event): Unit = js.native
}
