package typings.xstate.anon

import typings.xstate.typegenTypesMod.GenerateServiceEvents
import typings.xstate.typegenTypesMod.MergeWithInternalEvents
import typings.xstate.typegenTypesMod.TypegenConstraint
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.IndexByType
import typings.xstate.typesMod.Prop
import typings.xstate.typesMod.ServiceMap
import typings.xstate.xstateStrings.internalEvents
import typings.xstate.xstateStrings.invokeSrcNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedActions[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */] extends StObject {
  
  var indexedActions: IndexByType[TAction]
  
  var indexedEvents: MergeWithInternalEvents[
    IndexByType[
      TEvent | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
    ], 
    Prop[TTypesMeta, internalEvents]
  ]
}
object IndexedActions {
  
  inline def apply[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
    indexedActions: IndexByType[TAction],
    indexedEvents: MergeWithInternalEvents[
      IndexByType[
        TEvent | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
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
            TEvent | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
          ], 
          Prop[TTypesMeta, internalEvents]
        ]
    ): Self = StObject.set(x, "indexedEvents", value.asInstanceOf[js.Any])
  }
}
