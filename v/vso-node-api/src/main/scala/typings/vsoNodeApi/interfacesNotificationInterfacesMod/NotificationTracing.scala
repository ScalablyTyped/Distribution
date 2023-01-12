package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTracing
  extends StObject
     with NotificationTracingSetParameters {
  
  /**
    * Trace until the specified end date.
    */
  var endDate: js.Date
  
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double
  
  /**
    * The date and time tracing started.
    */
  var startDate: js.Date
  
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double
}
object NotificationTracing {
  
  inline def apply(
    enabled: Boolean,
    endDate: js.Date,
    maxTracedEntries: Double,
    startDate: js.Date,
    tracedEntries: Double
  ): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], maxTracedEntries = maxTracedEntries.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], tracedEntries = tracedEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationTracing] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setMaxTracedEntries(value: Double): Self = StObject.set(x, "maxTracedEntries", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTracedEntries(value: Double): Self = StObject.set(x, "tracedEntries", value.asInstanceOf[js.Any])
  }
}
