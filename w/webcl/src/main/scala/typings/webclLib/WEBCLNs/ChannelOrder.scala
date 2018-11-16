package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChannelOrder extends js.Object

/* cl_channel_order */
@JSGlobal("WEBCL.ChannelOrder")
@js.native
object ChannelOrder extends js.Object {
  @js.native
  sealed trait A
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait ARGB
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait BGRA
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait INTENSITY
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait LUMINANCE
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait R
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RA
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RG
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RGB
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RGBA
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RGBx
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait RGx
    extends webclLib.WEBCLNs.ChannelOrder
  
  @js.native
  sealed trait Rx
    extends webclLib.WEBCLNs.ChannelOrder
  
  /* 0x10B1 */ val A: A with scala.Double = js.native
  /* 0x10B7 */ val ARGB: ARGB with scala.Double = js.native
  /* 0x10B6 */ val BGRA: BGRA with scala.Double = js.native
  /* 0x10B8 */ val INTENSITY: INTENSITY with scala.Double = js.native
  /* 0x10B9 */ val LUMINANCE: LUMINANCE with scala.Double = js.native
  /* 0x10B0 */ val R: R with scala.Double = js.native
  /* 0x10B3 */ val RA: RA with scala.Double = js.native
  /* 0x10B2 */ val RG: RG with scala.Double = js.native
  /* 0x10B4 */ val RGB: RGB with scala.Double = js.native
  /* 0x10B5 */ val RGBA: RGBA with scala.Double = js.native
  /* 0x10BC */ val RGBx: RGBx with scala.Double = js.native
  /* 0x10BB */ val RGx: RGx with scala.Double = js.native
  /* 0x10BA */ val Rx: Rx with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ChannelOrder with scala.Double] = js.native
}

