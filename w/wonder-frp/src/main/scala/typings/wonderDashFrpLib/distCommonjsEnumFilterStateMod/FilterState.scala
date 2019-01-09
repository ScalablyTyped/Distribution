package typings
package wonderDashFrpLib.distCommonjsEnumFilterStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterState extends js.Object

@JSImport("wonder-frp/dist/commonjs/enum/FilterState", "FilterState")
@js.native
object FilterState extends js.Object {
  @js.native
  sealed trait ENTER
    extends wonderDashFrpLib.distCommonjsEnumFilterStateMod.FilterState
  
  @js.native
  sealed trait LEAVE
    extends wonderDashFrpLib.distCommonjsEnumFilterStateMod.FilterState
  
  @js.native
  sealed trait TRIGGER
    extends wonderDashFrpLib.distCommonjsEnumFilterStateMod.FilterState
  
  /* 1 */ val ENTER: ENTER with scala.Double = js.native
  /* 2 */ val LEAVE: LEAVE with scala.Double = js.native
  /* 0 */ val TRIGGER: TRIGGER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[wonderDashFrpLib.distCommonjsEnumFilterStateMod.FilterState with scala.Double] = js.native
}

