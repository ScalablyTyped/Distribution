package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationNodeContextPool")
@js.native
class IndentationNodeContextPool () extends js.Object {
  var nodes: js.Any = js.native
  def getNode(
    parent: IndentationNodeContext,
    node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode,
    fullStart: scala.Double,
    indentationLevel: scala.Double,
    childIndentationLevelDelta: scala.Double
  ): IndentationNodeContext = js.native
  def releaseNode(node: IndentationNodeContext): scala.Unit = js.native
  def releaseNode(node: IndentationNodeContext, recursive: scala.Boolean): scala.Unit = js.native
}

