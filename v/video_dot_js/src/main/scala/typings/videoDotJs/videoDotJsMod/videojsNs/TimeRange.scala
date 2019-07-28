package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that contains ranges of time for various reasons.
	 * @see https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges
	 */
trait TimeRange extends js.Object {
  /**
  		 *           The number of time ranges represented by this Object
  		 */
  val length: Double
  /**
  		 * Returns the time offset at which a specified time range ends.
  		 *
  		 * @param [index=0]
  		 *        The range number to return the time for.
  		 *
  		 * @return The time that offset at the specified index.
  		 */
  def end(index: Double): Double
  /**
  		 * Returns the time offset at which a specified time range begins.
  		 *
  		 * @param [index=0]
  		 *        The range number to return the time for.
  		 *
  		 * @return The time that offset at the specified index.
  		 */
  def start(index: Double): Double
}

object TimeRange {
  @scala.inline
  def apply(end: Double => Double, length: Double, start: Double => Double): TimeRange = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length, start = js.Any.fromFunction1(start))
  
    __obj.asInstanceOf[TimeRange]
  }
}

