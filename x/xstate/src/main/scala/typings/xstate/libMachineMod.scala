package typings.xstate

import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenConstraint
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InternalMachineOptions
import typings.xstate.libTypesMod.MachineConfig
import typings.xstate.libTypesMod.Prop
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.Typestate
import typings.xstate.xstateBooleans.`false`
import typings.xstate.xstateStrings.missingImplementations
import typings.xstate.xstateStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineMod {
  
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
