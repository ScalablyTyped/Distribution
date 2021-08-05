package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTracing
  extends StObject
     with NotificationTracingSetParameters {
  
  /**
    * Trace until the specified end date.
    */
  var endDate: Date
  
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double
  
  /**
    * The date and time tracing started.
    */
  var startDate: Date
  
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double
}
object NotificationTracing {
  
  inline def apply(enabled: Boolean, endDate: Date, maxTracedEntries: Double, startDate: Date, tracedEntries: Double): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], maxTracedEntries = maxTracedEntries.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], tracedEntries = tracedEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracing]
  }
  
  extension [Self <: NotificationTracing](x: Self) {
    
    inline def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setMaxTracedEntries(value: Double): Self = StObject.set(x, "maxTracedEntries", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTracedEntries(value: Double): Self = StObject.set(x, "tracedEntries", value.asInstanceOf[js.Any])
  }
}
