package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<xstate.xstate/lib/scheduler.SchedulerOptions> */
trait PartialSchedulerOptions extends StObject {
  
  var deferEvents: js.UndefOr[Boolean] = js.undefined
}
object PartialSchedulerOptions {
  
  inline def apply(): PartialSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSchedulerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSchedulerOptions] (val x: Self) extends AnyVal {
    
    inline def setDeferEvents(value: Boolean): Self = StObject.set(x, "deferEvents", value.asInstanceOf[js.Any])
    
    inline def setDeferEventsUndefined: Self = StObject.set(x, "deferEvents", js.undefined)
  }
}
