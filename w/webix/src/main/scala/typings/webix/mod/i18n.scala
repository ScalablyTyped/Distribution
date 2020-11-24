package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait i18n extends js.Object {
  
  var calendar: js.Any = js.native
  
  var controls: js.Any = js.native
  
  var dateFormat: String = js.native
  
  def dateFormatDate(date: String): js.Any = js.native
  
  def dateFormatStr(date: js.Any): String = js.native
  
  var decimalDelimiter: String = js.native
  
  var decimalSize: Double = js.native
  
  var fileSize: js.Array[_] = js.native
  
  var fullDateFormat: String = js.native
  
  def fullDateFormatDate(date: String): js.Any = js.native
  
  def fullDateFormatStr(date: Date): String = js.native
  
  var groupDelimiter: String = js.native
  
  var groupSize: Double = js.native
  
  def intFormat(num: Double): String = js.native
  
  var locales: js.Any = js.native
  
  var longDateFormat: String = js.native
  
  def longDateFormatDate(date: String): js.Any = js.native
  
  def longDateFormatStr(date: js.Any): String = js.native
  
  def numberFormat(number: Double): String = js.native
  
  var parseFormat: String = js.native
  
  def parseFormatDate(date: String): js.Any = js.native
  
  def parseFormatStr(date: js.Any): String = js.native
  
  var parseTimeFormat: String = js.native
  
  def parseTimeFormatDate(date: String): js.Any = js.native
  
  def parseTimeFormatStr(date: js.Any): String = js.native
  
  var price: String = js.native
  
  def priceFormat(number: Double): String = js.native
  
  var priceSettings: js.Any = js.native
  
  def setLocale(name: String): Unit = js.native
  
  var timeFormat: String = js.native
  
  def timeFormatDate(time: String): js.Any = js.native
  
  def timeFormatStr(date: js.Any): String = js.native
}
@JSImport("webix", "i18n")
@js.native
object i18n
  extends TopLevel[typings.webix.webix.i18n]
