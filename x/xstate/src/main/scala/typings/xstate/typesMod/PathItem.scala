package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathItem[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var path: js.Array[Segment[TContext, TEvent]]
  
  var state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  
  var weight: js.UndefOr[Double] = js.undefined
}
object PathItem {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    path: js.Array[Segment[TContext, TEvent]],
    state: State[TContext, TEvent, js.Any, ContextTContext[TContext]]
  ): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
  
  extension [Self <: PathItem[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (PathItem[TContext, TEvent])) {
    
    inline def setPath(value: js.Array[Segment[TContext, TEvent]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (Segment[TContext, TEvent])*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setState(value: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
