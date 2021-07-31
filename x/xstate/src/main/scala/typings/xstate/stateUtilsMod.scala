package typings.xstate

import typings.std.Iterable
import typings.std.Map
import typings.xstate.anon.Context
import typings.xstate.anon.ContextAny
import typings.xstate.mod.StateNode
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateUtilsMod {
  
  @JSImport("xstate/lib/stateUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAdjList[TC, TE /* <: EventObject */](configuration: Configuration[TC, TE]): AdjList[TC, TE] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjList")(configuration.asInstanceOf[js.Any]).asInstanceOf[AdjList[TC, TE]]
  
  @scala.inline
  def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, js.Any, TE, Context[TC]]): js.Array[StateNode[TC, js.Any, TE, Context[TC]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllStateNodes")(stateNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[StateNode[TC, js.Any, TE, Context[TC]]]]
  
  @scala.inline
  def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, js.Any, TE, Context[TC]]): js.Array[StateNode[TC, js.Any, TE, Context[TC]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(stateNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[StateNode[TC, js.Any, TE, Context[TC]]]]
  
  @scala.inline
  def getConfiguration[TC, TE /* <: EventObject */](
    prevStateNodes: Iterable[StateNode[TC, js.Any, TE, Context[TC]]],
    stateNodes: Iterable[StateNode[TC, js.Any, TE, Context[TC]]]
  ): Iterable[StateNode[TC, js.Any, TE, Context[TC]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(prevStateNodes.asInstanceOf[js.Any], stateNodes.asInstanceOf[js.Any])).asInstanceOf[Iterable[StateNode[TC, js.Any, TE, Context[TC]]]]
  
  @scala.inline
  def getValue[TC, TE /* <: EventObject */](rootNode: StateNode[TC, js.Any, TE, Context[TC]], configuration: Configuration[TC, TE]): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(rootNode.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  
  @scala.inline
  def has[T](iterable: Iterable[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(iterable.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isInFinalState[TC, TE /* <: EventObject */](
    configuration: js.Array[StateNode[TC, js.Any, TE, Context[TC]]],
    stateNode: StateNode[TC, js.Any, TE, Context[TC]]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInFinalState")(configuration.asInstanceOf[js.Any], stateNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isLeafNode(stateNode: StateNode[js.Any, js.Any, js.Any, ContextAny]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeafNode")(stateNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, js.Any, TE, Context[TC]]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextEvents")(configuration.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ]]
  
  type AdjList[TC, TE /* <: EventObject */] = Map[
    StateNode[TC, js.Any, TE, Context[TC]], 
    js.Array[StateNode[TC, js.Any, TE, Context[TC]]]
  ]
  
  type Configuration[TC, TE /* <: EventObject */] = Iterable[StateNode[TC, js.Any, TE, Context[TC]]]
}
