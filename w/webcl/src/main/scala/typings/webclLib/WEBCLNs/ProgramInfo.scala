package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProgramInfo extends js.Object

/* cl_map_flags - bitfield */
//MAP_READ                                  = 0x1, // disallowed
//MAP_WRITE                                 = 0x2, // disallowed
/* cl_prograinfo */
@JSGlobal("WEBCL.ProgramInfo")
@js.native
object ProgramInfo extends js.Object {
  //PROGRAM_REFERENCE_COUNT                   = 0x1160, // disallowed
  @js.native
  sealed trait PROGRAM_CONTEXT
    extends webclLib.WEBCLNs.ProgramInfo
  
  @js.native
  sealed trait PROGRAM_DEVICES
    extends webclLib.WEBCLNs.ProgramInfo
  
  @js.native
  sealed trait PROGRAM_NUM_DEVICES
    extends webclLib.WEBCLNs.ProgramInfo
  
  @js.native
  sealed trait PROGRAM_SOURCE
    extends webclLib.WEBCLNs.ProgramInfo
  
  /* 0x1161 */ val PROGRAM_CONTEXT: PROGRAM_CONTEXT with scala.Double = js.native
  /* 0x1163 */ val PROGRAM_DEVICES: PROGRAM_DEVICES with scala.Double = js.native
  /* 0x1162 */ val PROGRAM_NUM_DEVICES: PROGRAM_NUM_DEVICES with scala.Double = js.native
  /* 0x1164 */ val PROGRAM_SOURCE: PROGRAM_SOURCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ProgramInfo with scala.Double] = js.native
}

