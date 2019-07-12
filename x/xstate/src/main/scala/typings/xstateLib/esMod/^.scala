package typings
package xstateLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent]): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]]
  ): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    config: xstateLib.esTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.assign with js.Any
    ]
  ): xstateLib.esTypesMod.AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](assignment: xstateLib.esTypesMod.Assigner[TContext, TEvent]): xstateLib.esTypesMod.AssignAction[TContext, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]
  ): xstateLib.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def mapState(stateMap: org.scalablytyped.runtime.StringDictionary[js.Any], stateId: java.lang.String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    state: xstateLib.esStateMod.State[TContext, TEvent],
    patterns: js.Array[xstateLib.esMatchMod.StatePatternTuple[T, TContext, TEvent]],
    defaultValue: xstateLib.esMatchMod.ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    state: xstateLib.esTypesMod.StateValue,
    patterns: js.Array[xstateLib.esMatchMod.StatePatternTuple[T, TContext, TEvent]],
    defaultValue: xstateLib.esMatchMod.ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchesState(parentStateId: xstateLib.esTypesMod.StateValue, childStateId: xstateLib.esTypesMod.StateValue): scala.Boolean = js.native
  def matchesState(
    parentStateId: xstateLib.esTypesMod.StateValue,
    childStateId: xstateLib.esTypesMod.StateValue,
    delimiter: java.lang.String
  ): scala.Boolean = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.Event[TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.Event[TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](event: xstateLib.esTypesMod.SendExpr[TContext, TEvent]): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    event: xstateLib.esTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.esTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.esTypesMod.SendAction[TContext, TEvent] = js.native
  def spawn[TContext](entity: xstateLib.esInterpreterMod.Spawnable[TContext]): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
  def spawn[TContext](entity: xstateLib.esInterpreterMod.Spawnable[TContext], nameOrOptions: java.lang.String): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
  def spawn[TContext](
    entity: xstateLib.esInterpreterMod.Spawnable[TContext],
    nameOrOptions: xstateLib.esInterpreterMod.SpawnOptions
  ): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
}

