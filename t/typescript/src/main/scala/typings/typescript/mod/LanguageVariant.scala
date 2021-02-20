package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageVariant extends StObject
@JSImport("typescript", "LanguageVariant")
@js.native
object LanguageVariant extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVariant with Double] = js.native
  
  @js.native
  sealed trait JSX extends LanguageVariant
  /* 1 */ val JSX: typings.typescript.mod.LanguageVariant.JSX with Double = js.native
  
  @js.native
  sealed trait Standard extends LanguageVariant
  /* 0 */ val Standard: typings.typescript.mod.LanguageVariant.Standard with Double = js.native
}
