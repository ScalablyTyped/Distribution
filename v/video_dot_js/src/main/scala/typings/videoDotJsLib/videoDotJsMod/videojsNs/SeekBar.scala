package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Seek bar and container for the progress bars. Uses {@link PlayProgressBar}
	 * as its `bar`.
	 */
@js.native
trait SeekBar extends Slider {
  /**
  		 * Get the percentage of media played so far.
  		 *
  		 * @return The percentage of media played so far (0 to 1).
  		 */
  def getPercent(): scala.Double = js.native
  /**
  		 * Toggles the playback state of the player
  		 * This gets called when enter or space is used on the seekbar
  		 *
  		 * @param event
  		 *        The `keydown` event that caused this function to be called
  		 *
  		 */
  def handleAction(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * We want the seek bar to be full on ended
  		 * no matter what the actual internal values are. so we force it.
  		 *
  		 * @param [event]
  		 *        The `timeupdate` or `ended` event that caused this to run.
  		 *
  		 * @listens Player#ended
  		 */
  def handleEnded(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Called when this SeekBar has focus and a key gets pressed down. By
  		 * default it will call `this.handleAction` when the key is space or enter.
  		 *
  		 * @param event
  		 *        The `keydown` event that caused this function to be called.
  		 *
  		 * @listens keydown
  		 */
  def handleKeyPress(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
  /**
  		 * Move more quickly rewind for keyboard-only users
  		 */
  def stepBack(): scala.Unit = js.native
  /**
  		 * Move more quickly fast forward for keyboard-only users
  		 */
  def stepForward(): scala.Unit = js.native
}

