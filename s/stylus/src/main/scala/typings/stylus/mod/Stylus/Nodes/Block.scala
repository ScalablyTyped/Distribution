package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with Node {
  
  var hasMedia: scala.Boolean
  
  var hasProperties: scala.Boolean
  
  var isEmpty: scala.Boolean
  
  var node: Node
  
  var nodes: js.Array[Node]
  
  var parent: Block
  
  /**
    * Push a `node` to this block.
    */
  def push(node: Node): scala.Unit
  
  var scope: scala.Boolean
}
object Block {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hasMedia: scala.Boolean,
    hasProperties: scala.Boolean,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: Double,
    node: Node,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    parent: Block,
    push: Node => scala.Unit,
    scope: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Block = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hasMedia = hasMedia.asInstanceOf[js.Any], hasProperties = hasProperties.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), parent = parent.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), scope = scope.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setHasMedia(value: scala.Boolean): Self = StObject.set(x, "hasMedia", value.asInstanceOf[js.Any])
    
    inline def setHasProperties(value: scala.Boolean): Self = StObject.set(x, "hasProperties", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: scala.Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setParent(value: Block): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPush(value: Node => scala.Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setScope(value: scala.Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
