package typings.typescriptDashServices.TypeScript

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
  
  /* 1 */ val Error: typings.typescriptDashServices.TypeScript.DiagnosticCategory.Error with Double = js.native
  /* 2 */ val Message: typings.typescriptDashServices.TypeScript.DiagnosticCategory.Message with Double = js.native
  /* 3 */ val NoPrefix: typings.typescriptDashServices.TypeScript.DiagnosticCategory.NoPrefix with Double = js.native
  /* 0 */ val Warning: typings.typescriptDashServices.TypeScript.DiagnosticCategory.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagnosticCategory with Double] = js.native
}

