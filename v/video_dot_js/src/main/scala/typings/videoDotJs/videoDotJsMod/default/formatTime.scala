package typings.videoDotJs.videoDotJsMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "formatTime")
@js.native
object formatTime extends js.Object {
  /**
  	 * Format seconds as a time string, H:MM:SS or M:SS. Supplying a guide (in seconds)
  	 * will force a number of leading zeros to cover the length of the guide.
  	 *
  	 * @param seconds
  	 *        Number of seconds to be turned into a string
  	 *
  	 * @param guide
  	 *        Number (in seconds) to model the string after
  	 *
  	 * @return Time formatted as H:MM:SS or M:SS
  	 */
  def apply(seconds: Double, guide: Double): String = js.native
}

