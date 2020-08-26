package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo extends ResponseEntry {
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  var connectionBytesReceivedControl: Double = js.native
  var connectionBytesReceivedKeepalive: Double = js.native
  var connectionBytesReceivedSpeech: Double = js.native
  var connectionBytesReceivedTotal: Double = js.native
  var connectionBytesSentControl: Double = js.native
  var connectionBytesSentKeepalive: Double = js.native
  var connectionBytesSentSpeech: Double = js.native
  var connectionBytesSentTotal: Double = js.native
  var connectionFiletransferBandwidthReceived: Double = js.native
  var connectionFiletransferBandwidthSent: Double = js.native
  var connectionFiletransferBytesReceivedTotal: Double = js.native
  var connectionFiletransferBytesSentTotal: Double = js.native
  var connectionPacketsReceivedControl: Double = js.native
  var connectionPacketsReceivedKeepalive: Double = js.native
  var connectionPacketsReceivedSpeech: Double = js.native
  var connectionPacketsReceivedTotal: Double = js.native
  var connectionPacketsSentControl: Double = js.native
  var connectionPacketsSentKeepalive: Double = js.native
  var connectionPacketsSentSpeech: Double = js.native
  var connectionPacketsSentTotal: Double = js.native
  var virtualserverAntifloodPointsNeededCommandBlock: Double = js.native
  var virtualserverAntifloodPointsNeededIpBlock: Double = js.native
  var virtualserverAntifloodPointsNeededPluginBlock: Double = js.native
  var virtualserverAntifloodPointsTickReduce: Double = js.native
  var virtualserverChannelTempDeleteDelayDefault: Double = js.native
  var virtualserverChannelsonline: Double = js.native
  var virtualserverClientsonline: Double = js.native
  var virtualserverCodecEncryptionMode: Double = js.native
  var virtualserverComplainAutobanCount: Double = js.native
  var virtualserverComplainAutobanTime: Double = js.native
  var virtualserverComplainRemoveTime: Double = js.native
  var virtualserverCreated: Double = js.native
  var virtualserverDefaultChannelAdminGroup: String = js.native
  var virtualserverDefaultChannelGroup: String = js.native
  var virtualserverDefaultServerGroup: String = js.native
  var virtualserverDownloadQuota: Double = js.native
  var virtualserverFilebase: String = js.native
  var virtualserverFlagPassword: Boolean = js.native
  var virtualserverHostbannerGfxInterval: Double = js.native
  var virtualserverHostbannerGfxUrl: String = js.native
  var virtualserverHostbannerMode: Double = js.native
  var virtualserverHostbannerUrl: String = js.native
  var virtualserverHostbuttonGfxUrl: String = js.native
  var virtualserverHostbuttonTooltip: String = js.native
  var virtualserverHostbuttonUrl: String = js.native
  var virtualserverHostmessage: String = js.native
  var virtualserverHostmessageMode: Double = js.native
  var virtualserverIconId: String = js.native
  var virtualserverLogChannel: Double = js.native
  var virtualserverLogClient: Double = js.native
  var virtualserverLogFiletransfer: Double = js.native
  var virtualserverLogPermissions: Double = js.native
  var virtualserverLogQuery: Double = js.native
  var virtualserverLogServer: Double = js.native
  var virtualserverMaxDownloadTotalBandwidth: Double = js.native
  var virtualserverMaxUploadTotalBandwidth: Double = js.native
  var virtualserverMaxclients: Double = js.native
  var virtualserverMinAndroidVersion: Double = js.native
  var virtualserverMinClientVersion: Double = js.native
  var virtualserverMinClientsInChannelBeforeForcedSilence: Double = js.native
  var virtualserverMinIosVersion: Double = js.native
  var virtualserverName: String = js.native
  var virtualserverNamePhonetic: String = js.native
  var virtualserverNeededIdentitySecurityLevel: Double = js.native
  var virtualserverNickname: String = js.native
  var virtualserverPassword: String = js.native
  var virtualserverPrioritySpeakerDimmModificator: Double = js.native
  var virtualserverQueryclientsonline: Double = js.native
  var virtualserverReservedSlots: Double = js.native
  var virtualserverStatus: String = js.native
  var virtualserverTotalBytesDownloaded: Double = js.native
  var virtualserverTotalBytesUploaded: Double = js.native
  var virtualserverTotalPacketlossTotal: Double = js.native
  var virtualserverTotalPing: Double = js.native
  var virtualserverUniqueIdentifier: String = js.native
  var virtualserverUploadQuota: Double = js.native
  var virtualserverWeblistEnabled: Double = js.native
  var virtualserverWelcomemessage: String = js.native
}

