package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ExternalModuleReferenceSyntax")
@js.native
class ExternalModuleReferenceSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.ExternalModuleReferenceSyntax {
  def this(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ExternalModuleReferenceSyntax")
@js.native
object ExternalModuleReferenceSyntax extends js.Object {
  def create1(stringLiteral: ISyntaxToken): typings.typescriptDashServices.TypeScript.ExternalModuleReferenceSyntax = js.native
}

