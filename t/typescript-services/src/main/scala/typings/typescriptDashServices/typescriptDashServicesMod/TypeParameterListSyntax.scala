package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax {
  def this(
    lessThanToken: ISyntaxToken,
    typeParameters: ISeparatedSyntaxList,
    greaterThanToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
object TypeParameterListSyntax extends js.Object {
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax = js.native
}

