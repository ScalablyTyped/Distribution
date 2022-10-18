package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateMod.State
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathsItem[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var paths: js.Array[js.Array[Segment[TContext, TEvent]]]
  
  var state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]
}
object PathsItem {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    paths: js.Array[js.Array[Segment[TContext, TEvent]]],
    state: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]
  ): PathsItem[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathsItem[TContext, TEvent]]
  }
  
  extension [Self <: PathsItem[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (PathsItem[TContext, TEvent])) {
    
    inline def setPaths(value: js.Array[js.Array[Segment[TContext, TEvent]]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: (js.Array[Segment[TContext, TEvent]])*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setState(value: State[TContext, TEvent, Any, Context[TContext], TypegenDisabled]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
