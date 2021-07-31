package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFunctionDeclarationSyntax
  extends StObject
     with SyntaxNode {
  
  var block: BlockSyntax = js.native
  
  var callSignature: CallSignatureSyntax = js.native
  
  def isMemberDeclaration(): Boolean = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var propertyName: ISyntaxToken = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
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
