package typings
package ts3DashNodejsDashLibraryLib.propertyClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeakClient
  extends ts3DashNodejsDashLibraryLib.propertyAbstractMod.^ {
  var away: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var badges: js.UndefOr[java.lang.String] = js.native
  var cfid: scala.Double = js.native
  var channelGroupId: scala.Double = js.native
  var channelGroupInheritedChannelId: scala.Double = js.native
  var cid: scala.Double = js.native
  var clid: scala.Double = js.native
  var ctid: scala.Double = js.native
  var databaseId: scala.Double = js.native
  var iconId: scala.Double = js.native
  var inputHardware: scala.Double = js.native
  var inputMuted: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var isChannelCommander: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var isPrioritySpeaker: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var isRecording: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var isTalker: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var myteamspeakId: js.UndefOr[java.lang.String] = js.native
  var neededServerqueryViewPower: java.lang.String = js.native
  var nickname: java.lang.String = js.native
  var outputHardware: scala.Double = js.native
  var outputMuted: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var outputonlyMuted: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`0` | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibNumbers.`1` = js.native
  var reasonid: scala.Double = js.native
  var servergroups: js.Array[scala.Double] = js.native
  var talkPower: scala.Double = js.native
  var talkRequest: scala.Double = js.native
  var `type`: ClientType = js.native
  var uniqueIdentifier: java.lang.String = js.native
  var unreadMessages: java.lang.String = js.native
  /**
    * Adds a set of specified permissions to a client. Multiple permissions can be added by providing the three parameters of each permission. A permission can be specified by permid or permsid.
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set. Defaults to 0.
    * @param - Whether the negate flag should be set. Defaults to 0.
    */
  def addPerm(perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: java.lang.String, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: java.lang.String, value: scala.Double, skip: scala.Double, negate: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def addPerm(perm: scala.Double, value: scala.Double, skip: scala.Double, negate: scala.Double): js.Promise[_] = js.native
  /**
    * creates a new ban with the clients uid
    * @param - reason message
    * @param - the time in seconds a client should be banned, leave empty if it should result in a permanent ban
    */
  def ban(): js.Promise[_] = js.native
  def ban(banreason: java.lang.String): js.Promise[_] = js.native
  def ban(banreason: java.lang.String, time: scala.Double): js.Promise[_] = js.native
  /**
    * Adds a new ban rule on the selected virtual server. All parameters are optional but at least one of the following must be set: ip, name, or uid.
    * @param - IP Regex
    * @param - Name Regex
    * @param - UID Regex
    * @param  - Bantime in Seconds, if left empty it will result in a permaban
    * @param- Ban Reason
    */
  def banAdd(): js.Promise[_] = js.native
  def banAdd(ip: java.lang.String): js.Promise[_] = js.native
  def banAdd(ip: java.lang.String, name: java.lang.String): js.Promise[_] = js.native
  def banAdd(ip: java.lang.String, name: java.lang.String, uid: java.lang.String): js.Promise[_] = js.native
  def banAdd(ip: java.lang.String, name: java.lang.String, uid: java.lang.String, time: scala.Double): js.Promise[_] = js.native
  def banAdd(
    ip: java.lang.String,
    name: java.lang.String,
    uid: java.lang.String,
    time: scala.Double,
    banreason: java.lang.String
  ): js.Promise[_] = js.native
  /**
    * Removes a custom property from the client
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param - The Key which should be deleted
    */
  def customDelete(ident: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a list of custom properties for the client
    */
  def customInfo(): js.Promise[_] = js.native
  /**
    * Creates or updates a custom property for the client.
    * Ident and value can be any value, and are the key value pair of the custom property.
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param  - The Key which should be set
    * @param - The Value which should be set
    */
  def customSet(ident: java.lang.String, value: java.lang.String): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from a client. Multiple permissions can be removed at once. A permission can be specified by permid or permsid
    * @param - The permid or permsid
    */
  def delPerm(perm: java.lang.String): js.Promise[_] = js.native
  def delPerm(perm: scala.Double): js.Promise[_] = js.native
  /**
    * Returns a Buffer with the Avatar of the User
    * @returns a Promise with the binary data of the avatar
    */
  def getAvatar(): js.Promise[_] = js.native
  /**
    * Gets the Avatar Name of the Client
    */
  def getAvatarName(): js.Promise[java.lang.String] = js.native
  /**
    * Returns the Database ID of the Client
    * @returns the Clients Database ID
    */
  def getDBID(): scala.Double = js.native
  /**
    * Returns the Clients Database Info
    * @returns the Client Database Info
    */
  def getDBInfo(): js.Promise[_] = js.native
  /**
    * Returns the Client ID
    * @returns the Client ID
    */
  def getID(): scala.Double = js.native
  /**
    * Returns a Buffer with the Icon of the Client
    * @returns a Promise with the binary data of the Client Icon
    */
  def getIcon(): js.Promise[_] = js.native
  /**
    * Gets the Icon Name of the Client
    */
  def getIconName(): js.Promise[_] = js.native
  /**
    * Returns General Info of the Client, requires the Client to be online
    * @returns a Promise with the Client Information
    */
  def getInfo(): js.Promise[_] = js.native
  /**
    * Returns the Client Unique ID
    * @returns the Client UniqueID
    */
  def getUID(): java.lang.String = js.native
  /**
    * Retrieves a displayable Client Link for the TeamSpeak Chat
    * @return the TeamSpeak Client URL as Link
    */
  def getURL(): java.lang.String = js.native
  /**
    * Evaluates if the Client is a Query Client or a normal Client
    * @returns true when the Client is a Server Query Client
    */
  def isQuery(): scala.Boolean = js.native
  /**
    * Kicks the Client from their currently joined Channel
    * @param - The Message the Client should receive when getting kicked (max 40 Chars)
    */
  def kickFromChannel(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Kicks the Client from the Server
    * @param - The Message the Client should receive when getting kicked
    */
  def kickFromServer(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Sends a textmessage to the Client
    * @param - The message the Client should receive
    */
  def message(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Moves the Client to a different Channel
    * @param - Channel ID in which the Client should get moved
    * @param - The Channel Password
    */
  def move(cid: scala.Double): js.Promise[_] = js.native
  def move(cid: scala.Double, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a list of permissions defined for a client
    * @param - If the permsid option is set to true the output will contain the permission names. Defaults to false.
    */
  def permList(): js.Promise[_] = js.native
  def permList(permsid: scala.Boolean): js.Promise[_] = js.native
  /**
    * Pokes the Client with a certain message
    * @param - The message the Client should receive
    */
  def poke(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Adds the client to the server group specified with sgid. Please note that a client cannot be added to default groups or template groups.
    * @param - The Server Group ID which the Client should be added to
    */
  def serverGroupAdd(sgid: scala.Double): js.Promise[_] = js.native
  /**
    * Removes the client from the server group specified with sgid.
    * @param - The Server Group ID which the Client should be removed from
    */
  def serverGroupDel(sgid: scala.Double): js.Promise[_] = js.native
}

