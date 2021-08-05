package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var edges: js.UndefOr[js.Array[Edge] | DataSet[Edge]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[Node] | DataSet[Node]] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setEdges(value: js.Array[Edge] | DataSet[Edge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[Node] | DataSet[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
