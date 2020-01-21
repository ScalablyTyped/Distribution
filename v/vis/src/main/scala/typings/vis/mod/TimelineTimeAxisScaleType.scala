package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vis.visStrings.millisecond
  - typings.vis.visStrings.second
  - typings.vis.visStrings.minute
  - typings.vis.visStrings.hour
  - typings.vis.visStrings.weekday
  - typings.vis.visStrings.day
  - typings.vis.visStrings.week
  - typings.vis.visStrings.month
  - typings.vis.visStrings.year
*/
trait TimelineTimeAxisScaleType extends js.Object

object TimelineTimeAxisScaleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typings.vis.visStrings.day = this.cast("day")
  @scala.inline
  def hour: typings.vis.visStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typings.vis.visStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typings.vis.visStrings.minute = this.cast("minute")
  @scala.inline
  def month: typings.vis.visStrings.month = this.cast("month")
  @scala.inline
  def second: typings.vis.visStrings.second = this.cast("second")
  @scala.inline
  def week: typings.vis.visStrings.week = this.cast("week")
  @scala.inline
  def weekday: typings.vis.visStrings.weekday = this.cast("weekday")
  @scala.inline
  def year: typings.vis.visStrings.year = this.cast("year")
}

