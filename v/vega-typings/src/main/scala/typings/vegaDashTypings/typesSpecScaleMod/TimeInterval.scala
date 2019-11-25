package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecAxisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.millisecond
  - typings.vegaDashTypings.vegaDashTypingsStrings.second
  - typings.vegaDashTypings.vegaDashTypingsStrings.minute
  - typings.vegaDashTypings.vegaDashTypingsStrings.hour
  - typings.vegaDashTypings.vegaDashTypingsStrings.day
  - typings.vegaDashTypings.vegaDashTypingsStrings.week
  - typings.vegaDashTypings.vegaDashTypingsStrings.month
  - typings.vegaDashTypings.vegaDashTypingsStrings.year
*/
trait TimeInterval extends _TickCount

object TimeInterval {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typings.vegaDashTypings.vegaDashTypingsStrings.day = this.cast("day")
  @scala.inline
  def hour: typings.vegaDashTypings.vegaDashTypingsStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typings.vegaDashTypings.vegaDashTypingsStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typings.vegaDashTypings.vegaDashTypingsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typings.vegaDashTypings.vegaDashTypingsStrings.month = this.cast("month")
  @scala.inline
  def second: typings.vegaDashTypings.vegaDashTypingsStrings.second = this.cast("second")
  @scala.inline
  def week: typings.vegaDashTypings.vegaDashTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typings.vegaDashTypings.vegaDashTypingsStrings.year = this.cast("year")
}

