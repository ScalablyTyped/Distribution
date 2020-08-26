package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TypeParameterListSyntax")
@js.native
class TypeParameterListSyntax protected ()
  extends typings.typescriptServices.TypeScript.TypeParameterListSyntax {
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
  def create(lessThanToken: ISyntaxToken, greaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
}

