package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProfilingInfo extends js.Object

/* cl_profiling_info  */
@JSGlobal("WEBCL.ProfilingInfo")
@js.native
object ProfilingInfo extends js.Object {
  @js.native
  sealed trait PROFILING_COMMAND_END
    extends webclLib.WEBCLNs.ProfilingInfo
  
  @js.native
  sealed trait PROFILING_COMMAND_QUEUED
    extends webclLib.WEBCLNs.ProfilingInfo
  
  @js.native
  sealed trait PROFILING_COMMAND_START
    extends webclLib.WEBCLNs.ProfilingInfo
  
  @js.native
  sealed trait PROFILING_COMMAND_SUBMIT
    extends webclLib.WEBCLNs.ProfilingInfo
  
  /* 0x1283 */ val PROFILING_COMMAND_END: PROFILING_COMMAND_END with scala.Double = js.native
  /* 0x1280 */ val PROFILING_COMMAND_QUEUED: PROFILING_COMMAND_QUEUED with scala.Double = js.native
  /* 0x1282 */ val PROFILING_COMMAND_START: PROFILING_COMMAND_START with scala.Double = js.native
  /* 0x1281 */ val PROFILING_COMMAND_SUBMIT: PROFILING_COMMAND_SUBMIT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ProfilingInfo with scala.Double] = js.native
}

