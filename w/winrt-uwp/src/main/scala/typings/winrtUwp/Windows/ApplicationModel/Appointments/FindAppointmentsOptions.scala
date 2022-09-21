package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of options that modifies a query for appointments. */
trait FindAppointmentsOptions extends StObject {
  
  var calendarIds: Any
  
  /* unmapped type */
  var fetchProperties: Any
  
  /* unmapped type */
  var includeHidden: Any
  
  /* unmapped type */
  var maxCount: Any
}
object FindAppointmentsOptions {
  
  inline def apply(calendarIds: Any, fetchProperties: Any, includeHidden: Any, maxCount: Any): FindAppointmentsOptions = {
    val __obj = js.Dynamic.literal(calendarIds = calendarIds.asInstanceOf[js.Any], fetchProperties = fetchProperties.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAppointmentsOptions]
  }
  
  extension [Self <: FindAppointmentsOptions](x: Self) {
    
    inline def setCalendarIds(value: Any): Self = StObject.set(x, "calendarIds", value.asInstanceOf[js.Any])
    
    inline def setFetchProperties(value: Any): Self = StObject.set(x, "fetchProperties", value.asInstanceOf[js.Any])
    
    inline def setIncludeHidden(value: Any): Self = StObject.set(x, "includeHidden", value.asInstanceOf[js.Any])
    
    inline def setMaxCount(value: Any): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
  }
}
