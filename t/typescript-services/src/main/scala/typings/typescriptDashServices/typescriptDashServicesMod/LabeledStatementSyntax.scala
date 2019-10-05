package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IStatementSyntax
import typings.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "LabeledStatementSyntax")
@js.native
class LabeledStatementSyntax protected ()
  extends typings.typescriptDashServices.TypeScript.LabeledStatementSyntax {
  def this(
    identifier: ISyntaxToken,
    colonToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "LabeledStatementSyntax")
@js.native
object LabeledStatementSyntax extends js.Object {
  def create1(identifier: ISyntaxToken, statement: IStatementSyntax): typings.typescriptDashServices.TypeScript.LabeledStatementSyntax = js.native
}

