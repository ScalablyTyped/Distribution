package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var entry: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
  
  var exit: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
}
object EntryExitEffectMap {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    entry: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]],
    exit: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]
  ): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryExitEffectMap[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (EntryExitEffectMap[TContext, TEvent])) extends AnyVal {
    
    inline def setEntry(value: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: (ActionObject[TContext, TEvent, TEvent, BaseActionObject])*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExit(value: js.Array[ActionObject[TContext, TEvent, TEvent, BaseActionObject]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitVarargs(value: (ActionObject[TContext, TEvent, TEvent, BaseActionObject])*): Self = StObject.set(x, "exit", js.Array(value*))
  }
}
