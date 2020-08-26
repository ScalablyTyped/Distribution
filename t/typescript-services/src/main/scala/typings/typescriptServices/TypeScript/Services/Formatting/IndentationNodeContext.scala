package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndentationNodeContext extends js.Object {
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
  @scala.inline
  implicit class IndentationNodeContextOps[Self <: IndentationNodeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_childIndentationAmountDelta(value: js.Any): Self = this.set("_childIndentationAmountDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def set_depth(value: js.Any): Self = this.set("_depth", value.asInstanceOf[js.Any])
    @scala.inline
    def set_fullStart(value: js.Any): Self = this.set("_fullStart", value.asInstanceOf[js.Any])
    @scala.inline
    def set_hasSkippedOrMissingTokenChild(value: js.Any): Self = this.set("_hasSkippedOrMissingTokenChild", value.asInstanceOf[js.Any])
    @scala.inline
    def set_indentationAmount(value: js.Any): Self = this.set("_indentationAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def set_node(value: js.Any): Self = this.set("_node", value.asInstanceOf[js.Any])
    @scala.inline
    def set_parent(value: js.Any): Self = this.set("_parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildIndentationAmountDelta(value: () => Double): Self = this.set("childIndentationAmountDelta", js.Any.fromFunction0(value))
    @scala.inline
    def setClone(value: IndentationNodeContextPool => IndentationNodeContext): Self = this.set("clone", js.Any.fromFunction1(value))
    @scala.inline
    def setDepth(value: () => Double): Self = this.set("depth", js.Any.fromFunction0(value))
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setFullStart(value: () => Double): Self = this.set("fullStart", js.Any.fromFunction0(value))
    @scala.inline
    def setFullWidth(value: () => Double): Self = this.set("fullWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setHasSkippedOrMissingTokenChild(value: () => Boolean): Self = this.set("hasSkippedOrMissingTokenChild", js.Any.fromFunction0(value))
    @scala.inline
    def setIndentationAmount(value: () => Double): Self = this.set("indentationAmount", js.Any.fromFunction0(value))
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
    @scala.inline
    def setNode(value: () => SyntaxNode): Self = this.set("node", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: () => IndentationNodeContext): Self = this.set("parent", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Unit): Self = this.set("update", js.Any.fromFunction5(value))
  }
  
}

