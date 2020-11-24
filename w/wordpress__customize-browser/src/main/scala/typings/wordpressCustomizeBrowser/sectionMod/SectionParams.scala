package typings.wordpressCustomizeBrowser.sectionMod

import typings.wordpressCustomizeBrowser.containerMod.ContainerParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionParams extends ContainerParams {
  
  var customizeAction: js.UndefOr[String] = js.native
  
  var panel: js.UndefOr[String | Null] = js.native
}
object SectionParams {
  
  @scala.inline
  def apply(title: String): SectionParams = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionParams]
  }
  
  @scala.inline
  implicit class SectionParamsOps[Self <: SectionParams] (val x: Self) extends AnyVal {
    
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
    def setCustomizeAction(value: String): Self = this.set("customizeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizeAction: Self = this.set("customizeAction", js.undefined)
    
    @scala.inline
    def setPanel(value: String): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setPanelNull: Self = this.set("panel", null)
  }
}
