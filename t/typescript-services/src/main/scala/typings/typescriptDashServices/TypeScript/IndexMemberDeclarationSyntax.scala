package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScript.ISyntaxElement because Already inherited
- typings.typescriptDashServices.TypeScript.IClassElementSyntax because Already inherited */ @JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    indexSignature: IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var indexSignature: IndexSignatureSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withIndexSignature(indexSignature: IndexSignatureSyntax): IndexMemberDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): IndexMemberDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: IndexSignatureSyntax): IndexMemberDeclarationSyntax = js.native
}

