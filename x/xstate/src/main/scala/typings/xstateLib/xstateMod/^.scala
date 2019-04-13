package typings
package xstateLib.xstateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent]): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.MachineOptions[TContext, TEvent]]
  ): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    config: xstateLib.libTypesMod.MachineConfig[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    assignment: stdLib.Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ xstateLib.xstateLibStrings.assign with js.Any
    ]
  ): xstateLib.libTypesMod.AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](assignment: xstateLib.libTypesMod.Assigner[TContext, TEvent]): xstateLib.libTypesMod.AssignAction[TContext, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent]): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.libTypesMod.StateSchema */, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    machine: xstateLib.libTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.libTypesMod.InterpreterOptions]
  ): xstateLib.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def mapState(stateMap: org.scalablytyped.runtime.StringDictionary[js.Any], stateId: java.lang.String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    state: xstateLib.libStateMod.State[TContext, TEvent],
    patterns: js.Array[xstateLib.libMatchMod.StatePatternTuple[T, TContext, TEvent]],
    defaultValue: xstateLib.libMatchMod.ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    state: xstateLib.libTypesMod.StateValue,
    patterns: js.Array[xstateLib.libMatchMod.StatePatternTuple[T, TContext, TEvent]],
    defaultValue: xstateLib.libMatchMod.ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchesState(parentStateId: xstateLib.libTypesMod.StateValue, childStateId: xstateLib.libTypesMod.StateValue): scala.Boolean = js.native
  def matchesState(
    parentStateId: xstateLib.libTypesMod.StateValue,
    childStateId: xstateLib.libTypesMod.StateValue,
    delimiter: java.lang.String
  ): scala.Boolean = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.Event[TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.Event[TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](event: xstateLib.libTypesMod.SendExpr[TContext, TEvent]): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */](
    event: xstateLib.libTypesMod.SendExpr[TContext, TEvent],
    options: xstateLib.libTypesMod.SendActionOptions[TContext, TEvent]
  ): xstateLib.libTypesMod.SendAction[TContext, TEvent] = js.native
}

