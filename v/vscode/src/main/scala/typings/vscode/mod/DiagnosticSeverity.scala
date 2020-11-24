package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticSeverity extends js.Object
@JSImport("vscode", "DiagnosticSeverity")
@js.native
object DiagnosticSeverity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticSeverity with Double] = js.native
  
  /**
    * Something not allowed by the rules of a language or other means.
    */
  @js.native
  sealed trait Error extends DiagnosticSeverity
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /**
    * Something to hint to a better way of doing it, like proposing
    * a refactoring.
    */
  @js.native
  sealed trait Hint extends DiagnosticSeverity
  /* 3 */ @js.native
  object Hint extends TopLevel[Hint with Double]
  
  /**
    * Something to inform about but not a problem.
    */
  @js.native
  sealed trait Information extends DiagnosticSeverity
  /* 2 */ @js.native
  object Information extends TopLevel[Information with Double]
  
  /**
    * Something suspicious but allowed.
    */
  @js.native
  sealed trait Warning extends DiagnosticSeverity
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
