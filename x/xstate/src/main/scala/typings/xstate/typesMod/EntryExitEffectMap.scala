package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var entry: js.Array[ActionObject[TContext, TEvent]]
  
  var exit: js.Array[ActionObject[TContext, TEvent]]
}
object EntryExitEffectMap {
  
  inline def apply[TContext, TEvent /* <: EventObject */](entry: js.Array[ActionObject[TContext, TEvent]], exit: js.Array[ActionObject[TContext, TEvent]]): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
  
  extension [Self <: EntryExitEffectMap[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (EntryExitEffectMap[TContext, TEvent])) {
    
    inline def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "exit", js.Array(value*))
  }
}
