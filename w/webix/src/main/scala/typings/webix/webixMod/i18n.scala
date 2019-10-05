package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
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

@JSImport("webix", "i18n")
@js.native
object i18n extends TopLevel[i18n]

