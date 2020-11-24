package typings.vegaTypings.signalMod

import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewSignal
  extends BaseSignal
     with Signal {
  
  var bind: js.UndefOr[Binding] = js.native
  
  var react: js.UndefOr[Boolean] = js.native
  
  var update: js.UndefOr[Expr] = js.native
  
  var value: js.UndefOr[SignalValue] = js.native
}
object NewSignal {
  
  @scala.inline
  def apply(name: String): NewSignal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewSignal]
  }
  
  @scala.inline
  implicit class NewSignalOps[Self <: NewSignal] (val x: Self) extends AnyVal {
    
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
    def setBind(value: Binding): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    
    @scala.inline
    def setReact(value: Boolean): Self = this.set("react", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReact: Self = this.set("react", js.undefined)
    
    @scala.inline
    def setUpdate(value: Expr): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setValue(value: SignalValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
