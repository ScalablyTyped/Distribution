package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
class FunctionExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.FunctionExpressionSyntax {
  def this(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.FunctionExpressionSyntax")
@js.native
object FunctionExpressionSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax
  ): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
}

