package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebUINavigatedOperation extends js.Object {
  
  def getDeferral(): WebUINavigatedDeferral = js.native
}
object IWebUINavigatedOperation {
  
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
  
  @scala.inline
  implicit class IWebUINavigatedOperationOps[Self <: IWebUINavigatedOperation] (val x: Self) extends AnyVal {
    
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
    def setGetDeferral(value: () => WebUINavigatedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
