package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of options that modifies a query for appointments. */
trait FindAppointmentsOptions extends StObject {
  
  var calendarIds: js.Any
  
  /* unmapped type */
  var fetchProperties: js.Any
  
  /* unmapped type */
  var includeHidden: js.Any
  
  /* unmapped type */
  var maxCount: js.Any
}
object FindAppointmentsOptions {
  
  @scala.inline
  def apply(calendarIds: js.Any, fetchProperties: js.Any, includeHidden: js.Any, maxCount: js.Any): FindAppointmentsOptions = {
    val __obj = js.Dynamic.literal(calendarIds = calendarIds.asInstanceOf[js.Any], fetchProperties = fetchProperties.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAppointmentsOptions]
  }
  
  @scala.inline
  implicit class FindAppointmentsOptionsMutableBuilder[Self <: FindAppointmentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarIds(value: js.Any): Self = StObject.set(x, "calendarIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchProperties(value: js.Any): Self = StObject.set(x, "fetchProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHidden(value: js.Any): Self = StObject.set(x, "includeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCount(value: js.Any): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
  }
}
