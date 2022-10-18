package typings.xstate

import typings.std.Omit
import typings.xstate.anon.Id
import typings.xstate.libTypegenTypesMod.ResolveTypegenMeta
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import typings.xstate.libTypesMod.ActorRef
import typings.xstate.libTypesMod.BaseActionObject
import typings.xstate.libTypesMod.BaseActorRef
import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.InvokeDefinition
import typings.xstate.libTypesMod.NoInfer
import typings.xstate.libTypesMod.SCXML.Event
import typings.xstate.libTypesMod.ServiceMap
import typings.xstate.libTypesMod.Spawnable
import typings.xstate.libTypesMod.StateMachine
import typings.xstate.libTypesMod.Subscribable
import typings.xstate.xstateStrings.getSnapshot
import typings.xstate.xstateStrings.id
import typings.xstate.xstateStrings.send
import typings.xstate.xstateStrings.stop
import typings.xstate.xstateStrings.subscribe
import typings.xstate.xstateStrings.toJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActorMod {
  
  @JSImport("xstate/lib/Actor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDeferredActor(entity: Spawnable, id: String): ActorRef[Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Unit]]
  inline def createDeferredActor(entity: Spawnable, id: String, data: Any): ActorRef[Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredActor")(entity.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Unit]]
  
  inline def createInvocableActor[TC, TE /* <: EventObject */](
    invokeDefinition: InvokeDefinition[TC, TE],
    machine: StateMachine[
      TC, 
      Any, 
      TE, 
      Any, 
      BaseActionObject, 
      ServiceMap, 
      ResolveTypegenMeta[TypegenDisabled, NoInfer[TE], BaseActionObject, ServiceMap]
    ],
    context: TC,
    _event: Event[TE]
  ): ActorRef[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvocableActor")(invokeDefinition.asInstanceOf[js.Any], machine.asInstanceOf[js.Any], context.asInstanceOf[js.Any], _event.asInstanceOf[js.Any])).asInstanceOf[ActorRef[Any, Any]]
  
  inline def createNullActor(id: String): ActorRef[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullActor")(id.asInstanceOf[js.Any]).asInstanceOf[ActorRef[Any, Any]]
  
  inline def isActor(item: Any): /* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActor")(item.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean]
  
  inline def isSpawnedActor(item: Any): /* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpawnedActor")(item.asInstanceOf[js.Any]).asInstanceOf[/* is xstate.xstate/lib/types.ActorRef<any, any> */ Boolean]
  
  inline def toActorRef[TEvent /* <: EventObject */, TEmitted, TActorRefLike /* <: BaseActorRef[TEvent] */](actorRefLike: TActorRefLike): (ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("toActorRef")(actorRefLike.asInstanceOf[js.Any]).asInstanceOf[(ActorRef[TEvent, TEmitted]) & (Omit[
    TActorRefLike, 
    /* keyof xstate.xstate/lib/types.ActorRef<any, any> */ send | id | getSnapshot | stop | toJSON | subscribe
  ])]
  
  @js.native
  trait Actor[TContext, TEvent /* <: EventObject */]
    extends StObject
       with Subscribable[TContext] {
    
    var deferred: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var meta: js.UndefOr[InvokeDefinition[TContext, TEvent]] = js.native
    
    def send(event: TEvent): Any = js.native
    
    var state: js.UndefOr[Any] = js.native
    
    var stop: js.UndefOr[js.Function0[js.UndefOr[Any]]] = js.native
    
    def toJSON(): Id = js.native
  }
}
