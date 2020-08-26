package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(
    variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
}

