package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax {
  def this(
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: typings.typescriptDashServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(
    callSignature: typings.typescriptDashServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
}

