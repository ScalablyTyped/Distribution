package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait i18n extends StObject {
  
  var calendar: Any
  
  var controls: Any
  
  var dateFormat: String
  
  def dateFormatDate(date: String): Any
  
  def dateFormatStr(date: Any): String
  
  var decimalDelimiter: String
  
  var decimalSize: Double
  
  var fileSize: js.Array[Any]
  
  var fullDateFormat: String
  
  def fullDateFormatDate(date: String): Any
  
  def fullDateFormatStr(date: Date): String
  
  var groupDelimiter: String
  
  var groupSize: Double
  
  def intFormat(num: Double): String
  
  var locales: Any
  
  var longDateFormat: String
  
  def longDateFormatDate(date: String): Any
  
  def longDateFormatStr(date: Any): String
  
  def numberFormat(number: Double): String
  
  var parseFormat: String
  
  def parseFormatDate(date: String): Any
  
  def parseFormatStr(date: Any): String
  
  var parseTimeFormat: String
  
  def parseTimeFormatDate(date: String): Any
  
  def parseTimeFormatStr(date: Any): String
  
  var price: String
  
  def priceFormat(number: Double): String
  
  var priceSettings: Any
  
  def setLocale(name: String): Unit
  
  var timeFormat: String
  
  def timeFormatDate(time: String): Any
  
  def timeFormatStr(date: Any): String
}
object i18n {
  
  @JSImport("webix", "i18n")
  @js.native
  val ^ : typings.webix.webix.i18n = js.native
  
  extension [Self <: i18n](x: Self) {
    
    inline def setCalendar(value: Any): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setControls(value: Any): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatDate(value: String => Any): Self = StObject.set(x, "dateFormatDate", js.Any.fromFunction1(value))
    
    inline def setDateFormatStr(value: Any => String): Self = StObject.set(x, "dateFormatStr", js.Any.fromFunction1(value))
    
    inline def setDecimalDelimiter(value: String): Self = StObject.set(x, "decimalDelimiter", value.asInstanceOf[js.Any])
    
    inline def setDecimalSize(value: Double): Self = StObject.set(x, "decimalSize", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: js.Array[Any]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeVarargs(value: Any*): Self = StObject.set(x, "fileSize", js.Array(value*))
    
    inline def setFullDateFormat(value: String): Self = StObject.set(x, "fullDateFormat", value.asInstanceOf[js.Any])
    
    inline def setFullDateFormatDate(value: String => Any): Self = StObject.set(x, "fullDateFormatDate", js.Any.fromFunction1(value))
    
    inline def setFullDateFormatStr(value: Date => String): Self = StObject.set(x, "fullDateFormatStr", js.Any.fromFunction1(value))
    
    inline def setGroupDelimiter(value: String): Self = StObject.set(x, "groupDelimiter", value.asInstanceOf[js.Any])
    
    inline def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    inline def setIntFormat(value: Double => String): Self = StObject.set(x, "intFormat", js.Any.fromFunction1(value))
    
    inline def setLocales(value: Any): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormat(value: String): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormatDate(value: String => Any): Self = StObject.set(x, "longDateFormatDate", js.Any.fromFunction1(value))
    
    inline def setLongDateFormatStr(value: Any => String): Self = StObject.set(x, "longDateFormatStr", js.Any.fromFunction1(value))
    
    inline def setNumberFormat(value: Double => String): Self = StObject.set(x, "numberFormat", js.Any.fromFunction1(value))
    
    inline def setParseFormat(value: String): Self = StObject.set(x, "parseFormat", value.asInstanceOf[js.Any])
    
    inline def setParseFormatDate(value: String => Any): Self = StObject.set(x, "parseFormatDate", js.Any.fromFunction1(value))
    
    inline def setParseFormatStr(value: Any => String): Self = StObject.set(x, "parseFormatStr", js.Any.fromFunction1(value))
    
    inline def setParseTimeFormat(value: String): Self = StObject.set(x, "parseTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setParseTimeFormatDate(value: String => Any): Self = StObject.set(x, "parseTimeFormatDate", js.Any.fromFunction1(value))
    
    inline def setParseTimeFormatStr(value: Any => String): Self = StObject.set(x, "parseTimeFormatStr", js.Any.fromFunction1(value))
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceFormat(value: Double => String): Self = StObject.set(x, "priceFormat", js.Any.fromFunction1(value))
    
    inline def setPriceSettings(value: Any): Self = StObject.set(x, "priceSettings", value.asInstanceOf[js.Any])
    
    inline def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatDate(value: String => Any): Self = StObject.set(x, "timeFormatDate", js.Any.fromFunction1(value))
    
    inline def setTimeFormatStr(value: Any => String): Self = StObject.set(x, "timeFormatStr", js.Any.fromFunction1(value))
  }
}
