package typings
package wonderDashFrpLib.distCommonjsTestingActionTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionType extends js.Object

@JSImport("wonder-frp/dist/commonjs/testing/ActionType", "ActionType")
@js.native
object ActionType extends js.Object {
  @js.native
  sealed trait COMPLETED
    extends wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType
  
  @js.native
  sealed trait ERROR
    extends wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType
  
  @js.native
  sealed trait NEXT
    extends wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType
  
  /* 2 */ val COMPLETED: COMPLETED with scala.Double = js.native
  /* 1 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val NEXT: NEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDashFrpLib.distCommonjsTestingActionTypeMod.ActionType with scala.Double] = js.native
}

