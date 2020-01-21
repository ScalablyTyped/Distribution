package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.VariableDeclarationSyntax")
@js.native
class VariableDeclarationSyntax protected () extends SyntaxNode {
  def this(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList, parsedInStrictMode: Boolean) = this()
  var varKeyword: ISyntaxToken = js.native
  var variableDeclarators: ISeparatedSyntaxList = js.native
  def update(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
  def withVarKeyword(varKeyword: ISyntaxToken): VariableDeclarationSyntax = js.native
  def withVariableDeclarator(variableDeclarator: VariableDeclaratorSyntax): VariableDeclarationSyntax = js.native
  def withVariableDeclarators(variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.VariableDeclarationSyntax")
@js.native
object VariableDeclarationSyntax extends js.Object {
  def create1(variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
}

