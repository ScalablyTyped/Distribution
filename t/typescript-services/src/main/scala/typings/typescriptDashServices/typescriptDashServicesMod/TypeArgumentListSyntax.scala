package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.TypeArgumentListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeArguments: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
object TypeArgumentListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.TypeArgumentListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.TypeArgumentListSyntax = js.native
}

