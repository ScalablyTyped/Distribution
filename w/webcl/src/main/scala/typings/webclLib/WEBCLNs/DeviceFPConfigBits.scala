package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceFPConfigBits extends js.Object

/* cl_device_fp_config - bitfield */
@JSGlobal("WEBCL.DeviceFPConfigBits")
@js.native
object DeviceFPConfigBits extends js.Object {
  @js.native
  sealed trait FP_DENORM
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_FMA
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_INF_NAN
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_ROUND_TO_INF
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_ROUND_TO_NEAREST
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_ROUND_TO_ZERO
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  @js.native
  sealed trait FP_SOFT_FLOAT
    extends webclLib.WEBCLNs.DeviceFPConfigBits
  
  /* 0x1 */ val FP_DENORM: FP_DENORM with scala.Double = js.native
  /* 0x20 */ val FP_FMA: FP_FMA with scala.Double = js.native
  /* 0x2 */ val FP_INF_NAN: FP_INF_NAN with scala.Double = js.native
  /* 0x10 */ val FP_ROUND_TO_INF: FP_ROUND_TO_INF with scala.Double = js.native
  /* 0x4 */ val FP_ROUND_TO_NEAREST: FP_ROUND_TO_NEAREST with scala.Double = js.native
  /* 0x8 */ val FP_ROUND_TO_ZERO: FP_ROUND_TO_ZERO with scala.Double = js.native
  /* 0x40 */ val FP_SOFT_FLOAT: FP_SOFT_FLOAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.DeviceFPConfigBits with scala.Double] = js.native
}

