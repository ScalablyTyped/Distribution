package typings.xstate

import typings.std.Partial
import typings.xstate.anon.ContextValue
import typings.xstate.anon.Value
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.MachineConfig
import typings.xstate.typesMod.MachineOptions
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.StateSchema
import typings.xstate.typesMod.Typestate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineMod {
  
  @JSImport("xstate/lib/Machine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, js.Any, TEvent]): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](config: MachineConfig[TContext, js.Any, TEvent], options: Unit, initialContext: TContext): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  @scala.inline
  def Machine[TContext, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, js.Any, TEvent, Value[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, Value[TContext]]]
  
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent], options: Unit, initialContext: TContext): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  @scala.inline
  def Machine_TContextTStateSchema_StateSchemaAnyTEvent_EventObject[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Machine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initialContext.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, TStateSchema, TEvent, ContextValue[TContext]]]
  
  @scala.inline
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](config: MachineConfig[TContext, js.Any, TEvent]): StateMachine[TContext, js.Any, TEvent, TTypestate] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine[TContext, js.Any, TEvent, TTypestate]]
  @scala.inline
  def createMachine[TContext, TEvent /* <: EventObject */, TTypestate /* <: Typestate[TContext] */](
    config: MachineConfig[TContext, js.Any, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, js.Any, TEvent, TTypestate] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMachine")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StateMachine[TContext, js.Any, TEvent, TTypestate]]
}
