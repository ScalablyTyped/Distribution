package typings.vis.mod

import typings.vis.anon.Canvas
import typings.vis.anon.Nodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var edges: js.Array[String]
  
  var event: js.Array[String]
  
  var nodes: js.Array[String]
  
  var pointer: Canvas
  
  var previousSelection: js.UndefOr[Nodes] = js.undefined
}
object Properties {
  
  inline def apply(edges: js.Array[String], event: js.Array[String], nodes: js.Array[String], pointer: Canvas): Properties = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setEdges(value: js.Array[String]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: String*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setEvent(value: js.Array[String]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventVarargs(value: String*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPointer(value: Canvas): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelection(value: Nodes): Self = StObject.set(x, "previousSelection", value.asInstanceOf[js.Any])
    
    inline def setPreviousSelectionUndefined: Self = StObject.set(x, "previousSelection", js.undefined)
  }
}
