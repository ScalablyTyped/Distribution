package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScriptNs.IModuleElementSyntax because Already inherited */ @JSGlobal("TypeScript.ClassDeclarationSyntax")
@js.native
class ClassDeclarationSyntax protected () extends SyntaxNode {
  def this(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var classElements: ISyntaxList = js.native
  var classKeyword: ISyntaxToken = js.native
  var closeBraceToken: ISyntaxToken = js.native
  var heritageClauses: ISyntaxList = js.native
  var identifier: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var openBraceToken: ISyntaxToken = js.native
  var typeParameterList: TypeParameterListSyntax = js.native
  def update(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax = js.native
  def withClassElement(classElement: IClassElementSyntax): ClassDeclarationSyntax = js.native
  def withClassElements(classElements: ISyntaxList): ClassDeclarationSyntax = js.native
  def withClassKeyword(classKeyword: ISyntaxToken): ClassDeclarationSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ClassDeclarationSyntax = js.native
  def withHeritageClause(heritageClause: HeritageClauseSyntax): ClassDeclarationSyntax = js.native
  def withHeritageClauses(heritageClauses: ISyntaxList): ClassDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ClassDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ClassDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ClassDeclarationSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ClassDeclarationSyntax = js.native
  def withTypeParameterList(typeParameterList: TypeParameterListSyntax): ClassDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ClassDeclarationSyntax")
@js.native
object ClassDeclarationSyntax extends js.Object {
  def create(
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): ClassDeclarationSyntax = js.native
}

