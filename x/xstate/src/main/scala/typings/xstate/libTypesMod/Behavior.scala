package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behavior[TEvent /* <: EventObject */, TEmitted] extends StObject {
  
  var initialState: TEmitted
  
  var start: js.UndefOr[js.Function1[/* actorCtx */ ActorContext[TEvent, TEmitted], TEmitted]] = js.undefined
  
  def transition(state: TEmitted, event: TEvent, actorCtx: ActorContext[TEvent, TEmitted]): TEmitted
}
object Behavior {
  
  inline def apply[TEvent /* <: EventObject */, TEmitted](initialState: TEmitted, transition: (TEmitted, TEvent, ActorContext[TEvent, TEmitted]) => TEmitted): Behavior[TEvent, TEmitted] = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], transition = js.Any.fromFunction3(transition))
    __obj.asInstanceOf[Behavior[TEvent, TEmitted]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Behavior[?, ?], TEvent /* <: EventObject */, TEmitted] (val x: Self & (Behavior[TEvent, TEmitted])) extends AnyVal {
    
    inline def setInitialState(value: TEmitted): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setStart(value: /* actorCtx */ ActorContext[TEvent, TEmitted] => TEmitted): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTransition(value: (TEmitted, TEvent, ActorContext[TEvent, TEmitted]) => TEmitted): Self = StObject.set(x, "transition", js.Any.fromFunction3(value))
  }
}
