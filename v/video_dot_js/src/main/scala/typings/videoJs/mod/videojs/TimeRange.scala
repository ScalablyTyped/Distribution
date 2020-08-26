package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that contains ranges of time for various reasons.
  * @see https://developer.mozilla.org/en-US/docs/Web/API/TimeRanges
  */
@js.native
trait TimeRange extends js.Object {
  /**
    *           The number of time ranges represented by this Object
    */
  val length: Double = js.native
  /**
    * Returns the time offset at which a specified time range ends.
    *
    * @param [index=0]
    *        The range number to return the time for.
    *
    * @return The time that offset at the specified index.
    */
  def end(index: Double): Double = js.native
  /**
    * Returns the time offset at which a specified time range begins.
    *
    * @param [index=0]
    *        The range number to return the time for.
    *
    * @return The time that offset at the specified index.
    */
  def start(index: Double): Double = js.native
}

object TimeRange {
  @scala.inline
  def apply(end: Double => Double, length: Double, start: Double => Double): TimeRange = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[TimeRange]
  }
  @scala.inline
  implicit class TimeRangeOps[Self <: TimeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double => Double): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double => Double): Self = this.set("start", js.Any.fromFunction1(value))
  }
  
}

