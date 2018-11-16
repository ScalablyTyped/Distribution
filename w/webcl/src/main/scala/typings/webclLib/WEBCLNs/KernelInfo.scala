package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KernelInfo extends js.Object

/* cl_kernel_info */
@JSGlobal("WEBCL.KernelInfo")
@js.native
object KernelInfo extends js.Object {
  //KERNEL_REFERENCE_COUNT                    = 0x1192, // disallowed
  @js.native
  sealed trait KERNEL_CONTEXT
    extends webclLib.WEBCLNs.KernelInfo
  
  @js.native
  sealed trait KERNEL_FUNCTION_NAME
    extends webclLib.WEBCLNs.KernelInfo
  
  @js.native
  sealed trait KERNEL_NUM_RGS
    extends webclLib.WEBCLNs.KernelInfo
  
  @js.native
  sealed trait KERNEL_PROGRAM
    extends webclLib.WEBCLNs.KernelInfo
  
  /* 0x1193 */ val KERNEL_CONTEXT: KERNEL_CONTEXT with scala.Double = js.native
  /* 0x1190 */ val KERNEL_FUNCTION_NAME: KERNEL_FUNCTION_NAME with scala.Double = js.native
  /* 0x1191 */ val KERNEL_NUM_RGS: KERNEL_NUM_RGS with scala.Double = js.native
  /* 0x1194 */ val KERNEL_PROGRAM: KERNEL_PROGRAM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.KernelInfo with scala.Double] = js.native
}

