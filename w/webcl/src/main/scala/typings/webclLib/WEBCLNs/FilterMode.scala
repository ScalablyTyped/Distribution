package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterMode extends js.Object

/* cl_filter_mode */
@JSGlobal("WEBCL.FilterMode")
@js.native
object FilterMode extends js.Object {
  @js.native
  sealed trait FILTER_LINEAR
    extends webclLib.WEBCLNs.FilterMode
  
  @js.native
  sealed trait FILTER_NEAREST
    extends webclLib.WEBCLNs.FilterMode
  
  /* 0x1141 */ val FILTER_LINEAR: FILTER_LINEAR with scala.Double = js.native
  /* 0x1140 */ val FILTER_NEAREST: FILTER_NEAREST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.FilterMode with scala.Double] = js.native
}

