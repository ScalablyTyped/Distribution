package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceLocalMemType extends js.Object

/* cl_device_local_mem_type */
@JSGlobal("WEBCL.DeviceLocalMemType")
@js.native
object DeviceLocalMemType extends js.Object {
  @js.native
  sealed trait GLOBAL
    extends webclLib.WEBCLNs.DeviceLocalMemType
  
  @js.native
  sealed trait LOCAL
    extends webclLib.WEBCLNs.DeviceLocalMemType
  
  /* 0x2 */ val GLOBAL: GLOBAL with scala.Double = js.native
  /* 0x1 */ val LOCAL: LOCAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceLocalMemType with scala.Double] = js.native
}

