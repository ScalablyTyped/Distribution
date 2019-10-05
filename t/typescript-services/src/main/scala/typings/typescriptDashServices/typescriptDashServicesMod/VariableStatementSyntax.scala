package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.VariableStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: typings.typescriptDashServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  def create(
    variableDeclaration: typings.typescriptDashServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScript.VariableStatementSyntax = js.native
  def create1(variableDeclaration: typings.typescriptDashServices.TypeScript.VariableDeclarationSyntax): typings.typescriptDashServices.TypeScript.VariableStatementSyntax = js.native
}

