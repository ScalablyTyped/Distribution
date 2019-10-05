package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeArgumentListSyntax")
@js.native
class TypeArgumentListSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.TypeArgumentListSyntax {
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
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.TypeArgumentListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.TypeArgumentListSyntax = js.native
}

