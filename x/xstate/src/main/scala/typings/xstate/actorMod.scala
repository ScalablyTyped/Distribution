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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actorMod {
  
  @JSImport("xstate/lib/Actor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createDeferredActor(entity: Spawnable, id: String): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  @scala.inline
  def createDeferredActor(entity: Spawnable, id: String, data: js.Any): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  
  @scala.inline
  def createInvocableActor[TC, TE /* <: EventObject */](
    invokeDefinition: InvokeDefinition[TC, TE],
    machine: StateMachine[TC, js.Any, TE, Context[TC]],
    context: TC,
    _event: Event[TE]
  ): Actor[js.Any, AnyEventObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvocableActor")(invokeDefinition.asInstanceOf[js.Any], machine.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[Actor[js.Any, AnyEventObject]]
  
  @scala.inline
  def createNullActor(id: String): Actor[js.Any, AnyEventObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullActor")(id.asInstanceOf[js.Any]).asInstanceOf[Actor[js.Any, AnyEventObject]]
  
  @scala.inline
  def isActor(item: js.Any): /* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActor")(item.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/Actor.Actor<any, xstate.xstate/lib/types.AnyEventObject> */ Boolean]
  
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */]
    extends StObject
       with Subscribable[TContext] {
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    
    def send(event: TEvent): js.Any = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var stop: js.UndefOr[js.Function0[js.UndefOr[js.Any]]] = js.native
    
    def toJSON(): Id = js.native
  }
}
