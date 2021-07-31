package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLiteralExpressionSyntax
  extends StObject
     with SyntaxNode
     with IPrimaryExpressionSyntax {
  
  var closeBraceToken: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  
  var openBraceToken: ISyntaxToken = js.native
  
  var propertyAssignments: ISeparatedSyntaxList = js.native
  
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
