package typings.wordpressCustomizeBrowser.settingMod

import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingOptions extends js.Object {
  
  var dirty: Boolean = js.native
  
  var previewer: Previewer[String] = js.native
  
  var transport: String = js.native
}
object SettingOptions {
  
  @scala.inline
  def apply(dirty: Boolean, previewer: Previewer[String], transport: String): SettingOptions = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], previewer = previewer.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingOptions]
  }
  
  @scala.inline
  implicit class SettingOptionsOps[Self <: SettingOptions] (val x: Self) extends AnyVal {
    
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
    def setPreviewer(value: Previewer[String]): Self = this.set("previewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: String): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
}
