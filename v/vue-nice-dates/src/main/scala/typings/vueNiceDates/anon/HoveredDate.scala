package typings.vueNiceDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoveredDate extends js.Object {
  
  var hoveredDate: typings.std.Date | Null = js.native
  
  var receivedEndDate: String | typings.std.Date | Null = js.native
  
  var receivedStartDate: String | typings.std.Date | Null = js.native
}
object HoveredDate {
  
  @scala.inline
  def apply(): HoveredDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoveredDate]
  }
  
  @scala.inline
  implicit class HoveredDateOps[Self <: HoveredDate] (val x: Self) extends AnyVal {
    
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
    def setHoveredDate(value: typings.std.Date): Self = this.set("hoveredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredDateNull: Self = this.set("hoveredDate", null)
    
    @scala.inline
    def setReceivedEndDate(value: String | typings.std.Date): Self = this.set("receivedEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedEndDateNull: Self = this.set("receivedEndDate", null)
    
    @scala.inline
    def setReceivedStartDate(value: String | typings.std.Date): Self = this.set("receivedStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedStartDateNull: Self = this.set("receivedStartDate", null)
  }
}
