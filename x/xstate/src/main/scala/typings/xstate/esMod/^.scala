package typings.xstate.esMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.xstate.esActorMod.Actor
import typings.xstate.esInterpreterMod.SpawnOptions
import typings.xstate.esInterpreterMod.Spawnable
import typings.xstate.esMatchMod.StatePatternTuple
import typings.xstate.esMatchMod.ValueFromStateGetter
import typings.xstate.esTypesMod.AssignAction
import typings.xstate.esTypesMod.Assigner
import typings.xstate.esTypesMod.Event
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InterpreterOptions
import typings.xstate.esTypesMod.MachineConfig
import typings.xstate.esTypesMod.MachineOptions
import typings.xstate.esTypesMod.SendAction
import typings.xstate.esTypesMod.SendActionOptions
import typings.xstate.esTypesMod.SendExpr
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import typings.xstate.esTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](config: MachineConfig[TContext, TStateSchema, TEvent]): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]]
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def Machine[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    config: MachineConfig[TContext, TStateSchema, TEvent],
    options: Partial[MachineOptions[TContext, TEvent]],
    initialContext: TContext
  ): StateMachine[TContext, TStateSchema, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](
    assignment: Partial[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TContext ]: (context : TContext, event : TEvent): TContext[K] | TContext[K]}
    */ typings.xstate.xstateStrings.assign with js.Any
    ]
  ): AssignAction[TContext, TEvent] = js.native
  def assign[TContext, TEvent /* <: EventObject */](assignment: Assigner[TContext, TEvent]): AssignAction[TContext, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typings.xstate.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typings.xstate.esInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typings.xstate.esStateMod.State[TContext, TEvent],
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: StateValue,
    patterns: js.Array[StatePatternTuple[T, TContext, TEvent]],
    defaultValue: ValueFromStateGetter[T, TContext, TEvent]
  ): T = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue): Boolean = js.native
  def matchesState(parentStateId: StateValue, childStateId: StateValue, delimiter: String): Boolean = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def send[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def sendParent[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def spawn[TContext](entity: Spawnable[TContext]): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: String): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: SpawnOptions): Actor[TContext, EventObject] = js.native
}

