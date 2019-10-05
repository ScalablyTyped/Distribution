package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.TypeParameterListSyntax {
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
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.TypeParameterListSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.TypeParameterListSyntax = js.native
}

