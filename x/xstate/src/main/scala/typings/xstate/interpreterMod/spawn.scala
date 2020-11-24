package typings.xstate.interpreterMod

import typings.xstate.actorMod.Actor
import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateMachine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(entity: Spawnable): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: String): Actor[_, AnyEventObject] = js.native
  def apply(entity: Spawnable, nameOrOptions: SpawnOptions): Actor[_, AnyEventObject] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Context[TC]]): Actor[State[TC, TE, _, Context[TC]], TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Context[TC]], nameOrOptions: String): Actor[State[TC, TE, _, Context[TC]], TE] = js.native
  def apply[TC, TE /* <: EventObject */](entity: StateMachine[TC, _, TE, Context[TC]], nameOrOptions: SpawnOptions): Actor[State[TC, TE, _, Context[TC]], TE] = js.native
}
