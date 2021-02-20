package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MemberVariableDeclarationSyntax")
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
object MemberVariableDeclarationSyntax {
  
  /* static member */
  @JSImport("typescript-services", "MemberVariableDeclarationSyntax.create")
  @js.native
  def create(
    variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax,
    semicolonToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
  
  /* static member */
  @JSImport("typescript-services", "MemberVariableDeclarationSyntax.create1")
  @js.native
  def create1(variableDeclarator: typings.typescriptServices.TypeScript.VariableDeclaratorSyntax): typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
}
