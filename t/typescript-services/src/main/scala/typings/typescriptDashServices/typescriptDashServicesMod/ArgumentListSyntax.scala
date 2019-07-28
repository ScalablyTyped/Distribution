package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ArgumentListSyntax {
  def this(
    typeArgumentList: typings.typescriptDashServices.TypeScriptNs.TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    _arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
object ArgumentListSyntax extends js.Object {
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ArgumentListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScriptNs.ArgumentListSyntax = js.native
}

