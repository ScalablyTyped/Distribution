package typings.ts3NodejsLibrary

import typings.node.Buffer
import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.anon.Cldbid
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.permissionMod.Permission
import typings.ts3NodejsLibrary.permissionMod.Permission.PermType
import typings.ts3NodejsLibrary.propertyTypesMod.ClientDBEdit
import typings.ts3NodejsLibrary.propertyTypesMod.ClientEdit
import typings.ts3NodejsLibrary.responseTypesMod.BanAdd
import typings.ts3NodejsLibrary.responseTypesMod.ClientDBInfo
import typings.ts3NodejsLibrary.responseTypesMod.ClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientInfo
import typings.ts3NodejsLibrary.responseTypesMod.CustomInfo
import typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("ts3-nodejs-library/lib/node/Client", "TeamSpeakClient")
  @js.native
  class TeamSpeakClient protected () extends Abstract[ClientEntry] {
    def this(parent: TeamSpeak, list: ClientEntry) = this()
    
    /**
      * adds the client to one or more groups
      * @param sgid one or more servergroup ids which the client should be added to
      */
    def addGroups(sgid: String): js.Promise[js.Array[js.Any]] = js.native
    def addGroups(sgid: js.Array[String | TeamSpeakServerGroup]): js.Promise[js.Array[js.Any]] = js.native
    def addGroups(sgid: TeamSpeakServerGroup): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * Adds a set of specified permissions to a client.
      * Multiple permissions can be added by providing the three parameters of each permission.
      * A permission can be specified by permid or permsid.
      * @param perm the permission object to set
      */
    def addPerm(perm: PermType): js.Promise[js.Array[js.Any]] = js.native
    
    def away: Double = js.native
    
    def awayMessage: String = js.native
    
    def badges: String = js.native
    
    /**
      * bans the chosen client with its uid
      * @param banreason ban reason
      * @param time bantime in seconds, if left empty it will result in a permaban
      */
    def ban(banreason: String): js.Promise[BanAdd] = js.native
    def ban(banreason: String, time: Double): js.Promise[BanAdd] = js.native
    
    def channelGroupId: String = js.native
    
    def channelGroupInheritedChannelId: Double = js.native
    
    def cid: String = js.native
    
    def clid: String = js.native
    
    def connectionClientIp: String = js.native
    
    def country: js.UndefOr[String] = js.native
    
    /**
      * Adds a set of specified permissions to a client.
      * Multiple permissions can be added by providing the three parameters of each permission.
      * A permission can be specified by permid or permsid.
      */
    def createPerm(): Permission[js.Any] = js.native
    
    def created: Double = js.native
    
    /**
      * removes a custom property from the client
      * @param ident the key which should be deleted
      */
    def customDelete(ident: String): js.Promise[js.Array[js.Any]] = js.native
    
    /** returns a list of custom properties for the client */
    def customInfo(): js.Promise[CustomInfo] = js.native
    
    /**
      * creates or updates a custom property for the client
      * ident and value can be any value, and are the key value pair of the custom property
      * @param ident the key which should be set
      * @param value the value which should be set
      */
    def customSet(ident: String, value: String): js.Promise[js.Array[js.Any]] = js.native
    
    def databaseId: String = js.native
    
    /**
      * Changes a clients settings using given properties.
      * @param properties the properties which should be modified
      */
    def dbEdit(properties: ClientDBEdit): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * Removes the client from one or more groups
      * @param sgid one or more servergroup ids which the client should be added to
      */
    def delGroups(sgid: String): js.Promise[js.Array[js.Any]] = js.native
    def delGroups(sgid: js.Array[String | TeamSpeakServerGroup]): js.Promise[js.Array[js.Any]] = js.native
    def delGroups(sgid: TeamSpeakServerGroup): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * Removes a set of specified permissions from a client.
      * Multiple permissions can be removed at once.
      * A permission can be specified by permid or permsid
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[js.Any]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * edits the client
      * @param properties the properties to change
      */
    def edit(properties: ClientEdit): js.Promise[js.Array[js.Any]] = js.native
    
    def estimatedLocation: js.UndefOr[String] = js.native
    
    def flagTalking: Boolean = js.native
    
    /** returns a Buffer with the avatar of the user */
    def getAvatar(): js.Promise[Buffer] = js.native
    
    /** returns the avatar name of the client */
    def getAvatarName(): js.Promise[String] = js.native
    
    /** returns the clients database info */
    def getDBInfo(): js.Promise[ClientDBInfo] = js.native
    
    /** returns a Buffer with the icon of the client */
    def getIcon(): js.Promise[Buffer] = js.native
    
    /** gets the icon name of the client */
    def getIconId(): js.Promise[Double] = js.native
    
    /** returns general info of the client, requires the client to be online */
    def getInfo(): js.Promise[ClientInfo] = js.native
    
    /**
      * Retrieves a displayable Client Link for the TeamSpeak Chat
      */
    def getUrl(): String = js.native
    
    def idleTime: Double = js.native
    
    def inputHardware: Boolean = js.native
    
    def inputMuted: Boolean = js.native
    
    def isChannelCommander: Double = js.native
    
    def isPrioritySpeaker: Boolean = js.native
    
    /** evaluates if the client is a query client or a normal client */
    def isQuery(): Boolean = js.native
    
    def isRecording: Boolean = js.native
    
    def isTalker: Boolean = js.native
    
    /**
      * kicks the client from their currently joined channel
      * @param msg the message the client should receive when getting kicked (max 40 Chars)
      */
    def kickFromChannel(msg: String): js.Promise[js.Array[js.Any]] = js.native
    
    /**
      * kicks the client from the server
      * @param msg the message the client should receive when getting kicked
      */
    def kickFromServer(msg: String): js.Promise[js.Array[js.Any]] = js.native
    
    def lastconnected: Double = js.native
    
    /**
      * sends a textmessage to the client
      * @param msg the message the client should receive
      */
    def message(msg: String): js.Any = js.native
    
    /**
      * moves the client to a different channel
      * @param cid channel id in which the client should get moved
      * @param cpw the channel password
      */
    def move(cid: String): js.Promise[js.Array[js.Any]] = js.native
    def move(cid: String, cpw: String): js.Promise[js.Array[js.Any]] = js.native
    def move(cid: TeamSpeakChannel): js.Promise[js.Array[js.Any]] = js.native
    def move(cid: TeamSpeakChannel, cpw: String): js.Promise[js.Array[js.Any]] = js.native
    
    def nickname: String = js.native
    
    def outputHardware: Boolean = js.native
    
    def outputMuted: Boolean = js.native
    
    /**
      * returns a list of permissions defined for the client
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(): js.Promise[js.Array[Permission[Cldbid]]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[Permission[Cldbid]]] = js.native
    
    def platform: String = js.native
    
    /**
      * pokes the client with a certain message
      * @param msg the message the client should receive
      */
    def poke(msg: String): js.Promise[js.Array[js.Any]] = js.native
    
    def servergroups: js.Array[String] = js.native
    
    def talkPower: Double = js.native
    
    def `type`: Double = js.native
    
    def uniqueIdentifier: String = js.native
    
    def version: String = js.native
  }
  /* static members */
  object TeamSpeakClient {
    
    @JSImport("ts3-nodejs-library/lib/node/Client", "TeamSpeakClient")
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
    
    type ClientType = String | TeamSpeakClient
    
    type MultiClientType = (js.Array[String | TeamSpeakClient]) | ClientType
  }
}
