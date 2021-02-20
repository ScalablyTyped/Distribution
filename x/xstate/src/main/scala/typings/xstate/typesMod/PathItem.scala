package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathItem[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var path: js.Array[Segment[TContext, TEvent]] = js.native
  
  var state: State[TContext, TEvent, _, ContextTContext[TContext]] = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object PathItem {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    path: js.Array[Segment[TContext, TEvent]],
    state: State[TContext, TEvent, _, ContextTContext[TContext]]
  ): PathItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathItem[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class PathItemMutableBuilder[Self <: PathItem[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (PathItem[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[Segment[TContext, TEvent]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (Segment[TContext, TEvent])*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setState(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
