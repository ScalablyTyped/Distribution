package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VariableDeclaratorSyntax")
@js.native
class VariableDeclaratorSyntax protected () extends SyntaxNode {
  def this(propertyName: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax, equalsValueClause: EqualsValueClauseSyntax, parsedInStrictMode: scala.Boolean) = this()
  var equalsValueClause: EqualsValueClauseSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(
    propertyName: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): VariableDeclaratorSyntax = js.native
  def withEqualsValueClause(equalsValueClause: EqualsValueClauseSyntax): VariableDeclaratorSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): VariableDeclaratorSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): VariableDeclaratorSyntax = js.native
}

@JSGlobal("TypeScript.VariableDeclaratorSyntax")
@js.native
object VariableDeclaratorSyntax extends js.Object {
  def create(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax = js.native
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax = js.native
}

