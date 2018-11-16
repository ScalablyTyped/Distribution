package typings
package tsmonadLib.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaybeType extends js.Object

@JSImport("tsmonad/lib/src/maybe", "MaybeType")
@js.native
object MaybeType extends js.Object {
  @js.native
  sealed trait Just
    extends tsmonadLib.libSrcMaybeMod.MaybeType
  
  @js.native
  sealed trait Nothing
    extends tsmonadLib.libSrcMaybeMod.MaybeType
  
  /* 1 */ val Just: Just with scala.Double = js.native
  /* 0 */ val Nothing: Nothing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsmonadLib.libSrcMaybeMod.MaybeType with scala.Double] = js.native
}

