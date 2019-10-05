package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsMod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Displays the current time
	 */
@js.native
trait CurrentTimeDisplay extends TimeDisplay {
  /**
  		 * When the player fires ended there should be no time left. Sadly
  		 * this is not always the case, lets make it seem like that is the case
  		 * for users.
  		 *
  		 * @param [event]
  		 *        The `ended` event that caused this to run.
  		 *
  		 * @listens Player#ended
  		 */
  def handleEnded(event: Event): Unit = js.native
}

