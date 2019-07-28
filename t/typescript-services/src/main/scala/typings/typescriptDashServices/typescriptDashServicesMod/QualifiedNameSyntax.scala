package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.INameSyntax
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "QualifiedNameSyntax")
@js.native
class QualifiedNameSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.QualifiedNameSyntax {
  def this(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken, parsedInStrictMode: Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "QualifiedNameSyntax")
@js.native
object QualifiedNameSyntax extends js.Object {
  def create1(left: INameSyntax, right: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.QualifiedNameSyntax = js.native
}

