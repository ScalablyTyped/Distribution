package typings.xstate

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/Actor", JSImport.Namespace)
@js.native
object libActorMod extends js.Object {
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */] extends Subscribable[TContext] {
    var id: String = js.native
    var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
    def send(event: TEvent): js.Any = js.native
    def toJSON(): Anon_Id = js.native
  }
  
  def isActor(item: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.EventObject> */ Boolean = js.native
}

