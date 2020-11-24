package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInfo extends ResponseEntry {
  
  var serverinstanceDatabaseVersion: Double = js.native
  
  var serverinstanceFiletransferPort: Double = js.native
  
  var serverinstanceGuestServerqueryGroup: Double = js.native
  
  var serverinstanceMaxDownloadTotalBandwidth: Double = js.native
  
  var serverinstanceMaxUploadTotalBandwidth: Double = js.native
  
  var serverinstancePendingConnectionsPerIp: Double = js.native
  
  var serverinstancePermissionsVersion: Double = js.native
  
  var serverinstanceServerqueryFloodBanTime: Double = js.native
  
  var serverinstanceServerqueryFloodCommands: Double = js.native
  
  var serverinstanceServerqueryMaxConnectionsPerIp: Double = js.native
  
  var serverinstanceTemplateChanneladminGroup: String = js.native
  
  var serverinstanceTemplateChanneldefaultGroup: String = js.native
  
  var serverinstanceTemplateServeradminGroup: Double = js.native
  
  var serverinstanceTemplateServerdefaultGroup: String = js.native
}
object InstanceInfo {
  
  @scala.inline
  def apply(
    serverinstanceDatabaseVersion: Double,
    serverinstanceFiletransferPort: Double,
    serverinstanceGuestServerqueryGroup: Double,
    serverinstanceMaxDownloadTotalBandwidth: Double,
    serverinstanceMaxUploadTotalBandwidth: Double,
    serverinstancePendingConnectionsPerIp: Double,
    serverinstancePermissionsVersion: Double,
    serverinstanceServerqueryFloodBanTime: Double,
    serverinstanceServerqueryFloodCommands: Double,
    serverinstanceServerqueryMaxConnectionsPerIp: Double,
    serverinstanceTemplateChanneladminGroup: String,
    serverinstanceTemplateChanneldefaultGroup: String,
    serverinstanceTemplateServeradminGroup: Double,
    serverinstanceTemplateServerdefaultGroup: String
  ): InstanceInfo = {
    val __obj = js.Dynamic.literal(serverinstanceDatabaseVersion = serverinstanceDatabaseVersion.asInstanceOf[js.Any], serverinstanceFiletransferPort = serverinstanceFiletransferPort.asInstanceOf[js.Any], serverinstanceGuestServerqueryGroup = serverinstanceGuestServerqueryGroup.asInstanceOf[js.Any], serverinstanceMaxDownloadTotalBandwidth = serverinstanceMaxDownloadTotalBandwidth.asInstanceOf[js.Any], serverinstanceMaxUploadTotalBandwidth = serverinstanceMaxUploadTotalBandwidth.asInstanceOf[js.Any], serverinstancePendingConnectionsPerIp = serverinstancePendingConnectionsPerIp.asInstanceOf[js.Any], serverinstancePermissionsVersion = serverinstancePermissionsVersion.asInstanceOf[js.Any], serverinstanceServerqueryFloodBanTime = serverinstanceServerqueryFloodBanTime.asInstanceOf[js.Any], serverinstanceServerqueryFloodCommands = serverinstanceServerqueryFloodCommands.asInstanceOf[js.Any], serverinstanceServerqueryMaxConnectionsPerIp = serverinstanceServerqueryMaxConnectionsPerIp.asInstanceOf[js.Any], serverinstanceTemplateChanneladminGroup = serverinstanceTemplateChanneladminGroup.asInstanceOf[js.Any], serverinstanceTemplateChanneldefaultGroup = serverinstanceTemplateChanneldefaultGroup.asInstanceOf[js.Any], serverinstanceTemplateServeradminGroup = serverinstanceTemplateServeradminGroup.asInstanceOf[js.Any], serverinstanceTemplateServerdefaultGroup = serverinstanceTemplateServerdefaultGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInfo]
  }
  
  @scala.inline
  implicit class InstanceInfoOps[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
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
    def setServerinstanceDatabaseVersion(value: Double): Self = this.set("serverinstanceDatabaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceFiletransferPort(value: Double): Self = this.set("serverinstanceFiletransferPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceGuestServerqueryGroup(value: Double): Self = this.set("serverinstanceGuestServerqueryGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceMaxDownloadTotalBandwidth(value: Double): Self = this.set("serverinstanceMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceMaxUploadTotalBandwidth(value: Double): Self = this.set("serverinstanceMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstancePendingConnectionsPerIp(value: Double): Self = this.set("serverinstancePendingConnectionsPerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstancePermissionsVersion(value: Double): Self = this.set("serverinstancePermissionsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceServerqueryFloodBanTime(value: Double): Self = this.set("serverinstanceServerqueryFloodBanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceServerqueryFloodCommands(value: Double): Self = this.set("serverinstanceServerqueryFloodCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceServerqueryMaxConnectionsPerIp(value: Double): Self = this.set("serverinstanceServerqueryMaxConnectionsPerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceTemplateChanneladminGroup(value: String): Self = this.set("serverinstanceTemplateChanneladminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceTemplateChanneldefaultGroup(value: String): Self = this.set("serverinstanceTemplateChanneldefaultGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceTemplateServeradminGroup(value: Double): Self = this.set("serverinstanceTemplateServeradminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerinstanceTemplateServerdefaultGroup(value: String): Self = this.set("serverinstanceTemplateServerdefaultGroup", value.asInstanceOf[js.Any])
  }
}
