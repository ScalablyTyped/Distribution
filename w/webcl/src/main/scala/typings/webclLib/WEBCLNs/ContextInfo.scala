package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextInfo extends js.Object

/* cl_context_info  */
@JSGlobal("WEBCL.ContextInfo")
@js.native
object ContextInfo extends js.Object {
  //CONTEXT_REFERENCE_COUNT                   = 0x1080, // disallowed
  @js.native
  sealed trait CONTEXT_DEVICES
    extends webclLib.WEBCLNs.ContextInfo
  
  /* 0x1081 */ val CONTEXT_DEVICES: CONTEXT_DEVICES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ContextInfo with scala.Double] = js.native
}

