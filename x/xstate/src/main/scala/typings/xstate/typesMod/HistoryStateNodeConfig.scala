package typings.xstate.typesMod

import typings.xstate.xstateBooleans.`true`
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  
  @JSName("history")
  var history_HistoryStateNodeConfig: shallow | deep | `true` = js.native
  
  var target: js.UndefOr[StateValue] = js.native
}
object HistoryStateNodeConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](history: shallow | deep | `true`): HistoryStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStateNodeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class HistoryStateNodeConfigMutableBuilder[Self <: HistoryStateNodeConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (HistoryStateNodeConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setHistory(value: shallow | deep | `true`): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: StateValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
