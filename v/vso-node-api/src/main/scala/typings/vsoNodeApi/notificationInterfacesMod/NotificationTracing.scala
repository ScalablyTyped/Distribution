package typings.vsoNodeApi.notificationInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationTracing extends NotificationTracingSetParameters {
  
  /**
    * Trace until the specified end date.
    */
  var endDate: Date = js.native
  
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double = js.native
  
  /**
    * The date and time tracing started.
    */
  var startDate: Date = js.native
  
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double = js.native
}
object NotificationTracing {
  
  @scala.inline
  def apply(enabled: Boolean, endDate: Date, maxTracedEntries: Double, startDate: Date, tracedEntries: Double): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], maxTracedEntries = maxTracedEntries.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], tracedEntries = tracedEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationTracing]
  }
  
  @scala.inline
  implicit class NotificationTracingMutableBuilder[Self <: NotificationTracing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTracedEntries(value: Double): Self = StObject.set(x, "maxTracedEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracedEntries(value: Double): Self = StObject.set(x, "tracedEntries", value.asInstanceOf[js.Any])
  }
}
