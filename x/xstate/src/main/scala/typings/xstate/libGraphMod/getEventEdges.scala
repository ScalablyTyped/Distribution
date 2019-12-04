package typings.xstate.libGraphMod

import typings.xstate.libTypesMod.Edge
import typings.xstate.libTypesMod.EventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getEventEdges")
@js.native
object getEventEdges extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](node: StateNode[TContext, _, TEvent], event: String): js.Array[Edge[TContext, TEvent, String]] = js.native
}

