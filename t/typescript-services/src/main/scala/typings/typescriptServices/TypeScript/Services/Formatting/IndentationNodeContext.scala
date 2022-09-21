package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentationNodeContext extends StObject {
  
  /* private */ var _childIndentationAmountDelta: Any
  
  /* private */ var _depth: Any
  
  /* private */ var _fullStart: Any
  
  /* private */ var _hasSkippedOrMissingTokenChild: Any
  
  /* private */ var _indentationAmount: Any
  
  /* private */ var _node: Any
  
  /* private */ var _parent: Any
  
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
  
  inline def apply(
    _childIndentationAmountDelta: Any,
    _depth: Any,
    _fullStart: Any,
    _hasSkippedOrMissingTokenChild: Any,
    _indentationAmount: Any,
    _node: Any,
    _parent: Any,
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
  
  extension [Self <: IndentationNodeContext](x: Self) {
    
    inline def setChildIndentationAmountDelta(value: () => Double): Self = StObject.set(x, "childIndentationAmountDelta", js.Any.fromFunction0(value))
    
    inline def setClone_(value: IndentationNodeContextPool => IndentationNodeContext): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setDepth(value: () => Double): Self = StObject.set(x, "depth", js.Any.fromFunction0(value))
    
    inline def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setFullStart(value: () => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction0(value))
    
    inline def setFullWidth(value: () => Double): Self = StObject.set(x, "fullWidth", js.Any.fromFunction0(value))
    
    inline def setHasSkippedOrMissingTokenChild(value: () => Boolean): Self = StObject.set(x, "hasSkippedOrMissingTokenChild", js.Any.fromFunction0(value))
    
    inline def setIndentationAmount(value: () => Double): Self = StObject.set(x, "indentationAmount", js.Any.fromFunction0(value))
    
    inline def setKind(value: () => SyntaxKind): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setNode(value: () => SyntaxNode): Self = StObject.set(x, "node", js.Any.fromFunction0(value))
    
    inline def setParent(value: () => IndentationNodeContext): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
    
    inline def set_childIndentationAmountDelta(value: Any): Self = StObject.set(x, "_childIndentationAmountDelta", value.asInstanceOf[js.Any])
    
    inline def set_depth(value: Any): Self = StObject.set(x, "_depth", value.asInstanceOf[js.Any])
    
    inline def set_fullStart(value: Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    inline def set_hasSkippedOrMissingTokenChild(value: Any): Self = StObject.set(x, "_hasSkippedOrMissingTokenChild", value.asInstanceOf[js.Any])
    
    inline def set_indentationAmount(value: Any): Self = StObject.set(x, "_indentationAmount", value.asInstanceOf[js.Any])
    
    inline def set_node(value: Any): Self = StObject.set(x, "_node", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
