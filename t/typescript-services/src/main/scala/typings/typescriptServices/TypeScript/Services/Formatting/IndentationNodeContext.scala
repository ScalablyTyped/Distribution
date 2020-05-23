package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentationNodeContext extends js.Object {
  var _childIndentationAmountDelta: js.Any
  var _depth: js.Any
  var _fullStart: js.Any
  var _hasSkippedOrMissingTokenChild: js.Any
  var _indentationAmount: js.Any
  var _node: js.Any
  var _parent: js.Any
  def childIndentationAmountDelta(): Double
  def clone(pool: IndentationNodeContextPool): IndentationNodeContext
  def depth(): Double
  def end(): Double
  def fullStart(): Double
  def fullWidth(): Double
  def hasSkippedOrMissingTokenChild(): Boolean
  def indentationAmount(): Double
  def kind(): SyntaxKind
  def node(): SyntaxNode
  def parent(): IndentationNodeContext
  def start(): Double
  def update(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ): Unit
}

object IndentationNodeContext {
  @scala.inline
  def apply(
    _childIndentationAmountDelta: js.Any,
    _depth: js.Any,
    _fullStart: js.Any,
    _hasSkippedOrMissingTokenChild: js.Any,
    _indentationAmount: js.Any,
    _node: js.Any,
    _parent: js.Any,
    childIndentationAmountDelta: () => Double,
    clone: IndentationNodeContextPool => IndentationNodeContext,
    depth: () => Double,
    end: () => Double,
    fullStart: () => Double,
    fullWidth: () => Double,
    hasSkippedOrMissingTokenChild: () => Boolean,
    indentationAmount: () => Double,
    kind: () => SyntaxKind,
    node: () => SyntaxNode,
    parent: () => IndentationNodeContext,
    start: () => Double,
    update: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Unit
  ): IndentationNodeContext = {
    val __obj = js.Dynamic.literal(_childIndentationAmountDelta = _childIndentationAmountDelta.asInstanceOf[js.Any], _depth = _depth.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _hasSkippedOrMissingTokenChild = _hasSkippedOrMissingTokenChild.asInstanceOf[js.Any], _indentationAmount = _indentationAmount.asInstanceOf[js.Any], _node = _node.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childIndentationAmountDelta = js.Any.fromFunction0(childIndentationAmountDelta), clone = js.Any.fromFunction1(clone), depth = js.Any.fromFunction0(depth), end = js.Any.fromFunction0(end), fullStart = js.Any.fromFunction0(fullStart), fullWidth = js.Any.fromFunction0(fullWidth), hasSkippedOrMissingTokenChild = js.Any.fromFunction0(hasSkippedOrMissingTokenChild), indentationAmount = js.Any.fromFunction0(indentationAmount), kind = js.Any.fromFunction0(kind), node = js.Any.fromFunction0(node), parent = js.Any.fromFunction0(parent), start = js.Any.fromFunction0(start), update = js.Any.fromFunction5(update))
    __obj.asInstanceOf[IndentationNodeContext]
  }
}

