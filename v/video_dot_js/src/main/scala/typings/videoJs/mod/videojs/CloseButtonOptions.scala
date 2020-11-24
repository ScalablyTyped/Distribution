package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseButtonOptions extends ComponentOptions {
  
  var controlText: js.UndefOr[String] = js.native
}
object CloseButtonOptions {
  
  @scala.inline
  def apply(): CloseButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButtonOptions]
  }
  
  @scala.inline
  implicit class CloseButtonOptionsOps[Self <: CloseButtonOptions] (val x: Self) extends AnyVal {
    
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
    def setControlText(value: String): Self = this.set("controlText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlText: Self = this.set("controlText", js.undefined)
  }
}
