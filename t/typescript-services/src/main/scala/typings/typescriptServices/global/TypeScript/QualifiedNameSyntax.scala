package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected ()
  extends typings.typescriptServices.TypeScript.QualifiedNameSyntax {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}
/* static members */
@JSGlobal("TypeScript.QualifiedNameSyntax")
@js.native
object QualifiedNameSyntax extends js.Object {
  
  def create1(left: INameSyntax, right: ISyntaxToken): typings.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
}
