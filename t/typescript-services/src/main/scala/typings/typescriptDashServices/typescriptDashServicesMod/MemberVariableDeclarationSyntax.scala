package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
class MemberVariableDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.MemberVariableDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclarator: typings.typescriptDashServices.TypeScriptNs.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
@js.native
object MemberVariableDeclarationSyntax extends js.Object {
  def create(
    variableDeclarator: typings.typescriptDashServices.TypeScriptNs.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.MemberVariableDeclarationSyntax = js.native
  def create1(variableDeclarator: typings.typescriptDashServices.TypeScriptNs.VariableDeclaratorSyntax): typings.typescriptDashServices.TypeScriptNs.MemberVariableDeclarationSyntax = js.native
}

