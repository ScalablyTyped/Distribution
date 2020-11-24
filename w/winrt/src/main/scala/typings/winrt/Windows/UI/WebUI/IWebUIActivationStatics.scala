package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUIActivationStatics extends js.Object {
  
  var onactivated: js.Any = js.native
  
  var onnavigated: js.Any = js.native
  
  var onresuming: js.Any = js.native
  
  var onsuspending: js.Any = js.native
}
object IWebUIActivationStatics {
  
  @scala.inline
  def apply(onactivated: js.Any, onnavigated: js.Any, onresuming: js.Any, onsuspending: js.Any): IWebUIActivationStatics = {
    val __obj = js.Dynamic.literal(onactivated = onactivated.asInstanceOf[js.Any], onnavigated = onnavigated.asInstanceOf[js.Any], onresuming = onresuming.asInstanceOf[js.Any], onsuspending = onsuspending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIActivationStatics]
  }
  
  @scala.inline
  implicit class IWebUIActivationStaticsOps[Self <: IWebUIActivationStatics] (val x: Self) extends AnyVal {
    
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
    def setOnactivated(value: js.Any): Self = this.set("onactivated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnnavigated(value: js.Any): Self = this.set("onnavigated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresuming(value: js.Any): Self = this.set("onresuming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuspending(value: js.Any): Self = this.set("onsuspending", value.asInstanceOf[js.Any])
  }
}
