package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchClauseSyntax extends SyntaxNode {
  
  var block: BlockSyntax = js.native
  
  var catchKeyword: ISyntaxToken = js.native
  
  var closeParenToken: ISyntaxToken = js.native
  
  var identifier: ISyntaxToken = js.native
  
  var openParenToken: ISyntaxToken = js.native
  
  var typeAnnotation: TypeAnnotationSyntax = js.native
  
  def update(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax = js.native
  
  def withBlock(block: BlockSyntax): CatchClauseSyntax = js.native
  
  def withCatchKeyword(catchKeyword: ISyntaxToken): CatchClauseSyntax = js.native
  
  def withCloseParenToken(closeParenToken: ISyntaxToken): CatchClauseSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): CatchClauseSyntax = js.native
  
  def withOpenParenToken(openParenToken: ISyntaxToken): CatchClauseSyntax = js.native
  
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): CatchClauseSyntax = js.native
}
