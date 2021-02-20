package typings.xstate

import typings.xstate.anon.Context
import typings.xstate.anon.Id
import typings.xstate.typesMod.AnyEventObject
import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.typesMod.SCXML.Event
import typings.xstate.typesMod.Spawnable
import typings.xstate.typesMod.StateMachine
import typings.xstate.typesMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actorMod {
  
  @JSImport("xstate/lib/Actor", "createDeferredActor")
  @js.native
  def createDeferredActor(entity: Spawnable, id: String): Actor[_, AnyEventObject] = js.native
  @JSImport("xstate/lib/Actor", "createDeferredActor")
  @js.native
  def createDeferredActor(entity: Spawnable, id: String, data: js.Any): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "createInvocableActor")
  @js.native
  def createInvocableActor[TC, TE /* <: EventObject */](
    invokeDefinition: InvokeDefinition[TC, TE],
    machine: StateMachine[TC, _, TE, Context[TC]],
    context: TC,
    _event: Event[TE]
  ): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "createNullActor")
  @js.native
  def createNullActor(id: String): Actor[_, AnyEventObject] = js.native
  
  @JSImport("xstate/lib/Actor", "isActor")
  @js.native
  def isActor(item: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = js.native
  
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */] extends Subscribable[TContext] {
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    
    def send(event: TEvent): js.Any = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
    
    def toJSON(): Id = js.native
  }
}
