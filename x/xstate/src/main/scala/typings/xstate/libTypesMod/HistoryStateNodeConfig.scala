package typings.xstate.libTypesMod

import typings.xstate.xstateBooleans.`true`
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StObject
     with AtomicStateNodeConfig[TContext, TEvent] {
  
  @JSName("history")
  var history_HistoryStateNodeConfig: shallow | deep | `true`
  
  var target: js.UndefOr[StateValue] = js.undefined
}
object HistoryStateNodeConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](history: shallow | deep | `true`, initial: Unit, onDone: Unit, states: Unit): HistoryStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], onDone = onDone.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStateNodeConfig[TContext, TEvent]]
  }
  
  extension [Self <: HistoryStateNodeConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (HistoryStateNodeConfig[TContext, TEvent])) {
    
    inline def setHistory(value: shallow | deep | `true`): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: StateValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
