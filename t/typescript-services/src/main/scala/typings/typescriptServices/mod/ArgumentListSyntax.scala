package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ArgumentListSyntax")
@js.native
class ArgumentListSyntax protected ()
  extends typings.typescriptServices.TypeScript.ArgumentListSyntax {
  def this(
    typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax,
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
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ArgumentListSyntax = js.native
}

