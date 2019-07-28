package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.HeritageClauseSyntax")
@js.native
class HeritageClauseSyntax protected () extends SyntaxNode {
  def this(
    kind: SyntaxKind,
    extendsOrImplementsKeyword: ISyntaxToken,
    typeNames: ISeparatedSyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
  var _kind: js.Any = js.native
  var extendsOrImplementsKeyword: ISyntaxToken = js.native
  var typeNames: ISeparatedSyntaxList = js.native
  def update(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
  def withExtendsOrImplementsKeyword(extendsOrImplementsKeyword: ISyntaxToken): HeritageClauseSyntax = js.native
  def withKind(kind: SyntaxKind): HeritageClauseSyntax = js.native
  def withTypeName(typeName: INameSyntax): HeritageClauseSyntax = js.native
  def withTypeNames(typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
}

