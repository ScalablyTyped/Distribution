package typings.webix.webix

import typings.webix.anon.ActualSize
import typings.webix.anon.BeginsWith
import typings.webix.anon.Bold
import typings.webix.anon.Calendar
import typings.webix.anon.Cancel
import typings.webix.anon.Clear
import typings.webix.anon.Confirm
import typings.webix.anon.ConfirmMessage
import typings.webix.anon.DecimalDelimiter
import typings.webix.anon.DeselectAll
import typings.webix.anon.First
import typings.webix.anon.Formats
import typings.webix.anon.Last
import typings.webix.anon.Of
import typings.webix.anon.Seconds
import typings.webix.anon.Select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait i18n extends StObject {
  
  var PDFviewer: ActualSize
  
  var am: js.Array[String]
  
  var aria: Calendar
  
  var calendar: Clear
  
  var combo: Select
  
  var comments: ConfirmMessage
  
  var dataExport: Of
  
  var dateFormat: String
  
  def dateFormatDate(date: String): js.Date
  
  def dateFormatStr(date: js.Date): String
  
  var dbllist: DeselectAll
  
  var decimalDelimiter: String
  
  var decimalSize: Double
  
  var fileSize: js.Array[String]
  
  var filter: BeginsWith
  
  var fullDateFormat: String
  
  def fullDateFormatDate(date: String): js.Date
  
  def fullDateFormatStr(date: js.Date): String
  
  var groupDelimiter: String
  
  var groupSize: Double
  
  var hint: js.UndefOr[Last] = js.undefined
  
  def intFormat(num: Double): String
  
  var kanban: js.UndefOr[Confirm] = js.undefined
  
  var locales: Any
  
  var longDateFormat: String
  
  def longDateFormatDate(date: String): js.Date
  
  def longDateFormatStr(date: js.Date): String
  
  var message: Cancel
  
  def numberFormat(number: Double): String
  
  var pager: First
  
  var parseFormat: String
  
  def parseFormatDate(date: String): js.Date
  
  def parseFormatStr(date: js.Date): String
  
  var parseTimeFormat: String
  
  def parseTimeFormatDate(date: String): js.Date
  
  def parseTimeFormatStr(date: js.Date): String
  
  var pm: js.Array[String]
  
  var price: String
  
  def priceFormat(number: Double): String
  
  var priceSettings: DecimalDelimiter
  
  var richtext: Bold
  
  def setLocale(name: String): Unit
  
  var spreadsheet: js.UndefOr[Formats] = js.undefined
  
  var timeFormat: String
  
  def timeFormatDate(time: String): js.Date
  
  def timeFormatStr(date: js.Date): String
  
  var timeboard: Seconds
}
object i18n {
  
