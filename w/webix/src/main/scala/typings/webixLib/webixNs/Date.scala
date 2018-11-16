package typings
package webixLib.webixNs

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

