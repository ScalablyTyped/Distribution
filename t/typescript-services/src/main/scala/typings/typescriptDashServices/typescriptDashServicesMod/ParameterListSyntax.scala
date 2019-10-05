package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterListSyntax")
@js.native
class ParameterListSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ParameterListSyntax {
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
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ParameterListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ParameterListSyntax = js.native
}

