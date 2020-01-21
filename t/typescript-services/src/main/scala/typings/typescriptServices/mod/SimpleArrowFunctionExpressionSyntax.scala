package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
class SimpleArrowFunctionExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax {
  def this(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
object SimpleArrowFunctionExpressionSyntax extends js.Object {
  def create(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
}

