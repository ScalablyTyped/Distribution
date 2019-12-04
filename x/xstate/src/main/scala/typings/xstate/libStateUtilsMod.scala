package typings.xstate

import typings.std.Iterable
import typings.std.Map
import typings.xstate.libStateUtilsMod.AdjList
import typings.xstate.libStateUtilsMod.Configuration
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateValue
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/stateUtils", JSImport.Namespace)
@js.native
object libStateUtilsMod extends js.Object {
  def getAdjList[TC, TE /* <: EventObject */](configuration: Configuration[TC, TE]): AdjList[TC, TE] = js.native
  def getConfiguration[TC, TE /* <: EventObject */](prevStateNodes: Iterable[StateNode[TC, _, TE]], stateNodes: Iterable[StateNode[TC, _, TE]]): Iterable[StateNode[TC, _, TE]] = js.native
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, _, TE], configuration: Configuration[TC, TE]): StateValue = js.native
  type AdjList[TC, TE /* <: EventObject */] = Map[StateNode[TC, js.Any, TE], js.Array[StateNode[TC, js.Any, TE]]]
  type Configuration[TC, TE /* <: EventObject */] = Iterable[StateNode[TC, js.Any, TE]]
}

