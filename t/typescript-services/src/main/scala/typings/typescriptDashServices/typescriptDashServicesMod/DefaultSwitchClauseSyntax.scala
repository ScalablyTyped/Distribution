package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "DefaultSwitchClauseSyntax")
@js.native
class DefaultSwitchClauseSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.DefaultSwitchClauseSyntax {
  def this(
    defaultKeyword: ISyntaxToken,
    colonToken: ISyntaxToken,
    statements: ISyntaxList,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "DefaultSwitchClauseSyntax")
@js.native
object DefaultSwitchClauseSyntax extends js.Object {
  def create(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.DefaultSwitchClauseSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.DefaultSwitchClauseSyntax = js.native
}

