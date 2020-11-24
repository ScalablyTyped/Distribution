package typings.tsmonad.maybeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaybeType extends js.Object
@JSImport("tsmonad/lib/src/maybe", "MaybeType")
@js.native
object MaybeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaybeType with Double] = js.native
  
  @js.native
  sealed trait Just extends MaybeType
  /* 1 */ @js.native
  object Just extends TopLevel[Just with Double]
  
  @js.native
  sealed trait Nothing extends MaybeType
  /* 0 */ @js.native
  object Nothing extends TopLevel[Nothing with Double]
}
