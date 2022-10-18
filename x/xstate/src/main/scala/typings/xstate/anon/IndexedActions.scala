package typings.xstate.anon

import typings.xstate.libTypegenTypesMod.GenerateServiceEvents
import typings.xstate.libTypegenTypesMod.MergeWithInternalEvents
import typings.xstate.libTypegenTypesMod.TypegenConstraint
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.IndexByType
import typings.xstate.libTypesMod.Prop
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.xstateStrings.internalEvents
import typings.xstate.xstateStrings.invokeSrcNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedActions[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */] extends StObject {
  
  var indexedActions: IndexByType[TAction]
  
  var indexedEvents: MergeWithInternalEvents[
    IndexByType[
      (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
    ], 
    Prop[TTypesMeta, internalEvents]
  ]
}
object IndexedActions {
  
  inline def apply[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
    indexedActions: IndexByType[TAction],
    indexedEvents: MergeWithInternalEvents[
      IndexByType[
        (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
      ], 
      Prop[TTypesMeta, internalEvents]
    ]
  ): IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta] = {
    val __obj = js.Dynamic.literal(indexedActions = indexedActions.asInstanceOf[js.Any], indexedEvents = indexedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta]]
  }
  
  extension [Self <: IndexedActions[?, ?, ?, ?], TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](x: Self & (IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta])) {
    
    inline def setIndexedActions(value: IndexByType[TAction]): Self = StObject.set(x, "indexedActions", value.asInstanceOf[js.Any])
    
    inline def setIndexedEvents(
      value: MergeWithInternalEvents[
          IndexByType[
            (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
          ], 
          Prop[TTypesMeta, internalEvents]
        ]
    ): Self = StObject.set(x, "indexedEvents", value.asInstanceOf[js.Any])
  }
}
