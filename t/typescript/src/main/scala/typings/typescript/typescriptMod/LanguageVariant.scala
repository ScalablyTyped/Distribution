package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LanguageVariant extends js.Object

@JSImport("typescript", "LanguageVariant")
@js.native
object LanguageVariant extends js.Object {
  @js.native
  sealed trait JSX extends LanguageVariant
  
  @js.native
  sealed trait Standard extends LanguageVariant
  
  /* 1 */ val JSX: typings.typescript.typescriptMod.LanguageVariant.JSX with Double = js.native
  /* 0 */ val Standard: typings.typescript.typescriptMod.LanguageVariant.Standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVariant with Double] = js.native
}

