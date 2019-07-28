package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScriptNs.IModuleElementSyntax because Already inherited */ @JSGlobal("TypeScript.EnumDeclarationSyntax")
@js.native
class EnumDeclarationSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var enumElements: ISeparatedSyntaxList = js.native
  var enumKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var openBraceToken: ISyntaxToken = js.native
  def update(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): EnumDeclarationSyntax = js.native
  def withEnumElement(enumElement: EnumElementSyntax): EnumDeclarationSyntax = js.native
  def withEnumElements(enumElements: ISeparatedSyntaxList): EnumDeclarationSyntax = js.native
  def withEnumKeyword(enumKeyword: ISyntaxToken): EnumDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): EnumDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): EnumDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): EnumDeclarationSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): EnumDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.EnumDeclarationSyntax")
@js.native
object EnumDeclarationSyntax extends js.Object {
  def create(
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): EnumDeclarationSyntax = js.native
}

