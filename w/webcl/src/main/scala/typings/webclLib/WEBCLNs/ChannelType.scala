package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChannelType extends js.Object

/* cl_channel_type */
@JSGlobal("WEBCL.ChannelType")
@js.native
object ChannelType extends js.Object {
  @js.native
  sealed trait FLOAT
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait HALF_FLOAT
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait SIGNED_INT16
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait SIGNED_INT32
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait SIGNED_INT8
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait SNORM_INT16
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait SNORM_INT8
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNORM_INT16
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNORM_INT8
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNORM_INT_101010
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNORM_SHORT_555
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNORM_SHORT_565
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNSIGNED_INT16
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNSIGNED_INT32
    extends webclLib.WEBCLNs.ChannelType
  
  @js.native
  sealed trait UNSIGNED_INT8
    extends webclLib.WEBCLNs.ChannelType
  
  /* 0x10DE */ val FLOAT: FLOAT with scala.Double = js.native
  /* 0x10DD */ val HALF_FLOAT: HALF_FLOAT with scala.Double = js.native
  /* 0x10D8 */ val SIGNED_INT16: SIGNED_INT16 with scala.Double = js.native
  /* 0x10D9 */ val SIGNED_INT32: SIGNED_INT32 with scala.Double = js.native
  /* 0x10D7 */ val SIGNED_INT8: SIGNED_INT8 with scala.Double = js.native
  /* 0x10D1 */ val SNORM_INT16: SNORM_INT16 with scala.Double = js.native
  /* 0x10D0 */ val SNORM_INT8: SNORM_INT8 with scala.Double = js.native
  /* 0x10D3 */ val UNORM_INT16: UNORM_INT16 with scala.Double = js.native
  /* 0x10D2 */ val UNORM_INT8: UNORM_INT8 with scala.Double = js.native
  /* 0x10D6 */ val UNORM_INT_101010: UNORM_INT_101010 with scala.Double = js.native
  /* 0x10D5 */ val UNORM_SHORT_555: UNORM_SHORT_555 with scala.Double = js.native
  /* 0x10D4 */ val UNORM_SHORT_565: UNORM_SHORT_565 with scala.Double = js.native
  /* 0x10DB */ val UNSIGNED_INT16: UNSIGNED_INT16 with scala.Double = js.native
  /* 0x10DC */ val UNSIGNED_INT32: UNSIGNED_INT32 with scala.Double = js.native
  /* 0x10DA */ val UNSIGNED_INT8: UNSIGNED_INT8 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ChannelType with scala.Double] = js.native
}

