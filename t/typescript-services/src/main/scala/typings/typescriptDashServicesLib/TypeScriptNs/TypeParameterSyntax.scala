package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TypeParameterSyntax")
@js.native
class TypeParameterSyntax protected () extends SyntaxNode {
  def this(identifier: ISyntaxToken, constraint: ConstraintSyntax, parsedInStrictMode: scala.Boolean) = this()
  var constraint: ConstraintSyntax = js.native
  var identifier: ISyntaxToken = js.native
  def update(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def withConstraint(constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): TypeParameterSyntax = js.native
}

@JSGlobal("TypeScript.TypeParameterSyntax")
@js.native
object TypeParameterSyntax extends js.Object {
  def create(identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax = js.native
  def create1(identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax = js.native
}

