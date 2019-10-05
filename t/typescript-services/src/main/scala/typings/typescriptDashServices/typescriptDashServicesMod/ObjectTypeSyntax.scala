package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectTypeSyntax")
@js.native
class ObjectTypeSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ObjectTypeSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    typeMembers: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ObjectTypeSyntax")
@js.native
object ObjectTypeSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.ObjectTypeSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.ObjectTypeSyntax = js.native
}

