package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScriptNs.ISyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxDedenter")
@js.native
class SyntaxDedenter protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SyntaxDedenter {
  def this(
    dedentFirstToken: Boolean,
    dedentationAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxDedenter")
@js.native
object SyntaxDedenter extends js.Object {
  def dedentNode(
    node: ISyntaxNode,
    dedentFirstToken: Boolean,
    dedentAmount: Double,
    minimumIndent: Double,
    options: FormattingOptions
  ): ISyntaxNode = js.native
}

