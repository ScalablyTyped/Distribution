package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error
    extends typescriptLib.typescriptMod.DiagnosticCategory
  
  @js.native
  sealed trait Message
    extends typescriptLib.typescriptMod.DiagnosticCategory
  
  @js.native
  sealed trait Suggestion
    extends typescriptLib.typescriptMod.DiagnosticCategory
  
  @js.native
  sealed trait Warning
    extends typescriptLib.typescriptMod.DiagnosticCategory
  
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Message: Message with scala.Double = js.native
  /* 2 */ val Suggestion: Suggestion with scala.Double = js.native
  /* 0 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.DiagnosticCategory with scala.Double] = js.native
}

