package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var startOnMonday: scala.Boolean
  def add(date: js.Any, inc: scala.Double, mode: java.lang.String, copy: scala.Boolean): js.Any
  def copy(date: js.Any): js.Any
  def datePart(date: js.Any, copy: scala.Boolean): js.Any
  def dateToStr(format: java.lang.String, utc: scala.Boolean): WebixCallback
  def dayStart(date: js.Any): js.Any
  def equal(datea: js.Any, dateb: js.Any): scala.Boolean
  def getISOWeek(date: js.Any): scala.Double
  def getUTCISOWeek(date: js.Any): scala.Double
  def isHoliday(date: js.Any): scala.Boolean
  def monthStart(date: js.Any): js.Any
  def strToDate(format: java.lang.String, utc: scala.Boolean): WebixCallback
  def timePart(date: js.Any): scala.Double
  def toFixed(num: scala.Double): scala.Double
  def weekStart(date: js.Any): js.Any
  def yearStart(date: js.Any): js.Any
}

object Date {
  @scala.inline
  def apply(
    add: (js.Any, scala.Double, java.lang.String, scala.Boolean) => js.Any,
    copy: js.Any => js.Any,
    datePart: (js.Any, scala.Boolean) => js.Any,
    dateToStr: (java.lang.String, scala.Boolean) => WebixCallback,
    dayStart: js.Any => js.Any,
    equal: (js.Any, js.Any) => scala.Boolean,
    getISOWeek: js.Any => scala.Double,
    getUTCISOWeek: js.Any => scala.Double,
    isHoliday: js.Any => scala.Boolean,
    monthStart: js.Any => js.Any,
    startOnMonday: scala.Boolean,
    strToDate: (java.lang.String, scala.Boolean) => WebixCallback,
    timePart: js.Any => scala.Double,
    toFixed: scala.Double => scala.Double,
    weekStart: js.Any => js.Any,
    yearStart: js.Any => js.Any
  ): Date = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add), copy = js.Any.fromFunction1(copy), datePart = js.Any.fromFunction2(datePart), dateToStr = js.Any.fromFunction2(dateToStr), dayStart = js.Any.fromFunction1(dayStart), equal = js.Any.fromFunction2(equal), getISOWeek = js.Any.fromFunction1(getISOWeek), getUTCISOWeek = js.Any.fromFunction1(getUTCISOWeek), isHoliday = js.Any.fromFunction1(isHoliday), monthStart = js.Any.fromFunction1(monthStart), startOnMonday = startOnMonday, strToDate = js.Any.fromFunction2(strToDate), timePart = js.Any.fromFunction1(timePart), toFixed = js.Any.fromFunction1(toFixed), weekStart = js.Any.fromFunction1(weekStart), yearStart = js.Any.fromFunction1(yearStart))
  
    __obj.asInstanceOf[Date]
  }
}

