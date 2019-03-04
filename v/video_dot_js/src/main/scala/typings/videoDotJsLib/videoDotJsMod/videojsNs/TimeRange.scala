package typings
package videoDotJsLib.videoDotJsMod.videojsNs

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
  val length: scala.Double
  /**
  		 * Returns the time offset at which a specified time range ends.
  		 *
  		 * @param [index=0]
  		 *        The range number to return the time for.
  		 *
  		 * @return The time that offset at the specified index.
  		 */
  def end(index: scala.Double): scala.Double
  /**
  		 * Returns the time offset at which a specified time range begins.
  		 *
  		 * @param [index=0]
  		 *        The range number to return the time for.
  		 *
  		 * @return The time that offset at the specified index.
  		 */
  def start(index: scala.Double): scala.Double
}

object TimeRange {
  @scala.inline
  def apply(
    end: js.Function1[scala.Double, scala.Double],
    length: scala.Double,
    start: js.Function1[scala.Double, scala.Double]
  ): TimeRange = {
    val __obj = js.Dynamic.literal(end = end, length = length, start = start)
  
    __obj.asInstanceOf[TimeRange]
  }
}

