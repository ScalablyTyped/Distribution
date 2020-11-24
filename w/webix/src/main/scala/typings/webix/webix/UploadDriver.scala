package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadDriver extends js.Object {
  
  var html5: js.Any = js.native
}
object UploadDriver {
  
  @scala.inline
  def apply(html5: js.Any): UploadDriver = {
    val __obj = js.Dynamic.literal(html5 = html5.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadDriver]
  }
  
  @scala.inline
  implicit class UploadDriverOps[Self <: UploadDriver] (val x: Self) extends AnyVal {
    
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
    def setHtml5(value: js.Any): Self = this.set("html5", value.asInstanceOf[js.Any])
  }
}
