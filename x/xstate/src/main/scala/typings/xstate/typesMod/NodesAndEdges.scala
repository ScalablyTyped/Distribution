package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesAndEdges[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var edges: js.Array[
    Edge[
      TContext, 
      TEvent, 
      /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ]
  ]
  
  var nodes: js.Array[StateNode[js.Any, js.Any, EventObject, ContextAny]]
}
object NodesAndEdges {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    edges: js.Array[
      Edge[
        TContext, 
        TEvent, 
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ]
    ],
    nodes: js.Array[StateNode[js.Any, js.Any, EventObject, ContextAny]]
  ): NodesAndEdges[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesAndEdges[TContext, TEvent]]
  }
  
  extension [Self <: NodesAndEdges[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (NodesAndEdges[TContext, TEvent])) {
    
    inline def setEdges(
      value: js.Array[
          Edge[
            TContext, 
            TEvent, 
            /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(
      value: (Edge[
          TContext, 
          TEvent, 
          /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
        ])*
    ): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[StateNode[js.Any, js.Any, EventObject, ContextAny]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: (StateNode[js.Any, js.Any, EventObject, ContextAny])*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
