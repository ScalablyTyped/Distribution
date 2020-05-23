package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLiteralExpressionSyntax
  extends IPrimaryExpressionSyntax
     with SyntaxNode {
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var propertyAssignments: ISeparatedSyntaxList = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ObjectLiteralExpressionSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ObjectLiteralExpressionSyntax = js.native
  def withPropertyAssignment(propertyAssignment: IPropertyAssignmentSyntax): ObjectLiteralExpressionSyntax = js.native
  def withPropertyAssignments(propertyAssignments: ISeparatedSyntaxList): ObjectLiteralExpressionSyntax = js.native
}

