package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateTimeFormatterStatics extends StObject {
  
  var longDate: DateTimeFormatter
  
  var longTime: DateTimeFormatter
  
  var shortDate: DateTimeFormatter
  
  var shortTime: DateTimeFormatter
}
object IDateTimeFormatterStatics {
  
  inline def apply(
    longDate: DateTimeFormatter,
    longTime: DateTimeFormatter,
    shortDate: DateTimeFormatter,
    shortTime: DateTimeFormatter
  ): IDateTimeFormatterStatics = {
    val __obj = js.Dynamic.literal(longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
  
  extension [Self <: IDateTimeFormatterStatics](x: Self) {
    
    inline def setLongDate(value: DateTimeFormatter): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
    
    inline def setLongTime(value: DateTimeFormatter): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
    
    inline def setShortDate(value: DateTimeFormatter): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
    
    inline def setShortTime(value: DateTimeFormatter): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
  }
}
