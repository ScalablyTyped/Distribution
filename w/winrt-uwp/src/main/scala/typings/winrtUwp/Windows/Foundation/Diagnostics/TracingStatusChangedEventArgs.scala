package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TracingStatusChanged event. */
trait TracingStatusChangedEventArgs extends js.Object {
  /** Gets a value that indicates whether tracing is active. */
  var enabled: Boolean
  /** Gets the trace level for the current tracing session. */
  var traceLevel: CausalityTraceLevel
}

object TracingStatusChangedEventArgs {
  @scala.inline
  def apply(enabled: Boolean, traceLevel: CausalityTraceLevel): TracingStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], traceLevel = traceLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingStatusChangedEventArgs]
  }
}

