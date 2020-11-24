package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The button component for toggling and selecting descriptions
  */
@js.native
trait DescriptionsButton extends TextTrackButton {
  
  /**
    * Handle text track change
    *
    * @param event
    *        The event that caused this function to run
    *
    * @listens TextTrackList#change
    */
  def handleTracksChange(event: Event): Unit = js.native
}
