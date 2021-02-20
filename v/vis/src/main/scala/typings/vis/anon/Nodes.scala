package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nodes extends StObject {
  
  var edges: js.Array[String] = js.native
  
  var nodes: js.Array[String] = js.native
}
object Nodes {
  
  @scala.inline
  def apply(edges: js.Array[String], nodes: js.Array[String]): Nodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  @scala.inline
  implicit class NodesMutableBuilder[Self <: Nodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[String]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: String*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
