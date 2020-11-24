package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signals extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var signals: js.UndefOr[js.Any] = js.native
}
object Signals {
  
  @scala.inline
  def apply(): Signals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signals]
  }
  
  @scala.inline
  implicit class SignalsOps[Self <: Signals] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setSignals(value: js.Any): Self = this.set("signals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
  }
}
