package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Bool extends js.Object

/* cl_bool */
@JSGlobal("WEBCL.Bool")
@js.native
object Bool extends js.Object {
  @js.native
  sealed trait FALSE
    extends webclLib.WEBCLNs.Bool
  
  @js.native
  sealed trait TRUE
    extends webclLib.WEBCLNs.Bool
  
  /* 0 */ val FALSE: FALSE with scala.Double = js.native
  /* 1 */ val TRUE: TRUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.Bool with scala.Double] = js.native
}

