package typings.xstate

import typings.std.Iterable
import typings.std.Map
import typings.xstate.anon.Context
import typings.xstate.anon.ContextAny
import typings.xstate.mod.StateNode
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/stateUtils", JSImport.Namespace)
@js.native
object stateUtilsMod extends js.Object {
  
  def getAdjList[TC, TE /* <: EventObject */](configuration: Configuration[TC, TE]): AdjList[TC, TE] = js.native
  
  def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, Context[TC]]): js.Array[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, _, TE, Context[TC]]): js.Array[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  def getConfiguration[TC, TE /* <: EventObject */](
    prevStateNodes: Iterable[StateNode[TC, _, TE, Context[TC]]],
    stateNodes: Iterable[StateNode[TC, _, TE, Context[TC]]]
  ): Iterable[StateNode[TC, _, TE, Context[TC]]] = js.native
  
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, _, TE, Context[TC]], configuration: Configuration[TC, TE]): StateValue = js.native
  
  def has[T](iterable: Iterable[T], item: T): Boolean = js.native
  
  def isInFinalState[TC, TE /* <: EventObject */](
    configuration: js.Array[StateNode[TC, _, TE, Context[TC]]],
    stateNode: StateNode[TC, _, TE, Context[TC]]
  ): Boolean = js.native
  
  def isLeafNode(stateNode: StateNode[_, _, _, ContextAny]): Boolean = js.native
  
  def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, _, TE, Context[TC]]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = js.native
  
  type AdjList[TC, TE /* <: EventObject */] = Map[
    StateNode[TC, js.Any, TE, Context[TC]], 
    js.Array[StateNode[TC, js.Any, TE, Context[TC]]]
  ]
  
  type Configuration[TC, TE /* <: EventObject */] = Iterable[StateNode[TC, js.Any, TE, Context[TC]]]
}
