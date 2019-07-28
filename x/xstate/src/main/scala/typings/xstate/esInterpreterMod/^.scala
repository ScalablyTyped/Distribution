package typings.xstate.esInterpreterMod

import typings.std.Partial
import typings.xstate.esActorMod.Actor
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InterpreterOptions
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def spawn[TContext](entity: Spawnable[TContext]): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: String): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: SpawnOptions): Actor[TContext, EventObject] = js.native
}

