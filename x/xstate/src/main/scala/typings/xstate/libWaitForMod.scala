package typings.xstate

import typings.xstate.anon.PartialWaitForOptions
import typings.xstate.libTypesMod.ActorRef
import typings.xstate.libTypesMod.EmittedFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWaitForMod {
  
  @JSImport("xstate/lib/waitFor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitFor[TActorRef /* <: ActorRef[Any, Any] */](actorRef: TActorRef, predicate: js.Function1[/* emitted */ EmittedFrom[TActorRef], Boolean]): js.Promise[EmittedFrom[TActorRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(actorRef.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EmittedFrom[TActorRef]]]
  inline def waitFor[TActorRef /* <: ActorRef[Any, Any] */](
    actorRef: TActorRef,
    predicate: js.Function1[/* emitted */ EmittedFrom[TActorRef], Boolean],
    options: PartialWaitForOptions
  ): js.Promise[EmittedFrom[TActorRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(actorRef.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EmittedFrom[TActorRef]]]
  
  trait WaitForOptions extends StObject {
    
    /**
      * How long to wait before rejecting, if no emitted
      * state satisfies the predicate.
      *
      * @default 10_000 (10 seconds)
      */
    var timeout: Double
  }
  object WaitForOptions {
    
    inline def apply(timeout: Double): WaitForOptions = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitForOptions]
    }
    
    extension [Self <: WaitForOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
