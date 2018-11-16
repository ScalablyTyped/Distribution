package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitOutputResult extends js.Object

@JSGlobal("TypeScript.EmitOutputResult")
@js.native
object EmitOutputResult extends js.Object {
  @js.native
  sealed trait FailedBecauseOfCompilerOptionsErrors
    extends typescriptDashServicesLib.TypeScriptNs.EmitOutputResult
  
  @js.native
  sealed trait FailedBecauseOfSyntaxErrors
    extends typescriptDashServicesLib.TypeScriptNs.EmitOutputResult
  
  @js.native
  sealed trait FailedToGenerateDeclarationsBecauseOfSemanticErrors
    extends typescriptDashServicesLib.TypeScriptNs.EmitOutputResult
  
  @js.native
  sealed trait Succeeded
    extends typescriptDashServicesLib.TypeScriptNs.EmitOutputResult
  
  /* 2 */ val FailedBecauseOfCompilerOptionsErrors: FailedBecauseOfCompilerOptionsErrors with scala.Double = js.native
  /* 1 */ val FailedBecauseOfSyntaxErrors: FailedBecauseOfSyntaxErrors with scala.Double = js.native
  /* 3 */ val FailedToGenerateDeclarationsBecauseOfSemanticErrors: FailedToGenerateDeclarationsBecauseOfSemanticErrors with scala.Double = js.native
  /* 0 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.EmitOutputResult with scala.Double] = js.native
}

