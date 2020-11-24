package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode
import typings.ts3NodejsLibrary.enumMod.HostBannerMode
import typings.ts3NodejsLibrary.enumMod.HostMessageMode
import typings.ts3NodejsLibrary.enumMod.VirtualServerStatus
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEdit extends ResponseEntry {
  
  var virtualserverAntifloodPointsNeededCommandBlock: js.UndefOr[Double] = js.native
  
  var virtualserverAntifloodPointsNeededIpBlock: js.UndefOr[Double] = js.native
  
  var virtualserverAntifloodPointsNeededPluginBlock: js.UndefOr[Double] = js.native
  
  var virtualserverAntifloodPointsTickReduce: js.UndefOr[Double] = js.native
  
  var virtualserverAutostart: js.UndefOr[Double] = js.native
  
  var virtualserverCodecEncryptionMode: js.UndefOr[CodecEncryptionMode] = js.native
  
  var virtualserverComplainAutobanCount: js.UndefOr[Double] = js.native
  
  var virtualserverComplainAutobanTime: js.UndefOr[Double] = js.native
  
  var virtualserverComplainRemoveTime: js.UndefOr[Double] = js.native
  
  var virtualserverDefaultChannelAdminGroup: js.UndefOr[Double] = js.native
  
  var virtualserverDefaultChannelGroup: js.UndefOr[Double] = js.native
  
  var virtualserverDefaultServerGroup: js.UndefOr[Double] = js.native
  
  var virtualserverDownloadQuota: js.UndefOr[Double] = js.native
  
  var virtualserverHostbannerGfxInterval: js.UndefOr[Double] = js.native
  
  var virtualserverHostbannerGfxUrl: js.UndefOr[String] = js.native
  
  var virtualserverHostbannerMode: js.UndefOr[HostBannerMode] = js.native
  
  var virtualserverHostbannerUrl: js.UndefOr[String] = js.native
  
  var virtualserverHostbuttonGfxUrl: js.UndefOr[String] = js.native
  
  var virtualserverHostbuttonTooltip: js.UndefOr[String] = js.native
  
  var virtualserverHostbuttonUrl: js.UndefOr[String] = js.native
  
  var virtualserverHostmessage: js.UndefOr[String] = js.native
  
  var virtualserverHostmessageMode: js.UndefOr[HostMessageMode] = js.native
  
  var virtualserverIconId: js.UndefOr[Double] = js.native
  
  var virtualserverLogChannel: js.UndefOr[Double] = js.native
  
  var virtualserverLogClient: js.UndefOr[Double] = js.native
  
  var virtualserverLogFiletransfer: js.UndefOr[Double] = js.native
  
  var virtualserverLogPermissions: js.UndefOr[Double] = js.native
  
  var virtualserverLogQuery: js.UndefOr[Double] = js.native
  
  var virtualserverLogServer: js.UndefOr[Double] = js.native
  
  var virtualserverMachineId: js.UndefOr[String] = js.native
  
  var virtualserverMaxDownloadTotalBandwidth: js.UndefOr[Double] = js.native
  
  var virtualserverMaxUploadTotalBandwidth: js.UndefOr[Double] = js.native
  
  var virtualserverMaxclients: js.UndefOr[Double] = js.native
  
  var virtualserverMinAndroidVersion: js.UndefOr[Double] = js.native
  
  var virtualserverMinClientVersion: js.UndefOr[Double] = js.native
  
  var virtualserverMinClientsInChannelBeforeForcedSilence: js.UndefOr[Double] = js.native
  
  var virtualserverMinIosVersion: js.UndefOr[Double] = js.native
  
  var virtualserverName: js.UndefOr[String] = js.native
  
  var virtualserverNamePhonetic: js.UndefOr[String] = js.native
  
  var virtualserverNeededIdentitySecurityLevel: js.UndefOr[Double] = js.native
  
  var virtualserverPassword: js.UndefOr[String] = js.native
  
  var virtualserverPort: js.UndefOr[Double] = js.native
  
  var virtualserverPrioritySpeakerDimmModificator: js.UndefOr[Double] = js.native
  
  var virtualserverReservedSlots: js.UndefOr[Double] = js.native
  
  var virtualserverStatus: js.UndefOr[VirtualServerStatus] = js.native
  
  var virtualserverUploadQuota: js.UndefOr[Double] = js.native
  
  var virtualserverWeblistEnabled: js.UndefOr[Double] = js.native
  
  var virtualserverWelcomemessage: js.UndefOr[String] = js.native
}
object ServerEdit {
  
