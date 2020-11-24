package typings.tsmonad.eitherMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EitherType extends js.Object
@JSImport("tsmonad/lib/src/either", "EitherType")
@js.native
object EitherType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EitherType with Double] = js.native
  
  @js.native
  sealed trait Left extends EitherType
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  @js.native
  sealed trait Right extends EitherType
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
}
