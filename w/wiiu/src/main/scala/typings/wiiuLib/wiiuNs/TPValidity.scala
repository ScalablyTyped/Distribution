package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TPValidity extends js.Object

@JSGlobal("wiiu.TPValidity")
@js.native
object TPValidity extends js.Object {
  @js.native
  sealed trait INVALID
    extends wiiuLib.wiiuNs.TPValidity
  
  @js.native
  sealed trait VALID
    extends wiiuLib.wiiuNs.TPValidity
  
  @js.native
  sealed trait X_INVALID
    extends wiiuLib.wiiuNs.TPValidity
  
  @js.native
  sealed trait Y_INVALID
    extends wiiuLib.wiiuNs.TPValidity
  
  /* 3 */ val INVALID: INVALID with scala.Double = js.native
  /* 0 */ val VALID: VALID with scala.Double = js.native
  /* 1 */ val X_INVALID: X_INVALID with scala.Double = js.native
  /* 2 */ val Y_INVALID: Y_INVALID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wiiuLib.wiiuNs.TPValidity with scala.Double] = js.native
}

