package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitOutputResult extends js.Object

@JSGlobal("TypeScript.EmitOutputResult")
@js.native
object EmitOutputResult extends js.Object {
  @js.native
  sealed trait FailedBecauseOfCompilerOptionsErrors extends EmitOutputResult
  
  @js.native
  sealed trait FailedBecauseOfSyntaxErrors extends EmitOutputResult
  
  @js.native
  sealed trait FailedToGenerateDeclarationsBecauseOfSemanticErrors extends EmitOutputResult
  
  @js.native
  sealed trait Succeeded extends EmitOutputResult
  
  /* 2 */ val FailedBecauseOfCompilerOptionsErrors: typings.typescriptDashServices.TypeScriptNs.EmitOutputResult.FailedBecauseOfCompilerOptionsErrors with Double = js.native
  /* 1 */ val FailedBecauseOfSyntaxErrors: typings.typescriptDashServices.TypeScriptNs.EmitOutputResult.FailedBecauseOfSyntaxErrors with Double = js.native
  /* 3 */ val FailedToGenerateDeclarationsBecauseOfSemanticErrors: typings.typescriptDashServices.TypeScriptNs.EmitOutputResult.FailedToGenerateDeclarationsBecauseOfSemanticErrors with Double = js.native
  /* 0 */ val Succeeded: typings.typescriptDashServices.TypeScriptNs.EmitOutputResult.Succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitOutputResult with Double] = js.native
}

