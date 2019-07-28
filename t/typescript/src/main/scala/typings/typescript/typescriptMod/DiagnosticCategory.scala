package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSImport("typescript", "DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error extends DiagnosticCategory
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  
  @js.native
  sealed trait Suggestion extends DiagnosticCategory
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  
  /* 1 */ val Error: typings.typescript.typescriptMod.DiagnosticCategory.Error with Double = js.native
  /* 3 */ val Message: typings.typescript.typescriptMod.DiagnosticCategory.Message with Double = js.native
  /* 2 */ val Suggestion: typings.typescript.typescriptMod.DiagnosticCategory.Suggestion with Double = js.native
  /* 0 */ val Warning: typings.typescript.typescriptMod.DiagnosticCategory.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
}

