package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageServiceMode extends StObject
@JSImport("typescript", "LanguageServiceMode")
@js.native
object LanguageServiceMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageServiceMode with Double] = js.native
  
  @js.native
  sealed trait PartialSemantic extends LanguageServiceMode
  /* 1 */ val PartialSemantic: typings.typescript.mod.LanguageServiceMode.PartialSemantic with Double = js.native
  
  @js.native
  sealed trait Semantic extends LanguageServiceMode
  /* 0 */ val Semantic: typings.typescript.mod.LanguageServiceMode.Semantic with Double = js.native
  
  @js.native
  sealed trait Syntactic extends LanguageServiceMode
  /* 2 */ val Syntactic: typings.typescript.mod.LanguageServiceMode.Syntactic with Double = js.native
}
