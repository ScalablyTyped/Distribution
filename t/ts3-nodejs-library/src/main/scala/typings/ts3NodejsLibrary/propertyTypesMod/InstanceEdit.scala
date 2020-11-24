package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceEdit extends ResponseEntry {
  
  var serverinstanceFiletransferPort: js.UndefOr[Double] = js.native
  
  var serverinstanceMaxDownloadTotalBandwidth: js.UndefOr[Double] = js.native
  
  var serverinstanceMaxUploadTotalBandwidth: js.UndefOr[Double] = js.native
  
  var serverinstanceServerqueryFloodBanTime: js.UndefOr[Double] = js.native
  
  var serverinstanceServerqueryFloodCommands: js.UndefOr[Double] = js.native
  
  var serverinstanceServerqueryFloodTime: js.UndefOr[Double] = js.native
  
  var serverinstanceTemplateChanneladminGroup: js.UndefOr[String] = js.native
  
  var serverinstanceTemplateChanneldefaultGroup: js.UndefOr[String] = js.native
  
  var serverinstanceTemplateServeradminGroup: js.UndefOr[String] = js.native
  
  var serverinstanceTemplateServerdefaultGroup: js.UndefOr[String] = js.native
}
object InstanceEdit {
  
  @scala.inline
  def apply(): InstanceEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEdit]
  }
  
  @scala.inline
  implicit class InstanceEditOps[Self <: InstanceEdit] (val x: Self) extends AnyVal {
    
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
    def setServerinstanceFiletransferPort(value: Double): Self = this.set("serverinstanceFiletransferPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceFiletransferPort: Self = this.set("serverinstanceFiletransferPort", js.undefined)
    
    @scala.inline
    def setServerinstanceMaxDownloadTotalBandwidth(value: Double): Self = this.set("serverinstanceMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceMaxDownloadTotalBandwidth: Self = this.set("serverinstanceMaxDownloadTotalBandwidth", js.undefined)
    
    @scala.inline
    def setServerinstanceMaxUploadTotalBandwidth(value: Double): Self = this.set("serverinstanceMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceMaxUploadTotalBandwidth: Self = this.set("serverinstanceMaxUploadTotalBandwidth", js.undefined)
    
    @scala.inline
    def setServerinstanceServerqueryFloodBanTime(value: Double): Self = this.set("serverinstanceServerqueryFloodBanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceServerqueryFloodBanTime: Self = this.set("serverinstanceServerqueryFloodBanTime", js.undefined)
    
    @scala.inline
    def setServerinstanceServerqueryFloodCommands(value: Double): Self = this.set("serverinstanceServerqueryFloodCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceServerqueryFloodCommands: Self = this.set("serverinstanceServerqueryFloodCommands", js.undefined)
    
    @scala.inline
    def setServerinstanceServerqueryFloodTime(value: Double): Self = this.set("serverinstanceServerqueryFloodTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceServerqueryFloodTime: Self = this.set("serverinstanceServerqueryFloodTime", js.undefined)
    
    @scala.inline
    def setServerinstanceTemplateChanneladminGroup(value: String): Self = this.set("serverinstanceTemplateChanneladminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceTemplateChanneladminGroup: Self = this.set("serverinstanceTemplateChanneladminGroup", js.undefined)
    
    @scala.inline
    def setServerinstanceTemplateChanneldefaultGroup(value: String): Self = this.set("serverinstanceTemplateChanneldefaultGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceTemplateChanneldefaultGroup: Self = this.set("serverinstanceTemplateChanneldefaultGroup", js.undefined)
    
    @scala.inline
    def setServerinstanceTemplateServeradminGroup(value: String): Self = this.set("serverinstanceTemplateServeradminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceTemplateServeradminGroup: Self = this.set("serverinstanceTemplateServeradminGroup", js.undefined)
    
    @scala.inline
    def setServerinstanceTemplateServerdefaultGroup(value: String): Self = this.set("serverinstanceTemplateServerdefaultGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerinstanceTemplateServerdefaultGroup: Self = this.set("serverinstanceTemplateServerdefaultGroup", js.undefined)
  }
}
