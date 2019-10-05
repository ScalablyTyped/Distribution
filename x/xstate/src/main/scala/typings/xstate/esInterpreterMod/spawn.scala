package typings.xstate.esInterpreterMod

import typings.xstate.esActorMod.Actor
import typings.xstate.esTypesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", "spawn")
@js.native
object spawn extends js.Object {
  def apply[TContext](entity: Spawnable[TContext]): Actor[TContext, EventObject] = js.native
  def apply[TContext](entity: Spawnable[TContext], nameOrOptions: String): Actor[TContext, EventObject] = js.native
  def apply[TContext](entity: Spawnable[TContext], nameOrOptions: SpawnOptions): Actor[TContext, EventObject] = js.native
}

