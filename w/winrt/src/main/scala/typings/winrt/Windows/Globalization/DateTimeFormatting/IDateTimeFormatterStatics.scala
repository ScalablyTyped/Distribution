package typings.winrt.Windows.Globalization.DateTimeFormatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateTimeFormatterStatics extends StObject {
  
  var longDate: DateTimeFormatter = js.native
  
  var longTime: DateTimeFormatter = js.native
  
  var shortDate: DateTimeFormatter = js.native
  
  var shortTime: DateTimeFormatter = js.native
}
object IDateTimeFormatterStatics {
  
  @scala.inline
  def apply(
    longDate: DateTimeFormatter,
    longTime: DateTimeFormatter,
    shortDate: DateTimeFormatter,
    shortTime: DateTimeFormatter
  ): IDateTimeFormatterStatics = {
    val __obj = js.Dynamic.literal(longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
  
  @scala.inline
  implicit class IDateTimeFormatterStaticsMutableBuilder[Self <: IDateTimeFormatterStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLongDate(value: DateTimeFormatter): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTime(value: DateTimeFormatter): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDate(value: DateTimeFormatter): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTime(value: DateTimeFormatter): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
  }
}
