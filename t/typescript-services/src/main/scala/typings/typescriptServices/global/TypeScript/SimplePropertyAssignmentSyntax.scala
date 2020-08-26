package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected ()
  extends typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax {
  def this(
    propertyName: ISyntaxToken,
    colonToken: ISyntaxToken,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
object SimplePropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken, expression: IExpressionSyntax): typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
}

