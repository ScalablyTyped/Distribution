package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18n extends js.Object {
  var calendar: js.Any
  var controls: js.Any
  var dateFormat: String
  var decimalDelimiter: String
  var decimalSize: Double
  var fileSize: js.Array[_]
  var fullDateFormat: String
  var groupDelimiter: String
  var groupSize: Double
  var locales: js.Any
  var longDateFormat: String
  var parseFormat: String
  var parseTimeFormat: String
  var price: String
  var priceSettings: js.Any
  var timeFormat: String
  def dateFormatDate(date: String): js.Any
  def dateFormatStr(date: js.Any): String
  def fullDateFormatDate(date: String): js.Any
  def fullDateFormatStr(date: Date): String
  def intFormat(num: Double): String
  def longDateFormatDate(date: String): js.Any
  def longDateFormatStr(date: js.Any): String
  def numberFormat(number: Double): String
  def parseFormatDate(date: String): js.Any
  def parseFormatStr(date: js.Any): String
  def parseTimeFormatDate(date: String): js.Any
  def parseTimeFormatStr(date: js.Any): String
  def priceFormat(number: Double): String
  def setLocale(name: String): Unit
  def timeFormatDate(time: String): js.Any
  def timeFormatStr(date: js.Any): String
}

object i18n {
  @scala.inline
  def apply(
    calendar: js.Any,
    controls: js.Any,
    dateFormat: String,
    dateFormatDate: String => js.Any,
    dateFormatStr: js.Any => String,
    decimalDelimiter: String,
    decimalSize: Double,
    fileSize: js.Array[_],
    fullDateFormat: String,
    fullDateFormatDate: String => js.Any,
    fullDateFormatStr: Date => String,
    groupDelimiter: String,
    groupSize: Double,
    intFormat: Double => String,
    locales: js.Any,
    longDateFormat: String,
    longDateFormatDate: String => js.Any,
    longDateFormatStr: js.Any => String,
    numberFormat: Double => String,
    parseFormat: String,
    parseFormatDate: String => js.Any,
    parseFormatStr: js.Any => String,
    parseTimeFormat: String,
    parseTimeFormatDate: String => js.Any,
    parseTimeFormatStr: js.Any => String,
    price: String,
    priceFormat: Double => String,
    priceSettings: js.Any,
    setLocale: String => Unit,
    timeFormat: String,
    timeFormatDate: String => js.Any,
    timeFormatStr: js.Any => String
  ): i18n = {
    val __obj = js.Dynamic.literal(calendar = calendar, controls = controls, dateFormat = dateFormat, dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), decimalDelimiter = decimalDelimiter, decimalSize = decimalSize, fileSize = fileSize, fullDateFormat = fullDateFormat, fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter, groupSize = groupSize, intFormat = js.Any.fromFunction1(intFormat), locales = locales, longDateFormat = longDateFormat, longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), numberFormat = js.Any.fromFunction1(numberFormat), parseFormat = parseFormat, parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat, parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), price = price, priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings, setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat, timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr))
  
    __obj.asInstanceOf[i18n]
  }
}

