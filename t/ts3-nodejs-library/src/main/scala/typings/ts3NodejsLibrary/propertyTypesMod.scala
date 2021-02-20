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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyTypesMod {
  
  @js.native
  trait ApiKeyAdd extends ResponseEntry {
    
    var cldbid: js.UndefOr[String] = js.native
    
    var lifetime: js.UndefOr[Double] = js.native
    
    var scope: ApiKeyScope = js.native
  }
  object ApiKeyAdd {
    
    @scala.inline
    def apply(scope: ApiKeyScope): ApiKeyAdd = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyAdd]
    }
    
    @scala.inline
    implicit class ApiKeyAddMutableBuilder[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
      
      @scala.inline
      def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      @scala.inline
      def setScope(value: ApiKeyScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApiKeyList extends ResponseEntry {
    
    /** database ids to list  */
    var cldbid: js.UndefOr[String | Asterisk] = js.native
    
    /** amount of entries to retrieve */
    var duration: js.UndefOr[Double] = js.native
    
    /** offset from where the list should start */
    var start: js.UndefOr[Double] = js.native
  }
  object ApiKeyList {
    
    @scala.inline
    def apply(): ApiKeyList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyList]
    }
    
    @scala.inline
    implicit class ApiKeyListMutableBuilder[Self <: ApiKeyList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCldbid(value: String | Asterisk): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait BanAdd extends ResponseEntry {
    
    /** ban reason */
    var banreason: String = js.native
    
    /** ip regular expression */
    var ip: js.UndefOr[String] = js.native
    
    /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
    var mytsid: js.UndefOr[String] = js.native
    
    /** name regular expression */
    var name: js.UndefOr[String] = js.native
    
    /** bantime in seconds, if left empty it will result in a permaban */
    var time: js.UndefOr[Double] = js.native
    
    /** uid regular expression */
    var uid: js.UndefOr[String] = js.native
  }
  object BanAdd {
    
    @scala.inline
    def apply(banreason: String): BanAdd = {
      val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanAdd]
    }
    
    @scala.inline
    implicit class BanAddMutableBuilder[Self <: BanAdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBanreason(value: String): Self = StObject.set(x, "banreason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setMytsid(value: String): Self = StObject.set(x, "mytsid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMytsidUndefined: Self = StObject.set(x, "mytsid", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait BanClient extends ResponseEntry {
    
    /** ban reason */
    var banreason: String = js.native
    
    var clid: String | js.Array[String] = js.native
    
    /** ignore errors  */
    var continueOnError: js.UndefOr[Boolean] = js.native
    
    /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
    var mytsid: js.UndefOr[String] = js.native
    
    /** bantime in seconds, if left empty it will result in a permaban */
    var time: js.UndefOr[Double] = js.native
  }
  object BanClient {
    
    @scala.inline
    def apply(banreason: String, clid: String | js.Array[String]): BanClient = {
      val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanClient]
    }
    
    @scala.inline
    implicit class BanClientMutableBuilder[Self <: BanClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBanreason(value: String): Self = StObject.set(x, "banreason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClid(value: String | js.Array[String]): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClidVarargs(value: String*): Self = StObject.set(x, "clid", js.Array(value :_*))
      
      @scala.inline
      def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      @scala.inline
      def setMytsid(value: String): Self = StObject.set(x, "mytsid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMytsidUndefined: Self = StObject.set(x, "mytsid", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  @js.native
  trait ChannelEdit extends ResponseEntry {
    
    var channelCodec: js.UndefOr[Codec] = js.native
    
    var channelCodecIsUnencrypted: js.UndefOr[Boolean] = js.native
    
    var channelCodecQuality: js.UndefOr[Double] = js.native
    
    var channelDescription: js.UndefOr[String] = js.native
    
    var channelFlagDefault: js.UndefOr[Boolean] = js.native
    
    var channelFlagMaxclientsUnlimited: js.UndefOr[Boolean] = js.native
    
    var channelFlagMaxfamilyclientsInherited: js.UndefOr[Boolean] = js.native
    
    var channelFlagPermanent: js.UndefOr[Boolean] = js.native
    
    var channelFlagSemiPermanent: js.UndefOr[Boolean] = js.native
    
    var channelFlagTemporary: js.UndefOr[Boolean] = js.native
    
    var channelMaxclients: js.UndefOr[Double] = js.native
    
    var channelMaxfamilyclients: js.UndefOr[Double] = js.native
    
    var channelName: js.UndefOr[String] = js.native
    
    var channelNamePhonetic: js.UndefOr[String] = js.native
    
    var channelNeededTalkPower: js.UndefOr[Double] = js.native
    
    var channelOrder: js.UndefOr[Double] = js.native
    
    var channelPassword: js.UndefOr[String] = js.native
    
    var channelTopic: js.UndefOr[String] = js.native
    
    var cid: js.UndefOr[String] = js.native
    
    var cpid: js.UndefOr[String] = js.native
  }
  object ChannelEdit {
    
    @scala.inline
    def apply(): ChannelEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelEdit]
    }
    
    @scala.inline
    implicit class ChannelEditMutableBuilder[Self <: ChannelEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelCodec(value: Codec): Self = StObject.set(x, "channelCodec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCodecIsUnencrypted(value: Boolean): Self = StObject.set(x, "channelCodecIsUnencrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCodecIsUnencryptedUndefined: Self = StObject.set(x, "channelCodecIsUnencrypted", js.undefined)
      
      @scala.inline
      def setChannelCodecQuality(value: Double): Self = StObject.set(x, "channelCodecQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelCodecQualityUndefined: Self = StObject.set(x, "channelCodecQuality", js.undefined)
      
      @scala.inline
      def setChannelCodecUndefined: Self = StObject.set(x, "channelCodec", js.undefined)
      
      @scala.inline
      def setChannelDescription(value: String): Self = StObject.set(x, "channelDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelDescriptionUndefined: Self = StObject.set(x, "channelDescription", js.undefined)
      
      @scala.inline
      def setChannelFlagDefault(value: Boolean): Self = StObject.set(x, "channelFlagDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagDefaultUndefined: Self = StObject.set(x, "channelFlagDefault", js.undefined)
      
      @scala.inline
      def setChannelFlagMaxclientsUnlimited(value: Boolean): Self = StObject.set(x, "channelFlagMaxclientsUnlimited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagMaxclientsUnlimitedUndefined: Self = StObject.set(x, "channelFlagMaxclientsUnlimited", js.undefined)
      
      @scala.inline
      def setChannelFlagMaxfamilyclientsInherited(value: Boolean): Self = StObject.set(x, "channelFlagMaxfamilyclientsInherited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagMaxfamilyclientsInheritedUndefined: Self = StObject.set(x, "channelFlagMaxfamilyclientsInherited", js.undefined)
      
      @scala.inline
      def setChannelFlagPermanent(value: Boolean): Self = StObject.set(x, "channelFlagPermanent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagPermanentUndefined: Self = StObject.set(x, "channelFlagPermanent", js.undefined)
      
      @scala.inline
      def setChannelFlagSemiPermanent(value: Boolean): Self = StObject.set(x, "channelFlagSemiPermanent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagSemiPermanentUndefined: Self = StObject.set(x, "channelFlagSemiPermanent", js.undefined)
      
      @scala.inline
      def setChannelFlagTemporary(value: Boolean): Self = StObject.set(x, "channelFlagTemporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelFlagTemporaryUndefined: Self = StObject.set(x, "channelFlagTemporary", js.undefined)
      
      @scala.inline
      def setChannelMaxclients(value: Double): Self = StObject.set(x, "channelMaxclients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelMaxclientsUndefined: Self = StObject.set(x, "channelMaxclients", js.undefined)
      
      @scala.inline
      def setChannelMaxfamilyclients(value: Double): Self = StObject.set(x, "channelMaxfamilyclients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelMaxfamilyclientsUndefined: Self = StObject.set(x, "channelMaxfamilyclients", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNamePhonetic(value: String): Self = StObject.set(x, "channelNamePhonetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNamePhoneticUndefined: Self = StObject.set(x, "channelNamePhonetic", js.undefined)
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setChannelNeededTalkPower(value: Double): Self = StObject.set(x, "channelNeededTalkPower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNeededTalkPowerUndefined: Self = StObject.set(x, "channelNeededTalkPower", js.undefined)
      
      @scala.inline
      def setChannelOrder(value: Double): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelOrderUndefined: Self = StObject.set(x, "channelOrder", js.undefined)
      
      @scala.inline
      def setChannelPassword(value: String): Self = StObject.set(x, "channelPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelPasswordUndefined: Self = StObject.set(x, "channelPassword", js.undefined)
      
      @scala.inline
      def setChannelTopic(value: String): Self = StObject.set(x, "channelTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelTopicUndefined: Self = StObject.set(x, "channelTopic", js.undefined)
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setCpid(value: String): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpidUndefined: Self = StObject.set(x, "cpid", js.undefined)
    }
  }
  
  @js.native
  trait ClientDBEdit extends ResponseEntry {
    
    var clientDescription: String = js.native
  }
  object ClientDBEdit {
    
    @scala.inline
    def apply(clientDescription: String): ClientDBEdit = {
      val __obj = js.Dynamic.literal(clientDescription = clientDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDBEdit]
    }
    
    @scala.inline
    implicit class ClientDBEditMutableBuilder[Self <: ClientDBEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientEdit extends ResponseEntry {
    
    var clientDescription: js.UndefOr[String] = js.native
    
    var clientIsTalker: js.UndefOr[Boolean] = js.native
  }
  object ClientEdit {
    
    @scala.inline
    def apply(): ClientEdit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientEdit]
    }
    
    @scala.inline
    implicit class ClientEditMutableBuilder[Self <: ClientEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientDescriptionUndefined: Self = StObject.set(x, "clientDescription", js.undefined)
      
      @scala.inline
      def setClientIsTalker(value: Boolean): Self = StObject.set(x, "clientIsTalker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIsTalkerUndefined: Self = StObject.set(x, "clientIsTalker", js.undefined)
    }
  }
  
  @js.native
  trait ClientUpdate extends ResponseEntry {
    
    var clientNickname: String = js.native
  }
  object ClientUpdate {
    
    @scala.inline
    def apply(clientNickname: String): ClientUpdate = {
      val __obj = js.Dynamic.literal(clientNickname = clientNickname.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientUpdate]
    }
    
    @scala.inline
    implicit class ClientUpdateMutableBuilder[Self <: ClientUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class InstanceEditMutableBuilder[Self <: InstanceEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerinstanceFiletransferPort(value: Double): Self = StObject.set(x, "serverinstanceFiletransferPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceFiletransferPortUndefined: Self = StObject.set(x, "serverinstanceFiletransferPort", js.undefined)
      
      @scala.inline
      def setServerinstanceMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceMaxDownloadTotalBandwidthUndefined: Self = StObject.set(x, "serverinstanceMaxDownloadTotalBandwidth", js.undefined)
      
      @scala.inline
      def setServerinstanceMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "serverinstanceMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceMaxUploadTotalBandwidthUndefined: Self = StObject.set(x, "serverinstanceMaxUploadTotalBandwidth", js.undefined)
      
      @scala.inline
      def setServerinstanceServerqueryFloodBanTime(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodBanTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceServerqueryFloodBanTimeUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodBanTime", js.undefined)
      
      @scala.inline
      def setServerinstanceServerqueryFloodCommands(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceServerqueryFloodCommandsUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodCommands", js.undefined)
      
      @scala.inline
      def setServerinstanceServerqueryFloodTime(value: Double): Self = StObject.set(x, "serverinstanceServerqueryFloodTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceServerqueryFloodTimeUndefined: Self = StObject.set(x, "serverinstanceServerqueryFloodTime", js.undefined)
      
      @scala.inline
      def setServerinstanceTemplateChanneladminGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneladminGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceTemplateChanneladminGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateChanneladminGroup", js.undefined)
      
      @scala.inline
      def setServerinstanceTemplateChanneldefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateChanneldefaultGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceTemplateChanneldefaultGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateChanneldefaultGroup", js.undefined)
      
      @scala.inline
      def setServerinstanceTemplateServeradminGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateServeradminGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceTemplateServeradminGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateServeradminGroup", js.undefined)
      
      @scala.inline
      def setServerinstanceTemplateServerdefaultGroup(value: String): Self = StObject.set(x, "serverinstanceTemplateServerdefaultGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerinstanceTemplateServerdefaultGroupUndefined: Self = StObject.set(x, "serverinstanceTemplateServerdefaultGroup", js.undefined)
    }
  }
  
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
    implicit class ServerEditMutableBuilder[Self <: ServerEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededCommandBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededCommandBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededCommandBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededCommandBlock", js.undefined)
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededIpBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededIpBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededIpBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededIpBlock", js.undefined)
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededPluginBlock(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsNeededPluginBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverAntifloodPointsNeededPluginBlockUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsNeededPluginBlock", js.undefined)
      
      @scala.inline
      def setVirtualserverAntifloodPointsTickReduce(value: Double): Self = StObject.set(x, "virtualserverAntifloodPointsTickReduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverAntifloodPointsTickReduceUndefined: Self = StObject.set(x, "virtualserverAntifloodPointsTickReduce", js.undefined)
      
      @scala.inline
      def setVirtualserverAutostart(value: Double): Self = StObject.set(x, "virtualserverAutostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverAutostartUndefined: Self = StObject.set(x, "virtualserverAutostart", js.undefined)
      
      @scala.inline
      def setVirtualserverCodecEncryptionMode(value: CodecEncryptionMode): Self = StObject.set(x, "virtualserverCodecEncryptionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverCodecEncryptionModeUndefined: Self = StObject.set(x, "virtualserverCodecEncryptionMode", js.undefined)
      
      @scala.inline
      def setVirtualserverComplainAutobanCount(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverComplainAutobanCountUndefined: Self = StObject.set(x, "virtualserverComplainAutobanCount", js.undefined)
      
      @scala.inline
      def setVirtualserverComplainAutobanTime(value: Double): Self = StObject.set(x, "virtualserverComplainAutobanTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverComplainAutobanTimeUndefined: Self = StObject.set(x, "virtualserverComplainAutobanTime", js.undefined)
      
      @scala.inline
      def setVirtualserverComplainRemoveTime(value: Double): Self = StObject.set(x, "virtualserverComplainRemoveTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverComplainRemoveTimeUndefined: Self = StObject.set(x, "virtualserverComplainRemoveTime", js.undefined)
      
      @scala.inline
      def setVirtualserverDefaultChannelAdminGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultChannelAdminGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverDefaultChannelAdminGroupUndefined: Self = StObject.set(x, "virtualserverDefaultChannelAdminGroup", js.undefined)
      
      @scala.inline
      def setVirtualserverDefaultChannelGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultChannelGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverDefaultChannelGroupUndefined: Self = StObject.set(x, "virtualserverDefaultChannelGroup", js.undefined)
      
      @scala.inline
      def setVirtualserverDefaultServerGroup(value: Double): Self = StObject.set(x, "virtualserverDefaultServerGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverDefaultServerGroupUndefined: Self = StObject.set(x, "virtualserverDefaultServerGroup", js.undefined)
      
      @scala.inline
      def setVirtualserverDownloadQuota(value: Double): Self = StObject.set(x, "virtualserverDownloadQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverDownloadQuotaUndefined: Self = StObject.set(x, "virtualserverDownloadQuota", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbannerGfxInterval(value: Double): Self = StObject.set(x, "virtualserverHostbannerGfxInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbannerGfxIntervalUndefined: Self = StObject.set(x, "virtualserverHostbannerGfxInterval", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbannerGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerGfxUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbannerGfxUrlUndefined: Self = StObject.set(x, "virtualserverHostbannerGfxUrl", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbannerMode(value: HostBannerMode): Self = StObject.set(x, "virtualserverHostbannerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbannerModeUndefined: Self = StObject.set(x, "virtualserverHostbannerMode", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbannerUrl(value: String): Self = StObject.set(x, "virtualserverHostbannerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbannerUrlUndefined: Self = StObject.set(x, "virtualserverHostbannerUrl", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbuttonGfxUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonGfxUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbuttonGfxUrlUndefined: Self = StObject.set(x, "virtualserverHostbuttonGfxUrl", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbuttonTooltip(value: String): Self = StObject.set(x, "virtualserverHostbuttonTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbuttonTooltipUndefined: Self = StObject.set(x, "virtualserverHostbuttonTooltip", js.undefined)
      
      @scala.inline
      def setVirtualserverHostbuttonUrl(value: String): Self = StObject.set(x, "virtualserverHostbuttonUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostbuttonUrlUndefined: Self = StObject.set(x, "virtualserverHostbuttonUrl", js.undefined)
      
      @scala.inline
      def setVirtualserverHostmessage(value: String): Self = StObject.set(x, "virtualserverHostmessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostmessageMode(value: HostMessageMode): Self = StObject.set(x, "virtualserverHostmessageMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverHostmessageModeUndefined: Self = StObject.set(x, "virtualserverHostmessageMode", js.undefined)
      
      @scala.inline
      def setVirtualserverHostmessageUndefined: Self = StObject.set(x, "virtualserverHostmessage", js.undefined)
      
      @scala.inline
      def setVirtualserverIconId(value: Double): Self = StObject.set(x, "virtualserverIconId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverIconIdUndefined: Self = StObject.set(x, "virtualserverIconId", js.undefined)
      
      @scala.inline
      def setVirtualserverLogChannel(value: Double): Self = StObject.set(x, "virtualserverLogChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogChannelUndefined: Self = StObject.set(x, "virtualserverLogChannel", js.undefined)
      
      @scala.inline
      def setVirtualserverLogClient(value: Double): Self = StObject.set(x, "virtualserverLogClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogClientUndefined: Self = StObject.set(x, "virtualserverLogClient", js.undefined)
      
      @scala.inline
      def setVirtualserverLogFiletransfer(value: Double): Self = StObject.set(x, "virtualserverLogFiletransfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogFiletransferUndefined: Self = StObject.set(x, "virtualserverLogFiletransfer", js.undefined)
      
      @scala.inline
      def setVirtualserverLogPermissions(value: Double): Self = StObject.set(x, "virtualserverLogPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogPermissionsUndefined: Self = StObject.set(x, "virtualserverLogPermissions", js.undefined)
      
      @scala.inline
      def setVirtualserverLogQuery(value: Double): Self = StObject.set(x, "virtualserverLogQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogQueryUndefined: Self = StObject.set(x, "virtualserverLogQuery", js.undefined)
      
      @scala.inline
      def setVirtualserverLogServer(value: Double): Self = StObject.set(x, "virtualserverLogServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverLogServerUndefined: Self = StObject.set(x, "virtualserverLogServer", js.undefined)
      
      @scala.inline
      def setVirtualserverMachineId(value: String): Self = StObject.set(x, "virtualserverMachineId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMachineIdUndefined: Self = StObject.set(x, "virtualserverMachineId", js.undefined)
      
      @scala.inline
      def setVirtualserverMaxDownloadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxDownloadTotalBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMaxDownloadTotalBandwidthUndefined: Self = StObject.set(x, "virtualserverMaxDownloadTotalBandwidth", js.undefined)
      
      @scala.inline
      def setVirtualserverMaxUploadTotalBandwidth(value: Double): Self = StObject.set(x, "virtualserverMaxUploadTotalBandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMaxUploadTotalBandwidthUndefined: Self = StObject.set(x, "virtualserverMaxUploadTotalBandwidth", js.undefined)
      
      @scala.inline
      def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMaxclientsUndefined: Self = StObject.set(x, "virtualserverMaxclients", js.undefined)
      
      @scala.inline
      def setVirtualserverMinAndroidVersion(value: Double): Self = StObject.set(x, "virtualserverMinAndroidVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMinAndroidVersionUndefined: Self = StObject.set(x, "virtualserverMinAndroidVersion", js.undefined)
      
      @scala.inline
      def setVirtualserverMinClientVersion(value: Double): Self = StObject.set(x, "virtualserverMinClientVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMinClientVersionUndefined: Self = StObject.set(x, "virtualserverMinClientVersion", js.undefined)
      
      @scala.inline
      def setVirtualserverMinClientsInChannelBeforeForcedSilence(value: Double): Self = StObject.set(x, "virtualserverMinClientsInChannelBeforeForcedSilence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMinClientsInChannelBeforeForcedSilenceUndefined: Self = StObject.set(x, "virtualserverMinClientsInChannelBeforeForcedSilence", js.undefined)
      
      @scala.inline
      def setVirtualserverMinIosVersion(value: Double): Self = StObject.set(x, "virtualserverMinIosVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverMinIosVersionUndefined: Self = StObject.set(x, "virtualserverMinIosVersion", js.undefined)
      
      @scala.inline
      def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverNamePhonetic(value: String): Self = StObject.set(x, "virtualserverNamePhonetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverNamePhoneticUndefined: Self = StObject.set(x, "virtualserverNamePhonetic", js.undefined)
      
      @scala.inline
      def setVirtualserverNameUndefined: Self = StObject.set(x, "virtualserverName", js.undefined)
      
      @scala.inline
      def setVirtualserverNeededIdentitySecurityLevel(value: Double): Self = StObject.set(x, "virtualserverNeededIdentitySecurityLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverNeededIdentitySecurityLevelUndefined: Self = StObject.set(x, "virtualserverNeededIdentitySecurityLevel", js.undefined)
      
      @scala.inline
      def setVirtualserverPassword(value: String): Self = StObject.set(x, "virtualserverPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverPasswordUndefined: Self = StObject.set(x, "virtualserverPassword", js.undefined)
      
      @scala.inline
      def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverPortUndefined: Self = StObject.set(x, "virtualserverPort", js.undefined)
      
      @scala.inline
      def setVirtualserverPrioritySpeakerDimmModificator(value: Double): Self = StObject.set(x, "virtualserverPrioritySpeakerDimmModificator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverPrioritySpeakerDimmModificatorUndefined: Self = StObject.set(x, "virtualserverPrioritySpeakerDimmModificator", js.undefined)
      
      @scala.inline
      def setVirtualserverReservedSlots(value: Double): Self = StObject.set(x, "virtualserverReservedSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverReservedSlotsUndefined: Self = StObject.set(x, "virtualserverReservedSlots", js.undefined)
      
      @scala.inline
      def setVirtualserverStatus(value: VirtualServerStatus): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverStatusUndefined: Self = StObject.set(x, "virtualserverStatus", js.undefined)
      
      @scala.inline
      def setVirtualserverUploadQuota(value: Double): Self = StObject.set(x, "virtualserverUploadQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverUploadQuotaUndefined: Self = StObject.set(x, "virtualserverUploadQuota", js.undefined)
      
      @scala.inline
      def setVirtualserverWeblistEnabled(value: Double): Self = StObject.set(x, "virtualserverWeblistEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverWeblistEnabledUndefined: Self = StObject.set(x, "virtualserverWeblistEnabled", js.undefined)
      
      @scala.inline
      def setVirtualserverWelcomemessage(value: String): Self = StObject.set(x, "virtualserverWelcomemessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualserverWelcomemessageUndefined: Self = StObject.set(x, "virtualserverWelcomemessage", js.undefined)
    }
  }
  
  @js.native
  trait ServerTempPasswordAdd extends ResponseEntry {
    
    /** description of the password */
    var desc: js.UndefOr[String] = js.native
    
    /** the duration the password is valid in seconds */
    var duration: Double = js.native
    
    /** the temporary password */
    var pw: String = js.native
    
    /** the channel to let the user join */
    var tcid: js.UndefOr[String] = js.native
    
    /** the password to the channel */
    var tcpw: js.UndefOr[String] = js.native
  }
  object ServerTempPasswordAdd {
    
    @scala.inline
    def apply(duration: Double, pw: String): ServerTempPasswordAdd = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTempPasswordAdd]
    }
    
    @scala.inline
    implicit class ServerTempPasswordAddMutableBuilder[Self <: ServerTempPasswordAdd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPw(value: String): Self = StObject.set(x, "pw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcid(value: String): Self = StObject.set(x, "tcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcidUndefined: Self = StObject.set(x, "tcid", js.undefined)
      
      @scala.inline
      def setTcpw(value: String): Self = StObject.set(x, "tcpw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcpwUndefined: Self = StObject.set(x, "tcpw", js.undefined)
    }
  }
  
  @js.native
  trait TransferDownload extends ResponseEntry {
    
    /** channel id to upload to */
    var cid: js.UndefOr[String] = js.native
    
    /** arbitary id to identify the transfer */
    var clientftfid: js.UndefOr[Double] = js.native
    
    /** channel password of the channel which will be uploaded to */
    var cpw: js.UndefOr[String] = js.native
    
    /** destination filename */
    var name: String = js.native
    
    var seekpos: js.UndefOr[Double] = js.native
  }
  object TransferDownload {
    
    @scala.inline
    def apply(name: String): TransferDownload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferDownload]
    }
    
    @scala.inline
    implicit class TransferDownloadMutableBuilder[Self <: TransferDownload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientftfidUndefined: Self = StObject.set(x, "clientftfid", js.undefined)
      
      @scala.inline
      def setCpw(value: String): Self = StObject.set(x, "cpw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpwUndefined: Self = StObject.set(x, "cpw", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekpos(value: Double): Self = StObject.set(x, "seekpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekposUndefined: Self = StObject.set(x, "seekpos", js.undefined)
    }
  }
  
  @js.native
  trait TransferUpload extends ResponseEntry {
    
    /** channel id to upload to */
    var cid: js.UndefOr[String] = js.native
    
    /** arbitary id to identify the transfer */
    var clientftfid: js.UndefOr[Double] = js.native
    
    /** channel password of the channel which will be uploaded to */
    var cpw: js.UndefOr[String] = js.native
    
    /** destination filename */
    var name: String = js.native
    
    /** overwrites an existing file */
    var overwrite: js.UndefOr[Double] = js.native
    
    var resume: js.UndefOr[Double] = js.native
    
    /** size of the file */
    var size: Double = js.native
  }
  object TransferUpload {
    
    @scala.inline
    def apply(name: String, size: Double): TransferUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferUpload]
    }
    
    @scala.inline
    implicit class TransferUploadMutableBuilder[Self <: TransferUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setClientftfid(value: Double): Self = StObject.set(x, "clientftfid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientftfidUndefined: Self = StObject.set(x, "clientftfid", js.undefined)
      
      @scala.inline
      def setCpw(value: String): Self = StObject.set(x, "cpw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpwUndefined: Self = StObject.set(x, "cpw", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwrite(value: Double): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setResume(value: Double): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
