package typings.xstate

import typings.xstate.anon.Id
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/Actor", JSImport.Namespace)
@js.native
object actorMod extends js.Object {
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */] extends Subscribable[TContext] {
    var deferred: js.UndefOr[Boolean] = js.native
    var id: String = js.native
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    var state: js.UndefOr[js.Any] = js.native
    var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
    def send(event: TEvent): js.Any = js.native
    def toJSON(): Id = js.native
  }
  
  def createInvocableActor[TC, TE /* <: EventObject */](invokeDefinition: InvokeDefinition[TC, TE], machine: StateMachine[TC, _, TE, _]): Actor[_, AnyEventObject] = js.native
  def createNullActor(id: String): Actor[_, AnyEventObject] = js.native
  def isActor(item: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = js.native
}

