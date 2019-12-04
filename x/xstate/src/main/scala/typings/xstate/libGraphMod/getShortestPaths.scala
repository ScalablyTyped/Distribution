package typings.xstate.libGraphMod

import typings.std.Partial
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.PathMap
import typings.xstate.libTypesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getShortestPaths")
@js.native
object getShortestPaths extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent]): PathMap[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](machine: StateMachine[TContext, _, TEvent], options: Partial[ValueAdjMapOptions[TContext, TEvent]]): PathMap[TContext, TEvent] = js.native
}

