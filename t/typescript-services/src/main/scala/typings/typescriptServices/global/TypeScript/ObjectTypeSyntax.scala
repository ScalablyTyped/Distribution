package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
class ObjectTypeSyntax protected ()
  extends typings.typescriptServices.TypeScript.ObjectTypeSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    typeMembers: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ObjectTypeSyntax")
@js.native
object ObjectTypeSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
}

