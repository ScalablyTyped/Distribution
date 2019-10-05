package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import typings.typescriptDashServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BinaryExpressionSyntax")
@js.native
class BinaryExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.BinaryExpressionSyntax {
  def this(
    kind: SyntaxKind,
    left: IExpressionSyntax,
    operatorToken: ISyntaxToken,
    right: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

