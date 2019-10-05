package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.ISyntaxList
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.BlockSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    statements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "BlockSyntax")
@js.native
object BlockSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typings.typescriptDashServices.TypeScript.BlockSyntax = js.native
  def create1(): typings.typescriptDashServices.TypeScript.BlockSyntax = js.native
}

