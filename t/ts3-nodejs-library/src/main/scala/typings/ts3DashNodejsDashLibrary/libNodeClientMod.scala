package typings.ts3DashNodejsDashLibrary

import typings.node.Buffer
import typings.ts3DashNodejsDashLibrary.libNodeAbstractMod.Abstract
import typings.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ClientType
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ClientDBEdit
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ClientEdit
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.BanAdd
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientDBInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.CustomInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Client", JSImport.Namespace)
@js.native
object libNodeClientMod extends js.Object {
  @js.native
  class TeamSpeakClient protected () extends Abstract {
    def this(parent: TeamSpeak, list: ClientList) = this()
    def addGroups(sgid: js.Array[Double]): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * adds the client to one or more groups
      * @param sgid one or more servergroup ids which the client should be added to
      */
    def addGroups(sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Adds a set of specified permissions to a client.
      * Multiple permissions can be added by providing the three parameters of each permission.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      * @param value value of the permission
      * @param skip whether the skip flag should be set
      * @param negate whether the negate flag should be set
      */
    def addPerm(perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def addPerm(perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def away(): js.UndefOr[Double] = js.native
    def awayMessage(): js.UndefOr[String] = js.native
    def badges(): js.UndefOr[String] = js.native
    /**
      * bans the chosen client with its uid
      * @param banreason ban reason
      * @param time bantime in seconds, if left empty it will result in a permaban
      */
    def ban(banreason: String): js.Promise[BanAdd] = js.native
    def ban(banreason: String, time: Double): js.Promise[BanAdd] = js.native
    def channelGroupId(): js.UndefOr[Double] = js.native
    def channelGroupInheritedChannelId(): js.UndefOr[Double] = js.native
    def cid(): Double = js.native
    def clid(): Double = js.native
    def connectionClientIp(): js.UndefOr[String] = js.native
    def country(): js.UndefOr[String] = js.native
    def created(): js.UndefOr[Double] = js.native
    /**
      * removes a custom property from the client
      * @param ident the key which should be deleted
      */
    def customDelete(ident: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /** returns a list of custom properties for the client */
    def customInfo(): js.Promise[js.Array[CustomInfo]] = js.native
    /**
      * creates or updates a custom property for the client
      * ident and value can be any value, and are the key value pair of the custom property
      * @param ident the key which should be set
      * @param value the value which should be set
      */
    def customSet(ident: String, value: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def databaseId(): Double = js.native
    /**
      * Changes a clients settings using given properties.
      * @param properties the properties which should be modified
      */
    def dbEdit(properties: ClientDBEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def delGroups(sgid: js.Array[Double]): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Removes the client from one or more groups
      * @param sgid one or more servergroup ids which the client should be added to
      */
    def delGroups(sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Removes a set of specified permissions from a client.
      * Multiple permissions can be removed at once.
      * A permission can be specified by permid or permsid
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * edits the client
      * @param properties the properties to change
      */
    def edit(properties: ClientEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def flagTalking(): js.UndefOr[Double] = js.native
    /** returns a Buffer with the avatar of the user */
    def getAvatar(): js.Promise[Buffer] = js.native
    /** returns the avatar name of the client */
    def getAvatarName(): js.Promise[String] = js.native
    /** returns the clients database info */
    def getDBInfo(): js.Promise[ClientDBInfo] = js.native
    /** returns a Buffer with the icon of the client */
    def getIcon(): js.Promise[Buffer] = js.native
    /** gets the icon name of the client */
    def getIconName(): js.Promise[String] = js.native
    /** returns general info of the client, requires the client to be online */
    def getInfo(): js.Promise[ClientInfo] = js.native
    /**
      * Retrieves a displayable Client Link for the TeamSpeak Chat
      */
    def getUrl(): String = js.native
    def idleTime(): js.UndefOr[Double] = js.native
    def inputHardware(): js.UndefOr[Double] = js.native
    def inputMuted(): js.UndefOr[Double] = js.native
    def isChannelCommander(): js.UndefOr[Double] = js.native
    def isPrioritySpeaker(): js.UndefOr[Double] = js.native
    /** evaluates if the client is a query client or a normal client */
    def isQuery(): Boolean = js.native
    def isRecording(): js.UndefOr[Double] = js.native
    def isTalker(): js.UndefOr[Double] = js.native
    /**
      * kicks the client from their currently joined channel
      * @param msg the message the client should receive when getting kicked (max 40 Chars)
      */
    def kickFromChannel(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * kicks the client from the server
      * @param msg the message the client should receive when getting kicked
      */
    def kickFromServer(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def lastconnected(): js.UndefOr[Double] = js.native
    /**
      * sends a textmessage to the client
      * @param msg the message the client should receive
      */
    def message(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * moves the client to a different channel
      * @param cid channel id in which the client should get moved
      * @param cpw the channel password
      */
    def move(cid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def move(cid: Double, cpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def nickname(): String = js.native
    def outputHardware(): js.UndefOr[Double] = js.native
    def outputMuted(): js.UndefOr[Double] = js.native
    /**
      * returns a list of permissions defined for the client
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(): js.Promise[js.Array[PermList]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
    def platform(): js.UndefOr[String] = js.native
    /**
      * pokes the client with a certain message
      * @param msg the message the client should receive
      */
    def poke(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def servergroups(): js.UndefOr[js.Array[Double]] = js.native
    def talkPower(): js.UndefOr[Double] = js.native
    def `type`(): ClientType = js.native
    def uniqueIdentifier(): String = js.native
    def version(): js.UndefOr[String] = js.native
  }
  
}

