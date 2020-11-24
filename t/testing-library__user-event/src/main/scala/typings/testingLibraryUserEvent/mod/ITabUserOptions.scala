package typings.testingLibraryUserEvent.mod

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabUserOptions extends js.Object {
  
  var focusTrap: js.UndefOr[Document | Element] = js.native
  
  var shift: js.UndefOr[Boolean] = js.native
}
object ITabUserOptions {
  
  @scala.inline
  def apply(): ITabUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabUserOptions]
  }
  
  @scala.inline
  implicit class ITabUserOptionsOps[Self <: ITabUserOptions] (val x: Self) extends AnyVal {
    
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
    def setFocusTrap(value: Document | Element): Self = this.set("focusTrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTrap: Self = this.set("focusTrap", js.undefined)
    
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
  }
}
