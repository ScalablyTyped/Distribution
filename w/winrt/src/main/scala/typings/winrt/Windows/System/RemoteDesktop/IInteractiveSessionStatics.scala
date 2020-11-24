package typings.winrt.Windows.System.RemoteDesktop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInteractiveSessionStatics extends js.Object {
  
  var isRemote: Boolean = js.native
}
object IInteractiveSessionStatics {
  
  @scala.inline
  def apply(isRemote: Boolean): IInteractiveSessionStatics = {
    val __obj = js.Dynamic.literal(isRemote = isRemote.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractiveSessionStatics]
  }
  
  @scala.inline
  implicit class IInteractiveSessionStaticsOps[Self <: IInteractiveSessionStatics] (val x: Self) extends AnyVal {
    
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
    def setIsRemote(value: Boolean): Self = this.set("isRemote", value.asInstanceOf[js.Any])
  }
}
