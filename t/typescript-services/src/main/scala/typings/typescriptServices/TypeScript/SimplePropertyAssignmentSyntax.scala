package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePropertyAssignmentSyntax extends SyntaxNode {
  var colonToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
}

