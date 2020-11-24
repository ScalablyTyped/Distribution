package typings.vscodeJsonrpc.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitterOptions extends js.Object {
  
  var onFirstListenerAdd: js.UndefOr[js.Function] = js.native
  
  var onLastListenerRemove: js.UndefOr[js.Function] = js.native
}
object EmitterOptions {
  
  @scala.inline
  def apply(): EmitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitterOptions]
  }
  
  @scala.inline
  implicit class EmitterOptionsOps[Self <: EmitterOptions] (val x: Self) extends AnyVal {
    
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
    def setOnFirstListenerAdd(value: js.Function): Self = this.set("onFirstListenerAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFirstListenerAdd: Self = this.set("onFirstListenerAdd", js.undefined)
    
    @scala.inline
    def setOnLastListenerRemove(value: js.Function): Self = this.set("onLastListenerRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLastListenerRemove: Self = this.set("onLastListenerRemove", js.undefined)
  }
}
