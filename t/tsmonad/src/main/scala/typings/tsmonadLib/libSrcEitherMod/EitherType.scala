package typings
package tsmonadLib.libSrcEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EitherType extends js.Object

@JSImport("tsmonad/lib/src/either", "EitherType")
@js.native
object EitherType extends js.Object {
  @js.native
  sealed trait Left
    extends tsmonadLib.libSrcEitherMod.EitherType
  
  @js.native
  sealed trait Right
    extends tsmonadLib.libSrcEitherMod.EitherType
  
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsmonadLib.libSrcEitherMod.EitherType with scala.Double] = js.native
}

