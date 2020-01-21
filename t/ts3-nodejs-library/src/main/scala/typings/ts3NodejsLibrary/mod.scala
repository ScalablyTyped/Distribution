package typings.ts3NodejsLibrary

import typings.std.Partial
import typings.ts3NodejsLibrary.commandMod.Command
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponse
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupList
import typings.ts3NodejsLibrary.responseTypesMod.ChannelList
import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import typings.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupList
import typings.ts3NodejsLibrary.responseTypesMod.ServerList
import typings.ts3NodejsLibrary.teamSpeakMod.ConnectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ResponseError protected ()
    extends typings.ts3NodejsLibrary.responseErrorMod.ResponseError {
    def this(error: QueryErrorMessage, source: Command) = this()
  }
  
  @js.native
  class TeamSpeak protected ()
    extends typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak {
    def this(config: Partial[ConnectionParams]) = this()
  }
  
  @js.native
  class TeamSpeakChannel protected ()
    extends typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelList) = this()
  }
  
  @js.native
  class TeamSpeakChannelGroup protected ()
    extends typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ChannelGroupList) = this()
  }
  
  @js.native
  class TeamSpeakClient protected ()
    extends typings.ts3NodejsLibrary.clientMod.TeamSpeakClient {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ClientList) = this()
  }
  
  @js.native
  class TeamSpeakServer protected ()
    extends typings.ts3NodejsLibrary.serverMod.TeamSpeakServer {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerList) = this()
  }
  
  @js.native
  class TeamSpeakServerGroup protected ()
    extends typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup {
    def this(parent: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak, list: ServerGroupList) = this()
  }
  
  @js.native
  object ClientType extends js.Object {
    /* 0 */ val Regular: typings.ts3NodejsLibrary.enumMod.ClientType.Regular with Double = js.native
    /* 1 */ val ServerQuery: typings.ts3NodejsLibrary.enumMod.ClientType.ServerQuery with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ClientType with Double] = js.native
  }
  
  @js.native
  object Codec extends js.Object {
    /* 3 */ val CELT_MONO: typings.ts3NodejsLibrary.enumMod.Codec.CELT_MONO with Double = js.native
    /* 0 */ val SPEEX_NARROWBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_NARROWBAND with Double = js.native
    /* 2 */ val SPEEX_ULTRAWIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_ULTRAWIDEBAND with Double = js.native
    /* 1 */ val SPEEX_WIDEBAND: typings.ts3NodejsLibrary.enumMod.Codec.SPEEX_WIDEBAND with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.Codec with Double] = js.native
  }
  
  @js.native
  object CodecEncryptionMode extends js.Object {
    /* 1 */ val DISABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.DISABLED with Double = js.native
    /* 2 */ val ENABLED: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.ENABLED with Double = js.native
    /* 0 */ val INDIVIDUAL: typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode.INDIVIDUAL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.CodecEncryptionMode with Double] = js.native
  }
  
  @js.native
  object HostBannerMode extends js.Object {
    /* 1 */ val IGNOREASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.IGNOREASPECT with Double = js.native
    /* 2 */ val KEEPASPECT: typings.ts3NodejsLibrary.enumMod.HostBannerMode.KEEPASPECT with Double = js.native
    /* 0 */ val NOADJUST: typings.ts3NodejsLibrary.enumMod.HostBannerMode.NOADJUST with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostBannerMode with Double] = js.native
  }
  
  @js.native
  object HostMessageMode extends js.Object {
    /* 1 */ val LOG: typings.ts3NodejsLibrary.enumMod.HostMessageMode.LOG with Double = js.native
    /* 2 */ val MODAL: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODAL with Double = js.native
    /* 3 */ val MODALQUIT: typings.ts3NodejsLibrary.enumMod.HostMessageMode.MODALQUIT with Double = js.native
    /* 0 */ val NONE: typings.ts3NodejsLibrary.enumMod.HostMessageMode.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.HostMessageMode with Double] = js.native
  }
  
  @js.native
  object LogLevel extends js.Object {
    /* 3 */ val DEBUG: typings.ts3NodejsLibrary.enumMod.LogLevel.DEBUG with Double = js.native
    /* 1 */ val ERROR: typings.ts3NodejsLibrary.enumMod.LogLevel.ERROR with Double = js.native
    /* 4 */ val INFO: typings.ts3NodejsLibrary.enumMod.LogLevel.INFO with Double = js.native
    /* 2 */ val WARNING: typings.ts3NodejsLibrary.enumMod.LogLevel.WARNING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.LogLevel with Double] = js.native
  }
  
  @js.native
  object PermissionGroupDatabaseTypes extends js.Object {
    /* 2 */ val Query: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Query with Double = js.native
    /* 1 */ val Regular: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Regular with Double = js.native
    /* 0 */ val Template: typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes.Template with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupDatabaseTypes with Double] = js.native
  }
  
  @js.native
  object PermissionGroupTypes extends js.Object {
    /* 2 */ val Channel: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.Channel with Double = js.native
    /* 4 */ val ChannelClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelClient with Double = js.native
    /* 3 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ChannelGroup with Double = js.native
    /* 1 */ val GlobalClient: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.GlobalClient with Double = js.native
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes.ServerGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.PermissionGroupTypes with Double] = js.native
  }
  
  @js.native
  object QueryProtocol extends js.Object {
    /* "raw" */ val RAW: typings.ts3NodejsLibrary.enumMod.QueryProtocol.RAW with String = js.native
    /* "ssh" */ val SSH: typings.ts3NodejsLibrary.enumMod.QueryProtocol.SSH with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ts3NodejsLibrary.enumMod.QueryProtocol with String] = js.native
  }
  
  @js.native
  object ReasonIdentifier extends js.Object {
    /* 4 */ val KICK_CHANNEL: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_CHANNEL with Double = js.native
    /* 5 */ val KICK_SERVER: typings.ts3NodejsLibrary.enumMod.ReasonIdentifier.KICK_SERVER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.ReasonIdentifier with Double] = js.native
  }
  
  /* static members */
  @js.native
  object TeamSpeak extends js.Object {
    /**
      * connects via a Promise wrapper
      * @param config config options to connect
      */
    def connect(config: Partial[ConnectionParams]): js.Promise[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak] = js.native
    /**
      * filters an array with given filter
      * @param array the array which should get filtered
      * @param filter filter object
      */
    def filter[T /* <: QueryResponse */](array: js.Array[T], filter: T): js.Array[T] = js.native
    /**
      * retrieves the first element of an array
      * @param input the response input
      */
    def singleResponse[T](input: T): T = js.native
    def singleResponse[T](input: js.Array[T]): T = js.native
    /**
      * Transforms an Input to an Array
      * @param input input data which should be converted to an array
      */
    def toArray[T](input: T): js.Array[T] = js.native
    def toArray[T](input: js.Array[T]): js.Array[T] = js.native
    /**
      * waits a set time of ms
      * @param time time in ms to wait
      */
    def wait(time: Double): js.Promise[_] = js.native
  }
  
  @js.native
  object TextMessageTargetMode extends js.Object {
    /* 2 */ val CHANNEL: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CHANNEL with Double = js.native
    /* 1 */ val CLIENT: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CLIENT with Double = js.native
    /* 3 */ val SERVER: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.SERVER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode with Double] = js.native
  }
  
  @js.native
  object TokenType extends js.Object {
    /* 1 */ val ChannelGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ChannelGroup with Double = js.native
    /* 0 */ val ServerGroup: typings.ts3NodejsLibrary.enumMod.TokenType.ServerGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ts3NodejsLibrary.enumMod.TokenType with Double] = js.native
  }
  
}

