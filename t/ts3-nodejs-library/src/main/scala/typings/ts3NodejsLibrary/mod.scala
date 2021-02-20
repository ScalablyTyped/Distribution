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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts3-nodejs-library/lib", "ClientType")
  @js.native
  object ClientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ClientType with Double] = js.native
    
    /* 0 */ val Regular: typings.ts3NodejsLibrary.enumMod.ClientType.Regular with Double = js.native
    
    /* 1 */ val ServerQuery: typings.ts3NodejsLibrary.enumMod.ClientType.ServerQuery with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "Codec")
  @js.native
  object Codec extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.Codec with Double] = js.native
    
    /* 3 */ val CELT_MONO: typings.ts3NodejsLibrary.enumMod.Codec.CELT_MONO with Double = js.native
    
    /* 5 */ val OPUS_MUSIC: typings.ts3NodejsLibrary.enumMod.Codec.OPUS_MUSIC with Double = js.native
    
    /* 4 */ val OPUS_VOICE: typings.ts3NodejsLibrary.enumMod.Codec.OPUS_VOICE with Double = js.native
    
    /* 0 */ val SPEEX_NARROWBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_NARROWBAND with Double = js.native
    
    /* 2 */ val SPEEX_ULTRAWIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_ULTRAWIDEBAND with Double = js.native
    
    /* 1 */ val SPEEX_WIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_WIDEBAND with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "CodecEncryptionMode")
  @js.native
  object CodecEncryptionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode with Double] = js.native
    
    /* 1 */ val DISABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.DISABLED with Double = js.native
    
    /* 2 */ val ENABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.ENABLED with Double = js.native
    
    /* 0 */ val INDIVIDUAL: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.INDIVIDUAL with Double = js.native
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
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostBannerMode with Double] = js.native
    
    /* 1 */ val IGNOREASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.IGNOREASPECT with Double = js.native
    
    /* 2 */ val KEEPASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.KEEPASPECT with Double = js.native
    
    /* 0 */ val NOADJUST: typings.ts3NodejsLibrary.enumMod.HostBannerMode.NOADJUST with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "HostMessageMode")
  @js.native
  object HostMessageMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostMessageMode with Double] = js.native
    
    /* 1 */ val LOG: typings.ts3NodejsLibrary.enumMod.HostMessageMode.LOG with Double = js.native
    
    /* 2 */ val MODAL: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODAL with Double = js.native
    
    /* 3 */ val MODALQUIT: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODALQUIT with Double = js.native
    
    /* 0 */ val NONE: typings.ts3NodejsLibrary.enumMod.HostMessageMode.NONE with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.LogLevel with Double] = js.native
    
    /* 3 */ val DEBUG: typings.ts3NodejsLibrary.enumMod.LogLevel.DEBUG with Double = js.native
    
    /* 1 */ val ERROR: typings.ts3NodejsLibrary.enumMod.LogLevel.ERROR with Double = js.native
    
    /* 4 */ val INFO: typings.ts3NodejsLibrary.enumMod.LogLevel.INFO with Double = js.native
    
    /* 2 */ val WARNING: typings.ts3NodejsLibrary.enumMod.LogLevel.WARNING with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupDatabaseTypes")
  @js.native
  object PermissionGroupDatabaseTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes with Double] = js.native
    
    /* 2 */ val Query: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Query with Double = js.native
    
    /* 1 */ val Regular: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Regular with Double = js.native
    
    /* 0 */ val Template: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Template with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupTypes")
  @js.native
  object PermissionGroupTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes with Double] = js.native
    
    /* 2 */ val Channel: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.Channel with Double = js.native
    
    /* 4 */ val ChannelClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelClient with Double = js.native
    
    /* 3 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelGroup with Double = js.native
    
    /* 1 */ val GlobalClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.GlobalClient with Double = js.native
    
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ServerGroup with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "QueryProtocol")
  @js.native
  val QueryProtocol: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TeamSpeak.QueryProtocol */ js.Any = js.native
  
  @JSImport("ts3-nodejs-library/lib", "ReasonIdentifier")
  @js.native
  object ReasonIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ReasonIdentifier with Double] = js.native
    
    /* 4 */ val KICK_CHANNEL: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_CHANNEL with Double = js.native
    
    /* 5 */ val KICK_SERVER: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_SERVER with Double = js.native
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
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.QueryProtocol")
    @js.native
    object QueryProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol with String] = js.native
      
      /* "raw" */ val RAW: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol.RAW with String = js.native
      
      /* "ssh" */ val SSH: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.QueryProtocol.SSH with String = js.native
    }
    
    /**
      * connects via a Promise wrapper
      * @param config config options to connect
      */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.connect")
    @js.native
    def connect(config: PartialConnectionParams): js.Promise[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak] = js.native
    
    /**
      * filters an array with given filter
      * @param array the array which should get filtered
      * @param filter filter object
      */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.filter")
    @js.native
    def filter[T /* <: ResponseEntry */](array: js.Array[T], filter: Partial[T]): js.Array[T] = js.native
    
    /**
      * retrieves the first element of an array
      * @param input the response input
      */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.singleResponse")
    @js.native
    def singleResponse[T](input: T): T = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.singleResponse")
    @js.native
    def singleResponse[T](input: js.Array[T]): T = js.native
    
    /**
      * Transforms an Input to an Array
      * @param input input data which should be converted to an array
      */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.toArray")
    @js.native
    def toArray[T](input: T): js.Array[T] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.toArray")
    @js.native
    def toArray[T](input: js.Array[T]): js.Array[T] = js.native
    
    /**
      * waits a set time of ms
      * @param time time in ms to wait
      */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.wait")
    @js.native
    def wait(time: Double): js.Promise[_] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
  @js.native
  class TeamSpeakChannel protected ()
    extends typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelEntry) = this()
  }
  /* static members */
  object TeamSpeakChannel {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel.getId")
    @js.native
    def getId[T /* <: ChannelType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel.getId")
    @js.native
    def getId[T /* <: ChannelType */](channel: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel.getMultipleIds")
    @js.native
    def getMultipleIds(channels: MultiChannelType): js.Array[String] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
  @js.native
  class TeamSpeakChannelGroup protected ()
    extends typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakChannelGroup {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup.getId")
    @js.native
    def getId[T /* <: GroupType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup.getId")
    @js.native
    def getId[T /* <: GroupType */](channel: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup.getMultipleIds")
    @js.native
    def getMultipleIds(client: MultiGroupType): js.Array[String] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
  @js.native
  class TeamSpeakClient protected ()
    extends typings.ts3NodejsLibrary.clientMod.TeamSpeakClient {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ClientEntry) = this()
  }
  /* static members */
  object TeamSpeakClient {
    
    /** retrieves the client dbid from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getDbid")
    @js.native
    def getDbid[T /* <: ClientType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getDbid")
    @js.native
    def getDbid[T /* <: ClientType */](client: T): js.UndefOr[String] = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getId")
    @js.native
    def getId[T /* <: ClientType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getId")
    @js.native
    def getId[T /* <: ClientType */](client: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getMultipleDbids")
    @js.native
    def getMultipleDbids(client: MultiClientType): js.Array[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getMultipleIds")
    @js.native
    def getMultipleIds(client: MultiClientType): js.Array[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getMultipleUids")
    @js.native
    def getMultipleUids(client: MultiClientType): js.Array[String] = js.native
    
    /** retrieves the client dbid from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getUid")
    @js.native
    def getUid[T /* <: ClientType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient.getUid")
    @js.native
    def getUid[T /* <: ClientType */](client: T): js.UndefOr[String] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
  @js.native
  class TeamSpeakServer protected ()
    extends typings.ts3NodejsLibrary.serverMod.TeamSpeakServer {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerEntry) = this()
  }
  /* static members */
  object TeamSpeakServer {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer.getId")
    @js.native
    def getId[T /* <: ServerType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer.getId")
    @js.native
    def getId[T /* <: ServerType */](server: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer.getMultipleIds")
    @js.native
    def getMultipleIds(servers: MultiServerType): js.Array[String] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
  @js.native
  class TeamSpeakServerGroup protected ()
    extends typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakServerGroup {
    
    /** retrieves the client id from a string or teamspeak client */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup.getId")
    @js.native
    def getId[T /* <: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType */](): js.UndefOr[String] = js.native
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup.getId")
    @js.native
    def getId[T /* <: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType */](group: T): js.UndefOr[String] = js.native
    
    /** retrieves the clients from an array */
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup.getMultipleIds")
    @js.native
    def getMultipleIds(groups: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.MultiGroupType): js.Array[String] = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TextMessageTargetMode")
  @js.native
  object TextMessageTargetMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode with Double] = js.native
    
    /* 2 */ val CHANNEL: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CHANNEL with Double = js.native
    
    /* 1 */ val CLIENT: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CLIENT with Double = js.native
    
    /* 3 */ val SERVER: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.SERVER with Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TokenType with Double] = js.native
    
    /* 1 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ChannelGroup with Double = js.native
    
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ServerGroup with Double = js.native
  }
}
