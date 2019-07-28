package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.VariableStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: typings.typescriptDashServices.TypeScriptNs.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  def create(
    variableDeclaration: typings.typescriptDashServices.TypeScriptNs.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.VariableStatementSyntax = js.native
  def create1(variableDeclaration: typings.typescriptDashServices.TypeScriptNs.VariableDeclarationSyntax): typings.typescriptDashServices.TypeScriptNs.VariableStatementSyntax = js.native
}

