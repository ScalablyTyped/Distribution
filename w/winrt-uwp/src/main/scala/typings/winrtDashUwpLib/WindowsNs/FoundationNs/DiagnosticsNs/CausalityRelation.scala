package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CausalityRelation extends js.Object

/** Tracks ways that synchronous work items may interact with asynchronous operations. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalityRelation")
@js.native
object CausalityRelation extends js.Object {
  /** Indicates that a synchronous work items has assigned a callback or continuation to be run by an asynchronous operation. */
  @js.native
  sealed trait assignDelegate
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  
  /** Indicates that a synchronous work item was canceled. */
  @js.native
  sealed trait cancel
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied a choice asynchronous operation. */
  @js.native
  sealed trait choice
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  
  /** Indicates that a synchronous work item caused an error in an asynchronous operation. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  
  /** Indicates that a synchronous work item has satisfied part of a join asynchronous operation. */
  @js.native
  sealed trait join
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation
  
  val assignDelegate: assignDelegate with java.lang.String = js.native
  val cancel: cancel with java.lang.String = js.native
  val choice: choice with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val join: join with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalityRelation with java.lang.String
  ] = js.native
}

