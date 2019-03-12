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
    dateFormatDate: java.lang.String => js.Any,
    dateFormatStr: js.Any => java.lang.String,
    decimalDelimiter: java.lang.String,
    decimalSize: scala.Double,
    fileSize: js.Array[_],
    fullDateFormat: java.lang.String,
    fullDateFormatDate: java.lang.String => js.Any,
    fullDateFormatStr: Date => java.lang.String,
    groupDelimiter: java.lang.String,
    groupSize: scala.Double,
    intFormat: scala.Double => java.lang.String,
    locales: js.Any,
    longDateFormat: java.lang.String,
    longDateFormatDate: java.lang.String => js.Any,
    longDateFormatStr: js.Any => java.lang.String,
    numberFormat: scala.Double => java.lang.String,
    parseFormat: java.lang.String,
    parseFormatDate: java.lang.String => js.Any,
    parseFormatStr: js.Any => java.lang.String,
    parseTimeFormat: java.lang.String,
    parseTimeFormatDate: java.lang.String => js.Any,
    parseTimeFormatStr: js.Any => java.lang.String,
    price: java.lang.String,
    priceFormat: scala.Double => java.lang.String,
    priceSettings: js.Any,
    setLocale: java.lang.String => scala.Unit,
    timeFormat: java.lang.String,
    timeFormatDate: java.lang.String => js.Any,
    timeFormatStr: js.Any => java.lang.String
  ): i18n = {
    val __obj = js.Dynamic.literal(calendar = calendar, controls = controls, dateFormat = dateFormat, dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), decimalDelimiter = decimalDelimiter, decimalSize = decimalSize, fileSize = fileSize, fullDateFormat = fullDateFormat, fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter, groupSize = groupSize, intFormat = js.Any.fromFunction1(intFormat), locales = locales, longDateFormat = longDateFormat, longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), numberFormat = js.Any.fromFunction1(numberFormat), parseFormat = parseFormat, parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat, parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), price = price, priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings, setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat, timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr))
  
    __obj.asInstanceOf[i18n]
  }
}

