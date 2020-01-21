package typings.vegaTypings.scaleMod

import typings.vegaTypings.axisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.millisecond
  - typings.vegaTypings.vegaTypingsStrings.second
  - typings.vegaTypings.vegaTypingsStrings.minute
  - typings.vegaTypings.vegaTypingsStrings.hour
  - typings.vegaTypings.vegaTypingsStrings.day
  - typings.vegaTypings.vegaTypingsStrings.week
  - typings.vegaTypings.vegaTypingsStrings.month
  - typings.vegaTypings.vegaTypingsStrings.year
*/
trait TimeInterval extends _TickCount

object TimeInterval {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typings.vegaTypings.vegaTypingsStrings.day = this.cast("day")
  @scala.inline
  def hour: typings.vegaTypings.vegaTypingsStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typings.vegaTypings.vegaTypingsStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typings.vegaTypings.vegaTypingsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typings.vegaTypings.vegaTypingsStrings.month = this.cast("month")
  @scala.inline
  def second: typings.vegaTypings.vegaTypingsStrings.second = this.cast("second")
  @scala.inline
  def week: typings.vegaTypings.vegaTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typings.vegaTypings.vegaTypingsStrings.year = this.cast("year")
}

