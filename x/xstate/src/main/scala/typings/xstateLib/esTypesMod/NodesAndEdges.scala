package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesAndEdges[TContext, TEvent /* <: EventObject */] extends js.Object {
  var edges: js.Array[
    Edge[
      TContext, 
      TEvent, 
      /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any
    ]
  ]
  var nodes: js.Array[xstateLib.esStateNodeMod.StateNode[_, _, OmniEventObject[EventObject]]]
}

object NodesAndEdges {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    edges: js.Array[
      Edge[
        TContext, 
        TEvent, 
        /* import warning: ImportType.apply Failed type conversion: TEvent['type'] */ js.Any
      ]
    ],
    nodes: js.Array[xstateLib.esStateNodeMod.StateNode[_, _, OmniEventObject[EventObject]]]
  ): NodesAndEdges[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(edges = edges, nodes = nodes)
  
    __obj.asInstanceOf[NodesAndEdges[TContext, TEvent]]
  }
}

