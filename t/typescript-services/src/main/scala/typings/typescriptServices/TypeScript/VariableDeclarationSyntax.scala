package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclarationSyntax extends SyntaxNode {
  var varKeyword: ISyntaxToken = js.native
  var variableDeclarators: ISeparatedSyntaxList = js.native
  def update(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
  def withVarKeyword(varKeyword: ISyntaxToken): VariableDeclarationSyntax = js.native
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): VariableDeclarationSyntax = js.native
  def withVariableDeclarators(variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
}

