package typings.xstate

import typings.xstate.typegenTypesMod.ResolveTypegenMeta
import typings.xstate.typegenTypesMod.TypegenConstraint
import typings.xstate.typegenTypesMod.TypegenDisabled
import typings.xstate.typesMod.BaseActionObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InternalMachineOptions
import typings.xstate.typesMod.MachineConfig
import typings.xstate.typesMod.Prop
import typings.xstate.typesMod.ServiceMap
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.Typestate
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineMod {
  
  @JSImport("xstate/lib/Machine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled]): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: Unit,
    initialContext: TContext
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ],
    initialContext: TContext
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled]
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: Unit,
    initialContext: TContext
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  inline def Machine_TContextTStateSchemaTEvent[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent, BaseActionObject, ServiceMap, TypegenDisabled],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
      `false`, 
      Prop[
        Prop[
          ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap], 
          resolved
        ], 
        missingImplementations
      ]
    ],
    initialContext: TContext
  ): StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    TStateSchema, 
    TEvent, 
    Any, 
    BaseActionObject, 
    ServiceMap, 
    ResolveTypegenMeta[TypegenDisabled, TEvent, BaseActionObject, ServiceMap]
  ]]
  
  inline def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](config: MachineConfig[TContext, Any, TEvent, BaseActionObject, TServiceMap, TTypesMeta]): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ]]
  inline def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
    config: MachineConfig[TContext, Any, TEvent, BaseActionObject, TServiceMap, TTypesMeta],
    options: InternalMachineOptions[
      TContext, 
      TEvent, 
      ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap], 
      `false`, 
      Prop[
        Prop[ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap], resolved], 
        missingImplementations
      ]
    ]
  ): StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[
    TContext, 
    Any, 
    TEvent, 
    TTypestate, 
    BaseActionObject, 
    TServiceMap, 
    ResolveTypegenMeta[TTypesMeta, TEvent, BaseActionObject, TServiceMap]
  ]]
}
