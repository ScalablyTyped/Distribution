package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumElementSyntax extends SyntaxNode {
  var equalsValueClause: EqualsValueClauseSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def update(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def withEqualsValueClause(equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): EnumElementSyntax = js.native
}

