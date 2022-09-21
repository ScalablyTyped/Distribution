package typings.xstate

import org.scalablytyped.runtime.TopLevel
import typings.xstate.anon.Context
import typings.xstate.typegenTypesMod.ResolveTypegenMeta
import typings.xstate.typegenTypesMod.TypegenConstraint
import typings.xstate.typesMod.AnyFunction
import typings.xstate.typesMod.AssignAction
import typings.xstate.typesMod.Assigner
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InternalMachineOptions
import typings.xstate.typesMod.MachineConfig
import typings.xstate.typesMod.Prop
import typings.xstate.typesMod.PropertyAssigner
import typings.xstate.typesMod.ServiceMap
import typings.xstate.typesMod.StateMachine
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.actions
import typings.xstate.xstateStrings.events
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.xstateStrings.`An action creator must return an object`
    - Self
    - typings.xstate.xstateStrings.`An action creator canApostrophet return an object with a type property`
  */
  type ActionCreator[Self /* <: AnyFunction */, Return] = (_ActionCreator[Self, Return]) | Self
  
  type ActionCreators[Self] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? xstate.xstate/lib/model.types.ActionCreator<Self[K], std.ReturnType<Self[K]>> : 'An action creator must be a function'}
    */ typings.xstate.xstateStrings.ActionCreators & TopLevel[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.xstateStrings.`An event creator must return an object`
    - Self
    - typings.xstate.xstateStrings.`An event creator canApostrophet return an object with a type property`
  */
  type EventCreator[Self /* <: AnyFunction */, Return] = (_EventCreator[Self, Return]) | Self
  
  type EventCreators[Self] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? xstate.xstate/lib/model.types.EventCreator<Self[K], std.ReturnType<Self[K]>> : 'An event creator must be a function'}
    */ typings.xstate.xstateStrings.EventCreators & TopLevel[Any]
  
  type FinalActionCreators[Self] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? (args : std.Parameters<Self[K]>): xstate.xstate/lib/types.Compute<std.ReturnType<Self[K]> & {  type :K}> : never}
    */ typings.xstate.xstateStrings.FinalActionCreators & TopLevel[Any]
  
  type FinalEventCreators[Self] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? (args : std.Parameters<Self[K]>): xstate.xstate/lib/types.Compute<std.ReturnType<Self[K]> & {  type :K}> : never}
    */ typings.xstate.xstateStrings.FinalEventCreators & TopLevel[Any]
  
  trait FinalModelCreators[Self] extends StObject {
    
    var actions: FinalActionCreators[Prop[Self, typings.xstate.xstateStrings.actions]]
    
    var events: FinalEventCreators[Prop[Self, typings.xstate.xstateStrings.events]]
  }
  object FinalModelCreators {
    
    inline def apply[Self](actions: FinalActionCreators[Prop[Self, actions]], events: FinalEventCreators[Prop[Self, events]]): FinalModelCreators[Self] = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalModelCreators[Self]]
    }
    
    extension [Self_ <: FinalModelCreators[?], Self](x: Self_ & FinalModelCreators[Self]) {
      
      inline def setActions(value: FinalActionCreators[Prop[Self, actions]]): Self_ = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: FinalEventCreators[Prop[Self, events]]): Self_ = StObject.set(x, "events", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Model[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TModelCreators] extends StObject {
    
    var actions: Prop[TModelCreators, typings.xstate.xstateStrings.actions] = js.native
    
    def assign[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](assigner: Assigner[TContext, SimplisticExtractEvent[TEvent, TEventType]]): AssignAction[TContext, SimplisticExtractEvent[TEvent, TEventType]] = js.native
    def assign[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](assigner: Assigner[TContext, SimplisticExtractEvent[TEvent, TEventType]], eventType: TEventType): AssignAction[TContext, SimplisticExtractEvent[TEvent, TEventType]] = js.native
    def assign[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](assigner: PropertyAssigner[TContext, SimplisticExtractEvent[TEvent, TEventType]]): AssignAction[TContext, SimplisticExtractEvent[TEvent, TEventType]] = js.native
    def assign[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](
      assigner: PropertyAssigner[TContext, SimplisticExtractEvent[TEvent, TEventType]],
      eventType: TEventType
    ): AssignAction[TContext, SimplisticExtractEvent[TEvent, TEventType]] = js.native
    
    def createMachine[TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](config: MachineConfig[TContext, Any, TEvent, TAction, TServiceMap, TTypesMeta]): StateMachine[
        TContext, 
        Any, 
        TEvent, 
        Context[TContext], 
        TAction, 
        TServiceMap, 
        ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap]
      ] = js.native
    def createMachine[TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
      config: MachineConfig[TContext, Any, TEvent, TAction, TServiceMap, TTypesMeta],
      implementations: InternalMachineOptions[
          TContext, 
          TEvent, 
          ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], 
          `false`, 
          Prop[
            Prop[ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap], resolved], 
            missingImplementations
          ]
        ]
    ): StateMachine[
        TContext, 
        Any, 
        TEvent, 
        Context[TContext], 
        TAction, 
        TServiceMap, 
        ResolveTypegenMeta[TTypesMeta, TEvent, TAction, TServiceMap]
      ] = js.native
    
    var events: Prop[TModelCreators, typings.xstate.xstateStrings.events] = js.native
    
    var initialContext: TContext = js.native
    
    def reset(): AssignAction[TContext, Any] = js.native
  }
  
  type ModelActionsFrom[TModel /* <: Model[Any, Any, Any, Any] */] = Any
  
  type ModelContextFrom[TModel /* <: Model[Any, Any, Any, Any] */] = Any
  
  trait ModelCreators[Self] extends StObject {
    
    var actions: js.UndefOr[ActionCreators[Prop[Self, typings.xstate.xstateStrings.actions]]] = js.undefined
    
    var events: js.UndefOr[EventCreators[Prop[Self, typings.xstate.xstateStrings.events]]] = js.undefined
  }
  object ModelCreators {
    
    inline def apply[Self](): ModelCreators[Self] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelCreators[Self]]
    }
    
    extension [Self_ <: ModelCreators[?], Self](x: Self_ & ModelCreators[Self]) {
      
      inline def setActions(value: ActionCreators[Prop[Self, actions]]): Self_ = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self_ = StObject.set(x, "actions", js.undefined)
      
      inline def setEvents(value: EventCreators[Prop[Self, events]]): Self_ = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self_ = StObject.set(x, "events", js.undefined)
    }
  }
  
  type ModelEventsFrom[TModel /* <: js.UndefOr[Model[Any, Any, Any, Any]] */] = EventObject
  
  type SimplisticExtractEvent[TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] = TEvent
  
  type UnionFromCreatorsReturnTypes[TCreators] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TCreators ]: TCreators[K] extends xstate.xstate/lib/types.AnyFunction? std.ReturnType<TCreators[K]> : never}[keyof TCreators] */ js.Any
  
  trait _ActionCreator[Self /* <: AnyFunction */, Return] extends StObject
  
  trait _EventCreator[Self /* <: AnyFunction */, Return] extends StObject
}
