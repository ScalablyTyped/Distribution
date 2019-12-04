package typings.xstate.libGraphMod

import typings.xstate.Anon_Depth
import typings.xstate.libTypesMod.Edge
import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getEdges")
@js.native
object getEdges extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent]): js.Array[Edge[TContext, TEvent, String]] = js.native
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], options: Anon_Depth): js.Array[Edge[TContext, TEvent, String]] = js.native
}

