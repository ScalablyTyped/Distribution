package typings.vis.anon

import typings.vis.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edges extends StObject {
  
  var edges: js.Array[IdType] = js.native
  
  var nodes: js.Array[IdType] = js.native
}
object Edges {
  
  @scala.inline
  def apply(edges: js.Array[IdType], nodes: js.Array[IdType]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  
  @scala.inline
  implicit class EdgesMutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[IdType]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: IdType*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[IdType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: IdType*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
