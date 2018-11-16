package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MemInfo extends js.Object

/* cl_meinfo */
@JSGlobal("WEBCL.MemInfo")
@js.native
object MemInfo extends js.Object {
  @js.native
  sealed trait MEM_ASSOCIATED_MEMOBJECT
    extends webclLib.WEBCLNs.MemInfo
  
  //MEM_HOST_PTR                              = 0x1103, // disallowed
  //MEM_MAP_COUNT                             = 0x1104, // disallowed
  //MEM_REFERENCE_COUNT                       = 0x1105, // disallowed
  @js.native
  sealed trait MEM_CONTEXT
    extends webclLib.WEBCLNs.MemInfo
  
  @js.native
  sealed trait MEM_FLAGS
    extends webclLib.WEBCLNs.MemInfo
  
  @js.native
  sealed trait MEM_OFFSET
    extends webclLib.WEBCLNs.MemInfo
  
  @js.native
  sealed trait MEM_SIZE
    extends webclLib.WEBCLNs.MemInfo
  
  @js.native
  sealed trait MEM_TYPE
    extends webclLib.WEBCLNs.MemInfo
  
  /* 0x1107 */ val MEM_ASSOCIATED_MEMOBJECT: MEM_ASSOCIATED_MEMOBJECT with scala.Double = js.native
  /* 0x1106 */ val MEM_CONTEXT: MEM_CONTEXT with scala.Double = js.native
  /* 0x1101 */ val MEM_FLAGS: MEM_FLAGS with scala.Double = js.native
  /* 0x1108 */ val MEM_OFFSET: MEM_OFFSET with scala.Double = js.native
  /* 0x1102 */ val MEM_SIZE: MEM_SIZE with scala.Double = js.native
  /* 0x1100 */ val MEM_TYPE: MEM_TYPE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.MemInfo with scala.Double] = js.native
}

