package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamSpeak3
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Adds a new ban rule on the selected virtual server.
    * All parameters are optional but at least one of the following must be set: ip, name, or uid.
    * @param - IP Regex
    * @param - Name Regex
    * @param - UID Regex
    * @param - Bantime in Seconds, if left empty it will result in a permaban
    * @param - Ban Reason
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
    * Removes one or all bans from the server
    * @param- The BanID to remove, if not provided it will remove all bans
    */
  def banDel(): js.Promise[_] = js.native
  def banDel(banid: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of active bans on the selected virtual server.
    */
  def banList(): js.Promise[_] = js.native
  /**
    * Displays a list of IP addresses used by the server instance on multi-homed machines.
    */
  def bindingList(): js.Promise[_] = js.native
  /**
    * Creates a new channel using the given properties.
    * Note that this command accepts multiple properties which means that you're able to specifiy all settings of the new channel at once.
    * @param - The Name of the Channel
    * @param - Properties of the Channel
    */
  def channelCreate(name: java.lang.String): js.Promise[_] = js.native
  def channelCreate(name: java.lang.String, properties: js.Any): js.Promise[_] = js.native
   // TODO: permsid can be typed better (we know which permissions exist).
  /**
    * Removes a set of specified permissions from a channel.
    * Multiple permissions can be removed at once.
    * A permission can be specified by permid or permsid.
    * @param - the channel id
    * @param - The permid or permsid
    */
  def channelDelPerm(cid: scala.Double, perm: java.lang.String): js.Promise[_] = js.native
  def channelDelPerm(cid: scala.Double, perm: scala.Double): js.Promise[_] = js.native
  /**
    * Deletes an existing channel by ID.
    * If force is set to 1, the channel will be deleted even if there are clients within.
    * The clients will be kicked to the default channel with an appropriate reason message.
    * @param - the channel id
    * @param - If set to 1 the Channel will be deleted even when Clients are in it
    */
  def channelDelete(cid: scala.Double): js.Promise[_] = js.native
  def channelDelete(cid: scala.Double, force: scala.Double): js.Promise[_] = js.native
  /**
    * Changes a channels configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
    * @param - the channel id
    * @param - The Properties of the Channel which should get changed
    */
  def channelEdit(cid: scala.Double): js.Promise[_] = js.native
  def channelEdit(cid: scala.Double, properties: js.Any): js.Promise[_] = js.native
  /**
    * Adds a specified permissions to the channel group. A permission can be specified by permid or permsid.
    * @param - the ChannelGroup id
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set
    * @param - Whether the negate flag should be set
    */
  def channelGroupAddPerm(cgid: scala.Double, perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def channelGroupAddPerm(cgid: scala.Double, perm: java.lang.String, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def channelGroupAddPerm(
    cgid: scala.Double,
    perm: java.lang.String,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  def channelGroupAddPerm(cgid: scala.Double, perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  def channelGroupAddPerm(cgid: scala.Double, perm: scala.Double, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def channelGroupAddPerm(
    cgid: scala.Double,
    perm: scala.Double,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  /**
    * Displays the IDs of all clients currently residing in the channel group.
    * @param - the ChannelGroup id
    * @param - The Channel ID
    */
  def channelGroupClientList(cgid: scala.Double): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyClientMod.^]] = js.native
  def channelGroupClientList(cgid: scala.Double, cid: scala.Double): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyClientMod.^]] = js.native
  /**
    * Creates a copy of the channel group.
    * If tcgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param - the source ChannelGroup
    * @param - the target ChannelGroup (0 to create a new Group)
    * @param - The Type of the Group (0 = Template Group | 1 = Normal Group)
    * @param - Name of the Group
    */
  def channelGroupCopy(scgid: scala.Double): js.Promise[_] = js.native
  def channelGroupCopy(scgid: scala.Double, tcgid: scala.Double): js.Promise[_] = js.native
  def channelGroupCopy(scgid: scala.Double, tcgid: scala.Double, `type`: scala.Double): js.Promise[_] = js.native
  def channelGroupCopy(scgid: scala.Double, tcgid: scala.Double, `type`: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  def channelGroupCopy(scgid: scala.Double, tcgid: scala.Double, `type`: scala.Double, name: scala.Boolean): js.Promise[_] = js.native
  /**
    * Creates a new channel group using a given name.
    * The optional type parameter can be used to create ServerQuery groups and template groups.
    * @param - The Name of the Channel Group
    * @param - Type of the Channel Group
    */
  def channelGroupCreate(name: java.lang.String): js.Promise[_] = js.native
  def channelGroupCreate(name: java.lang.String, `type`: scala.Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from the channel group. A permission can be specified by permid or permsid.
    * @param - the ChannelGroup id
    * @param - The permid or permsid
    */
  def channelGroupDelPerm(cgid: scala.Double, perm: java.lang.String): js.Promise[_] = js.native
  def channelGroupDelPerm(cgid: scala.Double, perm: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of channel groups available. Depending on your permissions, the output may also contain template groups.
    * @param - Filter Object
    */
  def channelGroupList(filter: js.Any): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyChannelGroupMod.^]] = js.native
  /**
    * Displays a list of permissions assigned to the channel group specified with cgid.
    * @param - the ChannelGroup id to list
    * @param - If the permsid option is set to true the output will contain the permission names.
    */
  def channelGroupPermList(cgid: scala.Double): js.Promise[js.Array[_]] = js.native
  def channelGroupPermList(cgid: scala.Double, permsid: scala.Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Create a new privilegekey token for a Channel Group and assigned Channel ID with the given description
    * @param - The Channel Group for which the token should be valid
    * @param - Channel ID for which the token should be valid
    * @param - Token Description
    */
  def channelGroupPrivilegeKeyAdd(group: scala.Double, cid: scala.Double): js.Promise[_] = js.native
  def channelGroupPrivilegeKeyAdd(group: scala.Double, cid: scala.Double, description: java.lang.String): js.Promise[_] = js.native
  /**
    * Changes the name of the channel group
    * @param - the ChannelGroup id to rename
    * @param - new name of the ChannelGroup
    */
  def channelGroupRename(cgid: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays detailed configuration information about a channel including ID, topic, description, etc.
    * @param - the channel id
    */
  def channelInfo(cid: scala.Double): js.Promise[_] = js.native
  /**
    * Lists all Channels with a given Filter
    * @param - Filter Object
    */
  def channelList(filter: js.Any): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyChannelMod.^]] = js.native
  /**
    * Moves a channel to a new parent channel with the ID cpid.
    * If order is specified, the channel will be sorted right under the channel with the specified ID.
    * If order is set to 0, the channel will be sorted right below the new parent.
    * @param - the channel id
    * @param - Channel Parent ID
    * @param - Channel Sort Order
    */
  def channelMove(cid: scala.Double, cpid: scala.Double): js.Promise[_] = js.native
  def channelMove(cid: scala.Double, cpid: scala.Double, order: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of permissions defined for a channel.
    * @param - the channel id
    * @param - Whether the Perm SID should be displayed aswell
    */
  def channelPermList(cid: scala.Double): js.Promise[js.Array[_]] = js.native
  def channelPermList(cid: scala.Double, permsid: scala.Boolean): js.Promise[js.Array[_]] = js.native
  /**
    * Adds a set of specified permissions to a channel.
    * @param  - the channel id
    * @param - The permid or permsid
    * @param - The Value which should be set
    */
  def channelSetPerm(cid: scala.Double, perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def channelSetPerm(cid: scala.Double, perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  /**
    * Adds a set of specified permissions to a channel.
    * A permission can be specified by permid or permsid.
    * @param - the channel id
    * @param - the permissions to assign
    * @example
    * ts3.channelSetPerms(5, [{ permsid: "i_channel_needed_modify_power", permvalue: 75 }])
    */
  def channelSetPerms(cid: scala.Double, permissions: js.Array[ts3DashNodejsDashLibraryLib.Anon_Permsid]): js.Promise[_] = js.native
  /**
    * Adds a set of specified permissions to a client.
    * Multiple permissions can be added by providing the three parameters of each permission.
    * A permission can be specified by permid or permsid.
    * @param - the client database id
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set
    * @param - Whether the negate flag should be set
    */
  def clientAddPerm(cldbid: scala.Double, perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def clientAddPerm(cldbid: scala.Double, perm: java.lang.String, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def clientAddPerm(
    cldbid: scala.Double,
    perm: java.lang.String,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  def clientAddPerm(cldbid: scala.Double, perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  def clientAddPerm(cldbid: scala.Double, perm: scala.Double, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def clientAddPerm(
    cldbid: scala.Double,
    perm: scala.Double,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  /**
    * Deletes a clients properties from the database.
    * @param - The Client Database ID which should be edited
    */
  def clientDBDelete(cldbid: java.lang.String): js.Promise[_] = js.native
  /**
    * Changes a clients settings using given properties.
    * @param - The Client Database ID which should be edited
    * @param - The Properties which should be modified
    */
  def clientDBEdit(cldbid: java.lang.String): js.Promise[_] = js.native
  def clientDBEdit(cldbid: java.lang.String, properties: js.Any): js.Promise[_] = js.native
  /**
    * Displays a list of client database IDs matching a given pattern.
    * You can either search for a clients last known nickname or his unique identity by using the -uid option.
    * @param - The Pattern which should be searched for
    * @param - True when instead of the Name it should be searched for a uid
    */
  def clientDBFind(pattern: java.lang.String, isUid: scala.Boolean): js.Promise[_] = js.native
  /**
    * Returns the Clients Database Info
    * @param - the client database id
    * @returns the Client Database Info
    */
  def clientDBInfo(cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Returns the Clients Database List.1
    * @param - Start Offset. Defaults to 0.
    * @param - Duration or Limit of Clients. Defaults to 1000.
    * @param - True when the results should be counted
    * @returns the Client Database Info
    */
  def clientDBList(): js.Promise[_] = js.native
  def clientDBList(start: scala.Double): js.Promise[_] = js.native
  def clientDBList(start: scala.Double, duration: scala.Double): js.Promise[_] = js.native
  def clientDBList(start: scala.Double, duration: scala.Double, count: scala.Boolean): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from a client.
    * Multiple permissions can be removed at once.
    * A permission can be specified by permid or permsid
    * @param - the client database id
    * @param - The permid or permsid
    */
  def clientDelPerm(cldbid: scala.Double, perm: java.lang.String): js.Promise[_] = js.native
  def clientDelPerm(cldbid: scala.Double, perm: scala.Double): js.Promise[_] = js.native
  /**
    * Returns General Info of the Client, requires the Client to be online
    * @param - the client id
    * @returns Promise with the Client Information
    */
  def clientInfo(clid: scala.Double): js.Promise[_] = js.native
  /**
    * Kicks the Client from the Server
    * @param - the client id
    * @param - the reasonid
    * @param - The Message the Client should receive when getting kicked
    */
  def clientKick(clid: scala.Double, reasonid: scala.Double, reasonmsg: java.lang.String): js.Promise[_] = js.native
  /**
    * Lists all Clients with a given Filter
    * @param - Filter Object
    */
  def clientList(filter: js.Any): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyClientMod.^]] = js.native
  /**
    * Moves the Client to a different Channel
    * @param - the client id
    * @param - Channel ID in which the Client should get moved
    * @param - The Channel Password
    */
  def clientMove(clid: scala.Double, cid: scala.Double): js.Promise[_] = js.native
  def clientMove(clid: scala.Double, cid: scala.Double, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a list of permissions defined for a client
    * @param - the client database id
    * @param - If the permsid option is set to true the output will contain the permission names.
    */
  def clientPermList(cldbid: scala.Double): js.Promise[_] = js.native
  def clientPermList(cldbid: scala.Double, permsid: scala.Boolean): js.Promise[_] = js.native
  /**
    * Pokes the Client with a certain message
    * @param - the client id
    * @param - The message the Client should receive
    */
  def clientPoke(clid: scala.Double, msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Change your ServerQuery clients settings using given properties.
    * @param - The Properties which should be changed
    */
  def clientUpdate(properties: js.Any): js.Promise[_] = js.native
  /**
    * Submits a complaint about the client with database ID dbid to the server.
    * @param - Filter only for certain Client with the given Database ID
    * @param - The Message which should be added
    */
  def complainAdd(cldbid: scala.Double): js.Promise[_] = js.native
  def complainAdd(cldbid: scala.Double, message: java.lang.String): js.Promise[_] = js.native
  /**
    * Deletes the complaint about the client with ID tdbid submitted by the client with ID fdbid from the server.
    * If dbid will be left empty all complaints for the tdbid will be deleted
    * @param - The Target Client Database ID
    * @param - The Client Database ID which filed the Report
    */
  def complainDel(tcldbid: scala.Double): js.Promise[_] = js.native
  def complainDel(tcldbid: scala.Double, fcldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of complaints on the selected virtual server.
    * If dbid is specified, only complaints about the targeted client will be shown.
    * @param - Filter only for certain Client with the given Database ID
    */
  def complainList(): js.Promise[_] = js.native
  def complainList(cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Displays detailed connection information about the selected virtual server including uptime, traffic information, etc.
    */
  def connectionInfo(): js.Promise[_] = js.native
  /**
    * Removes a custom property from a client specified by the cldbid.
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param - The Client Database ID which should be changed
    * @param - The Key which should be deleted
    */
  def customDelete(cldbid: scala.Double, ident: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a list of custom properties for the client specified with cldbid.
    * @param - The Client Database ID which should be retrieved
    */
  def customInfo(cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Searches for custom client properties specified by ident and value.
    * The value parameter can include regular characters and SQL wildcard characters (e.g. %).
    * @param  - the key to search for
    * @param - the search pattern to use
    */
  def customSearch(ident: java.lang.String, pattern: java.lang.String): js.Promise[_] = js.native
  /**
    * Creates or updates a custom property for client specified by the cldbid.
    * Ident and value can be any value, and are the key value pair of the custom property.
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param - The Client Database ID which should be changed
    * @param - The Key which should be set
    * @param - The Value which should be set
    */
  def customSet(cldbid: scala.Double, ident: java.lang.String, value: java.lang.String): js.Promise[_] = js.native
  /**
    * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
    * @param - the channelgroup id
    * @param - If set to 1 the Channel Group will be deleted even when Clients are in it
    */
  def deleteChannelGroup(cgid: scala.Double): js.Promise[_] = js.native
  def deleteChannelGroup(cgid: scala.Double, force: scala.Double): js.Promise[_] = js.native
  /**
    * Returns the file in the channel with the given path
    * @param - the path whith the filename where the file should be uploaded to
    * @param - Channel ID to download from
    * @param - Channel Password of the Channel which will be uploaded to
    */
  def downloadFile(path: java.lang.String): js.Promise[_] = js.native
  def downloadFile(path: java.lang.String, cid: scala.Double): js.Promise[_] = js.native
  def downloadFile(path: java.lang.String, cid: scala.Double, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Returns an Icon with the given Name
    * @param - The Name of the Icon to retrieve eg "icon_262672952"
    */
  def downloadIcon(name: java.lang.String): js.Promise[_] = js.native
  /**
    * Sends a raw command to the TeamSpeak Server.
    * @example
    * ts3.execute("clientlist", ["-ip"])
    * ts3.execute("use", [9987], { client_nickname: "test" })
    * @param - The Command which should get executed on the TeamSpeak Server
    * @returns Promise object which returns the Information about the Query executed
    */
  def execute(args: js.Any*): js.Promise[_] = js.native
  /**
    * Creates new directory in a channels file repository
    * @param - the channel id to check for
    * @param - path to the directory
    * @param - the channel password
    */
  def ftCreateDir(cid: scala.Double, dirname: java.lang.String): js.Promise[_] = js.native
  def ftCreateDir(cid: scala.Double, dirname: java.lang.String, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Deletes one or more files stored in a channels file repository
    * @param - the channel id to check for
    * @param - path to the file to delete
    * @param - the channel password
    */
  def ftDeleteFile(cid: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  def ftDeleteFile(cid: scala.Double, name: java.lang.String, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays detailed information about one or more specified files stored in a channels file repository.
    * @param - the channel id to check for
    * @param - the filepath to receive
    * @param - the channel password
    */
  def ftGetFileInfo(cid: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  def ftGetFileInfo(cid: scala.Double, name: java.lang.String, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a list of files and directories stored in the specified channels file repository.
    * @param - the channel id to check for
    * @param - the path to list
    * @param - the channel password
    */
  def ftGetFileList(cid: scala.Double): js.Promise[_] = js.native
  def ftGetFileList(cid: scala.Double, path: java.lang.String): js.Promise[_] = js.native
  def ftGetFileList(cid: scala.Double, path: java.lang.String, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Initializes a file transfer download. clientftfid is an arbitrary ID to identify the file transfer on client-side.
    * On success, the server generates a new ftkey which is required to start downloading the file through TeamSpeak 3's file transfer interface.
    * @param - The Transfer Object
    * @param - Filepath to Download
    * @param - Arbitary ID to Identify the Transfer
    * @param - Channel ID to upload to
    * @param - Channel Password of the Channel which will be uploaded to
    * @param - <Description Pending File Startposition?>
    */
  def ftInitDownload(transfer: ts3DashNodejsDashLibraryLib.Anon_CidClientftfid): js.Promise[_] = js.native
  /**
    * Initializes a file transfer upload. clientftfid is an arbitrary ID to identify the file transfer on client-side.
    * On success, the server generates a new ftkey which is required to start uploading the file through TeamSpeak 3's file transfer interface.
    * @param - The Transfer Object
    * @param - Arbitary ID to Identify the Transfer
    * @param - Destination Filename
    * @param - Size of the File
    * @param - Channel ID to upload to
    * @param - Channel Password of the Channel which will be uploaded to
    * @param - Overwrites an existing file
    * @param - <Description Pending>
    */
  def ftInitUpload(transfer: ts3DashNodejsDashLibraryLib.Anon_Cid): js.Promise[_] = js.native
  /**
    * Renames a file in a channels file repository.
    * If the two parameters tcid and tcpw are specified, the file will be moved into another channels file repository
    * @param - the channel id to check for
    * @param - the path to the file which should be renamed
    * @param - the path to the file with the new name
    * @param - target channel id if the file should be moved to a different channel
    * @param - the channel password from where the file gets renamed
    * @param - the channel password from where the file will get transferred to
    */
  def ftRenameFile(cid: scala.Double, oldname: java.lang.String, newname: java.lang.String): js.Promise[_] = js.native
  def ftRenameFile(cid: scala.Double, oldname: java.lang.String, newname: java.lang.String, tcid: java.lang.String): js.Promise[_] = js.native
  def ftRenameFile(
    cid: scala.Double,
    oldname: java.lang.String,
    newname: java.lang.String,
    tcid: java.lang.String,
    cpw: java.lang.String
  ): js.Promise[_] = js.native
  def ftRenameFile(
    cid: scala.Double,
    oldname: java.lang.String,
    newname: java.lang.String,
    tcid: java.lang.String,
    cpw: java.lang.String,
    tcpw: java.lang.String
  ): js.Promise[_] = js.native
  /**
    * Stops the running file transfer with server-side ID serverftfid.
    * @param - Server File Transfer ID
    * @param - <Description Pending>
    */
  def ftStop(serverftfid: scala.Double): js.Promise[_] = js.native
  def ftStop(serverftfid: scala.Double, del: scala.Double): js.Promise[_] = js.native
  /**
    * Retrieves a Single Channel by the given Channel ID
    * @param- The Channel Id
    */
  def getChannelByID(cid: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyChannelMod.^] = js.native
  /**
    * Retrieves a Single Channel by the given Channel Name
    * @param - The Name of the Channel
    */
  def getChannelByName(channel_name: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyChannelMod.^] = js.native
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup ID
    * @param - the ChannelGroup Id
    */
  def getChannelGroupByID(cgid: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyChannelGroupMod.^] = js.native
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup Name
    * @param - the ChannelGroup name
    */
  def getChannelGroupByName(name: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyChannelGroupMod.^] = js.native
  /**
    * Retrieves a Single Client by the given Client Database ID
    * @param - The Client Database Id
    */
  def getClientByDBID(client_database_id: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyClientMod.^] = js.native
  /**
    * Retrieves a Single Client by the given Client ID
    * @param clid - The Client Id
    */
  def getClientByID(clid: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyClientMod.^] = js.native
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param - The Nickname of the Client
    */
  def getClientByName(client_nickname: java.lang.String): js.Promise[ts3DashNodejsDashLibraryLib.propertyClientMod.^] = js.native
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param - The Client Unique Identifier
    */
  def getClientByUID(client_unique_identifier: java.lang.String): js.Promise[ts3DashNodejsDashLibraryLib.propertyClientMod.^] = js.native
  /**
    * Gets the Icon Name of a resolveable Perm List
    * @param - expects a promise which resolves to a permission list
    */
  def getIconName(permlist: js.Promise[js.Array[_]]): js.Promise[_] = js.native
  /**
    * Retrieves a single ServerGroup by the given ServerGroup ID
    * @param - the ServerGroup Id
    */
  def getServerGroupByID(sgid: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyServerGroupMod.^] = js.native
  /**
    * Retrieves a single ServerGroup by the given ServerGroup Name
    * @param - the ServerGroup name
    */
  def getServerGroupByName(name: scala.Double): js.Promise[ts3DashNodejsDashLibraryLib.propertyServerGroupMod.^] = js.native
  /**
    * Sends a text message to all clients on all virtual servers in the TeamSpeak 3 Server instance.
    * @param - Message which will be sent to all instances
    */
  def gm(msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays detailed connection information about the server instance including uptime,
    * number of virtual servers online, traffic information, etc.
    */
  def hostInfo(): js.Promise[_] = js.native
  /**
    * Changes the server instance configuration using given properties.
    * @param - The stuff you want to change
    */
  def instanceEdit(properties: js.Any): js.Promise[_] = js.native
  /**
    * Displays the server instance configuration including database revision number,
    * the file transfer port, default group IDs, etc.
    */
  def instanceInfo(): js.Promise[_] = js.native
  /**
    * Writes a custom entry into the servers log.
    * Depending on your permissions, you'll be able to add entries into the server instance log and/or your virtual servers log.
    * The loglevel parameter specifies the type of the entry
    * @param - Level 1 to 4
    * @param - Message to log
    */
  def logAdd(loglevel: scala.Double, logmsg: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays a specified number of entries from the servers log.
    * If instance is set to 1, the server will return lines from the master logfile (ts3server_0.log) instead of the selected virtual server logfile.
    * @param - Lines to receive
    * @param - Invert Output
    * @param - Instance or Virtual Server Log
    * @param - Begin at Position
    */
  def logView(): js.Promise[_] = js.native
  def logView(lines: scala.Double): js.Promise[_] = js.native
  def logView(lines: scala.Double, reverse: scala.Double): js.Promise[_] = js.native
  def logView(lines: scala.Double, reverse: scala.Double, instance: scala.Double): js.Promise[_] = js.native
  def logView(lines: scala.Double, reverse: scala.Double, instance: scala.Double, begin_pos: scala.Double): js.Promise[_] = js.native
  /**
    * Authenticates with the TeamSpeak 3 Server instance using given ServerQuery login credentials.
    * @param - The Username which you want to login with
    * @param - The Password you want to login with
    */
  def login(username: java.lang.String, password: java.lang.String): js.Promise[_] = js.native
  /**
    * Deselects the active virtual server and logs out from the server instance.
    */
  def logout(): js.Promise[_] = js.native
  /**
    * Sends an offline message to the client specified by uid.
    * @param - Client Unique Identifier (uid)
    * @param - Subject of the message
    * @param - Message Text
    */
  def messageAdd(cluid: java.lang.String, subject: java.lang.String, text: java.lang.String): js.Promise[_] = js.native
  /**
    * Sends an offline message to the client specified by uid.
    * @param - The Message ID which should be deleted
    */
  def messageDel(msgid: scala.Double): js.Promise[_] = js.native
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param - Gets the content of the Message
    */
  def messageGet(msgid: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of offline messages you've received.
    * The output contains the senders unique identifier, the messages subject, etc.
    */
  def messageList(): js.Promise[_] = js.native
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param - Gets the content of the Message
    * @param - If flag is set to 1 the message will be marked as read
    */
  def messageUpdate(msgid: scala.Double): js.Promise[_] = js.native
  def messageUpdate(msgid: scala.Double, flag: scala.Double): js.Promise[_] = js.native
  def permFind(perm: java.lang.String): js.Promise[_] = js.native
  /**
    * Retrieves detailed information about all assignments of the permission.
    * The output is similar to permoverview which includes the type and the ID of the client, channel or group associated with the permission.
    * @param - Perm ID or Name to get
    */
  def permFind(perm: scala.Double): js.Promise[_] = js.native
  def permGet(key: java.lang.String): js.Promise[_] = js.native
  /**
    * Retrieves the current value of the permission for your own connection.
    * This can be useful when you need to check your own privileges.
    * @param - Perm ID or Name which should be checked
    */
  def permGet(key: scala.Double): js.Promise[_] = js.native
  /**
    * Retrieves the database ID of one or more permissions specified by permsid.
    * @param - One or more Permission Names
    * @returns gets the specified permissions
    */
  def permIdGetByName(permsid: java.lang.String): js.Promise[_] = js.native
  def permIdGetByName(permsid: js.Array[java.lang.String]): js.Promise[_] = js.native
  /**
    * Displays all permissions assigned to a client for the channel specified with cid.
    * If permid is set to 0, all permissions will be displayed.
    * A permission can be specified by permid or permsid.
    * @param - The Client Database ID
    * @param - One or more Permission Names
    * @param - One or more Permission IDs
    * @param - One or more Permission Names
    */
  def permOverview(cldbid: scala.Double, cid: scala.Double): js.Promise[_] = js.native
  def permOverview(cldbid: scala.Double, cid: scala.Double, permid: scala.Double): js.Promise[_] = js.native
  def permOverview(cldbid: scala.Double, cid: scala.Double, permid: scala.Double, permsid: scala.Double): js.Promise[_] = js.native
  /**
    * Restores the default permission settings on the selected virtual server and creates a new initial administrator token.
    * Please note that in case of an error during the permreset call - e.g. when the database has been modified or corrupted - the virtual server will be deleted from the database.
    */
  def permReset(): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves a list of permissions available on the server instance including ID, name and description.
    */
  def permissionList(): js.Promise[js.Array[_]] = js.native
  /**
    * Create a new token.
    * If type is set to 0, the ID specified with tokenid will be a server group ID.
    * Otherwise, tokenid is used as a channel group ID and you need to provide a valid channel ID using channelid.
    * @param - Token Type
    * @param - Depends on the Type given, add either a valid Channel Group or Server Group
    * @param - Depends on the Type given, add a valid Channel ID
    * @param - Token Description
    */
  def privilegeKeyAdd(tokentype: scala.Double, group: scala.Double): js.Promise[_] = js.native
  def privilegeKeyAdd(tokentype: scala.Double, group: scala.Double, cid: scala.Double): js.Promise[_] = js.native
  def privilegeKeyAdd(tokentype: scala.Double, group: scala.Double, cid: scala.Double, description: java.lang.String): js.Promise[_] = js.native
  /**
    * Deletes an existing token matching the token key specified with token.
    * @param - The token which should be deleted
    */
  def privilegeKeyDelete(token: java.lang.String): js.Promise[_] = js.native
  /**
    * Retrieves a list of privilege keys available including their type and group IDs.
    */
  def privilegeKeyList(): js.Promise[_] = js.native
  /**
    * Use a token key gain access to a server or channel group.
    * Please note that the server will automatically delete the token after it has been used.
    * @param - The token which should be used
    */
  def privilegeKeyUse(token: java.lang.String): js.Promise[_] = js.native
  /**
    * Adds a new query client login, or enables query login for existing clients.
    * When no virtual server has been selected, the command will create global query logins.
    * Otherwise the command enables query login for existing client, and cldbid must be specified.
    * @param - the login name
    * @param - the database id which should be used
    * @returns Promise object which returns the Information about the Query executed
    */
  def queryLoginAdd(client_login_name: java.lang.String): js.Promise[_] = js.native
  def queryLoginAdd(client_login_name: java.lang.String, cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Deletes an existing server query login on selected server.
    * When no virtual server has been selected, deletes global query logins instead.
    * @param - deletes the querylogin of this client
    * @returns Promise object which returns the Information about the Query executed
    */
  def queryLoginDel(cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * List existing query client logins.
    * The pattern parameter can include regular characters and SQL wildcard characters (e.g. %).
    * Only displays query logins of the selected virtual server, or all query logins when no virtual server have been  selected.
    * @param - the pattern to filter for client login names
    * @param - the offset from where clients should be listed
    * @param - how many clients should be listed
    * @returns Promise object which returns the Information about the Query executed
    */
  def queryLoginList(): js.Promise[_] = js.native
  def queryLoginList(pattern: java.lang.String): js.Promise[_] = js.native
  def queryLoginList(pattern: java.lang.String, start: scala.Double): js.Promise[_] = js.native
  def queryLoginList(pattern: java.lang.String, start: scala.Double, duration: scala.Double): js.Promise[_] = js.native
  /**
    * Closes the ServerQuery connection to the TeamSpeak 3 Server instance.
    */
  def quit(): js.Promise[_] = js.native
  /**
    * Subscribes to an Event.
    * @param - The Event on which should be subscribed
    * @param - The Channel ID, only required when subscribing to the "channel" event
    */
  def registerEvent(event: java.lang.String): js.Promise[_] = js.native
  def registerEvent(event: java.lang.String, id: scala.Double): js.Promise[_] = js.native
  /**
    * Sends a text message a specified target.
    * The type of the target is determined by targetmode while target specifies the ID of the recipient,
    * whether it be a virtual server, a channel or a client.
    * @param - target client id which should receive the message
    * @param - targetmode (1: client, 2: channel, 3: server)
    * @param - The message the Client should receive
    */
  def sendTextMessage(target: scala.Double, targetmode: scala.Double, msg: java.lang.String): js.Promise[_] = js.native
  /**
    * Creates a new virtual server using the given properties and displays its ID, port and initial administrator privilege key.
    * If virtualserver_port is not specified, the server will test for the first unused UDP port
    * @param - The Server Settings
    * @returns the server admin token for the new server and the response from the server creation
    */
  def serverCreate(properties: js.Any): js.Promise[_] = js.native
  /**
    * Deletes a Server.
    * @param - the server id
    */
  def serverDelete(sid: scala.Double): js.Promise[_] = js.native
  /**
    * Changes the selected virtual servers configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the selected virtual server at once.
    * @param properties - The Server Settings which should be changed
    */
  def serverEdit(properties: js.Any): js.Promise[_] = js.native
  /**
    * Adds the client to the server group specified with sgid.
    * Please note that a client cannot be added to default groups or template groups.
    * @param - The Client Database ID which should be added
    * @param - The Server Group ID which the Client should be added to
    */
  def serverGroupAddClient(cldbid: scala.Double, sgid: scala.Double): js.Promise[_] = js.native
  /**
    * Adds a specified permissions to the server group. A permission can be specified by permid or permsid.
    * @param - the ServerGroup id
    * @param - The permid or permsid
    * @param - Value of the Permission
    * @param - Whether the skip flag should be set
    * @param - Whether the negate flag should be set
    */
  def serverGroupAddPerm(sgid: scala.Double, perm: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  def serverGroupAddPerm(sgid: scala.Double, perm: java.lang.String, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def serverGroupAddPerm(
    sgid: scala.Double,
    perm: java.lang.String,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  def serverGroupAddPerm(sgid: scala.Double, perm: scala.Double, value: scala.Double): js.Promise[_] = js.native
  def serverGroupAddPerm(sgid: scala.Double, perm: scala.Double, value: scala.Double, skip: scala.Double): js.Promise[_] = js.native
  def serverGroupAddPerm(
    sgid: scala.Double,
    perm: scala.Double,
    value: scala.Double,
    skip: scala.Double,
    negate: scala.Double
  ): js.Promise[_] = js.native
  /**
    * Displays the IDs of all clients currently residing in the server group.
    * @param - the ServerGroup id
    */
  def serverGroupClientList(sgid: scala.Double): js.Promise[_] = js.native
  /**
    * Creates a copy of the server group specified with ssgid.
    * If tsgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param - the source ServerGroup
    * @param - the target ServerGroup, 0 to create a new Group
    * @param - The Type of the Group (0 = Query Group | 1 = Normal Group)
    * @param - Name of the Group
    */
  def serverGroupCopy(ssgid: scala.Double): js.Promise[_] = js.native
  def serverGroupCopy(ssgid: scala.Double, tsgid: scala.Double): js.Promise[_] = js.native
  def serverGroupCopy(ssgid: scala.Double, tsgid: scala.Double, `type`: scala.Double): js.Promise[_] = js.native
  def serverGroupCopy(ssgid: scala.Double, tsgid: scala.Double, `type`: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  def serverGroupCopy(ssgid: scala.Double, tsgid: scala.Double, `type`: scala.Double, name: scala.Boolean): js.Promise[_] = js.native
  /**
    * Creates a new server group using the name specified with name.
    * The optional type parameter can be used to create ServerQuery groups and template groups.
    * @param - The Name of the Server Group
    * @param - Type of the Server Group
    */
  def serverGroupCreate(name: java.lang.String): js.Promise[_] = js.native
  def serverGroupCreate(name: java.lang.String, `type`: scala.Double): js.Promise[_] = js.native
  /**
    * Deletes the server group. If force is set to 1, the server group will be deleted even if there are clients within.
    * @param - the ServerGroup id
    * @param - If set to 1 the ServerGroup will be deleted even when Clients are in it
    */
  def serverGroupDel(sgid: scala.Double): js.Promise[_] = js.native
  def serverGroupDel(sgid: scala.Double, force: scala.Double): js.Promise[_] = js.native
  /**
    * Removes the client from the server group specified with sgid.
    * @param - The Client Database ID which should be removed
    * @param - The Server Group ID which the Client should be removed from
    */
  def serverGroupDelClient(cldbid: scala.Double, sgid: scala.Double): js.Promise[_] = js.native
  /**
    * Removes a set of specified permissions from the server group.
    * A permission can be specified by permid or permsid.
    * @param - the ServerGroup id
    * @param - The permid or permsid
    */
  def serverGroupDelPerm(sgid: scala.Double, perm: java.lang.String): js.Promise[_] = js.native
  def serverGroupDelPerm(sgid: scala.Double, perm: scala.Double): js.Promise[_] = js.native
  /**
    * Displays a list of server groups available.
    * Depending on your permissions, the output may also contain global ServerQuery groups and template groups.
    * @param - Filter Object
    */
  def serverGroupList(filter: js.Any): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyServerGroupMod.^]] = js.native
  /**
    * Displays a list of permissions assigned to the server group specified with sgid.
    * @param - the ServerGroup id
    * @param - If the permsid option is set to true the output will contain the permission names.
    */
  def serverGroupPermList(sgid: scala.Double): js.Promise[_] = js.native
  def serverGroupPermList(sgid: scala.Double, permsid: scala.Boolean): js.Promise[_] = js.native
  /**
    * Create a new privilegekey token for a ServerGroup with the given description
    * @param - Server Group which should be generated the token for
    * @param - Token Description
    */
  def serverGroupPrivilegeKeyAdd(group: scala.Double): js.Promise[_] = js.native
  def serverGroupPrivilegeKeyAdd(group: scala.Double, description: java.lang.String): js.Promise[_] = js.native
  /**
    * Changes the name of the server group
    * @param - the ServerGroup id
    * @param - new name of the ServerGroup
    */
  def serverGroupRename(sgid: scala.Double, name: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays the database ID of the virtual server running on the UDP port
    * @param - The Server Port where data should be retrieved
    */
  def serverIdGetByPort(virtualserver_port: scala.Double): js.Promise[_] = js.native
  /**
    * Displays detailed configuration information about the selected virtual server
    * including unique ID, number of clients online, configuration, etc.
    */
  def serverInfo(): js.Promise[_] = js.native
  /**
    * Displays a list of virtual servers including their ID, status, number of clients online, etc.
    */
  def serverList(): js.Promise[js.Array[ts3DashNodejsDashLibraryLib.propertyServerMod.^]] = js.native
  /**
    * Stops the entire TeamSpeak 3 Server instance by shutting down the process.
    * @param - Specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverProcessStop(): js.Promise[_] = js.native
  def serverProcessStop(reasonmsg: java.lang.String): js.Promise[_] = js.native
  /**
    * Starts the virtual server. Depending on your permissions,
    * you're able to start either your own virtual server only or all virtual servers in the server instance.
    * @param - the server id
    */
  def serverStart(sid: scala.Double): js.Promise[_] = js.native
  /**
    * Stops the virtual server. Depending on your permissions,
    * you're able to stop either your own virtual server only or all virtual servers in the server instance.
    * @param - the server id
    * @param - Specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverStop(sid: scala.Double): js.Promise[_] = js.native
  def serverStop(sid: scala.Double, reasonmsg: java.lang.String): js.Promise[_] = js.native
  /**
    * Sets the channel group of a client
    * @param - The Channel Group which the Client should get assigned
    * @param - The Channel in which the Client should be assigned the Group
    * @param - The Client Database ID which should be added to the Group
    */
  def setClientChannelGroup(cgid: scala.Double, cid: scala.Double, cldbid: scala.Double): js.Promise[_] = js.native
  /**
    * Transforms an Input to an Array
    * @param - input data which should be converted to an array
    */
  def toArray(input: js.Any): js.Promise[js.Array[_]] = js.native
  /**
    * Uploads a file
    * @param - the path whith the filename where the file should be uploaded to
    * @param - The data to upload
    * @param - Channel ID to upload to
    * @param - Channel Password of the Channel which will be uploaded to
    */
  def uploadFile(path: java.lang.String, data: java.lang.String): js.Promise[_] = js.native
  def uploadFile(path: java.lang.String, data: java.lang.String, cid: scala.Double): js.Promise[_] = js.native
  def uploadFile(path: java.lang.String, data: java.lang.String, cid: scala.Double, cpw: java.lang.String): js.Promise[_] = js.native
  def uploadFile(path: java.lang.String, data: nodeLib.Buffer): js.Promise[_] = js.native
  def uploadFile(path: java.lang.String, data: nodeLib.Buffer, cid: scala.Double): js.Promise[_] = js.native
  def uploadFile(path: java.lang.String, data: nodeLib.Buffer, cid: scala.Double, cpw: java.lang.String): js.Promise[_] = js.native
  /**
    * Selects the virtual server specified with the port to allow further interaction.
    * @param - The Port the Server runs on
    * @param - Set Nickname when selecting a server
    */
  def useByPort(port: scala.Double): js.Promise[_] = js.native
  def useByPort(port: scala.Double, client_nickname: java.lang.String): js.Promise[_] = js.native
  /**
    * Selects the virtual server specified with the sid to allow further interaction.
    * @param - The Server ID
    * @param - Set Nickname when selecting a server
    */
  def useBySid(sid: scala.Double): js.Promise[_] = js.native
  def useBySid(sid: scala.Double, client_nickname: java.lang.String): js.Promise[_] = js.native
  /**
    * Displays the servers version information including platform and build number.
    */
  def version(): js.Promise[_] = js.native
  /**
    * Displays information about your current ServerQuery connection including your loginname, etc.
    */
  def whoami(): js.Promise[_] = js.native
}

