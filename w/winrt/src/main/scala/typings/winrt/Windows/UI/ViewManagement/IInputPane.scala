package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputPane extends js.Object {
  
  var occludedRect: Rect = js.native
  
  var onhiding: js.Any = js.native
  
  var onshowing: js.Any = js.native
}
object IInputPane {
  
  @scala.inline
  def apply(occludedRect: Rect, onhiding: js.Any, onshowing: js.Any): IInputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPane]
  }
  
  @scala.inline
  implicit class IInputPaneOps[Self <: IInputPane] (val x: Self) extends AnyVal {
    
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
    def setOccludedRect(value: Rect): Self = this.set("occludedRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhiding(value: js.Any): Self = this.set("onhiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshowing(value: js.Any): Self = this.set("onshowing", value.asInstanceOf[js.Any])
  }
}
