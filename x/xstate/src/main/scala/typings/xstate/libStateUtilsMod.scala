package typings.xstate

import typings.std.Iterable
import typings.std.Map
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
  def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, _]): js.Array[StateNode[TC, _, TE, _]] = js.native
  def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, _]): js.Array[StateNode[TC, _, TE, _]] = js.native
  def getConfiguration[TC, TE /* <: EventObject */](prevStateNodes: Iterable[StateNode[TC, _, TE, _]], stateNodes: Iterable[StateNode[TC, _, TE, _]]): Iterable[StateNode[TC, _, TE, _]] = js.native
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, _, TE, _], configuration: Configuration[TC, TE]): StateValue = js.native
  def has[T](iterable: Iterable[T], item: T): Boolean = js.native
  def isInFinalState[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, _]], stateNode: StateNode[TC, _, TE, _]): Boolean = js.native
  def isLeafNode(stateNode: StateNode[_, _, _, _]): Boolean = js.native
  def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, _]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = js.native
  type AdjList[TC, TE /* <: EventObject */] = Map[StateNode[TC, js.Any, TE, js.Any], js.Array[StateNode[TC, js.Any, TE, js.Any]]]
  type Configuration[TC, TE /* <: EventObject */] = Iterable[StateNode[TC, js.Any, TE, js.Any]]
}

