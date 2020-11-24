package typings.wordpressCustomizeBrowser.controlMod

import typings.wordpressCustomizeBrowser.settingMod.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlParams extends js.Object {
  
  var active: Boolean = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var description: String = js.native
  
  var instanceNumber: js.UndefOr[Double] = js.native
  
  var label: String = js.native
  
  var params: js.UndefOr[ControlParams] = js.native
  
  var priority: Double = js.native
  
  var section: String = js.native
  
  var setting: js.UndefOr[String | Setting[_]] = js.native
  
  var settings: ControlSettings = js.native
  
  var templateId: js.UndefOr[String] = js.native
  
  var `type`: js.Any = js.native
}
object ControlParams {
  
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    label: String,
    priority: Double,
    section: String,
    settings: ControlSettings,
    `type`: js.Any
  ): ControlParams = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlParams]
  }
  
  @scala.inline
  implicit class ControlParamsOps[Self <: ControlParams] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ControlSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setInstanceNumber(value: Double): Self = this.set("instanceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceNumber: Self = this.set("instanceNumber", js.undefined)
    
    @scala.inline
    def setParams(value: ControlParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setSetting(value: String | Setting[_]): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
