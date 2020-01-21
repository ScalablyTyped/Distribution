package typings.xstate.interpreterMod

import typings.xstate.actorMod.Actor
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  def apply(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _]): Interpreter[TC, _, TE, _] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: String): Interpreter[TC, _, TE, _] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, _], nameOrOptions: SpawnOptions): Interpreter[TC, _, TE, _] = js.native
}

