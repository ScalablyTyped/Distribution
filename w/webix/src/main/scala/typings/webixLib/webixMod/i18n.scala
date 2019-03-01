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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("controls")(controls)
    __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.updateDynamic("dateFormatDate")(dateFormatDate)
    __obj.updateDynamic("dateFormatStr")(dateFormatStr)
    __obj.updateDynamic("decimalDelimiter")(decimalDelimiter)
    __obj.updateDynamic("decimalSize")(decimalSize)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("fullDateFormat")(fullDateFormat)
    __obj.updateDynamic("fullDateFormatDate")(fullDateFormatDate)
    __obj.updateDynamic("fullDateFormatStr")(fullDateFormatStr)
    __obj.updateDynamic("groupDelimiter")(groupDelimiter)
    __obj.updateDynamic("groupSize")(groupSize)
    __obj.updateDynamic("intFormat")(intFormat)
    __obj.updateDynamic("locales")(locales)
    __obj.updateDynamic("longDateFormat")(longDateFormat)
    __obj.updateDynamic("longDateFormatDate")(longDateFormatDate)
    __obj.updateDynamic("longDateFormatStr")(longDateFormatStr)
    __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.updateDynamic("parseFormat")(parseFormat)
    __obj.updateDynamic("parseFormatDate")(parseFormatDate)
    __obj.updateDynamic("parseFormatStr")(parseFormatStr)
    __obj.updateDynamic("parseTimeFormat")(parseTimeFormat)
    __obj.updateDynamic("parseTimeFormatDate")(parseTimeFormatDate)
    __obj.updateDynamic("parseTimeFormatStr")(parseTimeFormatStr)
    __obj.updateDynamic("price")(price)
    __obj.updateDynamic("priceFormat")(priceFormat)
    __obj.updateDynamic("priceSettings")(priceSettings)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("timeFormat")(timeFormat)
    __obj.updateDynamic("timeFormatDate")(timeFormatDate)
    __obj.updateDynamic("timeFormatStr")(timeFormatStr)
    __obj.asInstanceOf[i18n]
  }
}

