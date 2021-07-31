package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var entry: js.Array[ActionObject[TContext, TEvent]]
  
  var exit: js.Array[ActionObject[TContext, TEvent]]
}
object EntryExitEffectMap {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](entry: js.Array[ActionObject[TContext, TEvent]], exit: js.Array[ActionObject[TContext, TEvent]]): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class EntryExitEffectMapMutableBuilder[Self <: EntryExitEffectMap[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (EntryExitEffectMap[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "exit", js.Array(value :_*))
  }
}
