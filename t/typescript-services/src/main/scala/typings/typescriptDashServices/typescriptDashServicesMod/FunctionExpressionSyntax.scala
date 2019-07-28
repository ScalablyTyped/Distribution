package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScriptNs.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScriptNs.BlockSyntax
  ): typings.typescriptDashServices.TypeScriptNs.FunctionExpressionSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.FunctionExpressionSyntax = js.native
}

