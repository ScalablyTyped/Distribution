package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandExecutionStatus extends js.Object

/* command execution status */
@JSGlobal("WEBCL.CommandExecutionStatus")
@js.native
object CommandExecutionStatus extends js.Object {
  @js.native
  sealed trait COMPLETE
    extends webclLib.WEBCLNs.CommandExecutionStatus
  
  @js.native
  sealed trait QUEUED
    extends webclLib.WEBCLNs.CommandExecutionStatus
  
  @js.native
  sealed trait RUNNING
    extends webclLib.WEBCLNs.CommandExecutionStatus
  
  @js.native
  sealed trait SUBMITTED
    extends webclLib.WEBCLNs.CommandExecutionStatus
  
  /* 0x0 */ val COMPLETE: COMPLETE with scala.Double = js.native
  /* 0x3 */ val QUEUED: QUEUED with scala.Double = js.native
  /* 0x1 */ val RUNNING: RUNNING with scala.Double = js.native
  /* 0x2 */ val SUBMITTED: SUBMITTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.CommandExecutionStatus with scala.Double] = js.native
}

