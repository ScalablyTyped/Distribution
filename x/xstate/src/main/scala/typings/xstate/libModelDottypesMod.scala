package typings.xstate

import typings.xstate.anon.Context
import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenConstraint
import typings.xstate.libTypesMod.AnyFunction
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InternalMachineOptions
import typings.xstate.libTypesMod.MachineConfig
import typings.xstate.libTypesMod.Prop
import typings.xstate.libTypesMod.PropertyAssigner
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.actions
import typings.xstate.xstateStrings.events
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelDottypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Return extends object ? Return extends {  type :any} ? 'An action creator can't return an object with a type property' : Self : 'An action creator must return an object'
    }}}
    */
  @js.native
  trait ActionCreator[Self /* <: AnyFunction */, Return] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? xstate.xstate/lib/model.types.ActionCreator<Self[K], std.ReturnType<Self[K]>> : 'An action creator must be a function'}
    }}}
    */
  @js.native
  trait ActionCreators[Self] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Return extends object ? Return extends {  type :any} ? 'An event creator can't return an object with a type property' : Self : 'An event creator must return an object'
    }}}
    */
  @js.native
  trait EventCreator[Self /* <: AnyFunction */, Return] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? xstate.xstate/lib/model.types.EventCreator<Self[K], std.ReturnType<Self[K]>> : 'An event creator must be a function'}
    }}}
    */
  @js.native
  trait EventCreators[Self] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? (args : std.Parameters<Self[K]>): xstate.xstate/lib/types.Compute<std.ReturnType<Self[K]> & {  type :K}> : never}
    }}}
    */
  @js.native
  trait FinalActionCreators[Self] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof Self ]: Self[K] extends xstate.xstate/lib/types.AnyFunction? (args : std.Parameters<Self[K]>): xstate.xstate/lib/types.Compute<std.ReturnType<Self[K]> & {  type :K}> : never}
    }}}
    */
  @js.native
  trait FinalEventCreators[Self] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TModel extends xstate.xstate/lib/model.types.Model<any, any, infer TAction, any> ? TAction : never
    }}}
    */
  @js.native
  trait ModelActionsFrom[TModel /* <: Model[Any, Any, Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TModel extends xstate.xstate/lib/model.types.Model<infer TContext, any, any, any> ? TContext : never
    }}}
    */
  @js.native
  trait ModelContextFrom[TModel /* <: Model[Any, Any, Any, Any] */] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TModel extends xstate.xstate/lib/model.types.Model<any, infer TEvent, any, any> ? TEvent : xstate.xstate/lib/types.EventObject
    }}}
    */
  @js.native
  trait ModelEventsFrom[TModel /* <: js.UndefOr[Model[Any, Any, Any, Any]] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TEvent extends {  type :TEventType} ? TEvent : never
    }}}
    */
  @js.native
  trait SimplisticExtractEvent[TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends StObject
  
  type UnionFromCreatorsReturnTypes[TCreators] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TCreators ]: TCreators[K] extends xstate.xstate/lib/types.AnyFunction? std.ReturnType<TCreators[K]> : never}[keyof TCreators] */ js.Any
}
