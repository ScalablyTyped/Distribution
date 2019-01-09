package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IPropertyAssignmentSyntax because Already inherited */ @JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
class SimplePropertyAssignmentSyntax protected () extends SyntaxNode {
  def this(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax, parsedInStrictMode: scala.Boolean) = this()
  var colonToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): scala.Boolean = js.native
  def update(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withColonToken(colonToken: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
  def withExpression(expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): SimplePropertyAssignmentSyntax = js.native
}

@JSGlobal("TypeScript.SimplePropertyAssignmentSyntax")
@js.native
object SimplePropertyAssignmentSyntax extends js.Object {
  def create1(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SimplePropertyAssignmentSyntax = js.native
}

