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
  def dateToStr(format: java.lang.String, utc: scala.Boolean): webixLib.WebixCallback
  def dayStart(date: js.Any): js.Any
  def equal(datea: js.Any, dateb: js.Any): scala.Boolean
  def getISOWeek(date: js.Any): scala.Double
  def getUTCISOWeek(date: js.Any): scala.Double
  def isHoliday(date: js.Any): scala.Boolean
  def monthStart(date: js.Any): js.Any
  def strToDate(format: java.lang.String, utc: scala.Boolean): webixLib.WebixCallback
  def timePart(date: js.Any): scala.Double
  def toFixed(num: scala.Double): scala.Double
  def weekStart(date: js.Any): js.Any
  def yearStart(date: js.Any): js.Any
}

object Date {
  @scala.inline
  def apply(
    add: js.Function4[js.Any, scala.Double, java.lang.String, scala.Boolean, js.Any],
    copy: js.Function1[js.Any, js.Any],
    datePart: js.Function2[js.Any, scala.Boolean, js.Any],
    dateToStr: js.Function2[java.lang.String, scala.Boolean, webixLib.WebixCallback],
    dayStart: js.Function1[js.Any, js.Any],
    equal: js.Function2[js.Any, js.Any, scala.Boolean],
    getISOWeek: js.Function1[js.Any, scala.Double],
    getUTCISOWeek: js.Function1[js.Any, scala.Double],
    isHoliday: js.Function1[js.Any, scala.Boolean],
    monthStart: js.Function1[js.Any, js.Any],
    startOnMonday: scala.Boolean,
    strToDate: js.Function2[java.lang.String, scala.Boolean, webixLib.WebixCallback],
    timePart: js.Function1[js.Any, scala.Double],
    toFixed: js.Function1[scala.Double, scala.Double],
    weekStart: js.Function1[js.Any, js.Any],
    yearStart: js.Function1[js.Any, js.Any]
  ): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("datePart")(datePart)
    __obj.updateDynamic("dateToStr")(dateToStr)
    __obj.updateDynamic("dayStart")(dayStart)
    __obj.updateDynamic("equal")(equal)
    __obj.updateDynamic("getISOWeek")(getISOWeek)
    __obj.updateDynamic("getUTCISOWeek")(getUTCISOWeek)
    __obj.updateDynamic("isHoliday")(isHoliday)
    __obj.updateDynamic("monthStart")(monthStart)
    __obj.updateDynamic("startOnMonday")(startOnMonday)
    __obj.updateDynamic("strToDate")(strToDate)
    __obj.updateDynamic("timePart")(timePart)
    __obj.updateDynamic("toFixed")(toFixed)
    __obj.updateDynamic("weekStart")(weekStart)
    __obj.updateDynamic("yearStart")(yearStart)
    __obj.asInstanceOf[Date]
  }
}

