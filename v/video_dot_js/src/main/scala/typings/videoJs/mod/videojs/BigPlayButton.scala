package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The initial play button that shows before the video has played. The hiding of the
  * `BigPlayButton` get done via CSS and `Player` states.
  */
@js.native
trait BigPlayButton
  extends StObject
     with Button {
  
  /**
    * Called when this BigPlayButton gets mouse pressed down
    *
    * @param event
    *        The `keydown` event that caused this function to be called.
    *
    * @listens mousedown
    */
  def handleMouseDown(event: Event): Unit = js.native
}
