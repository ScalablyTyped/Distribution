package typings.xstate.libGraphMod

import typings.xstate.libTypesMod.AdjacencyMap
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.OmniEventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "adjacencyMap")
@js.native
object adjacencyMap extends js.Object {
  def apply[TContext](node: StateNode[TContext, _, OmniEventObject[EventObject]]): AdjacencyMap = js.native
  def apply[TContext](node: StateNode[TContext, _, OmniEventObject[EventObject]], context: TContext): AdjacencyMap = js.native
}

