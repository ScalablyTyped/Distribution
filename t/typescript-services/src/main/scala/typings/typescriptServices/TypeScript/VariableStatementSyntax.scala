package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableStatementSyntax
  extends StObject
     with SyntaxNode
     with IStatementSyntax {
  
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  
  var modifiers: ISyntaxList = js.native
  
  var semicolonToken: ISyntaxToken = js.native
  
  def update(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax = js.native
  
  var variableDeclaration: VariableDeclarationSyntax = js.native
  
  def withModifier(modifier: ISyntaxToken): VariableStatementSyntax = js.native
  
  def withModifiers(modifiers: ISyntaxList): VariableStatementSyntax = js.native
  
  def withSemicolonToken(semicolonToken: ISyntaxToken): VariableStatementSyntax = js.native
  
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): VariableStatementSyntax = js.native
}
