package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var edges: js.UndefOr[js.Array[Edge] | DataSet[Edge]] = js.undefined
  
  var nodes: js.UndefOr[js.Array[Node] | DataSet[Node]] = js.undefined
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[Edge] | DataSet[Edge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node] | DataSet[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
