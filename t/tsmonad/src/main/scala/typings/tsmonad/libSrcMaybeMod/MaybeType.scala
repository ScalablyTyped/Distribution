package typings.tsmonad.libSrcMaybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaybeType extends js.Object

@JSImport("tsmonad/lib/src/maybe", "MaybeType")
@js.native
object MaybeType extends js.Object {
  @js.native
  sealed trait Just extends MaybeType
  
  @js.native
  sealed trait Nothing extends MaybeType
  
  /* 1 */ val Just: typings.tsmonad.libSrcMaybeMod.MaybeType.Just with Double = js.native
  /* 0 */ val Nothing: typings.tsmonad.libSrcMaybeMod.MaybeType.Nothing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaybeType with Double] = js.native
}