  @scala.inline
  def apply(): ServerEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerEdit]
  }
  
  @scala.inline
  implicit class ServerEditOps[Self <: ServerEdit] (val x: Self) extends AnyVal {
    
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
    def setVirtualserverAntifloodPointsNeededCommandBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededCommandBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverAntifloodPointsNeededCommandBlock: Self = this.set("virtualserverAntifloodPointsNeededCommandBlock", js.undefined)
    
    @scala.inline
    def setVirtualserverAntifloodPointsNeededIpBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededIpBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverAntifloodPointsNeededIpBlock: Self = this.set("virtualserverAntifloodPointsNeededIpBlock", js.undefined)
    
    @scala.inline
    def setVirtualserverAntifloodPointsNeededPluginBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededPluginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverAntifloodPointsNeededPluginBlock: Self = this.set("virtualserverAntifloodPointsNeededPluginBlock", js.undefined)
    
    @scala.inline
    def setVirtualserverAntifloodPointsTickReduce(value: Double): Self = this.set("virtualserverAntifloodPointsTickReduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverAntifloodPointsTickReduce: Self = this.set("virtualserverAntifloodPointsTickReduce", js.undefined)
    
    @scala.inline
    def setVirtualserverAutostart(value: Double): Self = this.set("virtualserverAutostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverAutostart: Self = this.set("virtualserverAutostart", js.undefined)
    
    @scala.inline
    def setVirtualserverCodecEncryptionMode(value: CodecEncryptionMode): Self = this.set("virtualserverCodecEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverCodecEncryptionMode: Self = this.set("virtualserverCodecEncryptionMode", js.undefined)
    
    @scala.inline
    def setVirtualserverComplainAutobanCount(value: Double): Self = this.set("virtualserverComplainAutobanCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverComplainAutobanCount: Self = this.set("virtualserverComplainAutobanCount", js.undefined)
    
    @scala.inline
    def setVirtualserverComplainAutobanTime(value: Double): Self = this.set("virtualserverComplainAutobanTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverComplainAutobanTime: Self = this.set("virtualserverComplainAutobanTime", js.undefined)
    
    @scala.inline
    def setVirtualserverComplainRemoveTime(value: Double): Self = this.set("virtualserverComplainRemoveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverComplainRemoveTime: Self = this.set("virtualserverComplainRemoveTime", js.undefined)
    
    @scala.inline
    def setVirtualserverDefaultChannelAdminGroup(value: Double): Self = this.set("virtualserverDefaultChannelAdminGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverDefaultChannelAdminGroup: Self = this.set("virtualserverDefaultChannelAdminGroup", js.undefined)
    
    @scala.inline
    def setVirtualserverDefaultChannelGroup(value: Double): Self = this.set("virtualserverDefaultChannelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverDefaultChannelGroup: Self = this.set("virtualserverDefaultChannelGroup", js.undefined)
    
    @scala.inline
    def setVirtualserverDefaultServerGroup(value: Double): Self = this.set("virtualserverDefaultServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverDefaultServerGroup: Self = this.set("virtualserverDefaultServerGroup", js.undefined)
    
    @scala.inline
    def setVirtualserverDownloadQuota(value: Double): Self = this.set("virtualserverDownloadQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverDownloadQuota: Self = this.set("virtualserverDownloadQuota", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbannerGfxInterval(value: Double): Self = this.set("virtualserverHostbannerGfxInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbannerGfxInterval: Self = this.set("virtualserverHostbannerGfxInterval", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbannerGfxUrl(value: String): Self = this.set("virtualserverHostbannerGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbannerGfxUrl: Self = this.set("virtualserverHostbannerGfxUrl", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbannerMode(value: HostBannerMode): Self = this.set("virtualserverHostbannerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbannerMode: Self = this.set("virtualserverHostbannerMode", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbannerUrl(value: String): Self = this.set("virtualserverHostbannerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbannerUrl: Self = this.set("virtualserverHostbannerUrl", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbuttonGfxUrl(value: String): Self = this.set("virtualserverHostbuttonGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbuttonGfxUrl: Self = this.set("virtualserverHostbuttonGfxUrl", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbuttonTooltip(value: String): Self = this.set("virtualserverHostbuttonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbuttonTooltip: Self = this.set("virtualserverHostbuttonTooltip", js.undefined)
    
    @scala.inline
    def setVirtualserverHostbuttonUrl(value: String): Self = this.set("virtualserverHostbuttonUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostbuttonUrl: Self = this.set("virtualserverHostbuttonUrl", js.undefined)
    
    @scala.inline
    def setVirtualserverHostmessage(value: String): Self = this.set("virtualserverHostmessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostmessage: Self = this.set("virtualserverHostmessage", js.undefined)
    
    @scala.inline
    def setVirtualserverHostmessageMode(value: HostMessageMode): Self = this.set("virtualserverHostmessageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverHostmessageMode: Self = this.set("virtualserverHostmessageMode", js.undefined)
    
    @scala.inline
    def setVirtualserverIconId(value: Double): Self = this.set("virtualserverIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverIconId: Self = this.set("virtualserverIconId", js.undefined)
    
    @scala.inline
    def setVirtualserverLogChannel(value: Double): Self = this.set("virtualserverLogChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogChannel: Self = this.set("virtualserverLogChannel", js.undefined)
    
    @scala.inline
    def setVirtualserverLogClient(value: Double): Self = this.set("virtualserverLogClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogClient: Self = this.set("virtualserverLogClient", js.undefined)
    
    @scala.inline
    def setVirtualserverLogFiletransfer(value: Double): Self = this.set("virtualserverLogFiletransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogFiletransfer: Self = this.set("virtualserverLogFiletransfer", js.undefined)
    
    @scala.inline
    def setVirtualserverLogPermissions(value: Double): Self = this.set("virtualserverLogPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogPermissions: Self = this.set("virtualserverLogPermissions", js.undefined)
    
    @scala.inline
    def setVirtualserverLogQuery(value: Double): Self = this.set("virtualserverLogQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogQuery: Self = this.set("virtualserverLogQuery", js.undefined)
    
    @scala.inline
    def setVirtualserverLogServer(value: Double): Self = this.set("virtualserverLogServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverLogServer: Self = this.set("virtualserverLogServer", js.undefined)
    
    @scala.inline
    def setVirtualserverMachineId(value: String): Self = this.set("virtualserverMachineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMachineId: Self = this.set("virtualserverMachineId", js.undefined)
    
    @scala.inline
    def setVirtualserverMaxDownloadTotalBandwidth(value: Double): Self = this.set("virtualserverMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMaxDownloadTotalBandwidth: Self = this.set("virtualserverMaxDownloadTotalBandwidth", js.undefined)
    
    @scala.inline
    def setVirtualserverMaxUploadTotalBandwidth(value: Double): Self = this.set("virtualserverMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMaxUploadTotalBandwidth: Self = this.set("virtualserverMaxUploadTotalBandwidth", js.undefined)
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = this.set("virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMaxclients: Self = this.set("virtualserverMaxclients", js.undefined)
    
    @scala.inline
    def setVirtualserverMinAndroidVersion(value: Double): Self = this.set("virtualserverMinAndroidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMinAndroidVersion: Self = this.set("virtualserverMinAndroidVersion", js.undefined)
    
    @scala.inline
    def setVirtualserverMinClientVersion(value: Double): Self = this.set("virtualserverMinClientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMinClientVersion: Self = this.set("virtualserverMinClientVersion", js.undefined)
    
    @scala.inline
    def setVirtualserverMinClientsInChannelBeforeForcedSilence(value: Double): Self = this.set("virtualserverMinClientsInChannelBeforeForcedSilence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMinClientsInChannelBeforeForcedSilence: Self = this.set("virtualserverMinClientsInChannelBeforeForcedSilence", js.undefined)
    
    @scala.inline
    def setVirtualserverMinIosVersion(value: Double): Self = this.set("virtualserverMinIosVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMinIosVersion: Self = this.set("virtualserverMinIosVersion", js.undefined)
    
    @scala.inline
    def setVirtualserverName(value: String): Self = this.set("virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverName: Self = this.set("virtualserverName", js.undefined)
    
    @scala.inline
    def setVirtualserverNamePhonetic(value: String): Self = this.set("virtualserverNamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverNamePhonetic: Self = this.set("virtualserverNamePhonetic", js.undefined)
    
    @scala.inline
    def setVirtualserverNeededIdentitySecurityLevel(value: Double): Self = this.set("virtualserverNeededIdentitySecurityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverNeededIdentitySecurityLevel: Self = this.set("virtualserverNeededIdentitySecurityLevel", js.undefined)
    
    @scala.inline
    def setVirtualserverPassword(value: String): Self = this.set("virtualserverPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverPassword: Self = this.set("virtualserverPassword", js.undefined)
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = this.set("virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverPort: Self = this.set("virtualserverPort", js.undefined)
    
    @scala.inline
    def setVirtualserverPrioritySpeakerDimmModificator(value: Double): Self = this.set("virtualserverPrioritySpeakerDimmModificator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverPrioritySpeakerDimmModificator: Self = this.set("virtualserverPrioritySpeakerDimmModificator", js.undefined)
    
    @scala.inline
    def setVirtualserverReservedSlots(value: Double): Self = this.set("virtualserverReservedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverReservedSlots: Self = this.set("virtualserverReservedSlots", js.undefined)
    
    @scala.inline
    def setVirtualserverStatus(value: VirtualServerStatus): Self = this.set("virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverStatus: Self = this.set("virtualserverStatus", js.undefined)
    
    @scala.inline
    def setVirtualserverUploadQuota(value: Double): Self = this.set("virtualserverUploadQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverUploadQuota: Self = this.set("virtualserverUploadQuota", js.undefined)
    
    @scala.inline
    def setVirtualserverWeblistEnabled(value: Double): Self = this.set("virtualserverWeblistEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverWeblistEnabled: Self = this.set("virtualserverWeblistEnabled", js.undefined)
    
    @scala.inline
    def setVirtualserverWelcomemessage(value: String): Self = this.set("virtualserverWelcomemessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverWelcomemessage: Self = this.set("virtualserverWelcomemessage", js.undefined)
  }
}
