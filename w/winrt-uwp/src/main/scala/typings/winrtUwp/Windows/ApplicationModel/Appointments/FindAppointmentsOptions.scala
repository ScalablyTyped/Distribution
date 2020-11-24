package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of options that modifies a query for appointments. */
@js.native
trait FindAppointmentsOptions extends js.Object {
  
  var calendarIds: js.Any = js.native
  
   /* unmapped type */ var fetchProperties: js.Any = js.native
  
   /* unmapped type */ var includeHidden: js.Any = js.native
  
   /* unmapped type */ var maxCount: js.Any = js.native
}
object FindAppointmentsOptions {
  
  @scala.inline
  def apply(calendarIds: js.Any, fetchProperties: js.Any, includeHidden: js.Any, maxCount: js.Any): FindAppointmentsOptions = {
    val __obj = js.Dynamic.literal(calendarIds = calendarIds.asInstanceOf[js.Any], fetchProperties = fetchProperties.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAppointmentsOptions]
  }
  
  @scala.inline
  implicit class FindAppointmentsOptionsOps[Self <: FindAppointmentsOptions] (val x: Self) extends AnyVal {
    
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
    def setCalendarIds(value: js.Any): Self = this.set("calendarIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchProperties(value: js.Any): Self = this.set("fetchProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHidden(value: js.Any): Self = this.set("includeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: js.Any): Self = this.set("maxCount", value.asInstanceOf[js.Any])
  }
}
