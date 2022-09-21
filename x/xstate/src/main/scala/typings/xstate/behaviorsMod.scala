package typings.xstate

import typings.xstate.typesMod.ActorContext
import typings.xstate.typesMod.ActorRef
import typings.xstate.typesMod.Behavior
import typings.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object behaviorsMod {
  
  @JSImport("xstate/lib/behaviors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPromise[T](promiseFn: js.Function0[js.Promise[T]]): Behavior[PromiseEvents[T], PromiseState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promiseFn.asInstanceOf[js.Any]).asInstanceOf[Behavior[PromiseEvents[T], PromiseState[T]]]
  
  inline def fromReducer[TState, TEvent /* <: EventObject */](
    transition: js.Function3[
      /* state */ TState, 
      /* event */ TEvent, 
      /* actorContext */ ActorContext[TEvent, TState], 
      TState
    ],
    initialState: TState
  ): Behavior[TEvent, TState] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromReducer")(transition.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[Behavior[TEvent, TState]]
  
  inline def spawnBehavior[TEvent /* <: EventObject */, TEmitted](behavior: Behavior[TEvent, TEmitted]): ActorRef[TEvent, TEmitted] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnBehavior")(behavior.asInstanceOf[js.Any]).asInstanceOf[ActorRef[TEvent, TEmitted]]
  inline def spawnBehavior[TEvent /* <: EventObject */, TEmitted](behavior: Behavior[TEvent, TEmitted], options: SpawnBehaviorOptions): ActorRef[TEvent, TEmitted] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnBehavior")(behavior.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ActorRef[TEvent, TEmitted]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.anon.Data[T]
    - typings.xstate.anon.Error
  */
  trait PromiseEvents[T] extends StObject
  object PromiseEvents {
    
    inline def Data[T](data: T): typings.xstate.anon.Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fulfill")
      __obj.asInstanceOf[typings.xstate.anon.Data[T]]
    }
    
    inline def Error(error: Any): typings.xstate.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reject")
      __obj.asInstanceOf[typings.xstate.anon.Error]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xstate.anon.Status
    - typings.xstate.anon.DataError[T]
    - typings.xstate.anon.ErrorStatus
  */
  trait PromiseState[T] extends StObject
  object PromiseState {
    
    inline def DataError[T](data: T, error: Unit): typings.xstate.anon.DataError[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "fulfilled")
      __obj.asInstanceOf[typings.xstate.anon.DataError[T]]
    }
    
    inline def ErrorStatus(data: Unit, error: Any): typings.xstate.anon.ErrorStatus = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.xstate.anon.ErrorStatus]
    }
    
    inline def Status(data: Unit, error: Unit): typings.xstate.anon.Status = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = "pending")
      __obj.asInstanceOf[typings.xstate.anon.Status]
    }
  }
  
  trait SpawnBehaviorOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[ActorRef[Any, Any]] = js.undefined
  }
  object SpawnBehaviorOptions {
    
    inline def apply(): SpawnBehaviorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpawnBehaviorOptions]
    }
    
    extension [Self <: SpawnBehaviorOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setParent(value: ActorRef[Any, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
