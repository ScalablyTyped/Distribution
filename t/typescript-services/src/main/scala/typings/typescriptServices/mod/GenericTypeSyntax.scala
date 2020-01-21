package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.INameSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "GenericTypeSyntax")
@js.native
class GenericTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.GenericTypeSyntax {
  def this(
    name: INameSyntax,
    typeArgumentList: typings.typescriptServices.TypeScript.TypeArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "GenericTypeSyntax")
@js.native
object GenericTypeSyntax extends js.Object {
  def create1(name: INameSyntax): typings.typescriptServices.TypeScript.GenericTypeSyntax = js.native
}

