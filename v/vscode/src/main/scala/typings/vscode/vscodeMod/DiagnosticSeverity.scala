package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticSeverity extends js.Object

@JSImport("vscode", "DiagnosticSeverity")
@js.native
object DiagnosticSeverity extends js.Object {
  /**
  		 * Something not allowed by the rules of a language or other means.
  		 */
  @js.native
  sealed trait Error extends DiagnosticSeverity
  
  /**
  		 * Something to hint to a better way of doing it, like proposing
  		 * a refactoring.
  		 */
  @js.native
  sealed trait Hint extends DiagnosticSeverity
  
  /**
  		 * Something to inform about but not a problem.
  		 */
  @js.native
  sealed trait Information extends DiagnosticSeverity
  
  /**
  		 * Something suspicious but allowed.
  		 */
  @js.native
  sealed trait Warning extends DiagnosticSeverity
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticSeverity with Double] = js.native
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 3 */ @js.native
  object Hint extends TopLevel[Hint with Double]
  
  /* 2 */ @js.native
  object Information extends TopLevel[Information with Double]
  
  /* 1 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

