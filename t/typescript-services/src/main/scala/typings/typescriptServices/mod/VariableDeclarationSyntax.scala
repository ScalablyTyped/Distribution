package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
class VariableDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.VariableDeclarationSyntax {
  def this(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSImport("typescript-services", "VariableDeclarationSyntax")
@js.native
object VariableDeclarationSyntax extends js.Object {
  
  def create1(variableDeclarators: ISeparatedSyntaxList): typings.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
}
