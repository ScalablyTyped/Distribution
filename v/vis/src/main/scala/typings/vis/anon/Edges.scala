package typings.vis.anon

import typings.vis.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edges extends StObject {
  
  var edges: js.Array[IdType]
  
  var nodes: js.Array[IdType]
}
object Edges {
  
  inline def apply(edges: js.Array[IdType], nodes: js.Array[IdType]): Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
    
    inline def setEdges(value: js.Array[IdType]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: IdType*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setNodes(value: js.Array[IdType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: IdType*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
