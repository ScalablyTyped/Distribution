package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LanguageVariant extends js.Object

@JSImport("typescript", "LanguageVariant")
@js.native
object LanguageVariant extends js.Object {
  @js.native
  sealed trait JSX
    extends typescriptLib.typescriptMod.LanguageVariant
  
  @js.native
  sealed trait Standard
    extends typescriptLib.typescriptMod.LanguageVariant
  
  /* 1 */ val JSX: JSX with scala.Double = js.native
  /* 0 */ val Standard: Standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.LanguageVariant with scala.Double] = js.native
}

