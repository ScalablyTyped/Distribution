package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptDashServicesLib.TypeScriptNs.IMemberDeclarationSyntax because Already inherited */ @JSGlobal("TypeScript.MemberFunctionDeclarationSyntax")
@js.native
class MemberFunctionDeclarationSyntax protected () extends SyntaxNode {
  def this(modifiers: ISyntaxList, propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax, semicolonToken: ISyntaxToken, parsedInStrictMode: scala.Boolean) = this()
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var modifiers: ISyntaxList = js.native
  var propertyName: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  def isMemberDeclaration(): scala.Boolean = js.native
  def update(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): MemberFunctionDeclarationSyntax = js.native
  def withBlock(block: BlockSyntax): MemberFunctionDeclarationSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): MemberFunctionDeclarationSyntax = js.native
  def withModifier(modifier: ISyntaxToken): MemberFunctionDeclarationSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): MemberFunctionDeclarationSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): MemberFunctionDeclarationSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): MemberFunctionDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberFunctionDeclarationSyntax")
@js.native
object MemberFunctionDeclarationSyntax extends js.Object {
  def create(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax = js.native
  def create1(propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax = js.native
}

