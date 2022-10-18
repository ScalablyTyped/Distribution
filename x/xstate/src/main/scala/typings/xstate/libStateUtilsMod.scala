package typings.xstate

import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.xstate.anon.ContextAny
import typings.xstate.anon.Value
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.StateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateUtilsMod {
  
  @JSImport("xstate/lib/stateUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdjList[TC, TE /* <: EventObject */](configuration: js.Iterable[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]): AdjList[TC, TE] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjList")(configuration.asInstanceOf[js.Any]).asInstanceOf[AdjList[TC, TE]]
  
  inline def getAllChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]): js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllChildren")(stateNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]]
  
  inline def getAllStateNodes[TC, TE /* <: EventObject */](stateNode: StateNode[TC, Any, TE, Any, Any, Any]): js.Array[StateNode[TC, Any, TE, Any, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllStateNodes")(stateNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[StateNode[TC, Any, TE, Any, Any, Any]]]
  
  inline def getChildren[TC, TE /* <: EventObject */](stateNode: StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]): js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(stateNode.asInstanceOf[js.Any]).asInstanceOf[js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]]
  
  inline def getConfiguration[TC, TE /* <: EventObject */](
    prevStateNodes: js.Iterable[StateNode[TC, Any, TE, Any, Any, Any]],
    stateNodes: js.Iterable[StateNode[TC, Any, TE, Any, Any, Any]]
  ): Set[StateNode[TC, Any, TE, Any, Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(prevStateNodes.asInstanceOf[js.Any], stateNodes.asInstanceOf[js.Any])).asInstanceOf[Set[StateNode[TC, Any, TE, Any, Any, Any]]]
  
  inline def getMeta(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeta")().asInstanceOf[Record[String, Any]]
  inline def getMeta(configuration: js.Array[StateNode[Any, Any, EventObject, ContextAny, ServiceMap, TypegenDisabled]]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeta")(configuration.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def getTagsFromConfiguration(configuration: js.Array[StateNode[Any, Any, Any, Any, ServiceMap, TypegenDisabled]]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagsFromConfiguration")(configuration.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  inline def getValue[TC, TE /* <: EventObject */](
    rootNode: StateNode[TC, Any, TE, Any, ServiceMap, TypegenDisabled],
    configuration: js.Iterable[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]
  ): StateValue = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(rootNode.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[StateValue]
  
  inline def has[T](iterable: js.Iterable[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(iterable.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInFinalState[TC, TE /* <: EventObject */](
    configuration: js.Array[StateNode[TC, Any, TE, Any, Any, Any]],
    stateNode: StateNode[TC, Any, TE, Any, Any, Any]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInFinalState")(configuration.asInstanceOf[js.Any], stateNode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLeafNode(stateNode: StateNode[Any, Any, Any, Any, Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeafNode")(stateNode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nextEvents[TC, TE /* <: EventObject */](configuration: js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextEvents")(configuration.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TE['type'] */ js.Any
  ]]
  
  type AdjList[TC, TE /* <: EventObject */] = Map[
    StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled], 
    js.Array[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]
  ]
  
  type Configuration[TC, TE /* <: EventObject */] = js.Iterable[StateNode[TC, Any, TE, Value[TC], ServiceMap, TypegenDisabled]]
}
