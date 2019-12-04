package typings.xstate.libGraphMod

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.OmniEventObject
import typings.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "getNodes")
@js.native
object getNodes extends js.Object {
  def apply(node: StateNode[_, _, OmniEventObject[EventObject]]): js.Array[StateNode[_, _, OmniEventObject[EventObject]]] = js.native
}

