package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MemFlagsBits extends js.Object

/* cl_mem_flags - bitfield */
@JSGlobal("WEBCL.MemFlagsBits")
@js.native
object MemFlagsBits extends js.Object {
  @js.native
  sealed trait MEM_READ_ONLY
    extends webclLib.WEBCLNs.MemFlagsBits
  
  @js.native
  sealed trait MEM_READ_WRITE
    extends webclLib.WEBCLNs.MemFlagsBits
  
  @js.native
  sealed trait MEM_WRITE_ONLY
    extends webclLib.WEBCLNs.MemFlagsBits
  
  /* 0x4 */ val MEM_READ_ONLY: MEM_READ_ONLY with scala.Double = js.native
  /* 0x1 */ val MEM_READ_WRITE: MEM_READ_WRITE with scala.Double = js.native
  /* 0x2 */ val MEM_WRITE_ONLY: MEM_WRITE_ONLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.MemFlagsBits with scala.Double] = js.native
}

