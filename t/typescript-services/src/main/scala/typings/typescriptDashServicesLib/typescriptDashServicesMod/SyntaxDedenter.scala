package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxDedenter")
@js.native
class SyntaxDedenter protected ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxDedenter {
  def this(dedentFirstToken: scala.Boolean, dedentationAmount: scala.Double, minimumIndent: scala.Double, options: typescriptDashServicesLib.FormattingOptions) = this()
}

/* static members */
@JSImport("typescript-services", "SyntaxDedenter")
@js.native
object SyntaxDedenter extends js.Object {
  def dedentNode(
    node: typescriptDashServicesLib.TypeScriptNs.ISyntaxNode,
    dedentFirstToken: scala.Boolean,
    dedentAmount: scala.Double,
    minimumIndent: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxNode = js.native
}

