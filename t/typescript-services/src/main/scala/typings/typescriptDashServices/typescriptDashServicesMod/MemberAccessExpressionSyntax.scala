package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IExpressionSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberAccessExpressionSyntax")
@js.native
class MemberAccessExpressionSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.MemberAccessExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    dotToken: ISyntaxToken,
    name: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberAccessExpressionSyntax")
@js.native
object MemberAccessExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax, name: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.MemberAccessExpressionSyntax = js.native
}

