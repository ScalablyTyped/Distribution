package typings.xstate.libGraphMod

import typings.std.Partial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.ValueAdjacencyMap
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getValueAdjacencyMap")
@js.native
object getValueAdjacencyMap extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent]): ValueAdjacencyMap[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], options: Partial[ValueAdjMapOptions[TContext, TEvent]]): ValueAdjacencyMap[TContext, TEvent] = js.native
}

