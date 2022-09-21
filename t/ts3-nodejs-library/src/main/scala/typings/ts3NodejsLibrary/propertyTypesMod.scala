package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode
import typings.ts3NodejsLibrary.enumMod.HostBannerMode
import typings.ts3NodejsLibrary.enumMod.HostMessageMode
import typings.ts3NodejsLibrary.enumMod.VirtualServerStatus
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyTypesMod {
  
  trait ApiKeyAdd
    extends StObject
       with ResponseEntry {
    
    var cldbid: js.UndefOr[String] = js.undefined
    
    var lifetime: js.UndefOr[Double] = js.undefined
    
    var scope: ApiKeyScope
  }
  object ApiKeyAdd {
    
    inline def apply(scope: ApiKeyScope): ApiKeyAdd = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyAdd]
    }
    
    extension [Self <: ApiKeyAdd](x: Self) {
      
      inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
      
      inline def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setScope(value: ApiKeyScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApiKeyList
    extends StObject
       with ResponseEntry {
    
    /** database ids to list  */
    var cldbid: js.UndefOr[String | Asterisk] = js.undefined
    
    /** amount of entries to retrieve */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** offset from where the list should start */
    var start: js.UndefOr[Double] = js.undefined
  }
  object ApiKeyList {
    
    inline def apply(): ApiKeyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyList]
    }
    
    extension [Self <: ApiKeyList](x: Self) {
      
      inline def setCldbid(value: String | Asterisk): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
      
      inline def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait BanAdd
    extends StObject
       with ResponseEntry {
    
    /** ban reason */
    var banreason: String
    
    /** ip regular expression */
    var ip: js.UndefOr[String] = js.undefined
    
    /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
    var mytsid: js.UndefOr[String] = js.undefined
    
    /** name regular expression */
    var name: js.UndefOr[String] = js.undefined
    
    /** bantime in seconds, if left empty it will result in a permaban */
    var time: js.UndefOr[Double] = js.undefined
    
    /** uid regular expression */
    var uid: js.UndefOr[String] = js.undefined
  }
  object BanAdd {
    
    inline def apply(banreason: String): BanAdd = {
      val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanAdd]
    }
    
    extension [Self <: BanAdd](x: Self) {
      
      inline def setBanreason(value: String): Self = StObject.set(x, "banreason", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setMytsid(value: String): Self = StObject.set(x, "mytsid", value.asInstanceOf[js.Any])
      
      inline def setMytsidUndefined: Self = StObject.set(x, "mytsid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait BanClient
    extends StObject
       with ResponseEntry {
    
    /** ban reason */
    var banreason: String
    
    var clid: String | js.Array[String]
    
    /** ignore errors  */
    var continueOnError: js.UndefOr[Boolean] = js.undefined
    
    /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
    var mytsid: js.UndefOr[String] = js.undefined
    
    /** bantime in seconds, if left empty it will result in a permaban */
    var time: js.UndefOr[Double] = js.undefined
  }
  object BanClient {
    
    inline def apply(banreason: String, clid: String | js.Array[String]): BanClient = {
      val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanClient]
    }
    
    extension [Self <: BanClient](x: Self) {
      
      inline def setBanreason(value: String): Self = StObject.set(x, "banreason", value.asInstanceOf[js.Any])
      
      inline def setClid(value: String | js.Array[String]): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
      
      inline def setClidVarargs(value: String*): Self = StObject.set(x, "clid", js.Array(value*))
      
      inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      inline def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      inline def setMytsid(value: String): Self = StObject.set(x, "mytsid", value.asInstanceOf[js.Any])
      
      inline def setMytsidUndefined: Self = StObject.set(x, "mytsid", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait ChannelEdit
    extends StObject
       with ResponseEntry {
    
    var channelCodec: js.UndefOr[Codec] = js.undefined
    
    var channelCodecIsUnencrypted: js.UndefOr[Boolean] = js.undefined
    
    var channelCodecQuality: js.UndefOr[Double] = js.undefined
    
    var channelDescription: js.UndefOr[String] = js.undefined
    
    var channelFlagDefault: js.UndefOr[Boolean] = js.undefined
    
    var channelFlagMaxclientsUnlimited: js.UndefOr[Boolean] = js.undefined
    
    var channelFlagMaxfamilyclientsInherited: js.UndefOr[Boolean] = js.undefined
    
    var channelFlagPermanent: js.UndefOr[Boolean] = js.undefined
    
    var channelFlagSemiPermanent: js.UndefOr[Boolean] = js.undefined
    
    var channelFlagTemporary: js.UndefOr[Boolean] = js.undefined
    
    var channelMaxclients: js.UndefOr[Double] = js.undefined
    
    var channelMaxfamilyclients: js.UndefOr[Double] = js.undefined
    
    var channelName: js.UndefOr[String] = js.undefined
    
    var channelNamePhonetic: js.UndefOr[String] = js.undefined
    
    var channelNeededTalkPower: js.UndefOr[Double] = js.undefined
    
    var channelOrder: js.UndefOr[Double] = js.undefined
    
    var channelPassword: js.UndefOr[String] = js.undefined
    
    var channelTopic: js.UndefOr[String] = js.undefined
    
    var cid: js.UndefOr[String] = js.undefined
    
    var cpid: js.UndefOr[String] = js.undefined
  }
  object ChannelEdit {
    
    inline def apply(): ChannelEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelEdit]
    }
    
    extension [Self <: ChannelEdit](x: Self) {
      
      inline def setChannelCodec(value: Codec): Self = StObject.set(x, "channelCodec", value.asInstanceOf[js.Any])
      
      inline def setChannelCodecIsUnencrypted(value: Boolean): Self = StObject.set(x, "channelCodecIsUnencrypted", value.asInstanceOf[js.Any])
      
      inline def setChannelCodecIsUnencryptedUndefined: Self = StObject.set(x, "channelCodecIsUnencrypted", js.undefined)
      
      inline def setChannelCodecQuality(value: Double): Self = StObject.set(x, "channelCodecQuality", value.asInstanceOf[js.Any])
      
      inline def setChannelCodecQualityUndefined: Self = StObject.set(x, "channelCodecQuality", js.undefined)
      
      inline def setChannelCodecUndefined: Self = StObject.set(x, "channelCodec", js.undefined)
      
      inline def setChannelDescription(value: String): Self = StObject.set(x, "channelDescription", value.asInstanceOf[js.Any])
      
      inline def setChannelDescriptionUndefined: Self = StObject.set(x, "channelDescription", js.undefined)
      
      inline def setChannelFlagDefault(value: Boolean): Self = StObject.set(x, "channelFlagDefault", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagDefaultUndefined: Self = StObject.set(x, "channelFlagDefault", js.undefined)
      
      inline def setChannelFlagMaxclientsUnlimited(value: Boolean): Self = StObject.set(x, "channelFlagMaxclientsUnlimited", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagMaxclientsUnlimitedUndefined: Self = StObject.set(x, "channelFlagMaxclientsUnlimited", js.undefined)
      
      inline def setChannelFlagMaxfamilyclientsInherited(value: Boolean): Self = StObject.set(x, "channelFlagMaxfamilyclientsInherited", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagMaxfamilyclientsInheritedUndefined: Self = StObject.set(x, "channelFlagMaxfamilyclientsInherited", js.undefined)
      
      inline def setChannelFlagPermanent(value: Boolean): Self = StObject.set(x, "channelFlagPermanent", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagPermanentUndefined: Self = StObject.set(x, "channelFlagPermanent", js.undefined)
      
      inline def setChannelFlagSemiPermanent(value: Boolean): Self = StObject.set(x, "channelFlagSemiPermanent", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagSemiPermanentUndefined: Self = StObject.set(x, "channelFlagSemiPermanent", js.undefined)
      
      inline def setChannelFlagTemporary(value: Boolean): Self = StObject.set(x, "channelFlagTemporary", value.asInstanceOf[js.Any])
      
      inline def setChannelFlagTemporaryUndefined: Self = StObject.set(x, "channelFlagTemporary", js.undefined)
      
      inline def setChannelMaxclients(value: Double): Self = StObject.set(x, "channelMaxclients", value.asInstanceOf[js.Any])
      
      inline def setChannelMaxclientsUndefined: Self = StObject.set(x, "channelMaxclients", js.undefined)
      
      inline def setChannelMaxfamilyclients(value: Double): Self = StObject.set(x, "channelMaxfamilyclients", value.asInstanceOf[js.Any])
      
      inline def setChannelMaxfamilyclientsUndefined: Self = StObject.set(x, "channelMaxfamilyclients", js.undefined)
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNamePhonetic(value: String): Self = StObject.set(x, "channelNamePhonetic", value.asInstanceOf[js.Any])
      
      inline def setChannelNamePhoneticUndefined: Self = StObject.set(x, "channelNamePhonetic", js.undefined)
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      inline def setChannelNeededTalkPower(value: Double): Self = StObject.set(x, "channelNeededTalkPower", value.asInstanceOf[js.Any])
      
      inline def setChannelNeededTalkPowerUndefined: Self = StObject.set(x, "channelNeededTalkPower", js.undefined)
      
      inline def setChannelOrder(value: Double): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
      
      inline def setChannelOrderUndefined: Self = StObject.set(x, "channelOrder", js.undefined)
      
      inline def setChannelPassword(value: String): Self = StObject.set(x, "channelPassword", value.asInstanceOf[js.Any])
      
      inline def setChannelPasswordUndefined: Self = StObject.set(x, "channelPassword", js.undefined)
      
      inline def setChannelTopic(value: String): Self = StObject.set(x, "channelTopic", value.asInstanceOf[js.Any])
      
      inline def setChannelTopicUndefined: Self = StObject.set(x, "channelTopic", js.undefined)
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setCpid(value: String): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
      
      inline def setCpidUndefined: Self = StObject.set(x, "cpid", js.undefined)
    }
  }
  
  trait ClientDBEdit
    extends StObject
       with ResponseEntry {
    
    var clientDescription: String
  }
  object ClientDBEdit {
    
    inline def apply(clientDescription: String): ClientDBEdit = {
      val __obj = js.Dynamic.literal(clientDescription = clientDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDBEdit]
    }
    
    extension [Self <: ClientDBEdit](x: Self) {
      
      inline def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientEdit
    extends StObject
       with ResponseEntry {
    
    var clientDescription: js.UndefOr[String] = js.undefined
    
    var clientIsTalker: js.UndefOr[Boolean] = js.undefined
  }
  object ClientEdit {
    
    inline def apply(): ClientEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientEdit]
    }
    
    extension [Self <: ClientEdit](x: Self) {
      
      inline def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
      
      inline def setClientDescriptionUndefined: Self = StObject.set(x, "clientDescription", js.undefined)
      
      inline def setClientIsTalker(value: Boolean): Self = StObject.set(x, "clientIsTalker", value.asInstanceOf[js.Any])
      
      inline def setClientIsTalkerUndefined: Self = StObject.set(x, "clientIsTalker", js.undefined)
    }
  }
  
  trait ClientUpdate
    extends StObject
       with ResponseEntry {
    
    var clientNickname: String
  }
  object ClientUpdate {
    
    inline def apply(clientNickname: String): ClientUpdate = {
      val __obj = js.Dynamic.literal(clientNickname = clientNickname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientUpdate]
    }
    
    extension [Self <: ClientUpdate](x: Self) {
      
      inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstanceEdit
    extends StObject
       with ResponseEntry {
    
    var serverinstanceFiletransferPort: js.UndefOr[Double] = js.undefined
    
    var serverinstanceMaxDownloadTotalBandwidth: js.UndefOr[Double] = js.undefined
    
    var serverinstanceMaxUploadTotalBandwidth: js.UndefOr[Double] = js.undefined
    
    var serverinstanceServerqueryFloodBanTime: js.UndefOr[Double] = js.undefined
    
    var serverinstanceServerqueryFloodCommands: js.UndefOr[Double] = js.undefined
    
    var serverinstanceServerqueryFloodTime: js.UndefOr[Double] = js.undefined
    
    var serverinstanceTemplateChanneladminGroup: js.UndefOr[String] = js.undefined
    
    var serverinstanceTemplateChanneldefaultGroup: js.UndefOr[String] = js.undefined
    
    var serverinstanceTemplateServeradminGroup: js.UndefOr[String] = js.undefined
    
    var serverinstanceTemplateServerdefaultGroup: js.UndefOr[String] = js.undefined
  }
  object InstanceEdit {
    
    inline def apply(): InstanceEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceEdit]
    }
    
    extension [Self <: InstanceEdit](x: Self) {
      
      inline def setServerinstanceFiletransferPort(value: Double): Self = StObject.set(x, "serverinstanceFiletransferPort", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceFiletransferPortUndefined: Self = StObject.set(x, "serverinstanceFiletransferPort", js.undefined)
      
      inline def setServerinstanceMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceMaxDownloadTotalBandwidthUndefined: Self = StObject.set(x, "serverinstanceMaxDownloadTotalBandwidth", js.undefined)
      
      inline def setServerinstanceMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceMaxUploadTotalBandwidthUndefined: Self = StObject.set(x, "serverinstanceMaxUploadTotalBandwidth", js.undefined)
      
      inline def setServerinstanceServerqueryFloodBanTime(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodBanTime", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceServerqueryFloodBanTimeUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodBanTime", js.undefined)
      
      inline def setServerinstanceServerqueryFloodCommands(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodCommands", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceServerqueryFloodCommandsUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodCommands", js.undefined)
      
      inline def setServerinstanceServerqueryFloodTime(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodTime", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceServerqueryFloodTimeUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodTime", js.undefined)
      
      inline def setServerinstanceTemplateChanneladminGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneladminGroup", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceTemplateChanneladminGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateChanneladminGroup", js.undefined)
      
      inline def setServerinstanceTemplateChanneldefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneldefaultGroup", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceTemplateChanneldefaultGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateChanneldefaultGroup", js.undefined)
      
      inline def setServerinstanceTemplateServeradminGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateServeradminGroup", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceTemplateServeradminGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateServeradminGroup", js.undefined)
      
      inline def setServerinstanceTemplateServerdefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateServerdefaultGroup", value.asInstanceOf[js.Any])
      
      inline def setServerinstanceTemplateServerdefaultGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateServerdefaultGroup", js.undefined)
    }
  }
  
  trait ServerEdit
    extends StObject
       with ResponseEntry {
    
    var virtualserverAntifloodPointsNeededCommandBlock: js.UndefOr[Double] = js.undefined
    
    var virtualserverAntifloodPointsNeededIpBlock: js.UndefOr[Double] = js.undefined
    
    var virtualserverAntifloodPointsNeededPluginBlock: js.UndefOr[Double] = js.undefined
    
    var virtualserverAntifloodPointsTickReduce: js.UndefOr[Double] = js.undefined
    
    var virtualserverAutostart: js.UndefOr[Double] = js.undefined
    
    var virtualserverCodecEncryptionMode: js.UndefOr[CodecEncryptionMode] = js.undefined
    
    var virtualserverComplainAutobanCount: js.UndefOr[Double] = js.undefined
    
    var virtualserverComplainAutobanTime: js.UndefOr[Double] = js.undefined
    
    var virtualserverComplainRemoveTime: js.UndefOr[Double] = js.undefined
    
    var virtualserverDefaultChannelAdminGroup: js.UndefOr[Double] = js.undefined
    
    var virtualserverDefaultChannelGroup: js.UndefOr[Double] = js.undefined
    
    var virtualserverDefaultServerGroup: js.UndefOr[Double] = js.undefined
    
    var virtualserverDownloadQuota: js.UndefOr[Double] = js.undefined
    
    var virtualserverHostbannerGfxInterval: js.UndefOr[Double] = js.undefined
    
    var virtualserverHostbannerGfxUrl: js.UndefOr[String] = js.undefined
    
    var virtualserverHostbannerMode: js.UndefOr[HostBannerMode] = js.undefined
    
    var virtualserverHostbannerUrl: js.UndefOr[String] = js.undefined
    
    var virtualserverHostbuttonGfxUrl: js.UndefOr[String] = js.undefined
    
    var virtualserverHostbuttonTooltip: js.UndefOr[String] = js.undefined
    
    var virtualserverHostbuttonUrl: js.UndefOr[String] = js.undefined
    
    var virtualserverHostmessage: js.UndefOr[String] = js.undefined
    
    var virtualserverHostmessageMode: js.UndefOr[HostMessageMode] = js.undefined
    
    var virtualserverIconId: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogChannel: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogClient: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogFiletransfer: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogPermissions: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogQuery: js.UndefOr[Double] = js.undefined
    
    var virtualserverLogServer: js.UndefOr[Double] = js.undefined
    
    var virtualserverMachineId: js.UndefOr[String] = js.undefined
    
    var virtualserverMaxDownloadTotalBandwidth: js.UndefOr[Double] = js.undefined
    
    var virtualserverMaxUploadTotalBandwidth: js.UndefOr[Double] = js.undefined
    
    var virtualserverMaxclients: js.UndefOr[Double] = js.undefined
    
    var virtualserverMinAndroidVersion: js.UndefOr[Double] = js.undefined
    
    var virtualserverMinClientVersion: js.UndefOr[Double] = js.undefined
    
    var virtualserverMinClientsInChannelBeforeForcedSilence: js.UndefOr[Double] = js.undefined
    
    var virtualserverMinIosVersion: js.UndefOr[Double] = js.undefined
    
    var virtualserverName: js.UndefOr[String] = js.undefined
    
    var virtualserverNamePhonetic: js.UndefOr[String] = js.undefined
    
    var virtualserverNeededIdentitySecurityLevel: js.UndefOr[Double] = js.undefined
    
    var virtualserverPassword: js.UndefOr[String] = js.undefined
    
    var virtualserverPort: js.UndefOr[Double] = js.undefined
    
    var virtualserverPrioritySpeakerDimmModificator: js.UndefOr[Double] = js.undefined
    
    var virtualserverReservedSlots: js.UndefOr[Double] = js.undefined
    
    var virtualserverStatus: js.UndefOr[VirtualServerStatus] = js.undefined
    
    var virtualserverUploadQuota: js.UndefOr[Double] = js.undefined
    
    var virtualserverWeblistEnabled: js.UndefOr[Double] = js.undefined
    
    var virtualserverWelcomemessage: js.UndefOr[String] = js.undefined
  }
  object ServerEdit {
    
    inline def apply(): ServerEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerEdit]
    }
    
    extension [Self <: ServerEdit](x: Self) {
      
      inline def setVirtualserverAntifloodPointsNeededCommandBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededCommandBlock", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverAntifloodPointsNeededCommandBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededCommandBlock", js.undefined)
      
      inline def setVirtualserverAntifloodPointsNeededIpBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededIpBlock", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverAntifloodPointsNeededIpBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededIpBlock", js.undefined)
      
      inline def setVirtualserverAntifloodPointsNeededPluginBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededPluginBlock", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverAntifloodPointsNeededPluginBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededPluginBlock", js.undefined)
      
      inline def setVirtualserverAntifloodPointsTickReduce(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsTickReduce", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverAntifloodPointsTickReduceUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsTickReduce", js.undefined)
      
      inline def setVirtualserverAutostart(value: Double): Self = StObject.set(x, "virtualserverAutostart", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverAutostartUndefined: Self = StObject.set(x, "virtualserverAutostart", js.undefined)
      
      inline def setVirtualserverCodecEncryptionMode(value: CodecEncryptionMode): Self = StObject.set(x, "virtualserverCodecEncryptionMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverCodecEncryptionModeUndefined: Self = StObject.set(x, "virtualserverCodecEncryptionMode", js.undefined)
      
      inline def setVirtualserverComplainAutobanCount(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanCount", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverComplainAutobanCountUndefined: Self = StObject.set(x, "virtualserverComplainAutobanCount", js.undefined)
      
      inline def setVirtualserverComplainAutobanTime(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanTime", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverComplainAutobanTimeUndefined: Self = StObject.set(x, "virtualserverComplainAutobanTime", js.undefined)
      
      inline def setVirtualserverComplainRemoveTime(value: Double): Self = StObject.set(x, "virtualserverComplainRemoveTime", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverComplainRemoveTimeUndefined: Self = StObject.set(x, "virtualserverComplainRemoveTime", js.undefined)
      
      inline def setVirtualserverDefaultChannelAdminGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultChannelAdminGroup", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverDefaultChannelAdminGroupUndefined: Self = StObject.set(x, "virtualserverDefaultChannelAdminGroup", js.undefined)
      
      inline def setVirtualserverDefaultChannelGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultChannelGroup", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverDefaultChannelGroupUndefined: Self = StObject.set(x, "virtualserverDefaultChannelGroup", js.undefined)
      
      inline def setVirtualserverDefaultServerGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultServerGroup", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverDefaultServerGroupUndefined: Self = StObject.set(x, "virtualserverDefaultServerGroup", js.undefined)
      
      inline def setVirtualserverDownloadQuota(value: Double): Self = StObject.set(x, "virtualserverDownloadQuota", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverDownloadQuotaUndefined: Self = StObject.set(x, "virtualserverDownloadQuota", js.undefined)
      
      inline def setVirtualserverHostbannerGfxInterval(value: Double): Self = StObject.set(x, "virtualserverHostbannerGfxInterval", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbannerGfxIntervalUndefined: Self = StObject.set(x, "virtualserverHostbannerGfxInterval", js.undefined)
      
      inline def setVirtualserverHostbannerGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerGfxUrl", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbannerGfxUrlUndefined: Self = StObject.set(x, "virtualserverHostbannerGfxUrl", js.undefined)
      
      inline def setVirtualserverHostbannerMode(value: HostBannerMode): Self = StObject.set(x, "virtualserverHostbannerMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbannerModeUndefined: Self = StObject.set(x, "virtualserverHostbannerMode", js.undefined)
      
      inline def setVirtualserverHostbannerUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerUrl", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbannerUrlUndefined: Self = StObject.set(x, "virtualserverHostbannerUrl", js.undefined)
      
      inline def setVirtualserverHostbuttonGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonGfxUrl", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbuttonGfxUrlUndefined: Self = StObject.set(x, "virtualserverHostbuttonGfxUrl", js.undefined)
      
      inline def setVirtualserverHostbuttonTooltip(value: String): Self = StObject.set(x, "virtualserverHostbuttonTooltip", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbuttonTooltipUndefined: Self = StObject.set(x, "virtualserverHostbuttonTooltip", js.undefined)
      
      inline def setVirtualserverHostbuttonUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonUrl", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostbuttonUrlUndefined: Self = StObject.set(x, "virtualserverHostbuttonUrl", js.undefined)
      
      inline def setVirtualserverHostmessage(value: String): Self = StObject.set(x, "virtualserverHostmessage", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostmessageMode(value: HostMessageMode): Self = StObject.set(x, "virtualserverHostmessageMode", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverHostmessageModeUndefined: Self = StObject.set(x, "virtualserverHostmessageMode", js.undefined)
      
      inline def setVirtualserverHostmessageUndefined: Self = StObject.set(x, "virtualserverHostmessage", js.undefined)
      
      inline def setVirtualserverIconId(value: Double): Self = StObject.set(x, "virtualserverIconId", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverIconIdUndefined: Self = StObject.set(x, "virtualserverIconId", js.undefined)
      
      inline def setVirtualserverLogChannel(value: Double): Self = StObject.set(x, "virtualserverLogChannel", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogChannelUndefined: Self = StObject.set(x, "virtualserverLogChannel", js.undefined)
      
      inline def setVirtualserverLogClient(value: Double): Self = StObject.set(x, "virtualserverLogClient", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogClientUndefined: Self = StObject.set(x, "virtualserverLogClient", js.undefined)
      
      inline def setVirtualserverLogFiletransfer(value: Double): Self = StObject.set(x, "virtualserverLogFiletransfer", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogFiletransferUndefined: Self = StObject.set(x, "virtualserverLogFiletransfer", js.undefined)
      
      inline def setVirtualserverLogPermissions(value: Double): Self = StObject.set(x, "virtualserverLogPermissions", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogPermissionsUndefined: Self = StObject.set(x, "virtualserverLogPermissions", js.undefined)
      
      inline def setVirtualserverLogQuery(value: Double): Self = StObject.set(x, "virtualserverLogQuery", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogQueryUndefined: Self = StObject.set(x, "virtualserverLogQuery", js.undefined)
      
      inline def setVirtualserverLogServer(value: Double): Self = StObject.set(x, "virtualserverLogServer", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverLogServerUndefined: Self = StObject.set(x, "virtualserverLogServer", js.undefined)
      
      inline def setVirtualserverMachineId(value: String): Self = StObject.set(x, "virtualserverMachineId", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMachineIdUndefined: Self = StObject.set(x, "virtualserverMachineId", js.undefined)
      
      inline def setVirtualserverMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMaxDownloadTotalBandwidthUndefined: Self = StObject.set(x, "virtualserverMaxDownloadTotalBandwidth", js.undefined)
      
      inline def setVirtualserverMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMaxUploadTotalBandwidthUndefined: Self = StObject.set(x, "virtualserverMaxUploadTotalBandwidth", js.undefined)
      
      inline def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMaxclientsUndefined: Self = StObject.set(x, "virtualserverMaxclients", js.undefined)
      
      inline def setVirtualserverMinAndroidVersion(value: Double): Self = StObject.set(x, "virtualserverMinAndroidVersion", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMinAndroidVersionUndefined: Self = StObject.set(x, "virtualserverMinAndroidVersion", js.undefined)
      
      inline def setVirtualserverMinClientVersion(value: Double): Self = StObject.set(x, "virtualserverMinClientVersion", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMinClientVersionUndefined: Self = StObject.set(x, "virtualserverMinClientVersion", js.undefined)
      
      inline def setVirtualserverMinClientsInChannelBeforeForcedSilence(value: Double): Self = StObject.set(x, "virtualserverMinClientsInChannelBeforeForcedSilence", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMinClientsInChannelBeforeForcedSilenceUndefined: Self = StObject.set(x, "virtualserverMinClientsInChannelBeforeForcedSilence", js.undefined)
      
      inline def setVirtualserverMinIosVersion(value: Double): Self = StObject.set(x, "virtualserverMinIosVersion", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverMinIosVersionUndefined: Self = StObject.set(x, "virtualserverMinIosVersion", js.undefined)
      
      inline def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverNamePhonetic(value: String): Self = StObject.set(x, "virtualserverNamePhonetic", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverNamePhoneticUndefined: Self = StObject.set(x, "virtualserverNamePhonetic", js.undefined)
      
      inline def setVirtualserverNameUndefined: Self = StObject.set(x, "virtualserverName", js.undefined)
      
      inline def setVirtualserverNeededIdentitySecurityLevel(value: Double): Self = StObject.set(x, "virtualserverNeededIdentitySecurityLevel", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverNeededIdentitySecurityLevelUndefined: Self = StObject.set(x, "virtualserverNeededIdentitySecurityLevel", js.undefined)
      
      inline def setVirtualserverPassword(value: String): Self = StObject.set(x, "virtualserverPassword", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverPasswordUndefined: Self = StObject.set(x, "virtualserverPassword", js.undefined)
      
      inline def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverPortUndefined: Self = StObject.set(x, "virtualserverPort", js.undefined)
      
      inline def setVirtualserverPrioritySpeakerDimmModificator(value: Double): Self = StObject.set(x, "virtualserverPrioritySpeakerDimmModificator", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverPrioritySpeakerDimmModificatorUndefined: Self = StObject.set(x, "virtualserverPrioritySpeakerDimmModificator", js.undefined)
      
      inline def setVirtualserverReservedSlots(value: Double): Self = StObject.set(x, "virtualserverReservedSlots", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverReservedSlotsUndefined: Self = StObject.set(x, "virtualserverReservedSlots", js.undefined)
      
      inline def setVirtualserverStatus(value: VirtualServerStatus): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverStatusUndefined: Self = StObject.set(x, "virtualserverStatus", js.undefined)
      
      inline def setVirtualserverUploadQuota(value: Double): Self = StObject.set(x, "virtualserverUploadQuota", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverUploadQuotaUndefined: Self = StObject.set(x, "virtualserverUploadQuota", js.undefined)
      
      inline def setVirtualserverWeblistEnabled(value: Double): Self = StObject.set(x, "virtualserverWeblistEnabled", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverWeblistEnabledUndefined: Self = StObject.set(x, "virtualserverWeblistEnabled", js.undefined)
      
      inline def setVirtualserverWelcomemessage(value: String): Self = StObject.set(x, "virtualserverWelcomemessage", value.asInstanceOf[js.Any])
      
      inline def setVirtualserverWelcomemessageUndefined: Self = StObject.set(x, "virtualserverWelcomemessage", js.undefined)
    }
  }
  
  trait ServerTempPasswordAdd
    extends StObject
       with ResponseEntry {
    
    /** description of the password */
    var desc: js.UndefOr[String] = js.undefined
    
    /** the duration the password is valid in seconds */
    var duration: Double
    
    /** the temporary password */
    var pw: String
    
    /** the channel to let the user join */
    var tcid: js.UndefOr[String] = js.undefined
    
    /** the password to the channel */
    var tcpw: js.UndefOr[String] = js.undefined
  }
  object ServerTempPasswordAdd {
    
    inline def apply(duration: Double, pw: String): ServerTempPasswordAdd = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTempPasswordAdd]
    }
    
    extension [Self <: ServerTempPasswordAdd](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPw(value: String): Self = StObject.set(x, "pw", value.asInstanceOf[js.Any])
      
      inline def setTcid(value: String): Self = StObject.set(x, "tcid", value.asInstanceOf[js.Any])
      
      inline def setTcidUndefined: Self = StObject.set(x, "tcid", js.undefined)
      
      inline def setTcpw(value: String): Self = StObject.set(x, "tcpw", value.asInstanceOf[js.Any])
      
      inline def setTcpwUndefined: Self = StObject.set(x, "tcpw", js.undefined)
    }
  }
  
  trait TransferDownload
    extends StObject
       with ResponseEntry {
    
    /** channel id to upload to */
    var cid: js.UndefOr[String] = js.undefined
    
    /** arbitary id to identify the transfer */
    var clientftfid: js.UndefOr[Double] = js.undefined
    
    /** channel password of the channel which will be uploaded to */
    var cpw: js.UndefOr[String] = js.undefined
    
    /** destination filename */
    var name: String
    
    var seekpos: js.UndefOr[Double] = js.undefined
  }
  object TransferDownload {
    
    inline def apply(name: String): TransferDownload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferDownload]
    }
    
    extension [Self <: TransferDownload](x: Self) {
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
      
      inline def setClientftfidUndefined: Self = StObject.set(x, "clientftfid", js.undefined)
      
      inline def setCpw(value: String): Self = StObject.set(x, "cpw", value.asInstanceOf[js.Any])
      
      inline def setCpwUndefined: Self = StObject.set(x, "cpw", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSeekpos(value: Double): Self = StObject.set(x, "seekpos", value.asInstanceOf[js.Any])
      
      inline def setSeekposUndefined: Self = StObject.set(x, "seekpos", js.undefined)
    }
  }
  
  trait TransferUpload
    extends StObject
       with ResponseEntry {
    
    /** channel id to upload to */
    var cid: js.UndefOr[String] = js.undefined
    
    /** arbitary id to identify the transfer */
    var clientftfid: js.UndefOr[Double] = js.undefined
    
    /** channel password of the channel which will be uploaded to */
    var cpw: js.UndefOr[String] = js.undefined
    
    /** destination filename */
    var name: String
    
    /** overwrites an existing file */
    var overwrite: js.UndefOr[Double] = js.undefined
    
    var resume: js.UndefOr[Double] = js.undefined
    
    /** size of the file */
    var size: Double
  }
  object TransferUpload {
    
    inline def apply(name: String, size: Double): TransferUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferUpload]
    }
    
    extension [Self <: TransferUpload](x: Self) {
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
      
      inline def setClientftfidUndefined: Self = StObject.set(x, "clientftfid", js.undefined)
      
      inline def setCpw(value: String): Self = StObject.set(x, "cpw", value.asInstanceOf[js.Any])
      
      inline def setCpwUndefined: Self = StObject.set(x, "cpw", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOverwrite(value: Double): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setResume(value: Double): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
