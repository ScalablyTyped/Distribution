package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18n extends js.Object {
  var calendar: js.Any
  var controls: js.Any
  var dateFormat: java.lang.String
  var decimalDelimiter: java.lang.String
  var decimalSize: scala.Double
  var fileSize: js.Array[_]
  var fullDateFormat: java.lang.String
  var groupDelimiter: java.lang.String
  var groupSize: scala.Double
  var locales: js.Any
  var longDateFormat: java.lang.String
  var parseFormat: java.lang.String
  var parseTimeFormat: java.lang.String
  var price: java.lang.String
  var priceSettings: js.Any
  var timeFormat: java.lang.String
  def dateFormatDate(date: java.lang.String): js.Any
  def dateFormatStr(date: js.Any): java.lang.String
  def fullDateFormatDate(date: java.lang.String): js.Any
  def fullDateFormatStr(date: Date): java.lang.String
  def intFormat(num: scala.Double): java.lang.String
  def longDateFormatDate(date: java.lang.String): js.Any
  def longDateFormatStr(date: js.Any): java.lang.String
  def numberFormat(number: scala.Double): java.lang.String
  def parseFormatDate(date: java.lang.String): js.Any
  def parseFormatStr(date: js.Any): java.lang.String
  def parseTimeFormatDate(date: java.lang.String): js.Any
  def parseTimeFormatStr(date: js.Any): java.lang.String
  def priceFormat(number: scala.Double): java.lang.String
  def setLocale(name: java.lang.String): scala.Unit
  def timeFormatDate(time: java.lang.String): js.Any
  def timeFormatStr(date: js.Any): java.lang.String
}

object i18n {
  @scala.inline
  def apply(
    calendar: js.Any,
    controls: js.Any,
    dateFormat: java.lang.String,
    dateFormatDate: js.Function1[java.lang.String, js.Any],
    dateFormatStr: js.Function1[js.Any, java.lang.String],
    decimalDelimiter: java.lang.String,
    decimalSize: scala.Double,
    fileSize: js.Array[_],
    fullDateFormat: java.lang.String,
    fullDateFormatDate: js.Function1[java.lang.String, js.Any],
    fullDateFormatStr: js.Function1[Date, java.lang.String],
    groupDelimiter: java.lang.String,
    groupSize: scala.Double,
    intFormat: js.Function1[scala.Double, java.lang.String],
    locales: js.Any,
    longDateFormat: java.lang.String,
    longDateFormatDate: js.Function1[java.lang.String, js.Any],
    longDateFormatStr: js.Function1[js.Any, java.lang.String],
    numberFormat: js.Function1[scala.Double, java.lang.String],
    parseFormat: java.lang.String,
    parseFormatDate: js.Function1[java.lang.String, js.Any],
    parseFormatStr: js.Function1[js.Any, java.lang.String],
    parseTimeFormat: java.lang.String,
    parseTimeFormatDate: js.Function1[java.lang.String, js.Any],
    parseTimeFormatStr: js.Function1[js.Any, java.lang.String],
    price: java.lang.String,
    priceFormat: js.Function1[scala.Double, java.lang.String],
    priceSettings: js.Any,
    setLocale: js.Function1[java.lang.String, scala.Unit],
    timeFormat: java.lang.String,
    timeFormatDate: js.Function1[java.lang.String, js.Any],
    timeFormatStr: js.Function1[js.Any, java.lang.String]
  ): i18n = {
    val __obj = js.Dynamic.literal(calendar = calendar, controls = controls, dateFormat = dateFormat, dateFormatDate = dateFormatDate, dateFormatStr = dateFormatStr, decimalDelimiter = decimalDelimiter, decimalSize = decimalSize, fileSize = fileSize, fullDateFormat = fullDateFormat, fullDateFormatDate = fullDateFormatDate, fullDateFormatStr = fullDateFormatStr, groupDelimiter = groupDelimiter, groupSize = groupSize, intFormat = intFormat, locales = locales, longDateFormat = longDateFormat, longDateFormatDate = longDateFormatDate, longDateFormatStr = longDateFormatStr, numberFormat = numberFormat, parseFormat = parseFormat, parseFormatDate = parseFormatDate, parseFormatStr = parseFormatStr, parseTimeFormat = parseTimeFormat, parseTimeFormatDate = parseTimeFormatDate, parseTimeFormatStr = parseTimeFormatStr, price = price, priceFormat = priceFormat, priceSettings = priceSettings, setLocale = setLocale, timeFormat = timeFormat, timeFormatDate = timeFormatDate, timeFormatStr = timeFormatStr)
  
    __obj.asInstanceOf[i18n]
  }
}