object ServerInfo {
  @scala.inline
  def apply(
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedControl: Double,
    connectionBytesReceivedKeepalive: Double,
    connectionBytesReceivedSpeech: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentControl: Double,
    connectionBytesSentKeepalive: Double,
    connectionBytesSentSpeech: Double,
    connectionBytesSentTotal: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionFiletransferBytesReceivedTotal: Double,
    connectionFiletransferBytesSentTotal: Double,
    connectionPacketsReceivedControl: Double,
    connectionPacketsReceivedKeepalive: Double,
    connectionPacketsReceivedSpeech: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentControl: Double,
    connectionPacketsSentKeepalive: Double,
    connectionPacketsSentSpeech: Double,
    connectionPacketsSentTotal: Double,
    virtualserverAntifloodPointsNeededCommandBlock: Double,
    virtualserverAntifloodPointsNeededIpBlock: Double,
    virtualserverAntifloodPointsNeededPluginBlock: Double,
    virtualserverAntifloodPointsTickReduce: Double,
    virtualserverChannelTempDeleteDelayDefault: Double,
    virtualserverChannelsonline: Double,
    virtualserverClientsonline: Double,
    virtualserverCodecEncryptionMode: Double,
    virtualserverComplainAutobanCount: Double,
    virtualserverComplainAutobanTime: Double,
    virtualserverComplainRemoveTime: Double,
    virtualserverCreated: Double,
    virtualserverDefaultChannelAdminGroup: String,
    virtualserverDefaultChannelGroup: String,
    virtualserverDefaultServerGroup: String,
    virtualserverDownloadQuota: Double,
    virtualserverFilebase: String,
    virtualserverFlagPassword: Boolean,
    virtualserverHostbannerGfxInterval: Double,
    virtualserverHostbannerGfxUrl: String,
    virtualserverHostbannerMode: Double,
    virtualserverHostbannerUrl: String,
    virtualserverHostbuttonGfxUrl: String,
    virtualserverHostbuttonTooltip: String,
    virtualserverHostbuttonUrl: String,
    virtualserverHostmessage: String,
    virtualserverHostmessageMode: Double,
    virtualserverIconId: String,
    virtualserverLogChannel: Double,
    virtualserverLogClient: Double,
    virtualserverLogFiletransfer: Double,
    virtualserverLogPermissions: Double,
    virtualserverLogQuery: Double,
    virtualserverLogServer: Double,
    virtualserverMaxDownloadTotalBandwidth: Double,
    virtualserverMaxUploadTotalBandwidth: Double,
    virtualserverMaxclients: Double,
    virtualserverMinAndroidVersion: Double,
    virtualserverMinClientVersion: Double,
    virtualserverMinClientsInChannelBeforeForcedSilence: Double,
    virtualserverMinIosVersion: Double,
    virtualserverName: String,
    virtualserverNamePhonetic: String,
    virtualserverNeededIdentitySecurityLevel: Double,
    virtualserverNickname: String,
    virtualserverPassword: String,
    virtualserverPrioritySpeakerDimmModificator: Double,
    virtualserverQueryclientsonline: Double,
    virtualserverReservedSlots: Double,
    virtualserverStatus: String,
    virtualserverTotalBytesDownloaded: Double,
    virtualserverTotalBytesUploaded: Double,
    virtualserverTotalPacketlossTotal: Double,
    virtualserverTotalPing: Double,
    virtualserverUniqueIdentifier: String,
    virtualserverUploadQuota: Double,
    virtualserverWeblistEnabled: Double,
    virtualserverWelcomemessage: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedControl = connectionBytesReceivedControl.asInstanceOf[js.Any], connectionBytesReceivedKeepalive = connectionBytesReceivedKeepalive.asInstanceOf[js.Any], connectionBytesReceivedSpeech = connectionBytesReceivedSpeech.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentControl = connectionBytesSentControl.asInstanceOf[js.Any], connectionBytesSentKeepalive = connectionBytesSentKeepalive.asInstanceOf[js.Any], connectionBytesSentSpeech = connectionBytesSentSpeech.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionFiletransferBytesReceivedTotal = connectionFiletransferBytesReceivedTotal.asInstanceOf[js.Any], connectionFiletransferBytesSentTotal = connectionFiletransferBytesSentTotal.asInstanceOf[js.Any], connectionPacketsReceivedControl = connectionPacketsReceivedControl.asInstanceOf[js.Any], connectionPacketsReceivedKeepalive = connectionPacketsReceivedKeepalive.asInstanceOf[js.Any], connectionPacketsReceivedSpeech = connectionPacketsReceivedSpeech.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentControl = connectionPacketsSentControl.asInstanceOf[js.Any], connectionPacketsSentKeepalive = connectionPacketsSentKeepalive.asInstanceOf[js.Any], connectionPacketsSentSpeech = connectionPacketsSentSpeech.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededCommandBlock = virtualserverAntifloodPointsNeededCommandBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededIpBlock = virtualserverAntifloodPointsNeededIpBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsNeededPluginBlock = virtualserverAntifloodPointsNeededPluginBlock.asInstanceOf[js.Any], virtualserverAntifloodPointsTickReduce = virtualserverAntifloodPointsTickReduce.asInstanceOf[js.Any], virtualserverChannelTempDeleteDelayDefault = virtualserverChannelTempDeleteDelayDefault.asInstanceOf[js.Any], virtualserverChannelsonline = virtualserverChannelsonline.asInstanceOf[js.Any], virtualserverClientsonline = virtualserverClientsonline.asInstanceOf[js.Any], virtualserverCodecEncryptionMode = virtualserverCodecEncryptionMode.asInstanceOf[js.Any], virtualserverComplainAutobanCount = virtualserverComplainAutobanCount.asInstanceOf[js.Any], virtualserverComplainAutobanTime = virtualserverComplainAutobanTime.asInstanceOf[js.Any], virtualserverComplainRemoveTime = virtualserverComplainRemoveTime.asInstanceOf[js.Any], virtualserverCreated = virtualserverCreated.asInstanceOf[js.Any], virtualserverDefaultChannelAdminGroup = virtualserverDefaultChannelAdminGroup.asInstanceOf[js.Any], virtualserverDefaultChannelGroup = virtualserverDefaultChannelGroup.asInstanceOf[js.Any], virtualserverDefaultServerGroup = virtualserverDefaultServerGroup.asInstanceOf[js.Any], virtualserverDownloadQuota = virtualserverDownloadQuota.asInstanceOf[js.Any], virtualserverFilebase = virtualserverFilebase.asInstanceOf[js.Any], virtualserverFlagPassword = virtualserverFlagPassword.asInstanceOf[js.Any], virtualserverHostbannerGfxInterval = virtualserverHostbannerGfxInterval.asInstanceOf[js.Any], virtualserverHostbannerGfxUrl = virtualserverHostbannerGfxUrl.asInstanceOf[js.Any], virtualserverHostbannerMode = virtualserverHostbannerMode.asInstanceOf[js.Any], virtualserverHostbannerUrl = virtualserverHostbannerUrl.asInstanceOf[js.Any], virtualserverHostbuttonGfxUrl = virtualserverHostbuttonGfxUrl.asInstanceOf[js.Any], virtualserverHostbuttonTooltip = virtualserverHostbuttonTooltip.asInstanceOf[js.Any], virtualserverHostbuttonUrl = virtualserverHostbuttonUrl.asInstanceOf[js.Any], virtualserverHostmessage = virtualserverHostmessage.asInstanceOf[js.Any], virtualserverHostmessageMode = virtualserverHostmessageMode.asInstanceOf[js.Any], virtualserverIconId = virtualserverIconId.asInstanceOf[js.Any], virtualserverLogChannel = virtualserverLogChannel.asInstanceOf[js.Any], virtualserverLogClient = virtualserverLogClient.asInstanceOf[js.Any], virtualserverLogFiletransfer = virtualserverLogFiletransfer.asInstanceOf[js.Any], virtualserverLogPermissions = virtualserverLogPermissions.asInstanceOf[js.Any], virtualserverLogQuery = virtualserverLogQuery.asInstanceOf[js.Any], virtualserverLogServer = virtualserverLogServer.asInstanceOf[js.Any], virtualserverMaxDownloadTotalBandwidth = virtualserverMaxDownloadTotalBandwidth.asInstanceOf[js.Any], virtualserverMaxUploadTotalBandwidth = virtualserverMaxUploadTotalBandwidth.asInstanceOf[js.Any], virtualserverMaxclients = virtualserverMaxclients.asInstanceOf[js.Any], virtualserverMinAndroidVersion = virtualserverMinAndroidVersion.asInstanceOf[js.Any], virtualserverMinClientVersion = virtualserverMinClientVersion.asInstanceOf[js.Any], virtualserverMinClientsInChannelBeforeForcedSilence = virtualserverMinClientsInChannelBeforeForcedSilence.asInstanceOf[js.Any], virtualserverMinIosVersion = virtualserverMinIosVersion.asInstanceOf[js.Any], virtualserverName = virtualserverName.asInstanceOf[js.Any], virtualserverNamePhonetic = virtualserverNamePhonetic.asInstanceOf[js.Any], virtualserverNeededIdentitySecurityLevel = virtualserverNeededIdentitySecurityLevel.asInstanceOf[js.Any], virtualserverNickname = virtualserverNickname.asInstanceOf[js.Any], virtualserverPassword = virtualserverPassword.asInstanceOf[js.Any], virtualserverPrioritySpeakerDimmModificator = virtualserverPrioritySpeakerDimmModificator.asInstanceOf[js.Any], virtualserverQueryclientsonline = virtualserverQueryclientsonline.asInstanceOf[js.Any], virtualserverReservedSlots = virtualserverReservedSlots.asInstanceOf[js.Any], virtualserverStatus = virtualserverStatus.asInstanceOf[js.Any], virtualserverTotalBytesDownloaded = virtualserverTotalBytesDownloaded.asInstanceOf[js.Any], virtualserverTotalBytesUploaded = virtualserverTotalBytesUploaded.asInstanceOf[js.Any], virtualserverTotalPacketlossTotal = virtualserverTotalPacketlossTotal.asInstanceOf[js.Any], virtualserverTotalPing = virtualserverTotalPing.asInstanceOf[js.Any], virtualserverUniqueIdentifier = virtualserverUniqueIdentifier.asInstanceOf[js.Any], virtualserverUploadQuota = virtualserverUploadQuota.asInstanceOf[js.Any], virtualserverWeblistEnabled = virtualserverWeblistEnabled.asInstanceOf[js.Any], virtualserverWelcomemessage = virtualserverWelcomemessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
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
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = this.set("connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesReceivedControl(value: Double): Self = this.set("connectionBytesReceivedControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesReceivedKeepalive(value: Double): Self = this.set("connectionBytesReceivedKeepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesReceivedSpeech(value: Double): Self = this.set("connectionBytesReceivedSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = this.set("connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesSentControl(value: Double): Self = this.set("connectionBytesSentControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesSentKeepalive(value: Double): Self = this.set("connectionBytesSentKeepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesSentSpeech(value: Double): Self = this.set("connectionBytesSentSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = this.set("connectionBytesSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = this.set("connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = this.set("connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesReceivedTotal(value: Double): Self = this.set("connectionFiletransferBytesReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionFiletransferBytesSentTotal(value: Double): Self = this.set("connectionFiletransferBytesSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedControl(value: Double): Self = this.set("connectionPacketsReceivedControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedKeepalive(value: Double): Self = this.set("connectionPacketsReceivedKeepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedSpeech(value: Double): Self = this.set("connectionPacketsReceivedSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = this.set("connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentControl(value: Double): Self = this.set("connectionPacketsSentControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentKeepalive(value: Double): Self = this.set("connectionPacketsSentKeepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentSpeech(value: Double): Self = this.set("connectionPacketsSentSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = this.set("connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverAntifloodPointsNeededCommandBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededCommandBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverAntifloodPointsNeededIpBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededIpBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverAntifloodPointsNeededPluginBlock(value: Double): Self = this.set("virtualserverAntifloodPointsNeededPluginBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverAntifloodPointsTickReduce(value: Double): Self = this.set("virtualserverAntifloodPointsTickReduce", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverChannelTempDeleteDelayDefault(value: Double): Self = this.set("virtualserverChannelTempDeleteDelayDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverChannelsonline(value: Double): Self = this.set("virtualserverChannelsonline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = this.set("virtualserverClientsonline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverCodecEncryptionMode(value: Double): Self = this.set("virtualserverCodecEncryptionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverComplainAutobanCount(value: Double): Self = this.set("virtualserverComplainAutobanCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverComplainAutobanTime(value: Double): Self = this.set("virtualserverComplainAutobanTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverComplainRemoveTime(value: Double): Self = this.set("virtualserverComplainRemoveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverCreated(value: Double): Self = this.set("virtualserverCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverDefaultChannelAdminGroup(value: String): Self = this.set("virtualserverDefaultChannelAdminGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverDefaultChannelGroup(value: String): Self = this.set("virtualserverDefaultChannelGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverDefaultServerGroup(value: String): Self = this.set("virtualserverDefaultServerGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverDownloadQuota(value: Double): Self = this.set("virtualserverDownloadQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverFilebase(value: String): Self = this.set("virtualserverFilebase", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverFlagPassword(value: Boolean): Self = this.set("virtualserverFlagPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbannerGfxInterval(value: Double): Self = this.set("virtualserverHostbannerGfxInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbannerGfxUrl(value: String): Self = this.set("virtualserverHostbannerGfxUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbannerMode(value: Double): Self = this.set("virtualserverHostbannerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbannerUrl(value: String): Self = this.set("virtualserverHostbannerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbuttonGfxUrl(value: String): Self = this.set("virtualserverHostbuttonGfxUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbuttonTooltip(value: String): Self = this.set("virtualserverHostbuttonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostbuttonUrl(value: String): Self = this.set("virtualserverHostbuttonUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostmessage(value: String): Self = this.set("virtualserverHostmessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverHostmessageMode(value: Double): Self = this.set("virtualserverHostmessageMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverIconId(value: String): Self = this.set("virtualserverIconId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogChannel(value: Double): Self = this.set("virtualserverLogChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogClient(value: Double): Self = this.set("virtualserverLogClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogFiletransfer(value: Double): Self = this.set("virtualserverLogFiletransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogPermissions(value: Double): Self = this.set("virtualserverLogPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogQuery(value: Double): Self = this.set("virtualserverLogQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverLogServer(value: Double): Self = this.set("virtualserverLogServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMaxDownloadTotalBandwidth(value: Double): Self = this.set("virtualserverMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMaxUploadTotalBandwidth(value: Double): Self = this.set("virtualserverMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = this.set("virtualserverMaxclients", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMinAndroidVersion(value: Double): Self = this.set("virtualserverMinAndroidVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMinClientVersion(value: Double): Self = this.set("virtualserverMinClientVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMinClientsInChannelBeforeForcedSilence(value: Double): Self = this.set("virtualserverMinClientsInChannelBeforeForcedSilence", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverMinIosVersion(value: Double): Self = this.set("virtualserverMinIosVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverName(value: String): Self = this.set("virtualserverName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverNamePhonetic(value: String): Self = this.set("virtualserverNamePhonetic", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverNeededIdentitySecurityLevel(value: Double): Self = this.set("virtualserverNeededIdentitySecurityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverNickname(value: String): Self = this.set("virtualserverNickname", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverPassword(value: String): Self = this.set("virtualserverPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverPrioritySpeakerDimmModificator(value: Double): Self = this.set("virtualserverPrioritySpeakerDimmModificator", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = this.set("virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverReservedSlots(value: Double): Self = this.set("virtualserverReservedSlots", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverStatus(value: String): Self = this.set("virtualserverStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverTotalBytesDownloaded(value: Double): Self = this.set("virtualserverTotalBytesDownloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverTotalBytesUploaded(value: Double): Self = this.set("virtualserverTotalBytesUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverTotalPacketlossTotal(value: Double): Self = this.set("virtualserverTotalPacketlossTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverTotalPing(value: Double): Self = this.set("virtualserverTotalPing", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = this.set("virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverUploadQuota(value: Double): Self = this.set("virtualserverUploadQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverWeblistEnabled(value: Double): Self = this.set("virtualserverWeblistEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualserverWelcomemessage(value: String): Self = this.set("virtualserverWelcomemessage", value.asInstanceOf[js.Any])
  }
  
}

