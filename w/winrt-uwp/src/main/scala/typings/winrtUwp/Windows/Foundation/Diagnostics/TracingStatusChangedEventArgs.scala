package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TracingStatusChanged event. */
trait TracingStatusChangedEventArgs extends StObject {
  
  /** Gets a value that indicates whether tracing is active. */
  var enabled: Boolean
  
  /** Gets the trace level for the current tracing session. */
  var traceLevel: CausalityTraceLevel
}
object TracingStatusChangedEventArgs {
  
  inline def apply(enabled: Boolean, traceLevel: CausalityTraceLevel): TracingStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], traceLevel = traceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingStatusChangedEventArgs]
  }
  
  extension [Self <: TracingStatusChangedEventArgs](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setTraceLevel(value: CausalityTraceLevel): Self = StObject.set(x, "traceLevel", value.asInstanceOf[js.Any])
  }
}
