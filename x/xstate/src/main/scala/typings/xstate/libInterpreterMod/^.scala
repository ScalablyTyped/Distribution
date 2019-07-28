package typings.xstate.libInterpreterMod

import typings.std.Partial
import typings.xstate.libActorMod.Actor
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InterpreterOptions
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](machine: StateMachine[TContext, TStateSchema, TEvent], options: Partial[InterpreterOptions]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def spawn[TContext](entity: Spawnable[TContext]): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: String): Actor[TContext, EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], nameOrOptions: SpawnOptions): Actor[TContext, EventObject] = js.native
}

