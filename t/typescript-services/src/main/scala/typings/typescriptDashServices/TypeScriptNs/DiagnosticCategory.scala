package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSGlobal("TypeScript.DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error extends DiagnosticCategory
  
  @js.native
  sealed trait Message extends DiagnosticCategory
  
  @js.native
  sealed trait NoPrefix extends DiagnosticCategory
  
  @js.native
  sealed trait Warning extends DiagnosticCategory
  
  /* 1 */ val Error: typings.typescriptDashServices.TypeScriptNs.DiagnosticCategory.Error with Double = js.native
  /* 2 */ val Message: typings.typescriptDashServices.TypeScriptNs.DiagnosticCategory.Message with Double = js.native
  /* 3 */ val NoPrefix: typings.typescriptDashServices.TypeScriptNs.DiagnosticCategory.NoPrefix with Double = js.native
  /* 0 */ val Warning: typings.typescriptDashServices.TypeScriptNs.DiagnosticCategory.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
}

