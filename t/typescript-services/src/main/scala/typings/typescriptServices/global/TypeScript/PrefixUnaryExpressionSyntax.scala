package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PrefixUnaryExpressionSyntax")
@js.native
class PrefixUnaryExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax {
  def this(
    kind: typings.typescriptServices.TypeScript.SyntaxKind,
    operatorToken: ISyntaxToken,
    operand: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
