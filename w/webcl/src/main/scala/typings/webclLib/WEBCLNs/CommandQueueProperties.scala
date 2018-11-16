package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandQueueProperties extends js.Object

/* cl_command_queue_properties - bitfield */
@JSGlobal("WEBCL.CommandQueueProperties")
@js.native
object CommandQueueProperties extends js.Object {
  @js.native
  sealed trait QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE
    extends webclLib.WEBCLNs.CommandQueueProperties
  
  @js.native
  sealed trait QUEUE_PROFILING_ENABLE
    extends webclLib.WEBCLNs.CommandQueueProperties
  
  /* 0x1 */ val QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE: QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE with scala.Double = js.native
  /* 0x2 */ val QUEUE_PROFILING_ENABLE: QUEUE_PROFILING_ENABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.CommandQueueProperties with scala.Double] = js.native
}

