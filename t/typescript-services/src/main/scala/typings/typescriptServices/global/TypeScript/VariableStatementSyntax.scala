package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
class VariableStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.VariableStatementSyntax {
  def this(
    modifiers: ISyntaxList,
    variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSGlobal("TypeScript.VariableStatementSyntax")
@js.native
object VariableStatementSyntax extends js.Object {
  
  def create(
    variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
  
  def create1(variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
}
