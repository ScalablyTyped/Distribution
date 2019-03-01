package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The specific menu item type for selecting a language within a text track kind
	 */
@js.native
trait TextTrackMenuItem extends MenuItem {
  /**
  		 * Handle selected language change
  		 *
  		 * @param event
  		 *        The `change` event that caused this function to be called.
  		 */
  def handleSelectedLanguageChange(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Handle text track list change
  		 *
  		 * @param event
  		 *        The `change` event that caused this function to be called.
  		 *
  		 * @listens TextTrackList#change
  		 */
  def handleTracksChange(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
}

