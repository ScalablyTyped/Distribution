package typings.winrtUwp.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationViewTransferContext extends js.Object {
  
   /* unmapped type */ var viewId: js.Any = js.native
}
object ApplicationViewTransferContext {
  
  @scala.inline
  def apply(viewId: js.Any): ApplicationViewTransferContext = {
    val __obj = js.Dynamic.literal(viewId = viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationViewTransferContext]
  }
  
  @scala.inline
  implicit class ApplicationViewTransferContextOps[Self <: ApplicationViewTransferContext] (val x: Self) extends AnyVal {
    
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
    def setViewId(value: js.Any): Self = this.set("viewId", value.asInstanceOf[js.Any])
  }
}
