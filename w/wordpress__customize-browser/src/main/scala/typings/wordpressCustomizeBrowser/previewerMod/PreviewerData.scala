package typings.wordpressCustomizeBrowser.previewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewerData extends js.Object {
  
   // TODO
  var activeControls: js.Any = js.native
  
  var activePanels: js.Any = js.native
  
   // TODO
  var activeSections: js.Any = js.native
  
  var currentUrl: String = js.native
}
object PreviewerData {
  
  @scala.inline
  def apply(activeControls: js.Any, activePanels: js.Any, activeSections: js.Any, currentUrl: String): PreviewerData = {
    val __obj = js.Dynamic.literal(activeControls = activeControls.asInstanceOf[js.Any], activePanels = activePanels.asInstanceOf[js.Any], activeSections = activeSections.asInstanceOf[js.Any], currentUrl = currentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewerData]
  }
  
  @scala.inline
  implicit class PreviewerDataOps[Self <: PreviewerData] (val x: Self) extends AnyVal {
    
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
    def setActiveControls(value: js.Any): Self = this.set("activeControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePanels(value: js.Any): Self = this.set("activePanels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSections(value: js.Any): Self = this.set("activeSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUrl(value: String): Self = this.set("currentUrl", value.asInstanceOf[js.Any])
  }
}
