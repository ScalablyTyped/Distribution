package typings.xstate.anon

import typings.xstate.interpreterMod.Clock
import typings.xstate.interpreterMod.Interpreter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<xstate.xstate/lib/types.InterpreterOptions> */
@js.native
trait PartialInterpreterOptions extends js.Object {
  
  var clock: js.UndefOr[Clock] = js.native
  
  var deferEvents: js.UndefOr[Boolean] = js.native
  
  var devTools: js.UndefOr[Boolean | js.Object] = js.native
  
  var execute: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var parent: js.UndefOr[Interpreter[_, _, _, ContextAny]] = js.native
}
object PartialInterpreterOptions {
  
  @scala.inline
  def apply(): PartialInterpreterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterpreterOptions]
  }
  
  @scala.inline
  implicit class PartialInterpreterOptionsOps[Self <: PartialInterpreterOptions] (val x: Self) extends AnyVal {
    
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
    def setClock(value: Clock): Self = this.set("clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClock: Self = this.set("clock", js.undefined)
    
    @scala.inline
    def setDeferEvents(value: Boolean): Self = this.set("deferEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferEvents: Self = this.set("deferEvents", js.undefined)
    
    @scala.inline
    def setDevTools(value: Boolean | js.Object): Self = this.set("devTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevTools: Self = this.set("devTools", js.undefined)
    
    @scala.inline
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLogger(value: /* repeated */ js.Any => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setParent(value: Interpreter[_, _, _, ContextAny]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
