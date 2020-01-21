package typings.vegaTypings.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.vegaTypingsStrings.year
  - typings.vegaTypings.vegaTypingsStrings.quarter
  - typings.vegaTypings.vegaTypingsStrings.month
  - typings.vegaTypings.vegaTypingsStrings.week
  - typings.vegaTypings.vegaTypingsStrings.day
  - typings.vegaTypings.vegaTypingsStrings.date
  - typings.vegaTypings.vegaTypingsStrings.hours
  - typings.vegaTypings.vegaTypingsStrings.minutes
  - typings.vegaTypings.vegaTypingsStrings.seconds
  - typings.vegaTypings.vegaTypingsStrings.milliseconds
*/
trait TimeUnit extends js.Object

object TimeUnit {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.vegaTypings.vegaTypingsStrings.date = this.cast("date")
  @scala.inline
  def day: typings.vegaTypings.vegaTypingsStrings.day = this.cast("day")
  @scala.inline
  def hours: typings.vegaTypings.vegaTypingsStrings.hours = this.cast("hours")
  @scala.inline
  def milliseconds: typings.vegaTypings.vegaTypingsStrings.milliseconds = this.cast("milliseconds")
  @scala.inline
  def minutes: typings.vegaTypings.vegaTypingsStrings.minutes = this.cast("minutes")
  @scala.inline
  def month: typings.vegaTypings.vegaTypingsStrings.month = this.cast("month")
  @scala.inline
  def quarter: typings.vegaTypings.vegaTypingsStrings.quarter = this.cast("quarter")
  @scala.inline
  def seconds: typings.vegaTypings.vegaTypingsStrings.seconds = this.cast("seconds")
  @scala.inline
  def week: typings.vegaTypings.vegaTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typings.vegaTypings.vegaTypingsStrings.year = this.cast("year")
}

