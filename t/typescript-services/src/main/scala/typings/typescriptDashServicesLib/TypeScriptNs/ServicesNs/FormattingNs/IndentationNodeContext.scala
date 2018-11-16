package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
@js.native
class IndentationNodeContext protected () extends js.Object {
  def this(parent: IndentationNodeContext, node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode, fullStart: scala.Double, indentationAmount: scala.Double, childIndentationAmountDelta: scala.Double) = this()
  var _childIndentationAmountDelta: js.Any = js.native
  var _depth: js.Any = js.native
  var _fullStart: js.Any = js.native
  var _hasSkippedOrMissingTokenChild: js.Any = js.native
  var _indentationAmount: js.Any = js.native
  var _node: js.Any = js.native
  var _parent: js.Any = js.native
  def childIndentationAmountDelta(): scala.Double = js.native
  def clone(pool: IndentationNodeContextPool): IndentationNodeContext = js.native
  def depth(): scala.Double = js.native
  def end(): scala.Double = js.native
  def fullStart(): scala.Double = js.native
  def fullWidth(): scala.Double = js.native
  def hasSkippedOrMissingTokenChild(): scala.Boolean = js.native
  def indentationAmount(): scala.Double = js.native
  def kind(): typescriptDashServicesLib.TypeScriptNs.SyntaxKind = js.native
  def node(): typescriptDashServicesLib.TypeScriptNs.SyntaxNode = js.native
  def parent(): IndentationNodeContext = js.native
  def start(): scala.Double = js.native
  def update(
    parent: IndentationNodeContext,
    node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode,
    fullStart: scala.Double,
    indentationAmount: scala.Double,
    childIndentationAmountDelta: scala.Double
  ): scala.Unit = js.native
}

