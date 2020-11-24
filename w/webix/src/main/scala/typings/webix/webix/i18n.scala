package typings.webix.webix

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
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), decimalDelimiter = decimalDelimiter.asInstanceOf[js.Any], decimalSize = decimalSize.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fullDateFormat = fullDateFormat.asInstanceOf[js.Any], fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], intFormat = js.Any.fromFunction1(intFormat), locales = locales.asInstanceOf[js.Any], longDateFormat = longDateFormat.asInstanceOf[js.Any], longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), numberFormat = js.Any.fromFunction1(numberFormat), parseFormat = parseFormat.asInstanceOf[js.Any], parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat.asInstanceOf[js.Any], parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), price = price.asInstanceOf[js.Any], priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings.asInstanceOf[js.Any], setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat.asInstanceOf[js.Any], timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr))
    __obj.asInstanceOf[i18n]
  }
  
  @scala.inline
  implicit class i18nOps[Self <: i18n] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendar(value: js.Any): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControls(value: js.Any): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatDate(value: String => js.Any): Self = this.set("dateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateFormatStr(value: js.Any => String): Self = this.set("dateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecimalDelimiter(value: String): Self = this.set("decimalDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalSize(value: Double): Self = this.set("decimalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeVarargs(value: js.Any*): Self = this.set("fileSize", js.Array(value :_*))
    
    @scala.inline
    def setFileSize(value: js.Array[_]): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateFormat(value: String): Self = this.set("fullDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateFormatDate(value: String => js.Any): Self = this.set("fullDateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFullDateFormatStr(value: Date => String): Self = this.set("fullDateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupDelimiter(value: String): Self = this.set("groupDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSize(value: Double): Self = this.set("groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntFormat(value: Double => String): Self = this.set("intFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocales(value: js.Any): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateFormat(value: String): Self = this.set("longDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDateFormatDate(value: String => js.Any): Self = this.set("longDateFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLongDateFormatStr(value: js.Any => String): Self = this.set("longDateFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNumberFormat(value: Double => String): Self = this.set("numberFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseFormat(value: String): Self = this.set("parseFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFormatDate(value: String => js.Any): Self = this.set("parseFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseFormatStr(value: js.Any => String): Self = this.set("parseFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTimeFormat(value: String): Self = this.set("parseTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseTimeFormatDate(value: String => js.Any): Self = this.set("parseTimeFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseTimeFormatStr(value: js.Any => String): Self = this.set("parseTimeFormatStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceFormat(value: Double => String): Self = this.set("priceFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPriceSettings(value: js.Any): Self = this.set("priceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLocale(value: String => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatDate(value: String => js.Any): Self = this.set("timeFormatDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeFormatStr(value: js.Any => String): Self = this.set("timeFormatStr", js.Any.fromFunction1(value))
  }
}
