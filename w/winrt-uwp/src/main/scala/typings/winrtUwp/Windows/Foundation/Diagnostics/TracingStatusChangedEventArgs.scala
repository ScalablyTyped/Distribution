package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TracingStatusChanged event. */
@js.native
trait TracingStatusChangedEventArgs extends StObject {
  
  /** Gets a value that indicates whether tracing is active. */
  var enabled: Boolean = js.native
  
  /** Gets the trace level for the current tracing session. */
  var traceLevel: CausalityTraceLevel = js.native
}
object TracingStatusChangedEventArgs {
  
  @scala.inline
  def apply(enabled: Boolean, traceLevel: CausalityTraceLevel): TracingStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], traceLevel = traceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingStatusChangedEventArgs]
  }
  
  @scala.inline
  implicit class TracingStatusChangedEventArgsMutableBuilder[Self <: TracingStatusChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceLevel(value: CausalityTraceLevel): Self = StObject.set(x, "traceLevel", value.asInstanceOf[js.Any])
  }
}
