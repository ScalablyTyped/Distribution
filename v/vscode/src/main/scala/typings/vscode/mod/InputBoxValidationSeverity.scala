package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputBoxValidationSeverity extends StObject
@JSImport("vscode", "InputBoxValidationSeverity")
@js.native
object InputBoxValidationSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputBoxValidationSeverity & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with InputBoxValidationSeverity
  /* 3 */ val Error: typings.vscode.mod.InputBoxValidationSeverity.Error & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with InputBoxValidationSeverity
  /* 1 */ val Info: typings.vscode.mod.InputBoxValidationSeverity.Info & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with InputBoxValidationSeverity
  /* 2 */ val Warning: typings.vscode.mod.InputBoxValidationSeverity.Warning & Double = js.native
}
