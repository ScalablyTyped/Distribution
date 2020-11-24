package typings.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateTimeFormatterStatics extends js.Object {
  
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
  implicit class IDateTimeFormatterStaticsOps[Self <: IDateTimeFormatterStatics] (val x: Self) extends AnyVal {
    
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
    def setLongDate(value: DateTimeFormatter): Self = this.set("longDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTime(value: DateTimeFormatter): Self = this.set("longTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDate(value: DateTimeFormatter): Self = this.set("shortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTime(value: DateTimeFormatter): Self = this.set("shortTime", value.asInstanceOf[js.Any])
  }
}
