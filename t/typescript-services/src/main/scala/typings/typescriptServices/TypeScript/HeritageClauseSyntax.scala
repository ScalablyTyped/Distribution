package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeritageClauseSyntax extends SyntaxNode {
  var _kind: js.Any = js.native
  var extendsOrImplementsKeyword: ISyntaxToken = js.native
  var typeNames: ISeparatedSyntaxList = js.native
  def update(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
  def withExtendsOrImplementsKeyword(extendsOrImplementsKeyword: ISyntaxToken): HeritageClauseSyntax = js.native
  def withKind(kind: SyntaxKind): HeritageClauseSyntax = js.native
  def withTypeName(typeName: INameSyntax): HeritageClauseSyntax = js.native
  def withTypeNames(typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
}

