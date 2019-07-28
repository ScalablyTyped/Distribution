package typings.xstate.xstateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.xstate.libActorMod.Actor
import typings.xstate.libInterpreterMod.SpawnOptions
import typings.xstate.libInterpreterMod.Spawnable
import typings.xstate.libMatchMod.StatePatternTuple
import typings.xstate.libMatchMod.ValueFromStateGetter
import typings.xstate.libTypesMod.AssignAction
import typings.xstate.libTypesMod.Assigner
import typings.xstate.libTypesMod.Event
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.MachineConfig
import typings.xstate.libTypesMod.MachineOptions
import typings.xstate.libTypesMod.SendAction
import typings.xstate.libTypesMod.SendActionOptions
import typings.xstate.libTypesMod.SendExpr
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import typings.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", JSImport.Namespace)
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
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): typings.xstate.libInterpreterMod.Interpreter[TContext, TStateSchema, TEvent] = js.native
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = js.native
  def matchState[T, TContext, TEvent /* <: EventObject */](
    state: typings.xstate.libStateMod.State[TContext, TEvent],
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

