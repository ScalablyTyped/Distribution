package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var edges: js.Array[String]
  
  var nodes: js.Array[String]
}
object Nodes {
  
  inline def apply(edges: js.Array[String], nodes: js.Array[String]): Nodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setEdges(value: js.Array[String]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: String*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
