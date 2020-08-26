package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
class ParenthesizedArrowFunctionExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax {
  def this(
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ParenthesizedArrowFunctionExpressionSyntax")
@js.native
object ParenthesizedArrowFunctionExpressionSyntax extends js.Object {
  def create(
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
}

