package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var startOnMonday: Boolean
  def add(date: js.Any, inc: Double, mode: String, copy: Boolean): js.Any
  def copy(date: js.Any): js.Any
  def datePart(date: js.Any, copy: Boolean): js.Any
  def dateToStr(format: String, utc: Boolean): WebixCallback
  def dayStart(date: js.Any): js.Any
  def equal(datea: js.Any, dateb: js.Any): Boolean
  def getISOWeek(date: js.Any): Double
  def getUTCISOWeek(date: js.Any): Double
  def isHoliday(date: js.Any): Boolean
  def monthStart(date: js.Any): js.Any
  def strToDate(format: String, utc: Boolean): WebixCallback
  def timePart(date: js.Any): Double
  def toFixed(num: Double): Double
  def weekStart(date: js.Any): js.Any
  def yearStart(date: js.Any): js.Any
}

object Date {
  @scala.inline
  def apply(
    add: (js.Any, Double, String, Boolean) => js.Any,
    copy: js.Any => js.Any,
    datePart: (js.Any, Boolean) => js.Any,
    dateToStr: (String, Boolean) => WebixCallback,
    dayStart: js.Any => js.Any,
    equal: (js.Any, js.Any) => Boolean,
    getISOWeek: js.Any => Double,
    getUTCISOWeek: js.Any => Double,
    isHoliday: js.Any => Boolean,
    monthStart: js.Any => js.Any,
    startOnMonday: Boolean,
    strToDate: (String, Boolean) => WebixCallback,
    timePart: js.Any => Double,
    toFixed: Double => Double,
    weekStart: js.Any => js.Any,
    yearStart: js.Any => js.Any
  ): Date = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add), copy = js.Any.fromFunction1(copy), datePart = js.Any.fromFunction2(datePart), dateToStr = js.Any.fromFunction2(dateToStr), dayStart = js.Any.fromFunction1(dayStart), equal = js.Any.fromFunction2(equal), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), isHoliday = js.Any.fromFunction1(isHoliday), monthStart = js.Any.fromFunction1(monthStart), startOnMonday = startOnMonday, strToDate = js.Any.fromFunction2(strToDate), timePart = js.Any.fromFunction1(timePart), toFixed = js.Any.fromFunction1(toFixed), weekStart = js.Any.fromFunction1(weekStart), yearStart = js.Any.fromFunction1(yearStart))
  
    __obj.asInstanceOf[Date]
  }
}

