package typings.xstate.libTypesMod

import typings.xstate.libStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesAndEdges[TContext, TEvent /* <: EventObject */] extends js.Object {
  var edges: js.Array[
    Edge[
      TContext, 
      TEvent, 
      /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ]
  ]
  var nodes: js.Array[StateNode[_, _, OmniEventObject[EventObject]]]
}

object NodesAndEdges {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    edges: js.Array[
      Edge[
        TContext, 
        TEvent, 
        /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
      ]
    ],
    nodes: js.Array[StateNode[_, _, OmniEventObject[EventObject]]]
  ): NodesAndEdges[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodesAndEdges[TContext, TEvent]]
  }
}

