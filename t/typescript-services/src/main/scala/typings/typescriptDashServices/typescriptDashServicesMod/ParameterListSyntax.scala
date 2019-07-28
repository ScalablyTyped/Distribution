package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterListSyntax")
@js.native
class ParameterListSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax {
  def this(
    openParenToken: ISyntaxToken,
    parameters: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParameterListSyntax")
@js.native
object ParameterListSyntax extends js.Object {
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.ParameterListSyntax = js.native
}

