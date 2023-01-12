package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInfo
  extends StObject
     with ResponseEntry {
  
  var serverinstanceDatabaseVersion: Double
  
  var serverinstanceFiletransferPort: Double
  
  var serverinstanceGuestServerqueryGroup: Double
  
  var serverinstanceMaxDownloadTotalBandwidth: Double
  
  var serverinstanceMaxUploadTotalBandwidth: Double
  
  var serverinstancePendingConnectionsPerIp: Double
  
  var serverinstancePermissionsVersion: Double
  
  var serverinstanceServerqueryFloodBanTime: Double
  
  var serverinstanceServerqueryFloodCommands: Double
  
  var serverinstanceServerqueryMaxConnectionsPerIp: Double
  
  var serverinstanceTemplateChanneladminGroup: String
  
  var serverinstanceTemplateChanneldefaultGroup: String
  
  var serverinstanceTemplateServeradminGroup: Double
  
  var serverinstanceTemplateServerdefaultGroup: String
}
object InstanceInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    
    inline def setServerinstanceDatabaseVersion(value: Double): Self = StObject.set(x, "serverinstanceDatabaseVersion", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceFiletransferPort(value: Double): Self = StObject.set(x, "serverinstanceFiletransferPort", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceGuestServerqueryGroup(value: Double): Self = StObject.set(x, "serverinstanceGuestServerqueryGroup", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    
    inline def setServerinstancePendingConnectionsPerIp(value: Double): Self = StObject.set(x, "serverinstancePendingConnectionsPerIp", value.asInstanceOf[js.Any])
    
    inline def setServerinstancePermissionsVersion(value: Double): Self = StObject.set(x, "serverinstancePermissionsVersion", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceServerqueryFloodBanTime(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodBanTime", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceServerqueryFloodCommands(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodCommands", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceServerqueryMaxConnectionsPerIp(value: Double): Self = StObject.set(x, "serverinstanceServerqueryMaxConnectionsPerIp", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceTemplateChanneladminGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneladminGroup", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceTemplateChanneldefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneldefaultGroup", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceTemplateServeradminGroup(value: Double): Self = StObject.set(x, "serverinstanceTemplateServeradminGroup", value.asInstanceOf[js.Any])
    
    inline def setServerinstanceTemplateServerdefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateServerdefaultGroup", value.asInstanceOf[js.Any])
  }
}
