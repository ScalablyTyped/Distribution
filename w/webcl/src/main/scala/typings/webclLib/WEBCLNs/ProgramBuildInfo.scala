package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProgramBuildInfo extends js.Object

/* cl_program_build_info */
@JSGlobal("WEBCL.ProgramBuildInfo")
@js.native
object ProgramBuildInfo extends js.Object {
  @js.native
  sealed trait PROGRAM_BUILD_LOG
    extends webclLib.WEBCLNs.ProgramBuildInfo
  
  @js.native
  sealed trait PROGRAM_BUILD_OPTIONS
    extends webclLib.WEBCLNs.ProgramBuildInfo
  
  @js.native
  sealed trait PROGRAM_BUILD_STATUS
    extends webclLib.WEBCLNs.ProgramBuildInfo
  
  /* 0x1183 */ val PROGRAM_BUILD_LOG: PROGRAM_BUILD_LOG with scala.Double = js.native
  /* 0x1182 */ val PROGRAM_BUILD_OPTIONS: PROGRAM_BUILD_OPTIONS with scala.Double = js.native
  /* 0x1181 */ val PROGRAM_BUILD_STATUS: PROGRAM_BUILD_STATUS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ProgramBuildInfo with scala.Double] = js.native
}

