package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableStatementSyntax
  extends SyntaxNode
     with IStatementSyntax {
  var modifiers: ISyntaxList = js.native
  var semicolonToken: ISyntaxToken = js.native
  var variableDeclaration: VariableDeclarationSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax = js.native
  def withModifier(modifier: ISyntaxToken): VariableStatementSyntax = js.native
  def withModifiers(modifiers: ISyntaxList): VariableStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): VariableStatementSyntax = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): VariableStatementSyntax = js.native
}