  inline def apply(
    PDFviewer: ActualSize,
    am: js.Array[String],
    aria: Calendar,
    calendar: Clear,
    combo: Select,
    comments: ConfirmMessage,
    dataExport: Of,
    dateFormat: String,
    dateFormatDate: String => js.Date,
    dateFormatStr: js.Date => String,
    dbllist: DeselectAll,
    decimalDelimiter: String,
    decimalSize: Double,
    fileSize: js.Array[String],
    filter: BeginsWith,
    fullDateFormat: String,
    fullDateFormatDate: String => js.Date,
    fullDateFormatStr: js.Date => String,
    groupDelimiter: String,
    groupSize: Double,
    intFormat: Double => String,
    locales: Any,
    longDateFormat: String,
    longDateFormatDate: String => js.Date,
    longDateFormatStr: js.Date => String,
    message: Cancel,
    numberFormat: Double => String,
    pager: First,
    parseFormat: String,
    parseFormatDate: String => js.Date,
    parseFormatStr: js.Date => String,
    parseTimeFormat: String,
    parseTimeFormatDate: String => js.Date,
    parseTimeFormatStr: js.Date => String,
    pm: js.Array[String],
    price: String,
    priceFormat: Double => String,
    priceSettings: DecimalDelimiter,
    richtext: Bold,
    setLocale: String => Unit,
    timeFormat: String,
    timeFormatDate: String => js.Date,
    timeFormatStr: js.Date => String,
    timeboard: Seconds
  ): i18n = {
    val __obj = js.Dynamic.literal(PDFviewer = PDFviewer.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], dataExport = dataExport.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateFormatDate = js.Any.fromFunction1(dateFormatDate), dateFormatStr = js.Any.fromFunction1(dateFormatStr), dbllist = dbllist.asInstanceOf[js.Any], decimalDelimiter = decimalDelimiter.asInstanceOf[js.Any], decimalSize = decimalSize.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], fullDateFormat = fullDateFormat.asInstanceOf[js.Any], fullDateFormatDate = js.Any.fromFunction1(fullDateFormatDate), fullDateFormatStr = js.Any.fromFunction1(fullDateFormatStr), groupDelimiter = groupDelimiter.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], intFormat = js.Any.fromFunction1(intFormat), locales = locales.asInstanceOf[js.Any], longDateFormat = longDateFormat.asInstanceOf[js.Any], longDateFormatDate = js.Any.fromFunction1(longDateFormatDate), longDateFormatStr = js.Any.fromFunction1(longDateFormatStr), message = message.asInstanceOf[js.Any], numberFormat = js.Any.fromFunction1(numberFormat), pager = pager.asInstanceOf[js.Any], parseFormat = parseFormat.asInstanceOf[js.Any], parseFormatDate = js.Any.fromFunction1(parseFormatDate), parseFormatStr = js.Any.fromFunction1(parseFormatStr), parseTimeFormat = parseTimeFormat.asInstanceOf[js.Any], parseTimeFormatDate = js.Any.fromFunction1(parseTimeFormatDate), parseTimeFormatStr = js.Any.fromFunction1(parseTimeFormatStr), pm = pm.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceFormat = js.Any.fromFunction1(priceFormat), priceSettings = priceSettings.asInstanceOf[js.Any], richtext = richtext.asInstanceOf[js.Any], setLocale = js.Any.fromFunction1(setLocale), timeFormat = timeFormat.asInstanceOf[js.Any], timeFormatDate = js.Any.fromFunction1(timeFormatDate), timeFormatStr = js.Any.fromFunction1(timeFormatStr), timeboard = timeboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18n]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: i18n] (val x: Self) extends AnyVal {
    
    inline def setAm(value: js.Array[String]): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setAmVarargs(value: String*): Self = StObject.set(x, "am", js.Array(value*))
    
    inline def setAria(value: Calendar): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setCalendar(value: Clear): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCombo(value: Select): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    inline def setComments(value: ConfirmMessage): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setDataExport(value: Of): Self = StObject.set(x, "dataExport", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatDate(value: String => js.Date): Self = StObject.set(x, "dateFormatDate", js.Any.fromFunction1(value))
    
    inline def setDateFormatStr(value: js.Date => String): Self = StObject.set(x, "dateFormatStr", js.Any.fromFunction1(value))
    
    inline def setDbllist(value: DeselectAll): Self = StObject.set(x, "dbllist", value.asInstanceOf[js.Any])
    
    inline def setDecimalDelimiter(value: String): Self = StObject.set(x, "decimalDelimiter", value.asInstanceOf[js.Any])
    
    inline def setDecimalSize(value: Double): Self = StObject.set(x, "decimalSize", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: js.Array[String]): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeVarargs(value: String*): Self = StObject.set(x, "fileSize", js.Array(value*))
    
    inline def setFilter(value: BeginsWith): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFullDateFormat(value: String): Self = StObject.set(x, "fullDateFormat", value.asInstanceOf[js.Any])
    
    inline def setFullDateFormatDate(value: String => js.Date): Self = StObject.set(x, "fullDateFormatDate", js.Any.fromFunction1(value))
    
    inline def setFullDateFormatStr(value: js.Date => String): Self = StObject.set(x, "fullDateFormatStr", js.Any.fromFunction1(value))
    
    inline def setGroupDelimiter(value: String): Self = StObject.set(x, "groupDelimiter", value.asInstanceOf[js.Any])
    
    inline def setGroupSize(value: Double): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Last): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIntFormat(value: Double => String): Self = StObject.set(x, "intFormat", js.Any.fromFunction1(value))
    
    inline def setKanban(value: Confirm): Self = StObject.set(x, "kanban", value.asInstanceOf[js.Any])
    
    inline def setKanbanUndefined: Self = StObject.set(x, "kanban", js.undefined)
    
    inline def setLocales(value: Any): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormat(value: String): Self = StObject.set(x, "longDateFormat", value.asInstanceOf[js.Any])
    
    inline def setLongDateFormatDate(value: String => js.Date): Self = StObject.set(x, "longDateFormatDate", js.Any.fromFunction1(value))
    
    inline def setLongDateFormatStr(value: js.Date => String): Self = StObject.set(x, "longDateFormatStr", js.Any.fromFunction1(value))
    
    inline def setMessage(value: Cancel): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double => String): Self = StObject.set(x, "numberFormat", js.Any.fromFunction1(value))
    
    inline def setPDFviewer(value: ActualSize): Self = StObject.set(x, "PDFviewer", value.asInstanceOf[js.Any])
    
    inline def setPager(value: First): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setParseFormat(value: String): Self = StObject.set(x, "parseFormat", value.asInstanceOf[js.Any])
    
    inline def setParseFormatDate(value: String => js.Date): Self = StObject.set(x, "parseFormatDate", js.Any.fromFunction1(value))
    
    inline def setParseFormatStr(value: js.Date => String): Self = StObject.set(x, "parseFormatStr", js.Any.fromFunction1(value))
    
    inline def setParseTimeFormat(value: String): Self = StObject.set(x, "parseTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setParseTimeFormatDate(value: String => js.Date): Self = StObject.set(x, "parseTimeFormatDate", js.Any.fromFunction1(value))
    
    inline def setParseTimeFormatStr(value: js.Date => String): Self = StObject.set(x, "parseTimeFormatStr", js.Any.fromFunction1(value))
    
    inline def setPm(value: js.Array[String]): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
    
    inline def setPmVarargs(value: String*): Self = StObject.set(x, "pm", js.Array(value*))
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceFormat(value: Double => String): Self = StObject.set(x, "priceFormat", js.Any.fromFunction1(value))
    
    inline def setPriceSettings(value: DecimalDelimiter): Self = StObject.set(x, "priceSettings", value.asInstanceOf[js.Any])
    
    inline def setRichtext(value: Bold): Self = StObject.set(x, "richtext", value.asInstanceOf[js.Any])
    
    inline def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
    
    inline def setSpreadsheet(value: Formats): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetUndefined: Self = StObject.set(x, "spreadsheet", js.undefined)
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatDate(value: String => js.Date): Self = StObject.set(x, "timeFormatDate", js.Any.fromFunction1(value))
    
    inline def setTimeFormatStr(value: js.Date => String): Self = StObject.set(x, "timeFormatStr", js.Any.fromFunction1(value))
    
    inline def setTimeboard(value: Seconds): Self = StObject.set(x, "timeboard", value.asInstanceOf[js.Any])
  }
}
