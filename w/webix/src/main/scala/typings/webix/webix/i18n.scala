package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait i18n extends StObject {
  
  var calendar: js.Any
  
  var controls: js.Any
  
  var dateFormat: String
  
  def dateFormatDate(date: String): js.Any
  
  def dateFormatStr(date: js.Any): String
  
  var decimalDelimiter: String
  
  var decimalSize: Double
  
  var fileSize: js.Array[js.Any]
  
  var fullDateFormat: String
  
  def fullDateFormatDate(date: String): js.Any
  
  def fullDateFormatStr(date: Date): String
  
  var groupDelimiter: String
  
  var groupSize: Double
  
  def intFormat(num: Double): String
  
  var locales: js.Any
  
  var longDateFormat: String
  
  def longDateFormatDate(date: String): js.Any
  
  def longDateFormatStr(date: js.Any): String
  
  def numberFormat(number: Double): String
  
  var parseFormat: String
  
  def parseFormatDate(date: String): js.Any
  
  def parseFormatStr(date: js.Any): String
  
  var parseTimeFormat: String
  
  def parseTimeFormatDate(date: String): js.Any
  
  def parseTimeFormatStr(date: js.Any): String
  
  var price: String
  
  def priceFormat(number: Double): String
  
  var priceSettings: js.Any
  
  def setLocale(name: String): Unit
  
  var timeFormat: String
  
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
    fileSize: js.Array[js.Any],
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
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), decimalDelimiter = decimalDelimiter.asInstanceOf[js.Any], decimalSize = decimalSize.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fullDateFormat = fullDateFormat.asInstanceOf[js.Any], fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], intFormat = js.Any.fromFunction1(intFormat), locales = locales.asInstanceOf[js.Any], longDateFormat = longDateFormat.asInstanceOf[js.Any], longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), numberFormat = js.Any.fromFunction1(numberFormat), parseFormat = parseFormat.asInstanceOf[js.Any], parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat.asInstanceOf[js.Any], parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), price = price.asInstanceOf[js.Any], priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings.asInstanceOf[js.Any], setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat.asInstanceOf[js.Any], timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr))
    __obj.asInstanceOf[i18n]
  }
  
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
    def setFileSize(value: js.Array[js.Any]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeVarargs(value: js.Any*): Self = StObject.set(x, "fileSize", js.Array(value :_*))
    
    @scala.inline
    def setFullDateFormat(value: String): Self = StObject.set(x, "fullDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateFormatDate(value: String => js.Any): Self = StObject.set(x, "fullDateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFullDateFormatStr(value: Date => String): Self = StObject.set(x, "fullDateFormatStr", js.Any.fromFunction1(value))
    
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
