package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IModuleElementSyntax because Already inherited */ @JSGlobal("TypeScript.ModuleDeclarationSyntax")
@js.native
class ModuleDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, moduleKeyword: ISyntaxToken, name: INameSyntax, stringLiteral: ISyntaxToken, openBraceToken: ISyntaxToken, moduleElements: ISyntaxList, closeBraceToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var moduleElements: ISyntaxList = js.native
  var moduleKeyword: ISyntaxToken = js.native
  var name: INameSyntax = js.native
  var openBraceToken: ISyntaxToken = js.native
  var stringLiteral: ISyntaxToken = js.native
  def update(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ModuleDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ModuleDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ModuleDeclarationSyntax = js.native
  def withModuleElement(moduleElement: IModuleElementSyntax): ModuleDeclarationSyntax = js.native
  def withModuleElements(moduleElements: ISyntaxList): ModuleDeclarationSyntax = js.native
  def withModuleKeyword(moduleKeyword: ISyntaxToken): ModuleDeclarationSyntax = js.native
  def withName(name: INameSyntax): ModuleDeclarationSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ModuleDeclarationSyntax = js.native
  def withStringLiteral(stringLiteral: ISyntaxToken): ModuleDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ModuleDeclarationSyntax")
@js.native
object ModuleDeclarationSyntax extends js.Object {
  def create(
    moduleKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax = js.native
}

