package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
class DefaultSwitchClauseSyntax protected ()
  extends typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax {
  def this(
    defaultKeyword: ISyntaxToken,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.DefaultSwitchClauseSyntax")
@js.native
object DefaultSwitchClauseSyntax extends js.Object {
  def create(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken): typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
  def create1(): typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
}

