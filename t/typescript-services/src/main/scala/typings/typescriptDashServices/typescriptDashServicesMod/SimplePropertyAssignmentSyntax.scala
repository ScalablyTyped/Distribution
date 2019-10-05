package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IExpressionSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.SimplePropertyAssignmentSyntax {
  def this(
    propertyName: ISyntaxToken,
    colonToken: ISyntaxToken,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SimplePropertyAssignmentSyntax")
@js.native
object SimplePropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptDashServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
}

