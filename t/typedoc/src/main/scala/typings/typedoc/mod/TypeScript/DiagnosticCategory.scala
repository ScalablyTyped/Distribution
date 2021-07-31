package typings.typedoc.mod.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.DiagnosticCategory")
@js.native
object DiagnosticCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.DiagnosticCategory & Double] = js.native
  
  /* 1 */ val Error: typings.typescript.mod.DiagnosticCategory.Error & Double = js.native
  
  /* 3 */ val Message: typings.typescript.mod.DiagnosticCategory.Message & Double = js.native
  
  /* 2 */ val Suggestion: typings.typescript.mod.DiagnosticCategory.Suggestion & Double = js.native
  
  /* 0 */ val Warning: typings.typescript.mod.DiagnosticCategory.Warning & Double = js.native
}
