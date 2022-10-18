package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateMod.State
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment[TContext, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * Event from state.
    */
  var event: TEvent
  
  /**
    * From state.
    */
  var state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]
}
object Segment {
  
  inline def apply[TContext, TEvent /* <: EventObject */](event: TEvent, state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]): Segment[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment[TContext, TEvent]]
  }
  
  extension [Self <: Segment[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (Segment[TContext, TEvent])) {
    
    inline def setEvent(value: TEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setState(value: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
