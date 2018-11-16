package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceExecCapabilitiesBits extends js.Object

/* cl_device_exec_capabilities - bitfield */
@JSGlobal("WEBCL.DeviceExecCapabilitiesBits")
@js.native
object DeviceExecCapabilitiesBits extends js.Object {
  @js.native
  sealed trait EXEC_KERNEL
    extends webclLib.WEBCLNs.DeviceExecCapabilitiesBits
  
  /* 0x1 */ val EXEC_KERNEL: EXEC_KERNEL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceExecCapabilitiesBits with scala.Double] = js.native
}

