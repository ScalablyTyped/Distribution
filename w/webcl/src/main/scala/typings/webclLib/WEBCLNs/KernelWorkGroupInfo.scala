package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KernelWorkGroupInfo extends js.Object

/* cl_kernel_work_group_info */
@JSGlobal("WEBCL.KernelWorkGroupInfo")
@js.native
object KernelWorkGroupInfo extends js.Object {
  @js.native
  sealed trait KERNEL_COMPILE_WORK_GROUP_SIZE
    extends webclLib.WEBCLNs.KernelWorkGroupInfo
  
  @js.native
  sealed trait KERNEL_LOCAL_MEM_SIZE
    extends webclLib.WEBCLNs.KernelWorkGroupInfo
  
  @js.native
  sealed trait KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE
    extends webclLib.WEBCLNs.KernelWorkGroupInfo
  
  @js.native
  sealed trait KERNEL_PRIVATE_MEM_SIZE
    extends webclLib.WEBCLNs.KernelWorkGroupInfo
  
  @js.native
  sealed trait KERNEL_WORK_GROUP_SIZE
    extends webclLib.WEBCLNs.KernelWorkGroupInfo
  
  /* 0x11B1 */ val KERNEL_COMPILE_WORK_GROUP_SIZE: KERNEL_COMPILE_WORK_GROUP_SIZE with scala.Double = js.native
  /* 0x11B2 */ val KERNEL_LOCAL_MEM_SIZE: KERNEL_LOCAL_MEM_SIZE with scala.Double = js.native
  /* 0x11B3 */ val KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE: KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE with scala.Double = js.native
  /* 0x11B4 */ val KERNEL_PRIVATE_MEM_SIZE: KERNEL_PRIVATE_MEM_SIZE with scala.Double = js.native
  /* 0x11B0 */ val KERNEL_WORK_GROUP_SIZE: KERNEL_WORK_GROUP_SIZE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.KernelWorkGroupInfo with scala.Double] = js.native
}

