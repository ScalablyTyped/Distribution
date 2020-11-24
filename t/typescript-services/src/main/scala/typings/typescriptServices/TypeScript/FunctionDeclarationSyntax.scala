package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDeclarationSyntax
  extends SyntaxNode
     with IStatementSyntax {
  
  var block: BlockSyntax = js.native
  
  var callSignature: CallSignatureSyntax = js.native
  
  var functionKeyword: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax = js.native
  
  def withBlock(block: BlockSyntax): FunctionDeclarationSyntax = js.native
  
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionDeclarationSyntax = js.native
  
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionDeclarationSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): FunctionDeclarationSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): FunctionDeclarationSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): FunctionDeclarationSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): FunctionDeclarationSyntax = js.native
}
