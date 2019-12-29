package typings.tsmonad.libSrcMaybeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaybeType with Double] = js.native
  /* 1 */ @js.native
  object Just extends TopLevel[Just with Double]
  
  /* 0 */ @js.native
  object Nothing extends TopLevel[Nothing with Double]
  
}

