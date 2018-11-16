package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.IModuleElementSyntax because Already inherited)*/
@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
class ImportDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, importKeyword: ISyntaxToken, identifier: ISyntaxToken, equalsToken: ISyntaxToken, moduleReference: IModuleReferenceSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var equalsToken: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var importKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var moduleReference: IModuleReferenceSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax = js.native
  def withEqualsToken(equalsToken: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withImportKeyword(importKeyword: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ImportDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ImportDeclarationSyntax = js.native
  def withModuleReference(moduleReference: IModuleReferenceSyntax): ImportDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ImportDeclarationSyntax = js.native
}

@JSGlobal("TypeScript.ImportDeclarationSyntax")
@js.native
object ImportDeclarationSyntax extends js.Object {
  def create(
    importKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleReference: typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax = js.native
  def create1(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleReference: typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax = js.native
}

