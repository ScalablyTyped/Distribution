package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstructorDeclarationSyntax extends SyntaxNode {
  
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
