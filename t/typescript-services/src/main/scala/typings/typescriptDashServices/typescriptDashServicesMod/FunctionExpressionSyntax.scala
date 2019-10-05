package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax
  ): typings.typescriptDashServices.TypeScript.FunctionExpressionSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.FunctionExpressionSyntax = js.native
}

