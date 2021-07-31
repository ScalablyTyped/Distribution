package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinallyClauseSyntax
  extends StObject
     with SyntaxNode {
  
  var block: BlockSyntax = js.native
  
  var finallyKeyword: ISyntaxToken = js.native
  
  def update(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax = js.native
  
  def withBlock(block: BlockSyntax): FinallyClauseSyntax = js.native
  
  def withFinallyKeyword(finallyKeyword: ISyntaxToken): FinallyClauseSyntax = js.native
}
