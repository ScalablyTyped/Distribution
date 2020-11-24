package typings.testingLibraryUserEvent.mod

import typings.std.Event
import typings.std.MouseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadInitArgument extends js.Object {
  
  var changeInit: js.UndefOr[Event] = js.native
  
  var clickInit: js.UndefOr[MouseEventInit] = js.native
}
object UploadInitArgument {
  
  @scala.inline
  def apply(): UploadInitArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadInitArgument]
  }
  
  @scala.inline
  implicit class UploadInitArgumentOps[Self <: UploadInitArgument] (val x: Self) extends AnyVal {
    
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
    def setChangeInit(value: Event): Self = this.set("changeInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeInit: Self = this.set("changeInit", js.undefined)
    
    @scala.inline
    def setClickInit(value: MouseEventInit): Self = this.set("clickInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickInit: Self = this.set("clickInit", js.undefined)
  }
}
