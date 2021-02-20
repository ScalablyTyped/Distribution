package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticSeverity extends StObject
@JSImport("vscode", "DiagnosticSeverity")
@js.native
object DiagnosticSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticSeverity with Double] = js.native
  
  /**
    * Something not allowed by the rules of a language or other means.
    */
  @js.native
  sealed trait Error extends DiagnosticSeverity
  /* 0 */ val Error: typings.vscode.mod.DiagnosticSeverity.Error with Double = js.native
  
  /**
    * Something to hint to a better way of doing it, like proposing
    * a refactoring.
    */
  @js.native
  sealed trait Hint extends DiagnosticSeverity
  /* 3 */ val Hint: typings.vscode.mod.DiagnosticSeverity.Hint with Double = js.native
  
  /**
    * Something to inform about but not a problem.
    */
  @js.native
  sealed trait Information extends DiagnosticSeverity
  /* 2 */ val Information: typings.vscode.mod.DiagnosticSeverity.Information with Double = js.native
  
  /**
    * Something suspicious but allowed.
    */
  @js.native
  sealed trait Warning extends DiagnosticSeverity
  /* 1 */ val Warning: typings.vscode.mod.DiagnosticSeverity.Warning with Double = js.native
}
