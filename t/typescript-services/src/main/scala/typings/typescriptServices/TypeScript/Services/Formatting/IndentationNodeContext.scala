package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationNodeContext extends StObject {
  
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
    clone_ : IndentationNodeContextPool => IndentationNodeContext,
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
    val __obj = js.Dynamic.literal(_childIndentationAmountDelta = _childIndentationAmountDelta.asInstanceOf[js.Any], _depth = _depth.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _hasSkippedOrMissingTokenChild = _hasSkippedOrMissingTokenChild.asInstanceOf[js.Any], _indentationAmount = _indentationAmount.asInstanceOf[js.Any], _node = _node.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childIndentationAmountDelta = js.Any.fromFunction0(childIndentationAmountDelta), depth = js.Any.fromFunction0(depth), end = js.Any.fromFunction0(end), fullStart = js.Any.fromFunction0(fullStart), fullWidth = js.Any.fromFunction0(fullWidth), hasSkippedOrMissingTokenChild = js.Any.fromFunction0(hasSkippedOrMissingTokenChild), indentationAmount = js.Any.fromFunction0(indentationAmount), kind = js.Any.fromFunction0(kind), node = js.Any.fromFunction0(node), parent = js.Any.fromFunction0(parent), start = js.Any.fromFunction0(start), update = js.Any.fromFunction5(update))
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[IndentationNodeContext]
  }
  
  @scala.inline
  implicit class IndentationNodeContextMutableBuilder[Self <: IndentationNodeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildIndentationAmountDelta(value: () => Double): Self = StObject.set(x, "childIndentationAmountDelta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_(value: IndentationNodeContextPool => IndentationNodeContext): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDepth(value: () => Double): Self = StObject.set(x, "depth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullStart(value: () => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSkippedOrMissingTokenChild(value: () => Boolean): Self = StObject.set(x, "hasSkippedOrMissingTokenChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndentationAmount(value: () => Double): Self = StObject.set(x, "indentationAmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNode(value: () => SyntaxNode): Self = StObject.set(x, "node", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: () => IndentationNodeContext): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    @scala.inline
    def set_childIndentationAmountDelta(value: js.Any): Self = StObject.set(x, "_childIndentationAmountDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_depth(value: js.Any): Self = StObject.set(x, "_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fullStart(value: js.Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_hasSkippedOrMissingTokenChild(value: js.Any): Self = StObject.set(x, "_hasSkippedOrMissingTokenChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_indentationAmount(value: js.Any): Self = StObject.set(x, "_indentationAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_node(value: js.Any): Self = StObject.set(x, "_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parent(value: js.Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
