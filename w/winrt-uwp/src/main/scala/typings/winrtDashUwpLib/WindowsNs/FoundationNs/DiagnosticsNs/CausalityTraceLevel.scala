package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CausalityTraceLevel extends js.Object

/** Specifies a logging level that listeners can use for trace filtering. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityTraceLevel")
@js.native
object CausalityTraceLevel extends js.Object {
  /** Tracks operations that are not necessary to construct a causality chain but are interesting for developers. */
  @js.native
  sealed trait important
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel
  
  /** Indicates all operations that are necessary to construct a causality chain, including all operations for job creation and completion and work item creation and completion. */
  @js.native
  sealed trait required
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel
  
  /** Indicates operations that influence causality but are likely to be less interesting for developers, including actions like registering progress delegates. */
  @js.native
  sealed trait verbose
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel
  
  /* 1 */ val important: important with scala.Double = js.native
  /* 0 */ val required: required with scala.Double = js.native
  /* 2 */ val verbose: verbose with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityTraceLevel with scala.Double
  ] = js.native
}

