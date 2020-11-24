package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageServiceMode extends js.Object
@JSImport("typescript", "LanguageServiceMode")
@js.native
object LanguageServiceMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageServiceMode with Double] = js.native
  
  @js.native
  sealed trait PartialSemantic extends LanguageServiceMode
  /* 1 */ @js.native
  object PartialSemantic extends TopLevel[PartialSemantic with Double]
  
  @js.native
  sealed trait Semantic extends LanguageServiceMode
  /* 0 */ @js.native
  object Semantic extends TopLevel[Semantic with Double]
  
  @js.native
  sealed trait Syntactic extends LanguageServiceMode
  /* 2 */ @js.native
  object Syntactic extends TopLevel[Syntactic with Double]
}
