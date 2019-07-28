package typings.videoDotJs.videoDotJsMod.videojsNs.TextTrackCueListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
		 */
trait TextTrackCue extends js.Object {
  /**
  			 * The end time for this text track cue
  			 */
  var endTime: Double
  /**
  			 * The unique id for this text track cue
  			 */
  var id: String
  /**
  			 * Pause when the end time is reached if true.
  			 */
  var pauseOnExit: Boolean
  /**
  			 * The start time for this text track cue
  			 */
  var startTime: Double
  /**
  			 * The text this cue is holding
  			 */
  var text: String
}

object TextTrackCue {
  @scala.inline
  def apply(endTime: Double, id: String, pauseOnExit: Boolean, startTime: Double, text: String): TextTrackCue = {
    val __obj = js.Dynamic.literal(endTime = endTime, id = id, pauseOnExit = pauseOnExit, startTime = startTime, text = text)
  
    __obj.asInstanceOf[TextTrackCue]
  }
}

