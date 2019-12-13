package typings.xstate.libInterpreterMod

import typings.xstate.libActorMod.Actor
import typings.xstate.libTypesMod.AnyEventObject
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Spawnable
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.Typestate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  def apply(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]]): Interpreter[TC, _, TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]], nameOrOptions: String): Interpreter[TC, _, TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Typestate[TC]], nameOrOptions: SpawnOptions): Interpreter[TC, _, TE] = js.native
}

