package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait i18n extends StObject {
  
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
  
  def fullDateFormatStr(date: typings.webix.mod.Date): String = js.native
  
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
object i18n {
  
  @JSImport("webix", "i18n")
  @js.native
  val ^ : typings.webix.webix.i18n = js.native
  
  @scala.inline
  implicit class i18nMutableBuilder[Self <: i18n] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: js.Any): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: js.Any): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatDate(value: String => js.Any): Self = StObject.set(x, "dateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateFormatStr(value: js.Any => String): Self = StObject.set(x, "dateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecimalDelimiter(value: String): Self = StObject.set(x, "decimalDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSize(value: Double): Self = StObject.set(x, "decimalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: js.Array[_]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeVarargs(value: js.Any*): Self = StObject.set(x, "fileSize", js.Array(value :_*))
    
    @scala.inline
    def setFullDateFormat(value: String): Self = StObject.set(x, "fullDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateFormatDate(value: String => js.Any): Self = StObject.set(x, "fullDateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFullDateFormatStr(value: typings.webix.mod.Date => String): Self = StObject.set(x, "fullDateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupDelimiter(value: String): Self = StObject.set(x, "groupDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntFormat(value: Double => String): Self = StObject.set(x, "intFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocales(value: js.Any): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateFormat(value: String): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateFormatDate(value: String => js.Any): Self = StObject.set(x, "longDateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLongDateFormatStr(value: js.Any => String): Self = StObject.set(x, "longDateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNumberFormat(value: Double => String): Self = StObject.set(x, "numberFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseFormat(value: String): Self = StObject.set(x, "parseFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFormatDate(value: String => js.Any): Self = StObject.set(x, "parseFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseFormatStr(value: js.Any => String): Self = StObject.set(x, "parseFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTimeFormat(value: String): Self = StObject.set(x, "parseTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseTimeFormatDate(value: String => js.Any): Self = StObject.set(x, "parseTimeFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTimeFormatStr(value: js.Any => String): Self = StObject.set(x, "parseTimeFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceFormat(value: Double => String): Self = StObject.set(x, "priceFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPriceSettings(value: js.Any): Self = StObject.set(x, "priceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatDate(value: String => js.Any): Self = StObject.set(x, "timeFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeFormatStr(value: js.Any => String): Self = StObject.set(x, "timeFormatStr", js.Any.fromFunction1(value))
  }
}
