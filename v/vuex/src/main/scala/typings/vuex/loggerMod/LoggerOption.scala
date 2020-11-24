package typings.vuex.loggerMod

import typings.vuex.mod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOption[S] extends js.Object {
  
  var actionFilter: js.UndefOr[js.Function2[/* action */ Payload, /* state */ S, Boolean]] = js.native
  
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Payload, _]] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[
    js.Function3[/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S, Boolean]
  ] = js.native
  
  var logActions: js.UndefOr[Boolean] = js.native
  
  var logMutations: js.UndefOr[Boolean] = js.native
  
  var mutationTransformer: js.UndefOr[js.Function1[/* mutation */ Payload, _]] = js.native
  
  var transformer: js.UndefOr[js.Function1[/* state */ S, _]] = js.native
}
object LoggerOption {
  
  @scala.inline
  def apply[S](): LoggerOption[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOption[S]]
  }
  
  @scala.inline
  implicit class LoggerOptionOps[Self <: LoggerOption[_], S] (val x: Self with LoggerOption[S]) extends AnyVal {
    
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
    def setActionFilter(value: (/* action */ Payload, /* state */ S) => Boolean): Self = this.set("actionFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActionFilter: Self = this.set("actionFilter", js.undefined)
    
    @scala.inline
    def setActionTransformer(value: /* action */ Payload => _): Self = this.set("actionTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionTransformer: Self = this.set("actionTransformer", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* mutation */ Payload, /* stateBefore */ S, /* stateAfter */ S) => Boolean): Self = this.set("filter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLogActions(value: Boolean): Self = this.set("logActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogActions: Self = this.set("logActions", js.undefined)
    
    @scala.inline
    def setLogMutations(value: Boolean): Self = this.set("logMutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogMutations: Self = this.set("logMutations", js.undefined)
    
    @scala.inline
    def setMutationTransformer(value: /* mutation */ Payload => _): Self = this.set("mutationTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMutationTransformer: Self = this.set("mutationTransformer", js.undefined)
    
    @scala.inline
    def setTransformer(value: /* state */ S => _): Self = this.set("transformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformer: Self = this.set("transformer", js.undefined)
  }
}
