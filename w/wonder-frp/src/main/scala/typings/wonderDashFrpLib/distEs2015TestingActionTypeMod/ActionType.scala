package typings
package wonderDashFrpLib.distEs2015TestingActionTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionType extends js.Object

@JSImport("wonder-frp/dist/es2015/testing/ActionType", "ActionType")
@js.native
object ActionType extends js.Object {
  @js.native
  sealed trait COMPLETED
    extends wonderDashFrpLib.distEs2015TestingActionTypeMod.ActionType
  
  @js.native
  sealed trait ERROR
    extends wonderDashFrpLib.distEs2015TestingActionTypeMod.ActionType
  
  @js.native
  sealed trait NEXT
    extends wonderDashFrpLib.distEs2015TestingActionTypeMod.ActionType
  
  /* 2 */ val COMPLETED: COMPLETED with scala.Double = js.native
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val NEXT: NEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDashFrpLib.distEs2015TestingActionTypeMod.ActionType with scala.Double] = js.native
}

