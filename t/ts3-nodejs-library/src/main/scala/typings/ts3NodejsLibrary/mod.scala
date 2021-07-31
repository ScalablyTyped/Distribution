package typings.ts3NodejsLibrary

import typings.std.Partial
import typings.ts3NodejsLibrary.anon.PartialConnectionParams
import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.GroupType
import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.MultiGroupType
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel.ChannelType
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel.MultiChannelType
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient.MultiClientType
import typings.ts3NodejsLibrary.responseTypesMod.ChannelEntry
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import typings.ts3NodejsLibrary.responseTypesMod.ServerEntry
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupEntry
import typings.ts3NodejsLibrary.serverMod.TeamSpeakServer.MultiServerType
import typings.ts3NodejsLibrary.serverMod.TeamSpeakServer.ServerType
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts3-nodejs-library/lib", "ClientType")
  @js.native
  object ClientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ClientType & Double] = js.native
    
    /* 0 */ val Regular: typings.ts3NodejsLibrary.enumMod.ClientType.Regular & Double = js.native
    
    /* 1 */ val ServerQuery: typings.ts3NodejsLibrary.enumMod.ClientType.ServerQuery & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "Codec")
  @js.native
  object Codec extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.Codec & Double] = js.native
    
    /* 3 */ val CELT_MONO: typings.ts3NodejsLibrary.enumMod.Codec.CELT_MONO & Double = js.native
    
    /* 5 */ val OPUS_MUSIC: typings.ts3NodejsLibrary.enumMod.Codec.OPUS_MUSIC & Double = js.native
    
    /* 4 */ val OPUS_VOICE: typings.ts3NodejsLibrary.enumMod.Codec.OPUS_VOICE & Double = js.native
    
    /* 0 */ val SPEEX_NARROWBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_NARROWBAND & Double = js.native
    
    /* 2 */ val SPEEX_ULTRAWIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_ULTRAWIDEBAND & Double = js.native
    
    /* 1 */ val SPEEX_WIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_WIDEBAND & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "CodecEncryptionMode")
  @js.native
  object CodecEncryptionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode & Double] = js.native
    
    /* 1 */ val DISABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.DISABLED & Double = js.native
    
    /* 2 */ val ENABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.ENABLED & Double = js.native
    
    /* 0 */ val INDIVIDUAL: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.INDIVIDUAL & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "EventError")
  @js.native
  class EventError protected ()
    extends typings.ts3NodejsLibrary.eventErrorMod.EventError {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
  }
  
  @JSImport("ts3-nodejs-library/lib", "HostBannerMode")
  @js.native
  object HostBannerMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostBannerMode & Double] = js.native
    
    /* 1 */ val IGNOREASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.IGNOREASPECT & Double = js.native
    
    /* 2 */ val KEEPASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.KEEPASPECT & Double = js.native
    
    /* 0 */ val NOADJUST: typings.ts3NodejsLibrary.enumMod.HostBannerMode.NOADJUST & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "HostMessageMode")
  @js.native
  object HostMessageMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostMessageMode & Double] = js.native
    
    /* 1 */ val LOG: typings.ts3NodejsLibrary.enumMod.HostMessageMode.LOG & Double = js.native
    
    /* 2 */ val MODAL: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODAL & Double = js.native
    
    /* 3 */ val MODALQUIT: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODALQUIT & Double = js.native
    
    /* 0 */ val NONE: typings.ts3NodejsLibrary.enumMod.HostMessageMode.NONE & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.LogLevel & Double] = js.native
    
    /* 3 */ val DEBUG: typings.ts3NodejsLibrary.enumMod.LogLevel.DEBUG & Double = js.native
    
    /* 1 */ val ERROR: typings.ts3NodejsLibrary.enumMod.LogLevel.ERROR & Double = js.native
    
    /* 4 */ val INFO: typings.ts3NodejsLibrary.enumMod.LogLevel.INFO & Double = js.native
    
    /* 2 */ val WARNING: typings.ts3NodejsLibrary.enumMod.LogLevel.WARNING & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupDatabaseTypes")
  @js.native
  object PermissionGroupDatabaseTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes & Double] = js.native
    
    /* 2 */ val Query: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Query & Double = js.native
    
    /* 1 */ val Regular: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Regular & Double = js.native
    
    /* 0 */ val Template: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Template & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupTypes")
  @js.native
  object PermissionGroupTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes & Double] = js.native
    
    /* 2 */ val Channel: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.Channel & Double = js.native
    
    /* 4 */ val ChannelClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelClient & Double = js.native
    
    /* 3 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelGroup & Double = js.native
    
    /* 1 */ val GlobalClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.GlobalClient & Double = js.native
    
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ServerGroup & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "QueryProtocol")
  @js.native
  val QueryProtocol: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TeamSpeak.QueryProtocol */ js.Any = js.native
  
  @JSImport("ts3-nodejs-library/lib", "ReasonIdentifier")
  @js.native
  object ReasonIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ReasonIdentifier & Double] = js.native
    
    /* 4 */ val KICK_CHANNEL: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_CHANNEL & Double = js.native
    
    /* 5 */ val KICK_SERVER: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_SERVER & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "ResponseError")
  @js.native
  class ResponseError protected ()
    extends typings.ts3NodejsLibrary.responseErrorMod.ResponseError {
    def this(error: QueryErrorMessage, stack: String) = this()
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeak")
  @js.native
  class TeamSpeak protected ()
    extends typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak {
    def this(config: PartialConnectionParams) = this()
  }
  /* static members */
  object TeamSpeak {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.QueryProtocol")
    @js.native
    object QueryProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol & String] = js.native
      
      /* "raw" */ val RAW: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol.RAW & String = js.native
      
      /* "ssh" */ val SSH: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol.SSH & String = js.native
    }
    
    /**
      * connects via a Promise wrapper
      * @param config config options to connect
      */
    @scala.inline
    def connect(config: PartialConnectionParams): js.Promise[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak]]
    
    /**
      * filters an array with given filter
      * @param array the array which should get filtered
      * @param filter filter object
      */
    @scala.inline
    def filter[T /* <: ResponseEntry */](array: js.Array[T], filter: Partial[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * retrieves the first element of an array
      * @param input the response input
      */
    @scala.inline
    def singleResponse[T](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("singleResponse")(input.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def singleResponse[T](input: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("singleResponse")(input.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Transforms an Input to an Array
      * @param input input data which should be converted to an array
      */
    @scala.inline
    def toArray[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    @scala.inline
    def toArray[T](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    /**
      * waits a set time of ms
      * @param time time in ms to wait
      */
    @scala.inline
    def wait(time: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
  @js.native
  class TeamSpeakChannel protected ()
    extends typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelEntry) = this()
  }
  /* static members */
  object TeamSpeakChannel {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    @scala.inline
    def getId[T /* <: ChannelType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getId[T /* <: ChannelType */](channel: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleIds(channels: MultiChannelType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(channels.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
  @js.native
  class TeamSpeakChannelGroup protected ()
    extends typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakChannelGroup {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    @scala.inline
    def getId[T /* <: GroupType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getId[T /* <: GroupType */](channel: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleIds(client: MultiGroupType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
  @js.native
  class TeamSpeakClient protected ()
    extends typings.ts3NodejsLibrary.clientMod.TeamSpeakClient {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ClientEntry) = this()
  }
  /* static members */
  object TeamSpeakClient {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client dbid from a string or teamspeak client */
    @scala.inline
    def getDbid[T /* <: ClientType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDbid")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getDbid[T /* <: ClientType */](client: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDbid")(client.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the client id from a string or teamspeak client */
    @scala.inline
    def getId[T /* <: ClientType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getId[T /* <: ClientType */](client: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(client.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleDbids(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleDbids")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleIds(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleUids(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleUids")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the client dbid from a string or teamspeak client */
    @scala.inline
    def getUid[T /* <: ClientType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getUid[T /* <: ClientType */](client: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(client.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
  @js.native
  class TeamSpeakServer protected ()
    extends typings.ts3NodejsLibrary.serverMod.TeamSpeakServer {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerEntry) = this()
  }
  /* static members */
  object TeamSpeakServer {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    @scala.inline
    def getId[T /* <: ServerType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getId[T /* <: ServerType */](server: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(server.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleIds(servers: MultiServerType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(servers.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
  @js.native
  class TeamSpeakServerGroup protected ()
    extends typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakServerGroup {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    @scala.inline
    def getId[T /* <: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    @scala.inline
    def getId[T /* <: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType */](group: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(group.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    @scala.inline
    def getMultipleIds(groups: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.MultiGroupType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(groups.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TextMessageTargetMode")
  @js.native
  object TextMessageTargetMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode & Double] = js.native
    
    /* 2 */ val CHANNEL: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CHANNEL & Double = js.native
    
    /* 1 */ val CLIENT: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CLIENT & Double = js.native
    
    /* 3 */ val SERVER: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.SERVER & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TokenType & Double] = js.native
    
    /* 1 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ChannelGroup & Double = js.native
    
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ServerGroup & Double = js.native
  }
}
