package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
@js.native
class IndentationNodeContext protected () extends js.Object {
  def this(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ) = this()
  var _childIndentationAmountDelta: js.Any = js.native
  var _depth: js.Any = js.native
  var _fullStart: js.Any = js.native
  var _hasSkippedOrMissingTokenChild: js.Any = js.native
  var _indentationAmount: js.Any = js.native
  var _node: js.Any = js.native
  var _parent: js.Any = js.native
  def childIndentationAmountDelta(): Double = js.native
  def clone(pool: IndentationNodeContextPool): IndentationNodeContext = js.native
  def depth(): Double = js.native
  def end(): Double = js.native
  def fullStart(): Double = js.native
  def fullWidth(): Double = js.native
  def hasSkippedOrMissingTokenChild(): Boolean = js.native
  def indentationAmount(): Double = js.native
  def kind(): SyntaxKind = js.native
  def node(): SyntaxNode = js.native
  def parent(): IndentationNodeContext = js.native
  def start(): Double = js.native
  def update(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ): Unit = js.native
}

