package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceTypeBits extends js.Object

/* cl_device_type - bitfield */
@JSGlobal("WEBCL.DeviceTypeBits")
@js.native
object DeviceTypeBits extends js.Object {
  @js.native
  sealed trait DEVICE_TYPE_ACCELERATOR
    extends webclLib.WEBCLNs.DeviceTypeBits
  
  @js.native
  sealed trait DEVICE_TYPE_ALL
    extends webclLib.WEBCLNs.DeviceTypeBits
  
  @js.native
  sealed trait DEVICE_TYPE_CPU
    extends webclLib.WEBCLNs.DeviceTypeBits
  
  @js.native
  sealed trait DEVICE_TYPE_DEFAULT
    extends webclLib.WEBCLNs.DeviceTypeBits
  
  @js.native
  sealed trait DEVICE_TYPE_GPU
    extends webclLib.WEBCLNs.DeviceTypeBits
  
  /* 0x8 */ val DEVICE_TYPE_ACCELERATOR: DEVICE_TYPE_ACCELERATOR with scala.Double = js.native
  /* 0xFFFFFFFF */ val DEVICE_TYPE_ALL: DEVICE_TYPE_ALL with scala.Double = js.native
  /* 0x2 */ val DEVICE_TYPE_CPU: DEVICE_TYPE_CPU with scala.Double = js.native
  /* 0x1 */ val DEVICE_TYPE_DEFAULT: DEVICE_TYPE_DEFAULT with scala.Double = js.native
  /* 0x4 */ val DEVICE_TYPE_GPU: DEVICE_TYPE_GPU with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceTypeBits with scala.Double] = js.native
}

