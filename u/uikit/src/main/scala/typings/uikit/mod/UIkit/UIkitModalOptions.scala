package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitModalOptions extends js.Object {
  
  var `bg-close`: js.UndefOr[Boolean] = js.native
  
  var `cls-page`: js.UndefOr[String] = js.native
  
  var `cls-panel`: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String | Boolean] = js.native
  
  var `esc-close`: js.UndefOr[Boolean] = js.native
  
  var `sel-close`: js.UndefOr[String] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
}
object UIkitModalOptions {
  
  @scala.inline
  def apply(): UIkitModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitModalOptions]
  }
  
  @scala.inline
  implicit class UIkitModalOptionsOps[Self <: UIkitModalOptions] (val x: Self) extends AnyVal {
    
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
    def `setBg-close`(value: Boolean): Self = this.set("bg-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBg-close`: Self = this.set("bg-close", js.undefined)
    
    @scala.inline
    def `setCls-page`(value: String): Self = this.set("cls-page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCls-page`: Self = this.set("cls-page", js.undefined)
    
    @scala.inline
    def `setCls-panel`(value: String): Self = this.set("cls-panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCls-panel`: Self = this.set("cls-panel", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def `setEsc-close`(value: Boolean): Self = this.set("esc-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEsc-close`: Self = this.set("esc-close", js.undefined)
    
    @scala.inline
    def `setSel-close`(value: String): Self = this.set("sel-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSel-close`: Self = this.set("sel-close", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
}
