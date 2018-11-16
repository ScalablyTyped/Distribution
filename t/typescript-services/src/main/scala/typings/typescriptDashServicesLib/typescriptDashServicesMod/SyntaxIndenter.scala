package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
class SyntaxIndenter protected ()
  extends typescriptDashServicesLib.TypeScriptNs.SyntaxIndenter {
  def this(indentFirstToken: scala.Boolean, indentationAmount: scala.Double, options: typescriptDashServicesLib.FormattingOptions) = this()
}

@JSImport("typescript-services", "SyntaxIndenter")
@js.native
object SyntaxIndenter extends js.Object {
  def indentNode(
    node: typescriptDashServicesLib.TypeScriptNs.ISyntaxNode,
    indentFirstToken: scala.Boolean,
    indentAmount: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): typescriptDashServicesLib.TypeScriptNs.SyntaxNode = js.native
  def indentNodes(
    nodes: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxNode],
    indentFirstToken: scala.Boolean,
    indentAmount: scala.Double,
    options: typescriptDashServicesLib.FormattingOptions
  ): js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxNode] = js.native
}

