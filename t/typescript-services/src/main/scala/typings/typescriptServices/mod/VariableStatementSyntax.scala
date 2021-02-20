package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "VariableStatementSyntax")
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
object VariableStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "VariableStatementSyntax.create")
  @js.native
  def create(
    variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "VariableStatementSyntax.create1")
  @js.native
  def create1(variableDeclaration: typings.typescriptServices.TypeScript.VariableDeclarationSyntax): typings.typescriptServices.TypeScript.VariableStatementSyntax = js.native
}
