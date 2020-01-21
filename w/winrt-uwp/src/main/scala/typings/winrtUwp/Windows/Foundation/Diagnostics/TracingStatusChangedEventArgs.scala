package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TracingStatusChanged event. */
@JSGlobal("Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs")
@js.native
abstract class TracingStatusChangedEventArgs () extends js.Object {
  /** Gets a value that indicates whether tracing is active. */
  var enabled: Boolean = js.native
  /** Gets the trace level for the current tracing session. */
  var traceLevel: CausalityTraceLevel = js.native
}

