package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x11B0`
import typings.webcl.webclNumbers.`0x11B1`
import typings.webcl.webclNumbers.`0x11B2`
import typings.webcl.webclNumbers.`0x11B3`
import typings.webcl.webclNumbers.`0x11B4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_kernel_work_group_info */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x11B0`
  - typings.webcl.webclNumbers.`0x11B1`
  - typings.webcl.webclNumbers.`0x11B2`
  - typings.webcl.webclNumbers.`0x11B3`
  - typings.webcl.webclNumbers.`0x11B4`
*/
trait KernelWorkGroupInfo extends js.Object

object KernelWorkGroupInfo {
  @scala.inline
  def KERNEL_COMPILE_WORK_GROUP_SIZE: `0x11B1` = this.cast(0x11B1)
  @scala.inline
  def KERNEL_LOCAL_MEM_SIZE: `0x11B2` = this.cast(0x11B2)
  @scala.inline
  def KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE: `0x11B3` = this.cast(0x11B3)
  @scala.inline
  def KERNEL_PRIVATE_MEM_SIZE: `0x11B4` = this.cast(0x11B4)
  @scala.inline
  def KERNEL_WORK_GROUP_SIZE: `0x11B0` = this.cast(0x11B0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

