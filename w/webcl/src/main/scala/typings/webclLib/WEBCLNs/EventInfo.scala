package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventInfo extends js.Object

/* cl_event_info  */
@JSGlobal("WEBCL.EventInfo")
@js.native
object EventInfo extends js.Object {
  //EVENT_REFERENCE_COUNT                     = 0x11D2, // disallowed
  @js.native
  sealed trait EVENT_COMMAND_EXECUTION_STATUS
    extends webclLib.WEBCLNs.EventInfo
  
  @js.native
  sealed trait EVENT_COMMAND_QUEUE
    extends webclLib.WEBCLNs.EventInfo
  
  @js.native
  sealed trait EVENT_COMMAND_TYPE
    extends webclLib.WEBCLNs.EventInfo
  
  @js.native
  sealed trait EVENT_CONTEXT
    extends webclLib.WEBCLNs.EventInfo
  
  /* 0x11D3 */ val EVENT_COMMAND_EXECUTION_STATUS: EVENT_COMMAND_EXECUTION_STATUS with scala.Double = js.native
  /* 0x11D0 */ val EVENT_COMMAND_QUEUE: EVENT_COMMAND_QUEUE with scala.Double = js.native
  /* 0x11D1 */ val EVENT_COMMAND_TYPE: EVENT_COMMAND_TYPE with scala.Double = js.native
  /* 0x11D4 */ val EVENT_CONTEXT: EVENT_CONTEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.EventInfo with scala.Double] = js.native
}

