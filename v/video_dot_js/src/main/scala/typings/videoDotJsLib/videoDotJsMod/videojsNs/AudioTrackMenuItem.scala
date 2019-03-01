package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An {@link AudioTrack} {@link MenuItem}
	 */
@js.native
trait AudioTrackMenuItem extends MenuItem {
  /**
  		 * Handle any {@link AudioTrack} change.
  		 *
  		 * @param [event]
  		 *        The {@link AudioTrackList#change} event that caused this to run.
  		 *
  		 * @listens AudioTrackList#change
  		 */
  def handleTracksChange(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
}

