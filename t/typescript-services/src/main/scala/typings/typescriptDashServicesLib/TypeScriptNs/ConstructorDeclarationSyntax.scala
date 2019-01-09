package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IClassElementSyntax because Already inherited */ @JSGlobal("TypeScript.ConstructorDeclarationSyntax")
@js.native
class ConstructorDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, constructorKeyword: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var constructorKeyword: ISyntaxToken = js.native
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): ConstructorDeclarationSyntax = js.native
  def withBlock(block: BlockSyntax): ConstructorDeclarationSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): ConstructorDeclarationSyntax = js.native
  def withConstructorKeyword(constructorKeyword: ISyntaxToken): ConstructorDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): ConstructorDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): ConstructorDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ConstructorDeclarationSyntax = js.native
}

@JSGlobal("TypeScript.ConstructorDeclarationSyntax")
@js.native
object ConstructorDeclarationSyntax extends js.Object {
  def create(
    constructorKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax = js.native
  def create1(): typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax = js.native
}

