package typings.wordpressCustomizeBrowser.anon

import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting_Options> */
@js.native
trait PartialSettingOptions extends js.Object {
  
  var dirty: js.UndefOr[Boolean] = js.native
  
  var previewer: js.UndefOr[Previewer[String]] = js.native
  
  var transport: js.UndefOr[String] = js.native
}
object PartialSettingOptions {
  
  @scala.inline
  def apply(): PartialSettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSettingOptions]
  }
  
  @scala.inline
  implicit class PartialSettingOptionsOps[Self <: PartialSettingOptions] (val x: Self) extends AnyVal {
    
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
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    
    @scala.inline
    def setPreviewer(value: Previewer[String]): Self = this.set("previewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewer: Self = this.set("previewer", js.undefined)
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
}
