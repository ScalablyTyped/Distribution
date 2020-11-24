package typings.xstate.typesMod

import typings.xstate.xstateBooleans.`true`
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.shallow
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
  implicit class HistoryStateNodeConfigOps[Self <: HistoryStateNodeConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (HistoryStateNodeConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHistory(value: shallow | deep | `true`): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: StateValue): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
