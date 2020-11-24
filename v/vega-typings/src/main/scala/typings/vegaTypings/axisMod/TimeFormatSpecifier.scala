package typings.vegaTypings.axisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeFormatSpecifier extends js.Object {
  
  var date: js.UndefOr[String] = js.native
  
  var day: js.UndefOr[String] = js.native
  
  var hours: js.UndefOr[String] = js.native
  
  var milliseconds: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var quarter: js.UndefOr[String] = js.native
  
  var seconds: js.UndefOr[String] = js.native
  
  var week: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object TimeFormatSpecifier {
  
  @scala.inline
  def apply(): TimeFormatSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeFormatSpecifier]
  }
  
  @scala.inline
  implicit class TimeFormatSpecifierOps[Self <: TimeFormatSpecifier] (val x: Self) extends AnyVal {
    
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMilliseconds(value: String): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setQuarter(value: String): Self = this.set("quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarter: Self = this.set("quarter", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
