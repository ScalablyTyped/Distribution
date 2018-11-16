package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagnosticCategory extends js.Object

@JSGlobal("TypeScript.DiagnosticCategory")
@js.native
object DiagnosticCategory extends js.Object {
  @js.native
  sealed trait Error
    extends typescriptDashServicesLib.TypeScriptNs.DiagnosticCategory
  
  @js.native
  sealed trait Message
    extends typescriptDashServicesLib.TypeScriptNs.DiagnosticCategory
  
  @js.native
  sealed trait NoPrefix
    extends typescriptDashServicesLib.TypeScriptNs.DiagnosticCategory
  
  @js.native
  sealed trait Warning
    extends typescriptDashServicesLib.TypeScriptNs.DiagnosticCategory
  
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Message: Message with scala.Double = js.native
  /* 3 */ val NoPrefix: NoPrefix with scala.Double = js.native
  /* 0 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.DiagnosticCategory with scala.Double] = js.native
}

