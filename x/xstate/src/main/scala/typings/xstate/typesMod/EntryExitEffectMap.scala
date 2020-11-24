package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryExitEffectMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  var entry: js.Array[ActionObject[TContext, TEvent]] = js.native
  
  var exit: js.Array[ActionObject[TContext, TEvent]] = js.native
}
object EntryExitEffectMap {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](entry: js.Array[ActionObject[TContext, TEvent]], exit: js.Array[ActionObject[TContext, TEvent]]): EntryExitEffectMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryExitEffectMap[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class EntryExitEffectMapOps[Self <: EntryExitEffectMap[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (EntryExitEffectMap[TContext, TEvent])) extends AnyVal {
    
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
    def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("exit", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
}
