package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitOutputResult with Double] = js.native
  /* 2 */ @js.native
  object FailedBecauseOfCompilerOptionsErrors extends TopLevel[FailedBecauseOfCompilerOptionsErrors with Double]
  
  /* 1 */ @js.native
  object FailedBecauseOfSyntaxErrors extends TopLevel[FailedBecauseOfSyntaxErrors with Double]
  
  /* 3 */ @js.native
  object FailedToGenerateDeclarationsBecauseOfSemanticErrors extends TopLevel[FailedToGenerateDeclarationsBecauseOfSemanticErrors with Double]
  
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

