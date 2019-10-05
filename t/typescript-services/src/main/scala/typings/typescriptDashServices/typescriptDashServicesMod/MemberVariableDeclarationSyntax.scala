package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.MemberVariableDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: typings.typescriptDashServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(
    variableDeclarator: typings.typescriptDashServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: typings.typescriptDashServices.TypeScript.VariableDeclaratorSyntax): typings.typescriptDashServices.TypeScript.MemberVariableDeclarationSyntax = js.native
}

