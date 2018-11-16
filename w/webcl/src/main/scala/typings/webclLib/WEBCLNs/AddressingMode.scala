package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddressingMode extends js.Object

/* cl_addressing_mode */
@JSGlobal("WEBCL.AddressingMode")
@js.native
object AddressingMode extends js.Object {
  @js.native
  sealed trait ADDRESS_CLAMP
    extends webclLib.WEBCLNs.AddressingMode
  
  //ADDRESS_NONE                              = 0x1130, // disallowed
  @js.native
  sealed trait ADDRESS_CLAMP_TO_EDGE
    extends webclLib.WEBCLNs.AddressingMode
  
  @js.native
  sealed trait ADDRESS_MIRRORED_REPEAT
    extends webclLib.WEBCLNs.AddressingMode
  
  @js.native
  sealed trait ADDRESS_REPEAT
    extends webclLib.WEBCLNs.AddressingMode
  
  /* 0x1132 */ val ADDRESS_CLAMP: ADDRESS_CLAMP with scala.Double = js.native
  /* 0x1131 */ val ADDRESS_CLAMP_TO_EDGE: ADDRESS_CLAMP_TO_EDGE with scala.Double = js.native
  /* 0x1134 */ val ADDRESS_MIRRORED_REPEAT: ADDRESS_MIRRORED_REPEAT with scala.Double = js.native
  /* 0x1133 */ val ADDRESS_REPEAT: ADDRESS_REPEAT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.AddressingMode with scala.Double] = js.native
}

