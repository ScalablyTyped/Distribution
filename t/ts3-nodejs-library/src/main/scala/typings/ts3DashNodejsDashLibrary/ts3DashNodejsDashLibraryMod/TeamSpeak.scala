package typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Partial
import typings.ts3DashNodejsDashLibrary.libExceptionResponseErrorMod.ResponseError
import typings.ts3DashNodejsDashLibrary.libNodeChannelGroupMod.TeamSpeakChannelGroup
import typings.ts3DashNodejsDashLibrary.libNodeChannelMod.TeamSpeakChannel
import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libNodeServerGroupMod.TeamSpeakServerGroup
import typings.ts3DashNodejsDashLibrary.libNodeServerMod.TeamSpeakServer
import typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.executeArgs
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ChannelCreate
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ChannelDelete
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ChannelMove
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ClientConnect
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ClientDisconnect
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ClientMoved
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.Debug
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ServerEdit
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.TextMessage
import typings.ts3DashNodejsDashLibrary.libTypesEventsMod.TokenUsed
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.BanAdd
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.BanClient
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ChannelEdit
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ClientDBEdit
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ClientEdit
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ClientUpdate
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.InstanceEdit
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ServerTempPasswordAdd
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.TransferDownload
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.TransferUpload
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponse
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.BanList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.BindingList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelClientPermListId
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelClientPermListSid
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelFind
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelGroupClientList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelGroupCopy
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelGroupList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientDBFind
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientDBInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientDBList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientFind
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientGetDbidFromUid
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientGetIds
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientGetNameFromDbid
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientGetNameFromUid
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientGetUidFromClid
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientSetServerQueryLogin
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ComplainList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.CustomInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.CustomSearch
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.FTGetFileInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.FTGetFileList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.FTInitDownload
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.FTInitUpload
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.FTList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.HostInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.InstanceInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.LogView
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.MessageGet
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.MessageList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermFind
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermGet
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermIdGetByName
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermOverview
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermissionList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PrivilegeKeyList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.QueryLoginAdd
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.QueryLoginList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerCreate
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerGroupClientList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerGroupCopy
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerGroupList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerGroupsByClientId
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerIdGetByPort
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerRequestConnectionInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ServerTempPasswordList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.SnapshotCreate
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.Token
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.Version
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.Whoami
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryNumbers.`false`
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryNumbers.`true`
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.channelcreate
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.channeldelete
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.channeledit
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.channelmoved
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.clientconnect
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.clientdisconnect
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.clientmoved
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.close
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.debug
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.error
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.flooding
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.ready
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.serveredit
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.textmessage
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.tokenused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library", "TeamSpeak")
@js.native
class TeamSpeak protected () extends EventEmitter {
  def this(config: Partial[ConnectionParams]) = this()
  var channelgroups: js.Any = js.native
  var channels: js.Any = js.native
  var clients: js.Any = js.native
  val config: ConnectionParams = js.native
  var context: js.Any = js.native
  /**
    * Gets called when a channel gets edited
    * @param event the raw teamspeak event
    */
  var evchannelcreated: js.Any = js.native
  /**
    * Gets called when a channel gets deleted
    * @param event the raw teamspeak event
    */
  var evchanneldeleted: js.Any = js.native
  /**
    * Gets called when a channel gets edited
    * @param event the raw teamspeak event
    */
  var evchanneledited: js.Any = js.native
  /**
    * Gets called when a channel gets moved
    * @param event the raw teamspeak event
    */
  var evchannelmoved: js.Any = js.native
  /**
    * Gets called when a client connects to the TeamSpeak Server
    * @param event the raw teamspeak event
    */
  var evcliententerview: js.Any = js.native
  /**
    * Gets called when a client discconnects from the TeamSpeak Server
    * @param event the raw teamspeak event
    */
  var evclientleftview: js.Any = js.native
  /**
    * Gets called when a client moves to a different channel
    * @param event the raw teamspeak event
    */
  var evclientmoved: js.Any = js.native
  /**
    * Gets called when the server has been edited
    * @param event the raw teamspeak event
    */
  var evserveredited: js.Any = js.native
  /**
    * Gets called when a chat message gets received
    * @param event the raw teamspeak event
    */
  var evtextmessage: js.Any = js.native
  /**
    * Gets called when a client uses a privilege key
    * @param event the raw teamspeak event
    */
  var evtokenused: js.Any = js.native
  /**
    * parses the whole cache by given objects
    * @param cache the cache object
    * @param list the list to check against the cache
    * @param key the key used to identify the object inside the cache
    * @param node the class which should be used
    */
  var handleCache: js.Any = js.native
  /** handles initial commands after successfully connecting to a TeamSpeak Server */
  var handleReady: js.Any = js.native
  var priorizeNextCommand: js.Any = js.native
  var query: js.Any = js.native
  var servergroups: js.Any = js.native
  var servers: js.Any = js.native
  /**
    * updates the context with new data
    * @param data the data to update the context with
    */
  var updateContext: js.Any = js.native
  /**
    * updates the context when the inner callback gets called
    * and throws the first parameter which is an error
    * @param context context data to update
    */
  var updateContextReject: js.Any = js.native
  /**
    * updates the context when the inner callback gets called
    * and returns the first parameter
    * @param context context data to update
    */
  var updateContextResolve: js.Any = js.native
  /**
    * Adds a new ban rule on the selected virtual server.
    * All parameters are optional but at least one of the following must be set: ip, name, uid or mytsid.
    */
  def ban(properties: BanAdd): js.Promise[typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.BanAdd] = js.native
  /**
    * Bans the client specified with ID clid from the server.
    * Please note that this will create two separate ban rules for the targeted clients IP address and his unique identifier.
    */
  def banClient(properties: BanClient): js.Promise[typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.BanAdd] = js.native
  /**
    * Removes one or all bans from the server
    * @param banid the banid to remove, if not provided it will remove all bans
    */
  def banDel(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def banDel(banid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of active bans on the selected virtual server.
    * @param start optional start from where clients should be listed
    * @param duration optional duration on how much ban entries should be retrieved
    */
  def banList(): js.Promise[js.Array[BanList]] = js.native
  def banList(start: Double): js.Promise[js.Array[BanList]] = js.native
  def banList(start: Double, duration: Double): js.Promise[js.Array[BanList]] = js.native
  /** returns a list of IP addresses used by the server instance on multi-homed machines. */
  def bindingList(): js.Promise[js.Array[BindingList]] = js.native
  @JSName("channelClientPermList")
  def channelClientPermList_false(cid: Double, cldbid: Double, permsid: `false`): js.Promise[js.Array[ChannelClientPermListId]] = js.native
  @JSName("channelClientPermList")
  def channelClientPermList_true(cid: Double, cldbid: Double, permsid: `true`): js.Promise[js.Array[ChannelClientPermListSid]] = js.native
  /**
    * Creates a new channel using the given properties.
    * Note that this command accepts multiple properties which means that you're able to specifiy all settings of the new channel at once.
    * @param name the name of the channel
    * @param properties properties of the channel
    */
  def channelCreate(name: String): js.Promise[TeamSpeakChannel] = js.native
  def channelCreate(name: String, properties: ChannelEdit): js.Promise[TeamSpeakChannel] = js.native
  /**
    * Removes a set of specified permissions from a channel.
    * Multiple permissions can be removed at once.
    * A permission can be specified by permid or permsid.
    * @param cid the channel id
    * @param perm the permid or permsid
    */
  def channelDelPerm(cid: Double, perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelDelPerm(cid: Double, perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes an existing channel by ID.
    * If force is set to 1, the channel will be deleted even if there are clients within.
    * The clients will be kicked to the default channel with an appropriate reason message.
    * @param cid the channel id
    * @param force if set to 1 the channel will be deleted even when client are in it
    */
  def channelDelete(cid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelDelete(cid: Double, force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Changes a channels configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
    * @param cid the channel id
    * @param properties the properties of the channel which should get changed
    */
  def channelEdit(cid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelEdit(cid: Double, properties: ChannelEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * displays a list of channels matching a given name pattern
    * @param pattern the channel name pattern to search for
    */
  def channelFind(pattern: String): js.Promise[js.Array[ChannelFind]] = js.native
  /**
    * Adds a specified permissions to the channel group. A permission can be specified by permid or permsid.
    * @param cgid the channelgroup id
    * @param perm the permid or permsid
    * @param value value of the permission
    * @param skip whether the skip flag should be set
    * @param negate whether the negate flag should be set
    */
  def channelGroupAddPerm(cgid: Double, perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupAddPerm(cgid: Double, perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupAddPerm(cgid: Double, perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupAddPerm(cgid: Double, perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupAddPerm(cgid: Double, perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupAddPerm(cgid: Double, perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays the IDs of all clients currently residing in the channel group.
    * @param cgid the channelgroup id
    * @param cid the channel id
    */
  def channelGroupClientList(cgid: Double): js.Promise[js.Array[ChannelGroupClientList]] = js.native
  def channelGroupClientList(cgid: Double, cid: Double): js.Promise[js.Array[ChannelGroupClientList]] = js.native
  /**
    * Creates a copy of the channel group.
    * If tcgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param scgid the source channelgroup
    * @param tcgid the target channelgroup (0 to create a new group)
    * @param type the type of the group (0 = Template Group | 1 = Normal Group)
    * @param name name of the goup
    */
  def channelGroupCopy(scgid: Double): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(scgid: Double, tcgid: Double): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(scgid: Double, tcgid: Double, `type`: Double): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(scgid: Double, tcgid: Double, `type`: Double, name: String): js.Promise[ChannelGroupCopy] = js.native
  /**
    * Creates a new channel group using a given name.
    * The optional type parameter can be used to create ServerQuery groups and template groups.
    * @param name the name of the channelgroup
    * @param type type of the channelgroup
    */
  def channelGroupCreate(name: String): js.Promise[TeamSpeakChannelGroup] = js.native
  def channelGroupCreate(name: String, `type`: Double): js.Promise[TeamSpeakChannelGroup] = js.native
  /**
    * Removes a set of specified permissions from the channel group. A permission can be specified by permid or permsid.
    * @param cgid the channelgroup id
    * @param perm the permid or permsid
    */
  def channelGroupDelPerm(cgid: Double, perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelGroupDelPerm(cgid: Double, perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of channel groups available. Depending on your permissions, the output may also contain template groups.
    */
  def channelGroupList(): js.Promise[js.Array[TeamSpeakChannelGroup]] = js.native
  def channelGroupList(filter: Partial[ChannelGroupList]): js.Promise[js.Array[TeamSpeakChannelGroup]] = js.native
  /**
    * Displays a list of permissions assigned to the channel group specified with cgid.
    * @param cgid the channelgroup id to list
    * @param permsid if the permsid option is set to true the output will contain the permission names.
    */
  def channelGroupPermList(cgid: Double): js.Promise[js.Array[PermList]] = js.native
  def channelGroupPermList(cgid: Double, permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
  /**
    * Create a new privilegekey token for a Channel Group and assigned Channel ID with the given description
    * @param group the channel group for which the token should be valid
    * @param cid channel id for which the token should be valid
    * @param description token description
    * @param tokencustomset token custom set
    */
  def channelGroupPrivilegeKeyAdd(group: Double, cid: Double): js.Promise[Token] = js.native
  def channelGroupPrivilegeKeyAdd(group: Double, cid: Double, description: String): js.Promise[Token] = js.native
  def channelGroupPrivilegeKeyAdd(group: Double, cid: Double, description: String, tokencustomset: String): js.Promise[Token] = js.native
  /**
    * Changes the name of the channel group
    * @param cgid the channelgroup id to rename
    * @param name new name of the ghannelgroup
    */
  def channelGroupRename(cgid: Double, name: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays detailed configuration information about a channel including ID, topic, description, etc.
    * @param cid the channel id
    */
  def channelInfo(cid: Double): js.Promise[ChannelInfo] = js.native
  /**
    * Lists all Channels with a given Filter
    */
  def channelList(): js.Promise[js.Array[TeamSpeakChannel]] = js.native
  def channelList(filter: Partial[ChannelList]): js.Promise[js.Array[TeamSpeakChannel]] = js.native
  /**
    * Moves a channel to a new parent channel with the ID cpid.
    * If order is specified, the channel will be sorted right under the channel with the specified ID.
    * If order is set to 0, the channel will be sorted right below the new parent.
    * @param cid the channel id
    * @param cpid channel parent id
    * @param order channel sort order
    */
  def channelMove(cid: Double, cpid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelMove(cid: Double, cpid: Double, order: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of permissions defined for a channel.
    * @param cid the channel id
    * @param permsid whether the permsid should be displayed aswell
    */
  def channelPermList(cid: Double): js.Promise[js.Array[PermList]] = js.native
  def channelPermList(cid: Double, permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
  /**
    * Adds a set of specified permissions to a channel.
    * @param cid the channel id
    * @param perm the permid or permsid
    * @param value the value which should be set
    */
  def channelSetPerm(cid: Double, perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def channelSetPerm(cid: Double, perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds a set of specified permissions to a channel.
    * A permission can be specified by permid or permsid.
    * @param cid the channel id
    * @param permissions the permissions to assign
    * @example
    * TeamSpeak.channelSetPerms(5, [{ permsid: "i_channel_needed_modify_power", permvalue: 75 }])
    */
  def channelSetPerms(cid: Double, permissions: js.Array[_]): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds a set of specified permissions to a client.
    * Multiple permissions can be added by providing the three parameters of each permission.
    * A permission can be specified by permid or permsid.
    * @param cldbid the client database id
    * @param perm the permid or permsid
    * @param value value of the permission
    * @param skip whether the skip flag should be set
    * @param negate whether the negate flag should be set
    */
  def clientAddPerm(cldbid: Double, perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddPerm(cldbid: Double, perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddPerm(cldbid: Double, perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddPerm(cldbid: Double, perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddPerm(cldbid: Double, perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddPerm(cldbid: Double, perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientAddServerGroup(cldbid: Double, sgid: js.Array[Double]): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds one or more servergroups to a client.
    * Please note that a client cannot be added to default groups or template groups
    * @param cldbid one or more client database ids which should be added
    * @param sgid one or more servergroup ids which the client should be added to
    */
  def clientAddServerGroup(cldbid: Double, sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes a clients properties from the database.
    * @param cldbid the client database id which should be deleted
    */
  def clientDBDelete(cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Changes a clients settings using given properties.
    * @param cldbid the client database id which should be edited
    * @param properties the properties which should be modified
    */
  def clientDBEdit(cldbid: Double, properties: ClientDBEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of client database IDs matching a given pattern.
    * You can either search for a clients last known nickname or his unique identity by using the -uid option.
    * @param pattern the pattern which should be searched for
    * @param isUid true when instead of the Name it should be searched for an uid
    */
  def clientDBFind(pattern: String): js.Promise[js.Array[ClientDBFind]] = js.native
  def clientDBFind(pattern: String, isUid: Boolean): js.Promise[js.Array[ClientDBFind]] = js.native
  def clientDBInfo(cldbid: js.Array[Double]): js.Promise[js.Array[ClientDBInfo]] = js.native
  /**
    * Returns the Clients Database Info
    * @param cldbid one or more client database ids to get
    */
  def clientDBInfo(cldbid: Double): js.Promise[js.Array[ClientDBInfo]] = js.native
  /**
    * Returns the Clients Database List
    * @param start start offset
    * @param duration amount of entries which should get retrieved
    * @param count retrieve the count of entries
    */
  def clientDBList(): js.Promise[js.Array[ClientDBList]] = js.native
  def clientDBList(start: Double): js.Promise[js.Array[ClientDBList]] = js.native
  def clientDBList(start: Double, duration: Double): js.Promise[js.Array[ClientDBList]] = js.native
  def clientDBList(start: Double, duration: Double, count: Boolean): js.Promise[js.Array[ClientDBList]] = js.native
  /**
    * Removes a set of specified permissions from a client.
    * Multiple permissions can be removed at once.
    * A permission can be specified by permid or permsid
    * @param cldbid the client database id
    * @param perm the permid or permsid
    */
  def clientDelPerm(cldbid: Double, perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientDelPerm(cldbid: Double, perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientDelServerGroup(cldbid: Double, sgid: js.Array[Double]): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Removes one or more servergroups from the client.
    * @param cldbid one or more client database ids which should be added
    * @param sgid one or more servergroup ids which the client should be removed from
    */
  def clientDelServerGroup(cldbid: Double, sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * edits a specific client
    * @param clid the client id to modify
    * @param properties the properties to change
    */
  def clientEdit(clid: Double, properties: ClientEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * displays a list of clients matching a given name pattern
    * @param pattern the pattern to search clients
    */
  def clientFind(pattern: String): js.Promise[js.Array[ClientFind]] = js.native
  /**
    * displays the database ID matching the unique identifier specified by cluid
    * @param cluid the unique id to search for
    */
  def clientGetDbidFromUid(cluid: String): js.Promise[ClientGetDbidFromUid] = js.native
  /**
    * displays all client IDs matching the unique identifier specified by cluid
    * @param cluid the unique id to search for
    */
  def clientGetIds(cluid: String): js.Promise[js.Array[ClientGetIds]] = js.native
  /**
    * displays the unique identifier and nickname matching the database ID specified by cldbid
    * @param cldbid client database it to search from
    */
  def clientGetNameFromDbid(cldbid: Double): js.Promise[ClientGetNameFromDbid] = js.native
  /**
    * displays the database ID and nickname matching the unique identifier specified by cluid
    * @param cluid the unique id to search for
    */
  def clientGetNameFromUid(cluid: String): js.Promise[ClientGetNameFromUid] = js.native
  /**
    * displays the database ID and nickname matching the unique identifier specified by cluid
    * @param clid the client id to search from
    */
  def clientGetUidFromClid(clid: Double): js.Promise[ClientGetUidFromClid] = js.native
  def clientInfo(clid: js.Array[Double]): js.Promise[js.Array[ClientInfo]] = js.native
  /**
    * Returns General Info of the Client, requires the Client to be online
    * @param clid one or more client ids to get
    */
  def clientInfo(clid: Double): js.Promise[js.Array[ClientInfo]] = js.native
  /**
    * Kicks the Client from the Server
    * @param clid the client id
    * @param reasonid the reasonid
    * @param reasonmsg the message the client should receive when getting kicked
    */
  def clientKick(
    clid: Double,
    reasonid: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.ReasonIdentifier,
    reasonmsg: String
  ): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Lists all Clients with a given Filter
    */
  def clientList(): js.Promise[js.Array[TeamSpeakClient]] = js.native
  def clientList(filter: Partial[ClientList]): js.Promise[js.Array[TeamSpeakClient]] = js.native
  /**
    * Moves the Client to a different Channel
    * @param clid the client id
    * @param cid channel id in which the client should get moved
    * @param cpw the channel password
    */
  def clientMove(clid: Double, cid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def clientMove(clid: Double, cid: Double, cpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of permissions defined for a client
    * @param cldbid the client database id
    * @param permsid if the permsid option is set to true the output will contain the permission names
    */
  def clientPermList(cldbid: Double): js.Promise[js.Array[PermList]] = js.native
  def clientPermList(cldbid: Double, permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
  /**
    * Pokes the Client with a certain message
    * @param clid the client id
    * @param msg the message the client should receive
    */
  def clientPoke(clid: Double, msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Updates your own ServerQuery login credentials using a specified username.
    * The password will be auto-generated.
    * @param name
    */
  def clientSetServerQueryLogin(name: String): js.Promise[ClientSetServerQueryLogin] = js.native
  /**
    * Change your ServerQuery clients settings using given properties.
    * @param props the properties which should be changed
    */
  def clientUpdate(props: ClientUpdate): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Submits a complaint about the client with database ID dbid to the server.
    * @param cldbid filter only for certain client with the given database id
    * @param message the Message which should be added
    */
  def complainAdd(cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def complainAdd(cldbid: Double, message: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes the complaint about the client with ID tcldbid submitted by the client with ID fdbid from the server.
    * If fcldbid will be left empty all complaints for the tcldbid will be deleted
    * @param tcldbid the target client database id
    * @param fcldbid the client database id which filed the report
    */
  def complainDel(tcldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def complainDel(tcldbid: Double, fcldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of complaints on the selected virtual server.
    * If dbid is specified, only complaints about the targeted client will be shown.
    * @param cldbid filter only for certain client with the given database id
    */
  def complainList(): js.Promise[js.Array[ComplainList]] = js.native
  def complainList(cldbid: Double): js.Promise[js.Array[ComplainList]] = js.native
  /**
    * connects to the TeamSpeak Server
    */
  def connect(): js.Promise[TeamSpeak] = js.native
  /**
    * returns detailed connection information about the selected virtual server including uptime, traffic information, etc.
    */
  def connectionInfo(): js.Promise[ServerRequestConnectionInfo] = js.native
  /**
    * displays a snapshot of the selected virtual server containing all settings,
    * groups and known client identities. The data from a server snapshot can be
    * used to restore a virtual servers configuration, channels and permissions
    * using the serversnapshotdeploy command.
    * only supports version 2 (from server 3.10.0)
    * @param password the optional password to encrypt the snapshot
    */
  def createSnapshot(): js.Promise[SnapshotCreate] = js.native
  def createSnapshot(password: String): js.Promise[SnapshotCreate] = js.native
  /**
    * Removes a custom property from a client specified by the cldbid.
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param cldbid the client Database ID which should be changed
    * @param ident the key which should be deleted
    */
  def customDelete(cldbid: Double, ident: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * returns a list of custom properties for the client specified with cldbid.
    * @param cldbid the Client Database ID which should be retrieved
    */
  def customInfo(cldbid: Double): js.Promise[js.Array[CustomInfo]] = js.native
  /**
    * Searches for custom client properties specified by ident and value.
    * The value parameter can include regular characters and SQL wildcard characters (e.g. %).
    * @param ident the key to search for
    * @param pattern the search pattern to use
    */
  def customSearch(ident: String, pattern: String): js.Promise[CustomSearch] = js.native
  /**
    * Creates or updates a custom property for client specified by the cldbid.
    * Ident and value can be any value, and are the key value pair of the custom property.
    * This requires TeamSpeak Server Version 3.2.0 or newer.
    * @param cldbid the client database id which should be changed
    * @param ident the key which should be set
    * @param value the value which should be set
    */
  def customSet(cldbid: Double, ident: String, value: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
    * @param cgid the channelgroup id
    * @param force if set to 1 the channelgroup will be deleted even when clients are in it
    */
  def deleteChannelGroup(cgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def deleteChannelGroup(cgid: Double, force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * displays a snapshot of the selected virtual server containing all settings,
    * groups and known client identities. The data from a server snapshot can be
    * used to restore a virtual servers configuration, channels and permissions
    * using the serversnapshotdeploy command.
    * only supports version 2 (from server 3.10.0)
    * @param salt if a password has been set provide the salt from the response
    * @param password the password which has been set while saving
    * @param keepfiles wether it should keep the file mapping
    */
  def deploySnapshot(data: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def deploySnapshot(data: String, salt: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def deploySnapshot(data: String, salt: String, password: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def deploySnapshot(data: String, salt: String, password: String, keepfiles: Boolean): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Returns the file in the channel with the given path
    * @param path the path whith the filename where the file should be uploaded to
    * @param cid channel id to download from
    * @param cpw channel password of the channel which will be uploaded to
    */
  def downloadFile(path: String): js.Promise[Buffer] = js.native
  def downloadFile(path: String, cid: Double): js.Promise[Buffer] = js.native
  def downloadFile(path: String, cid: Double, cpw: String): js.Promise[Buffer] = js.native
  /**
    * Returns an Icon with the given Name
    * @param name the name of the icon to retrieve eg "icon_262672952"
    */
  def downloadIcon(name: String): js.Promise[Buffer] = js.native
  /**
    * Sends a raw command to the TeamSpeak Server.
    * @param {...any} args the command which should get executed on the teamspeak server
    * @example
    * ts3.execute("clientlist", ["-ip"])
    * ts3.execute("use", [9987], { client_nickname: "test" })
    */
  def execute(cmd: String, args: executeArgs*): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** forcefully closes the socket connection */
  def forceQuit(): Unit = js.native
  /**
    * Creates new directory in a channels file repository
    * @param cid the channel id to check for
    * @param dirname path to the directory
    * @param cpw the channel password
    */
  def ftCreateDir(cid: Double, dirname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftCreateDir(cid: Double, dirname: String, cpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes one or more files stored in a channels file repository
    * @param cid the channel id to check for
    * @param name path to the file to delete
    * @param cpw the channel password
    */
  def ftDeleteFile(cid: Double, name: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftDeleteFile(cid: Double, name: String, cpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays detailed information about one or more specified files stored in a channels file repository.
    * @param cid the channel id to check for
    * @param name the filepath to receive
    * @param cpw the channel password
    */
  def ftGetFileInfo(cid: Double, name: String): js.Promise[FTGetFileInfo] = js.native
  def ftGetFileInfo(cid: Double, name: String, cpw: String): js.Promise[FTGetFileInfo] = js.native
  /**
    * Displays a list of files and directories stored in the specified channels file repository.
    * @param cid the channel id to check for
    * @param path the path to list
    * @param cpw the channel password
    */
  def ftGetFileList(cid: Double): js.Promise[js.Array[FTGetFileList]] = js.native
  def ftGetFileList(cid: Double, path: String): js.Promise[js.Array[FTGetFileList]] = js.native
  def ftGetFileList(cid: Double, path: String, cpw: String): js.Promise[js.Array[FTGetFileList]] = js.native
  /**
    * Initializes a file transfer download. clientftfid is an arbitrary ID to identify the file transfer on client-side.
    * On success, the server generates a new ftkey which is required to start downloading the file through TeamSpeak 3's file transfer interface.
    */
  def ftInitDownload(transfer: TransferDownload): js.Promise[FTInitDownload] = js.native
  /**
    * Initializes a file transfer upload. clientftfid is an arbitrary ID to identify the file transfer on client-side.
    * On success, the server generates a new ftkey which is required to start uploading the file through TeamSpeak 3's file transfer interface.
    */
  def ftInitUpload(transfer: TransferUpload): js.Promise[FTInitUpload] = js.native
  def ftList(): js.Promise[js.Array[FTList]] = js.native
  /**
    * Renames a file in a channels file repository.
    * If the two parameters tcid and tcpw are specified, the file will be moved into another channels file repository
    * @param cid the channel id to check for
    * @param oldname the path to the file which should be renamed
    * @param newname the path to the file with the new name
    * @param tcid target channel id if the file should be moved to a different channel
    * @param cpw the channel password from where the file gets renamed
    * @param tcpw the channel password from where the file will get transferred to
    */
  def ftRenameFile(cid: Double, oldname: String, newname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftRenameFile(cid: Double, oldname: String, newname: String, tcid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftRenameFile(cid: Double, oldname: String, newname: String, tcid: Double, cpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftRenameFile(cid: Double, oldname: String, newname: String, tcid: Double, cpw: String, tcpw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Stops the running file transfer with server-side ID serverftfid.
    * @param serverftfid server file transfer id
    * @param del
    */
  def ftStop(serverftfid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def ftStop(serverftfid: Double, del: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Retrieves a Single Channel by the given Channel ID
    * @param cid the channel id
    */
  def getChannelByID(cid: Double): js.Promise[js.UndefOr[TeamSpeakChannel]] = js.native
  /**
    * Retrieves a Single Channel by the given Channel Name
    * @param channel_name the name of the channel
    */
  def getChannelByName(channel_name: String): js.Promise[js.UndefOr[TeamSpeakChannel]] = js.native
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup ID
    * @param cgid the channelgroup Id
    */
  def getChannelGroupByID(cgid: Double): js.Promise[js.UndefOr[TeamSpeakChannelGroup]] = js.native
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup Name
    * @param name the channelGroup name
    */
  def getChannelGroupByName(name: String): js.Promise[js.UndefOr[TeamSpeakChannelGroup]] = js.native
  /**
    * Retrieves a Single Client by the given Client Database ID
    * @param client_database_id the client database Id
    */
  def getClientByDBID(client_database_id: Double): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  /**
    * Retrieves a Single Client by the given Client ID
    * @param clid the client id
    */
  def getClientByID(clid: Double): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param client_nickname the nickname of the client
    */
  def getClientByName(client_nickname: String): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param client_unique_identifier the client unique identifier
    */
  def getClientByUID(client_unique_identifier: String): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  /**
    * Gets the Icon Name of a resolveable Perm List
    * @param permlist expects a promise which resolves to a permission list
    */
  def getIconName(permlist: js.Promise[js.Array[PermList]]): js.Promise[String] = js.native
  /**
    * Retrieves a single ServerGroup by the given ServerGroup ID
    * @param sgid the servergroup id
    */
  def getServerGroupByID(sgid: Double): js.Promise[js.UndefOr[TeamSpeakServerGroup]] = js.native
  /**
    * Retrieves a single ServerGroup by the given ServerGroup Name
    * @param name the servergroup name
    */
  def getServerGroupByName(name: String): js.Promise[js.UndefOr[TeamSpeakServerGroup]] = js.native
  /**
    * Sends a text message to all clients on all virtual servers in the TeamSpeak 3 Server instance.
    * @param msg message which will be sent to all instances
    */
  def gm(msg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays detailed connection information about the server instance including uptime,
    * number of virtual servers online, traffic information, etc.
    */
  def hostInfo(): js.Promise[HostInfo] = js.native
  /**
    * Changes the server instance configuration using given properties.
    * @param properties the props you want to change
    */
  def instanceEdit(properties: InstanceEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays the server instance configuration including database revision number,
    * the file transfer port, default group IDs, etc.
    */
  def instanceInfo(): js.Promise[InstanceInfo] = js.native
  /**
    * Writes a custom entry into the servers log.
    * Depending on your permissions, you'll be able to add entries into the server instance log and/or your virtual servers log.
    * The loglevel parameter specifies the type of the entry
    * @param loglevel level 1 to 4
    * @param logmsg message to log
    */
  def logAdd(loglevel: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.LogLevel, logmsg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a specified number of entries from the servers log.
    * If instance is set to 1, the server will return lines from the master logfile (ts3server_0.log) instead of the selected virtual server logfile.
    * @param lines amount of lines to receive
    * @param reverse invert output (like Array.reverse)
    * @param instance instance or virtualserver log
    * @param begin_pos begin at position
    */
  def logView(): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double, instance: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double, instance: Double, begin_pos: Double): js.Promise[js.Array[LogView]] = js.native
  /**
    * Authenticates with the TeamSpeak 3 Server instance using given ServerQuery login credentials.
    * @param username the username which you want to login with
    * @param password the password you want to login with
    */
  def login(username: String, password: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** Deselects the active virtual server and logs out from the server instance. */
  def logout(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Sends an offline message to the client specified by uid.
    * @param cluid client unique identifier
    * @param subject subject of the message
    * @param message message text
    */
  def messageAdd(cluid: String, subject: String, message: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Sends an offline message to the client specified by uid.
    * @param msgid the message id which should be deleted
    */
  def messageDel(msgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param msgid the message id
    */
  def messageGet(msgid: Double): js.Promise[MessageGet] = js.native
  /**
    * Displays a list of offline messages you've received.
    * The output contains the senders unique identifier, the messages subject, etc.
    */
  def messageList(): js.Promise[js.Array[MessageList]] = js.native
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param msgid the message id
    * @param flag if flag is set to 1 the message will be marked as read
    */
  def messageUpdate(msgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def messageUpdate(msgid: Double, flag: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  @JSName("on")
  def on_channelcreate(event: channelcreate, listener: js.Function1[/* event */ ChannelCreate, Unit]): this.type = js.native
  @JSName("on")
  def on_channeldelete(event: channeldelete, listener: js.Function1[/* event */ ChannelDelete, Unit]): this.type = js.native
  @JSName("on")
  def on_channeledit(
    event: channeledit,
    listener: js.Function1[/* event */ typings.ts3DashNodejsDashLibrary.libTypesEventsMod.ChannelEdit, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_channelmoved(event: channelmoved, listener: js.Function1[/* event */ ChannelMove, Unit]): this.type = js.native
  @JSName("on")
  def on_clientconnect(event: clientconnect, listener: js.Function1[/* event */ ClientConnect, Unit]): this.type = js.native
  @JSName("on")
  def on_clientdisconnect(event: clientdisconnect, listener: js.Function1[/* event */ ClientDisconnect, Unit]): this.type = js.native
  @JSName("on")
  def on_clientmoved(event: clientmoved, listener: js.Function1[/* event */ ClientMoved, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
  @JSName("on")
  def on_debug(event: debug, listener: js.Function1[/* event */ Debug, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_flooding(event: flooding, listener: js.Function1[/* error */ ResponseError, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_serveredit(event: serveredit, listener: js.Function1[/* event */ ServerEdit, Unit]): this.type = js.native
  @JSName("on")
  def on_textmessage(event: textmessage, listener: js.Function1[/* event */ TextMessage, Unit]): this.type = js.native
  @JSName("on")
  def on_tokenused(event: tokenused, listener: js.Function1[/* event */ TokenUsed, Unit]): this.type = js.native
  def permFind(perm: String): js.Promise[js.Array[PermFind]] = js.native
  /**
    * Retrieves detailed information about all assignments of the permission.
    * The output is similar to permoverview which includes the type and the ID of the client, channel or group associated with the permission.
    * @param perm perm id or name to retrieve
    */
  def permFind(perm: Double): js.Promise[js.Array[PermFind]] = js.native
  def permGet(perm: String): js.Promise[PermGet] = js.native
  /**
    * Retrieves the current value of the permission for your own connection.
    * This can be useful when you need to check your own privileges.
    * @param perm perm id or name which should be checked
    */
  def permGet(perm: Double): js.Promise[PermGet] = js.native
  /**
    * Retrieves the database ID of one or more permissions specified by permsid.
    * @param permsid one name
    */
  def permIdGetByName(permsid: String): js.Promise[PermIdGetByName] = js.native
  /**
    * Retrieves the database ID of one or more permissions specified by permsid.
    * @param permsid multiple permission names
    */
  def permIdsGetByName(permsid: js.Array[String]): js.Promise[js.Array[PermIdGetByName]] = js.native
  /**
    * Displays all permissions assigned to a client for the channel specified with cid.
    * If permid is set to 0, all permissions will be displayed.
    * A permission can be specified by permid or permsid.
    * @param cldbid the client database id
    * @param cid one or more permission names
    * @param permid one or more permission ids
    * @param permsid one or more permission names
    */
  def permOverview(cldbid: Double, cid: Double): js.Promise[js.Array[PermOverview]] = js.native
  def permOverview(cldbid: Double, cid: Double, perms: js.Array[Double | String]): js.Promise[js.Array[PermOverview]] = js.native
  /**
    * Restores the default permission settings on the selected virtual server and creates a new initial administrator token.
    * Please note that in case of an error during the permreset call - e.g. when the database has been modified or corrupted - the virtual server will be deleted from the database.
    */
  def permReset(): js.Promise[Token] = js.native
  /**
    * Retrieves a list of permissions available on the server instance including ID, name and description.
    */
  def permissionList(): js.Promise[js.Array[PermissionList]] = js.native
  /** priorizes the next command, this commands will be first in execution */
  def priorize(): this.type = js.native
  /**
    * Create a new token.+
    * If type is set to 0, the ID specified with tokenid will be a server group ID.
    * Otherwise, tokenid is used as a channel group ID and you need to provide a valid channel ID using channelid.
    * @param tokentype token type
    * @param group depends on the type given, add either a valid channelgroup or servergroup
    * @param cid depends on the type given, add a valid channel id
    * @param description token description
    * @param customset token custom set
    */
  def privilegeKeyAdd(tokentype: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType, group: Double): js.Promise[Token] = js.native
  def privilegeKeyAdd(tokentype: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType, group: Double, cid: Double): js.Promise[Token] = js.native
  def privilegeKeyAdd(
    tokentype: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType,
    group: Double,
    cid: Double,
    description: String
  ): js.Promise[Token] = js.native
  def privilegeKeyAdd(
    tokentype: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TokenType,
    group: Double,
    cid: Double,
    description: String,
    customset: String
  ): js.Promise[Token] = js.native
  /**
    * Deletes an existing token matching the token key specified with token.
    * @param token the token which should be deleted
    */
  def privilegeKeyDelete(token: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Retrieves a list of privilege keys available including their type and group IDs.
    */
  def privilegeKeyList(): js.Promise[js.Array[PrivilegeKeyList]] = js.native
  /**
    * Use a token key gain access to a server or channel group.
    * Please note that the server will automatically delete the token after it has been used.
    * @param token the token which should be used
    */
  def privilegeKeyUse(token: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds a new query client login, or enables query login for existing clients.
    * When no virtual server has been selected, the command will create global query logins.
    * Otherwise the command enables query login for existing client, and cldbid must be specified.
    * @param client_login_name the login name
    * @param cldbid the database id which should be used
    */
  def queryLoginAdd(client_login_name: String): js.Promise[QueryLoginAdd] = js.native
  def queryLoginAdd(client_login_name: String, cldbid: Double): js.Promise[QueryLoginAdd] = js.native
  /**
    * Deletes an existing server query login on selected server.
    * When no virtual server has been selected, deletes global query logins instead.
    * @param cldbid deletes the querylogin of this client
    */
  def queryLoginDel(cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * List existing query client logins.
    * The pattern parameter can include regular characters and SQL wildcard characters (e.g. %).
    * Only displays query logins of the selected virtual server, or all query logins when no virtual server have been  selected.
    * @param pattern the pattern to filter for client login names
    * @param start the offset from where clients should be listed
    * @param duration how many clients should be listed
    */
  def queryLoginList(): js.Promise[js.Array[QueryLoginList]] = js.native
  def queryLoginList(pattern: String): js.Promise[js.Array[QueryLoginList]] = js.native
  def queryLoginList(pattern: String, start: Double): js.Promise[js.Array[QueryLoginList]] = js.native
  def queryLoginList(pattern: String, start: Double, duration: Double): js.Promise[js.Array[QueryLoginList]] = js.native
  /** closes the ServerQuery connection to the TeamSpeak server instance. */
  def quit(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * attempts a reconnect to the teamspeak server with full context features
    * @param attempts the amount of times it should try to reconnect (-1 = try forever)
    * @param timeout time in ms to wait inbetween reconnect
    */
  def reconnect(): js.Promise[this.type] = js.native
  def reconnect(attempts: Double): js.Promise[this.type] = js.native
  def reconnect(attempts: Double, timeout: Double): js.Promise[this.type] = js.native
  /**
    * Subscribes to an Event
    * @param event the event on which should be subscribed
    * @param id the channel id, only required when subscribing to the "channel" event
    */
  def registerEvent(event: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def registerEvent(event: String, id: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Sends a text message a specified target.
    * The type of the target is determined by targetmode while target specifies the ID of the recipient,
    * whether it be a virtual server, a channel or a client.
    * @param target target client id which should receive the message
    * @param targetmode targetmode (1: client, 2: channel, 3: server)
    * @param msg the message the client should receive
    */
  def sendTextMessage(
    target: Double,
    targetmode: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode,
    msg: String
  ): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Creates a new virtual server using the given properties and displays its ID, port and initial administrator privilege key.
    * If virtualserver_port is not specified, the server will test for the first unused UDP port
    * @param properties the server properties
    */
  def serverCreate(properties: typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ServerEdit): js.Promise[ServerCreate] = js.native
  /**
    * deletes the server
    * @param sid the server id to delete
    */
  def serverDelete(sid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Changes the selected virtual servers configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the selected virtual server at once.
    */
  def serverEdit(properties: typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ServerEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddClient(cldbid: js.Array[Double], sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds one or more clients to a server group specified with sgid.
    * Please note that a client cannot be added to default groups or template groups
    * @param cldbid one or more client database ids which should be added
    * @param sgid the servergroup id which the client(s) should be added to
    */
  def serverGroupAddClient(cldbid: Double, sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Adds a specified permissions to the server group. A permission can be specified by permid or permsid.
    * @param sgid the ServerGroup id
    * @param perm the permid or permsid
    * @param value value of the Permission
    * @param skip whether the skip flag should be set
    * @param negate whether the negate flag should be set
    */
  def serverGroupAddPerm(sgid: Double, perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddPerm(sgid: Double, perm: String, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddPerm(sgid: Double, perm: String, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddPerm(sgid: Double, perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddPerm(sgid: Double, perm: Double, value: Double, skip: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupAddPerm(sgid: Double, perm: Double, value: Double, skip: Double, negate: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * returns the IDs of all clients currently residing in the server group.
    * @param sgid the servergroup id
    */
  def serverGroupClientList(sgid: Double): js.Promise[js.Array[ServerGroupClientList]] = js.native
  /**
    * Creates a copy of the server group specified with ssgid.
    * If tsgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param ssgid the source ServerGroup
    * @param tsgid the target ServerGroup, 0 to create a new Group
    * @param type the type of the servergroup (0 = Query Group | 1 = Normal Group)
    * @param name name of the group
    */
  def serverGroupCopy(ssgid: Double): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(ssgid: Double, tsgid: Double): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(ssgid: Double, tsgid: Double, `type`: Double): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(ssgid: Double, tsgid: Double, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
  /**
    * Creates a new server group using the name specified with name.
    * The optional type parameter can be used to create ServerQuery groups and template groups.
    * @param name the name of the servergroup
    * @param type type of the servergroup
    */
  def serverGroupCreate(name: String): js.Promise[TeamSpeakServerGroup] = js.native
  def serverGroupCreate(name: String, `type`: Double): js.Promise[TeamSpeakServerGroup] = js.native
  /**
    * Deletes the server group. If force is set to 1, the server group will be deleted even if there are clients within.
    * @param sgid the servergroup id
    * @param force if set to 1 the servergoup will be deleted even when clients stil belong to this group
    */
  def serverGroupDel(sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupDel(sgid: Double, force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupDelClient(cldbid: js.Array[Double], sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Removes one or more clients from the server group specified with sgid.
    * @param cldbid one or more client database ids which should be added
    * @param sgid the servergroup id which the client(s) should be removed from
    */
  def serverGroupDelClient(cldbid: Double, sgid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Removes a set of specified permissions from the server group.
    * A permission can be specified by permid or permsid.
    * @param sgid the servergroup id
    * @param perm the permid or permsid
    */
  def serverGroupDelPerm(sgid: Double, perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverGroupDelPerm(sgid: Double, perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Displays a list of server groups available.
    * Depending on your permissions, the output may also contain global ServerQuery groups and template groups.
    */
  def serverGroupList(): js.Promise[js.Array[TeamSpeakServerGroup]] = js.native
  def serverGroupList(filter: Partial[ServerGroupList]): js.Promise[js.Array[TeamSpeakServerGroup]] = js.native
  /**
    * Displays a list of permissions assigned to the server group specified with sgid.
    * @param sgid the servergroup id
    * @param permsid if the permsid option is set to true the output will contain the permission names
    */
  def serverGroupPermList(sgid: Double): js.Promise[js.Array[PermList]] = js.native
  def serverGroupPermList(sgid: Double, permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
  /**
    * Create a new privilegekey token for a ServerGroup with the given description
    * @param group servergroup which should be generated the token for
    * @param description token description
    * @param tokencustomset token custom set
    */
  def serverGroupPrivilegeKeyAdd(group: Double): js.Promise[Token] = js.native
  def serverGroupPrivilegeKeyAdd(group: Double, description: String): js.Promise[Token] = js.native
  def serverGroupPrivilegeKeyAdd(group: Double, description: String, tokencustomset: String): js.Promise[Token] = js.native
  /**
    * Changes the name of the server group
    * @param sgid the servergroup id
    * @param name new name of the servergroup
    */
  def serverGroupRename(sgid: Double, name: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * displays all server groups the client specified with cldbid is currently residing in
    * @param cldbid the client database id to check
    */
  def serverGroupsByClientId(cldbid: Double): js.Promise[js.Array[ServerGroupsByClientId]] = js.native
  /**
    * Displays the database ID of the virtual server running on the UDP port
    * @param virtualserver_port the server port where data should be retrieved
    */
  def serverIdGetByPort(virtualserver_port: Double): js.Promise[ServerIdGetByPort] = js.native
  /**
    * Displays detailed configuration information about the selected virtual server
    * including unique ID, number of clients online, configuration, etc.
    */
  def serverInfo(): js.Promise[ServerInfo] = js.native
  /**
    * Displays a list of virtual servers including their ID, status, number of clients online, etc.
    */
  def serverList(): js.Promise[js.Array[TeamSpeakServer]] = js.native
  def serverList(filter: Partial[ServerList]): js.Promise[js.Array[TeamSpeakServer]] = js.native
  /**
    * Stops the entire TeamSpeak 3 Server instance by shutting down the process.
    * @param reasonmsg specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverProcessStop(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverProcessStop(reasonmsg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Starts the virtual server. Depending on your permissions,
    * you're able to start either your own virtual server only or all virtual servers in the server instance.
    * @param sid the server id to start
    */
  def serverStart(sid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Stops the virtual server. Depending on your permissions,
    * you're able to stop either your own virtual server only or all virtual servers in the server instance.
    * @param sid the server id to stop
    * @param reasonmsg Specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverStop(sid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def serverStop(sid: Double, reasonmsg: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Sets a new temporary server password specified with pw. The temporary
    * password will be valid for the number of seconds specified with duration. The
    * client connecting with this password will automatically join the channel
    * specified with tcid. If tcid is set to 0, the client will join the default
    * channel.
    */
  def serverTempPasswordAdd(props: ServerTempPasswordAdd): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Deletes the temporary server password specified with pw.
    * @param pw the password to delete
    */
  def serverTempPasswordDel(pw: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Returns a list of active temporary server passwords. The output contains the
    * clear-text password, the nickname and unique identifier of the creating
    * client.
    */
  def serverTempPasswordList(): js.Promise[js.Array[ServerTempPasswordList]] = js.native
  /**
    * Sets the channel group of a client
    * @param cgid the channelgroup which the client should get assigned
    * @param cid the channel in which the client should be assigned the group
    * @param cldbid the client database id which should be added to the group
    */
  def setClientChannelGroup(cgid: Double, cid: Double, cldbid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Subscribes to an Event.
    */
  def unregisterEvent(): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Uploads a file
    * @param path the path whith the filename where the file should be uploaded to
    * @param data the data to upload
    * @param cid channel id to upload to
    * @param cpw channel password of the channel which will be uploaded to
    */
  def uploadFile(path: String, data: String): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: String, cid: Double): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: String, cid: Double, cpw: String): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer, cid: Double): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer, cid: Double, cpw: String): js.Promise[Unit] = js.native
  /**
    * Selects the virtual server specified with the port to allow further interaction.
    * @param port the port the server runs on
    * @param client_nickname set nickname when selecting a server
    */
  def useByPort(port: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def useByPort(port: Double, client_nickname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /**
    * Selects the virtual server specified with the sid to allow further interaction.
    * @param sid the server id
    * @param client_nickname set nickname when selecting a server
    */
  def useBySid(sid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  def useBySid(sid: Double, client_nickname: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
  /** Displays the servers version information including platform and build number. */
  def version(): js.Promise[Version] = js.native
  /** returns information about your current ServerQuery connection including your loginname, etc. */
  def whoami(): js.Promise[Whoami] = js.native
}

/* static members */
@JSImport("ts3-nodejs-library", "TeamSpeak")
@js.native
object TeamSpeak extends js.Object {
  /**
    * connects via a Promise wrapper
    * @param config config options to connect
    */
  def connect(config: Partial[ConnectionParams]): js.Promise[TeamSpeak] = js.native
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

