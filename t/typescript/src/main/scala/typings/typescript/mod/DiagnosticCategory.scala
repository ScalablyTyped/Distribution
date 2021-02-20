package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticCategory extends StObject
@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
  
  @js.native
  sealed trait Error extends DiagnosticCategory
  /* 1 */ val Error: typings.typescript.mod.DiagnosticCategory.Error with Double = js.native
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  /* 3 */ val Message: typings.typescript.mod.DiagnosticCategory.Message with Double = js.native
  
  @js.native
  sealed trait Suggestion extends DiagnosticCategory
  /* 2 */ val Suggestion: typings.typescript.mod.DiagnosticCategory.Suggestion with Double = js.native
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  /* 0 */ val Warning: typings.typescript.mod.DiagnosticCategory.Warning with Double = js.native
}
