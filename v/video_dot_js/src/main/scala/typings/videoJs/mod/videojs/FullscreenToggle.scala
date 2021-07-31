package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Toggle fullscreen video
  */
@js.native
trait FullscreenToggle
  extends StObject
     with Button {
  
  /**
    * Handles fullscreenchange on the player and change control text accordingly.
    *
    * @param [event]
    *        The {@link Player#fullscreenchange} event that caused this function to be
    *        called.
    *
    * @listens Player#fullscreenchange
    */
  def handleFullscreenChange(event: Event): Unit = js.native
}
