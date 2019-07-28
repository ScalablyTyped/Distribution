package typings.videoDotJs.videoDotJsMod.videojsNs

import typings.videoDotJs.videoDotJsMod.videojsNs.EventTargetNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Displays the time left in the video
	 */
@js.native
trait TimeDisplay extends Component {
  /**
  		 * To be filled out in the child class, should update the displayed time
  		 * in accordance with the fact that the current time has changed.
  		 *
  		 * @param [event]
  		 *        The `timeupdate`  event that caused this to run.
  		 *
  		 * @listens Player#timeupdate
  		 */
  def updateContent(): Unit = js.native
  def updateContent(event: Event): Unit = js.native
}

