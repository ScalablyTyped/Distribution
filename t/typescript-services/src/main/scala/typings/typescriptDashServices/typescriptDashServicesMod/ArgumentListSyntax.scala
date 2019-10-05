package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ArgumentListSyntax {
  def this(
    typeArgumentList: typings.typescriptDashServices.TypeScript.TypeArgumentListSyntax,
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
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ArgumentListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ArgumentListSyntax = js.native
}

