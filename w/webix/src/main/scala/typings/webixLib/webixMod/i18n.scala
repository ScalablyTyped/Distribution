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

