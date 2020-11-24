package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.VariableDeclarationSyntax")
@js.native
class VariableDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.VariableDeclarationSyntax {
  def this(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSGlobal("TypeScript.VariableDeclarationSyntax")
@js.native
object VariableDeclarationSyntax extends js.Object {
  
  def create1(variableDeclarators: ISeparatedSyntaxList): typings.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
}
