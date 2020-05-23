package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaratorSyntax extends SyntaxNode {
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

