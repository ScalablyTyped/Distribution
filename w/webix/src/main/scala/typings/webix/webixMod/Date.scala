package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var startOnMonday: Boolean = js.native
  def add(date: js.Any, inc: Double, mode: String, copy: Boolean): js.Any = js.native
  def copy(date: js.Any): js.Any = js.native
  def datePart(date: js.Any, copy: Boolean): js.Any = js.native
  def dateToStr(format: String, utc: Boolean): WebixCallback = js.native
  def dayStart(date: js.Any): js.Any = js.native
  def equal(datea: js.Any, dateb: js.Any): Boolean = js.native
  def getISOWeek(date: js.Any): Double = js.native
  def getUTCISOWeek(date: js.Any): Double = js.native
  def isHoliday(date: js.Any): Boolean = js.native
  def monthStart(date: js.Any): js.Any = js.native
  def strToDate(format: String, utc: Boolean): WebixCallback = js.native
  def timePart(date: js.Any): Double = js.native
  def toFixed(num: String): Double | String = js.native
  def toFixed(num: Double): Double | String = js.native
  def weekStart(date: js.Any): js.Any = js.native
  def yearStart(date: js.Any): js.Any = js.native
}

