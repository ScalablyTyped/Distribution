package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.TimeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "createTimeRanges")
@js.native
object createTimeRanges extends js.Object {
  /**
    * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
    *
    * @param start
    *        The start of a single range or an array of ranges
    *
    * @param end
    *        The end of a single range.
    */
  def apply(): TimeRange = js.native
  def apply(start: js.Array[TimeRange]): TimeRange = js.native
  def apply(start: js.Array[TimeRange], end: Double): TimeRange = js.native
  def apply(start: Double): TimeRange = js.native
  def apply(start: Double, end: Double): TimeRange = js.native
}

