package typings.ts3NodejsLibrary.teamSpeakMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.ts3NodejsLibrary.anon.Cgid
import typings.ts3NodejsLibrary.anon.Cid
import typings.ts3NodejsLibrary.anon.Cldbid
import typings.ts3NodejsLibrary.anon.PartialChannelEntry
import typings.ts3NodejsLibrary.anon.PartialChannelGroupEntry
import typings.ts3NodejsLibrary.anon.PartialClientEntry
import typings.ts3NodejsLibrary.anon.PartialConnectionParams
import typings.ts3NodejsLibrary.anon.PartialServerEntry
import typings.ts3NodejsLibrary.anon.PartialServerGroupEntry
import typings.ts3NodejsLibrary.anon.Permid
import typings.ts3NodejsLibrary.anon.Sgid
import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup
import typings.ts3NodejsLibrary.channelGroupMod.TeamSpeakChannelGroup.GroupType
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel.ChannelType
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient.ClientType
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient.MultiClientType
import typings.ts3NodejsLibrary.enumMod.LogLevel
import typings.ts3NodejsLibrary.enumMod.ReasonIdentifier
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CHANNEL
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CLIENT
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.SERVER
import typings.ts3NodejsLibrary.enumMod.TokenType.ChannelGroup
import typings.ts3NodejsLibrary.enumMod.TokenType.ServerGroup
import typings.ts3NodejsLibrary.eventsMod.ChannelCreate
import typings.ts3NodejsLibrary.eventsMod.ChannelDelete
import typings.ts3NodejsLibrary.eventsMod.ChannelMove
import typings.ts3NodejsLibrary.eventsMod.ClientConnect
import typings.ts3NodejsLibrary.eventsMod.ClientDisconnect
import typings.ts3NodejsLibrary.eventsMod.ClientMoved
import typings.ts3NodejsLibrary.eventsMod.Debug
import typings.ts3NodejsLibrary.eventsMod.ServerEdit
import typings.ts3NodejsLibrary.eventsMod.TextMessage
import typings.ts3NodejsLibrary.eventsMod.TokenUsed
import typings.ts3NodejsLibrary.permissionMod.Permission
import typings.ts3NodejsLibrary.permissionMod.Permission.PermType
import typings.ts3NodejsLibrary.propertyTypesMod.ApiKeyAdd
import typings.ts3NodejsLibrary.propertyTypesMod.ApiKeyList
import typings.ts3NodejsLibrary.propertyTypesMod.BanAdd
import typings.ts3NodejsLibrary.propertyTypesMod.BanClient
import typings.ts3NodejsLibrary.propertyTypesMod.ChannelEdit
import typings.ts3NodejsLibrary.propertyTypesMod.ClientDBEdit
import typings.ts3NodejsLibrary.propertyTypesMod.ClientEdit
import typings.ts3NodejsLibrary.propertyTypesMod.ClientUpdate
import typings.ts3NodejsLibrary.propertyTypesMod.InstanceEdit
import typings.ts3NodejsLibrary.propertyTypesMod.ServerTempPasswordAdd
import typings.ts3NodejsLibrary.propertyTypesMod.TransferDownload
import typings.ts3NodejsLibrary.propertyTypesMod.TransferUpload
import typings.ts3NodejsLibrary.responseErrorMod.ResponseError
import typings.ts3NodejsLibrary.responseTypesMod.ApiKeyEntry
import typings.ts3NodejsLibrary.responseTypesMod.BanEntry
import typings.ts3NodejsLibrary.responseTypesMod.BindingEntry
import typings.ts3NodejsLibrary.responseTypesMod.ChannelClientPermIdList
import typings.ts3NodejsLibrary.responseTypesMod.ChannelClientPermSidList
import typings.ts3NodejsLibrary.responseTypesMod.ChannelFind
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupClientList
import typings.ts3NodejsLibrary.responseTypesMod.ChannelGroupCopy
import typings.ts3NodejsLibrary.responseTypesMod.ChannelInfo
import typings.ts3NodejsLibrary.responseTypesMod.ClientDBEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientDBFind
import typings.ts3NodejsLibrary.responseTypesMod.ClientDBInfo
import typings.ts3NodejsLibrary.responseTypesMod.ClientFind
import typings.ts3NodejsLibrary.responseTypesMod.ClientGetDbidFromUid
import typings.ts3NodejsLibrary.responseTypesMod.ClientGetIdEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientGetNameFromDbid
import typings.ts3NodejsLibrary.responseTypesMod.ClientGetNameFromUid
import typings.ts3NodejsLibrary.responseTypesMod.ClientGetUidFromClid
import typings.ts3NodejsLibrary.responseTypesMod.ClientInfo
import typings.ts3NodejsLibrary.responseTypesMod.ClientSetServerQueryLogin
import typings.ts3NodejsLibrary.responseTypesMod.ComplainEntry
import typings.ts3NodejsLibrary.responseTypesMod.CustomInfo
import typings.ts3NodejsLibrary.responseTypesMod.CustomSearch
import typings.ts3NodejsLibrary.responseTypesMod.FTGetFileEntry
import typings.ts3NodejsLibrary.responseTypesMod.FTGetFileInfo
import typings.ts3NodejsLibrary.responseTypesMod.FTInitDownload
import typings.ts3NodejsLibrary.responseTypesMod.FTInitUpload
import typings.ts3NodejsLibrary.responseTypesMod.FileTransferEntry
import typings.ts3NodejsLibrary.responseTypesMod.HostInfo
import typings.ts3NodejsLibrary.responseTypesMod.InstanceInfo
import typings.ts3NodejsLibrary.responseTypesMod.LogView
import typings.ts3NodejsLibrary.responseTypesMod.MessageEntry
import typings.ts3NodejsLibrary.responseTypesMod.MessageGet
import typings.ts3NodejsLibrary.responseTypesMod.PermFind
import typings.ts3NodejsLibrary.responseTypesMod.PermGet
import typings.ts3NodejsLibrary.responseTypesMod.PermIdGetByName
import typings.ts3NodejsLibrary.responseTypesMod.PermOverviewEntry
import typings.ts3NodejsLibrary.responseTypesMod.PermissionEntry
import typings.ts3NodejsLibrary.responseTypesMod.PrivilegeKeyEntry
import typings.ts3NodejsLibrary.responseTypesMod.QueryLoginAdd
import typings.ts3NodejsLibrary.responseTypesMod.QueryLoginEntry
import typings.ts3NodejsLibrary.responseTypesMod.ServerCreate
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupCopy
import typings.ts3NodejsLibrary.responseTypesMod.ServerGroupsByClientId
import typings.ts3NodejsLibrary.responseTypesMod.ServerIdGetByPort
import typings.ts3NodejsLibrary.responseTypesMod.ServerInfo
import typings.ts3NodejsLibrary.responseTypesMod.ServerRequestConnectionInfo
import typings.ts3NodejsLibrary.responseTypesMod.ServerTempPasswordEntry
import typings.ts3NodejsLibrary.responseTypesMod.SnapshotCreate
import typings.ts3NodejsLibrary.responseTypesMod.Token
import typings.ts3NodejsLibrary.responseTypesMod.Version
import typings.ts3NodejsLibrary.responseTypesMod.Whoami
import typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup
import typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.MultiGroupType
import typings.ts3NodejsLibrary.serverMod.TeamSpeakServer
import typings.ts3NodejsLibrary.serverMod.TeamSpeakServer.ServerType
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.executeArgs
import typings.ts3NodejsLibrary.ts3NodejsLibraryBooleans.`false`
import typings.ts3NodejsLibrary.ts3NodejsLibraryBooleans.`true`
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.`0`
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.channelcreate
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.channeldelete
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.channeledit
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.channelmoved
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.clientconnect
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.clientdisconnect
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.clientmoved
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.close
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.debug
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.error
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.flooding
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.ready
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.serveredit
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.textmessage
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.tokenused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/TeamSpeak", "TeamSpeak")
@js.native
class TeamSpeak_ protected () extends EventEmitter {
  def this(config: PartialConnectionParams) = this()
  
  def apiKeyAdd(props: ApiKeyAdd): js.Promise[typings.ts3NodejsLibrary.responseTypesMod.ApiKeyAdd] = js.native
  
  /**
    * Deletes an apikey. Any apikey owned by the current user, can always be deleted
    * Deleting apikeys from other requires bVirtualserverApikeyManage
    * @param id the key id to delete
    */
  def apiKeyDel(id: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Lists all apikeys owned by the user, or of all users using cldbid=*.
    * Usage of cldbid=... requires bVirtualserverApikeyManage.
    */
  def apiKeyList(): js.Promise[js.Array[ApiKeyEntry]] = js.native
  def apiKeyList(props: ApiKeyList): js.Promise[js.Array[ApiKeyEntry]] = js.native
  
  /**
    * Adds a new ban rule on the selected virtual server.
    * All parameters are optional but at least one of the following must be set: ip, name, uid or mytsid.
    */
  def ban(properties: BanAdd): js.Promise[typings.ts3NodejsLibrary.responseTypesMod.BanAdd] = js.native
  
  /**
    * Bans the client specified with ID clid from the server.
    * Please note that this will create two separate ban rules for the targeted clients IP address and his unique identifier.
    */
  def banClient(properties: BanClient): js.Promise[typings.ts3NodejsLibrary.responseTypesMod.BanAdd] = js.native
  
  /**
    * Removes one or all bans from the server
    * @param banid the banid to remove, if not provided it will remove all bans
    */
  def banDel(): js.Promise[js.Array[js.Any]] = js.native
  def banDel(banid: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of active bans on the selected virtual server.
    * @param start optional start from where clients should be listed
    * @param duration optional duration on how much ban entries should be retrieved
    */
  def banList(): js.Promise[js.Array[BanEntry]] = js.native
  def banList(start: js.UndefOr[scala.Nothing], duration: Double): js.Promise[js.Array[BanEntry]] = js.native
  def banList(start: Double): js.Promise[js.Array[BanEntry]] = js.native
  def banList(start: Double, duration: Double): js.Promise[js.Array[BanEntry]] = js.native
  
  /** returns a list of IP addresses used by the server instance on multi-homed machines. */
  def bindingList(): js.Promise[js.Array[BindingEntry]] = js.native
  
  /**
    * displays a list of permissions defined for a client in a specific channel
    * @param channel the channel to search from
    * @param client the client database id to get permissions from
    * @param permsid wether to retrieve permission names instead of ids
    */
  def channelClientPermList(channel: ChannelType, client: ClientType): js.Promise[ChannelClientPermIdList] = js.native
  @JSName("channelClientPermList")
  def channelClientPermList_false(channel: ChannelType, client: ClientType, permsid: `false`): js.Promise[ChannelClientPermIdList] = js.native
  @JSName("channelClientPermList")
  def channelClientPermList_true(channel: ChannelType, client: ClientType, permsid: `true`): js.Promise[ChannelClientPermSidList] = js.native
  
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
    * @param channel the channel id
    * @param perm the permid or permsid
    */
  def channelDelPerm(channel: ChannelType, perm: String): js.Promise[js.Array[js.Any]] = js.native
  def channelDelPerm(channel: ChannelType, perm: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes an existing channel by ID.
    * If force is set to 1, the channel will be deleted even if there are clients within.
    * The clients will be kicked to the default channel with an appropriate reason message.
    * @param channel the channel id
    * @param force if set to 1 the channel will be deleted even when client are in it
    */
  def channelDelete(channel: ChannelType): js.Promise[js.Array[js.Any]] = js.native
  def channelDelete(channel: ChannelType, force: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Changes a channels configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
    * @param channel the channel id
    * @param properties the properties of the channel which should get changed
    */
  def channelEdit(channel: ChannelType): js.Promise[js.Array[js.Any]] = js.native
  def channelEdit(channel: ChannelType, properties: ChannelEdit): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * displays a list of channels matching a given name pattern
    * @param pattern the channel name pattern to search for
    */
  def channelFind(pattern: String): js.Promise[js.Array[ChannelFind]] = js.native
  
  /**
    * Adds a specified permissions to the channel group.
    * A permission can be specified by permid or permsid.
    * @param group the channelgroup id
    * @param perm the permission object
    */
  def channelGroupAddPerm(group: GroupType, perm: js.UndefOr[scala.Nothing]): Permission[_] = js.native
  def channelGroupAddPerm(group: GroupType, perm: PermType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays the IDs of all clients currently residing in the channel group.
    * @param cgid the channelgroup id
    * @param cid the channel id
    * @param cldbid the client database id to filter
    */
  def channelGroupClientList(group: GroupType): js.Promise[ChannelGroupClientList] = js.native
  def channelGroupClientList(group: GroupType, channel: js.UndefOr[ChannelType], client: ClientType): js.Promise[ChannelGroupClientList] = js.native
  def channelGroupClientList(group: GroupType, channel: ChannelType): js.Promise[ChannelGroupClientList] = js.native
  
  /**
    * Creates a copy of the channel group.
    * If tcgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tcgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param sourceGroup the source channelgroup
    * @param targetGroup the target channelgroup (0 to create a new group)
    * @param type the type of the group (0 = Template Group | 1 = Normal Group)
    * @param name name of the goup
    */
  def channelGroupCopy(sourceGroup: GroupType): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(
    sourceGroup: GroupType,
    targetGroup: js.UndefOr[GroupType],
    `type`: js.UndefOr[scala.Nothing],
    name: String
  ): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(sourceGroup: GroupType, targetGroup: js.UndefOr[GroupType], `type`: Double): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(sourceGroup: GroupType, targetGroup: js.UndefOr[GroupType], `type`: Double, name: String): js.Promise[ChannelGroupCopy] = js.native
  def channelGroupCopy(sourceGroup: GroupType, targetGroup: GroupType): js.Promise[ChannelGroupCopy] = js.native
  
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
    * @param group the channelgroup id
    * @param perm the permid or permsid
    */
  def channelGroupDelPerm(group: GroupType, perm: String): js.Promise[js.Array[js.Any]] = js.native
  def channelGroupDelPerm(group: GroupType, perm: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of channel groups available. Depending on your permissions, the output may also contain template groups.
    */
  def channelGroupList(): js.Promise[js.Array[TeamSpeakChannelGroup]] = js.native
  def channelGroupList(filter: PartialChannelGroupEntry): js.Promise[js.Array[TeamSpeakChannelGroup]] = js.native
  
  /**
    * Displays a list of permissions assigned to the channel group specified with cgid.
    * @param group the channelgroup id to list
    * @param permsid if the permsid option is set to true the output will contain the permission names.
    */
  def channelGroupPermList(group: GroupType): js.Promise[js.Array[Permission[Cgid]]] = js.native
  def channelGroupPermList(group: GroupType, permsid: Boolean): js.Promise[js.Array[Permission[Cgid]]] = js.native
  
  /**
    * Create a new privilegekey token for a Channel Group and assigned Channel ID with the given description
    * @param group the channel group for which the token should be valid
    * @param cid channel id for which the token should be valid
    * @param description token description
    * @param tokencustomset token custom set
    */
  def channelGroupPrivilegeKeyAdd(group: GroupType, channel: ChannelType): js.Promise[Token] = js.native
  def channelGroupPrivilegeKeyAdd(group: GroupType, channel: ChannelType, description: js.UndefOr[scala.Nothing], customset: String): js.Promise[Token] = js.native
  def channelGroupPrivilegeKeyAdd(group: GroupType, channel: ChannelType, description: String): js.Promise[Token] = js.native
  def channelGroupPrivilegeKeyAdd(group: GroupType, channel: ChannelType, description: String, customset: String): js.Promise[Token] = js.native
  
  /**
    * Changes the name of the channel group
    * @param group the channelgroup id to rename
    * @param name new name of the ghannelgroup
    */
  def channelGroupRename(group: GroupType, name: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays detailed configuration information about a channel including ID, topic, description, etc.
    * @param channel the channel id
    */
  def channelInfo(channel: ChannelType): js.Promise[ChannelInfo] = js.native
  
  /**
    * Lists all Channels with a given Filter
    */
  def channelList(): js.Promise[js.Array[TeamSpeakChannel]] = js.native
  def channelList(filter: PartialChannelEntry): js.Promise[js.Array[TeamSpeakChannel]] = js.native
  
  /**
    * Moves a channel to a new parent channel with the ID cpid.
    * If order is specified, the channel will be sorted right under the channel with the specified ID.
    * If order is set to 0, the channel will be sorted right below the new parent.
    * @param channel the channel id
    * @param parent channel parent id
    * @param order channel sort order
    */
  def channelMove(channel: ChannelType, parent: ChannelType): js.Promise[js.Array[js.Any]] = js.native
  def channelMove(channel: ChannelType, parent: ChannelType, order: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of permissions defined for a channel.
    * @param channel the channel id
    * @param permsid whether the permsid should be displayed aswell
    */
  def channelPermList(channel: ChannelType): js.Promise[js.Array[Permission[Cid]]] = js.native
  def channelPermList(channel: ChannelType, permsid: Boolean): js.Promise[js.Array[Permission[Cid]]] = js.native
  
  /**
    * Adds a set of specified permissions to a channel.
    * @param channel the channel id
    * @param perm the permission object
    */
  def channelSetPerm(channel: ChannelType, perm: js.UndefOr[scala.Nothing]): Permission[_] = js.native
  def channelSetPerm(channel: ChannelType, perm: PermType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Adds a set of specified permissions to a channel.
    * A permission can be specified by permid or permsid.
    * @param channel the channel id
    * @param permissions the permissions to assign
    * @example
    * TeamSpeak.channelSetPerms(5, [{ permsid: "i_channel_needed_modify_power", permvalue: 75 }])
    */
  def channelSetPerms(channel: ChannelType, permissions: js.Array[Permid]): js.Promise[js.Array[js.Any]] = js.native
  
  var channelgroups: js.Any = js.native
  
  var channels: js.Any = js.native
  
  /**
    * Adds a set of specified permissions to a client.
    * Multiple permissions can be added by providing the three parameters of each permission.
    * A permission can be specified by permid or permsid.
    * @param client the client database id
    * @param perm the permission object
    */
  def clientAddPerm(client: ClientType, perm: js.UndefOr[scala.Nothing]): Permission[_] = js.native
  def clientAddPerm(client: ClientType, perm: PermType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Adds one or more servergroups to a client.
    * Please note that a client cannot be added to default groups or template groups
    * @param client one or more client database ids which should be added
    * @param group one or more servergroup ids which the client should be added to
    */
  def clientAddServerGroup(client: ClientType, group: MultiGroupType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes a clients properties from the database.
    * @param client the client database id which should be deleted
    */
  def clientDbDelete(client: ClientType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Changes a clients settings using given properties.
    * @param client the client database id which should be edited
    * @param properties the properties which should be modified
    */
  def clientDbEdit(client: ClientType, properties: ClientDBEdit): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of client database IDs matching a given pattern.
    * You can either search for a clients last known nickname or his unique identity by using the -uid option.
    * @param pattern the pattern which should be searched for
    * @param isUid true when instead of the Name it should be searched for an uid
    */
  def clientDbFind(pattern: String): js.Promise[js.Array[ClientDBFind]] = js.native
  def clientDbFind(pattern: String, isUid: Boolean): js.Promise[js.Array[ClientDBFind]] = js.native
  
  /**
    * Returns the Clients Database Info
    * @param clients one or more client database ids to get
    */
  def clientDbInfo(clients: MultiClientType): js.Promise[js.Array[ClientDBInfo]] = js.native
  
  /**
    * Returns the Clients Database List
    * @param start start offset
    * @param duration amount of entries which should get retrieved
    * @param count retrieve the count of entries
    */
  def clientDbList(): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: js.UndefOr[scala.Nothing], duration: js.UndefOr[scala.Nothing], count: Boolean): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: js.UndefOr[scala.Nothing], duration: Double): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: js.UndefOr[scala.Nothing], duration: Double, count: Boolean): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: Double): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: Double, duration: js.UndefOr[scala.Nothing], count: Boolean): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: Double, duration: Double): js.Promise[js.Array[ClientDBEntry]] = js.native
  def clientDbList(start: Double, duration: Double, count: Boolean): js.Promise[js.Array[ClientDBEntry]] = js.native
  
  /**
    * Removes a set of specified permissions from a client.
    * Multiple permissions can be removed at once.
    * A permission can be specified by permid or permsid
    * @param client the client database id
    * @param perm the permid or permsid
    */
  def clientDelPerm(client: ClientType, perm: String): js.Promise[js.Array[js.Any]] = js.native
  def clientDelPerm(client: ClientType, perm: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Removes one or more servergroups from the client.
    * @param client one or more client database ids which should be added
    * @param groups one or more servergroup ids which the client should be removed from
    */
  def clientDelServerGroup(client: ClientType, groups: MultiGroupType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * edits a specific client
    * @param client the client id to modify
    * @param properties the properties to change
    */
  def clientEdit(client: ClientType, properties: ClientEdit): js.Promise[js.Array[js.Any]] = js.native
  
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
  def clientGetIds(cluid: String): js.Promise[js.Array[ClientGetIdEntry]] = js.native
  
  /**
    * displays the unique identifier and nickname matching the database ID specified by cldbid
    * @param cldbid client database it to search from
    */
  def clientGetNameFromDbid(cldbid: String): js.Promise[ClientGetNameFromDbid] = js.native
  
  /**
    * displays the database ID and nickname matching the unique identifier specified by cluid
    * @param cluid the unique id to search for
    */
  def clientGetNameFromUid(cluid: String): js.Promise[ClientGetNameFromUid] = js.native
  
  /**
    * displays the database ID and nickname matching the unique identifier specified by cluid
    * @param clid the client id to search from
    */
  def clientGetUidFromClid(clid: String): js.Promise[ClientGetUidFromClid] = js.native
  
  /**
    * Returns General Info of the Client, requires the Client to be online
    * @param clients one or more client ids to get
    */
  def clientInfo(clients: MultiClientType): js.Promise[js.Array[ClientInfo]] = js.native
  
  /**
    * Kicks the Client from the Server
    * @param client the client id
    * @param reasonid the reasonid
    * @param reasonmsg the message the client should receive when getting kicked
    * @param continueOnError ignore errors
    */
  def clientKick(client: ClientType, reasonid: ReasonIdentifier, reasonmsg: String): js.Promise[js.Array[js.Any]] = js.native
  def clientKick(client: ClientType, reasonid: ReasonIdentifier, reasonmsg: String, continueOnError: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Lists all Clients with a given Filter
    */
  def clientList(): js.Promise[js.Array[TeamSpeakClient]] = js.native
  def clientList(filter: PartialClientEntry): js.Promise[js.Array[TeamSpeakClient]] = js.native
  
  /**
    * Moves the Client to a different Channel
    * @param client the client id
    * @param channel channel id in which the client should get moved
    * @param cpw the channel password
    * @param continueOnError ignore errors
    */
  def clientMove(client: ClientType, channel: ChannelType): js.Promise[js.Array[js.Any]] = js.native
  def clientMove(client: ClientType, channel: ChannelType, cpw: js.UndefOr[scala.Nothing], continueOnError: Boolean): js.Promise[js.Array[js.Any]] = js.native
  def clientMove(client: ClientType, channel: ChannelType, cpw: String): js.Promise[js.Array[js.Any]] = js.native
  def clientMove(client: ClientType, channel: ChannelType, cpw: String, continueOnError: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of permissions defined for a client
    * @param client the client database id
    * @param permsid if the permsid option is set to true the output will contain the permission names
    */
  def clientPermList(client: ClientType): js.Promise[js.Array[Permission[Cldbid]]] = js.native
  def clientPermList(client: ClientType, permsid: Boolean): js.Promise[js.Array[Permission[Cldbid]]] = js.native
  
  /**
    * Pokes the Client with a certain message
    * @param client the client id
    * @param msg the message the client should receive
    */
  def clientPoke(client: ClientType, msg: String): js.Promise[js.Array[js.Any]] = js.native
  
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
  def clientUpdate(props: ClientUpdate): js.Promise[js.Array[js.Any]] = js.native
  
  var clients: js.Any = js.native
  
  /**
    * Submits a complaint about the client with database ID dbid to the server.
    * @param client filter only for certain client with the given database id
    * @param message the Message which should be added
    */
  def complainAdd(client: ClientType): js.Promise[js.Array[js.Any]] = js.native
  def complainAdd(client: ClientType, message: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes the complaint about the client with ID tcldbid submitted by the client with ID fdbid from the server.
    * If fcldbid will be left empty all complaints for the tcldbid will be deleted
    * @param targetClient the target client database id
    * @param fromClient the client database id which filed the report
    */
  def complainDel(targetClient: ClientType): js.Promise[js.Array[js.Any]] = js.native
  def complainDel(targetClient: ClientType, fromClient: ClientType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of complaints on the selected virtual server.
    * If dbid is specified, only complaints about the targeted client will be shown.
    * @param client filter only for certain client with the given database id
    */
  def complainList(): js.Promise[js.Array[ComplainEntry]] = js.native
  def complainList(client: ClientType): js.Promise[js.Array[ComplainEntry]] = js.native
  
  val config: typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams = js.native
  
  /**
    * connects to the TeamSpeak Server
    */
  def connect(): js.Promise[TeamSpeak] = js.native
  
  /**
    * returns detailed connection information about the selected virtual server including uptime, traffic information, etc.
    */
  def connectionInfo(): js.Promise[ServerRequestConnectionInfo] = js.native
  
  var context: js.Any = js.native
  
  /** creates a channel group perm builder for the specified channel group id */
  var createChannelGroupPermBuilder: js.Any = js.native
  
  /** creates a channel perm builder for the specified channel id */
  var createChannelPermBuilder: js.Any = js.native
  
  /** creates a client perm builder for the specified client database id */
  var createClientPermBuilder: js.Any = js.native
  
  /** creates a servergroup perm builder for the specified server group id */
  var createServerGroupPermBuilder: js.Any = js.native
  
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
    * @param client the client Database ID which should be changed
    * @param ident the key which should be deleted
    */
  def customDelete(client: ClientType, ident: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * returns a list of custom properties for the client specified with cldbid.
    * @param client the Client Database ID which should be retrieved
    */
  def customInfo(client: ClientType): js.Promise[CustomInfo] = js.native
  
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
    * @param client the client database id which should be changed
    * @param ident the key which should be set
    * @param value the value which should be set
    */
  def customSet(client: ClientType, ident: String, value: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes the channel group. If force is set to 1, the channel group will be deleted even if there are clients within.
    * @param group the channelgroup id
    * @param force if set to true the channelgroup will be deleted even when clients are in it
    */
  def deleteChannelGroup(group: GroupType): js.Promise[js.Array[js.Any]] = js.native
  def deleteChannelGroup(group: GroupType, force: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * displays a snapshot of the selected virtual server containing all settings,
    * groups and known client identities. The data from a server snapshot can be
    * used to restore a virtual servers configuration, channels and permissions
    * using the serversnapshotdeploy command.
    * only supports version 2 (from server 3.10.0)
    * @param salt if a password has been set provide the salt from the response
    * @param password the password which has been set while saving
    * @param keepfiles wether it should keep the file mapping
    * @param version of the snapshot with 0 the version of the current teamspeak server is being used
    */
  def deploySnapshot(data: String): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: js.UndefOr[scala.Nothing],
    password: js.UndefOr[scala.Nothing],
    keepfiles: js.UndefOr[scala.Nothing],
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: js.UndefOr[scala.Nothing],
    password: js.UndefOr[scala.Nothing],
    keepfiles: Boolean
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: js.UndefOr[scala.Nothing],
    password: js.UndefOr[scala.Nothing],
    keepfiles: Boolean,
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: js.UndefOr[scala.Nothing], password: String): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: js.UndefOr[scala.Nothing],
    password: String,
    keepfiles: js.UndefOr[scala.Nothing],
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: js.UndefOr[scala.Nothing], password: String, keepfiles: Boolean): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: js.UndefOr[scala.Nothing],
    password: String,
    keepfiles: Boolean,
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: String): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: String,
    password: js.UndefOr[scala.Nothing],
    keepfiles: js.UndefOr[scala.Nothing],
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: String, password: js.UndefOr[scala.Nothing], keepfiles: Boolean): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: String,
    password: js.UndefOr[scala.Nothing],
    keepfiles: Boolean,
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: String, password: String): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(
    data: String,
    salt: String,
    password: String,
    keepfiles: js.UndefOr[scala.Nothing],
    version: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: String, password: String, keepfiles: Boolean): js.Promise[js.Array[js.Any]] = js.native
  def deploySnapshot(data: String, salt: String, password: String, keepfiles: Boolean, version: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * returns the file in the channel with the given path
    * @param path the path whith the filename where the file should be uploaded to
    * @param channel channel id to download from (0 = server)
    * @param cpw channel password of the channel which will be uploaded to
    */
  def downloadFile(path: String): js.Promise[Buffer] = js.native
  def downloadFile(path: String, channel: js.UndefOr[ChannelType], cpw: String): js.Promise[Buffer] = js.native
  def downloadFile(path: String, channel: ChannelType): js.Promise[Buffer] = js.native
  
  /**
    * returns an icon with the given id
    * @param id the id of the icon to retrieve eg 262672952
    */
  def downloadIcon(id: Double): js.Promise[Buffer] = js.native
  
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
    * Sends a raw command to the TeamSpeak Server.
    * @param {...any} args the command which should get executed on the teamspeak server
    * @example
    * ts3.execute("clientlist", ["-ip"])
    * ts3.execute("use", [9987], { clientnickname: "test" })
    */
  def execute[T /* <: ResponseEntry | Response */](cmd: String, args: executeArgs*): js.Promise[T] = js.native
  
  /** forcefully closes the socket connection */
  def forceQuit(): Unit = js.native
  
  /**
    * Creates new directory in a channels file repository
    * @param channel the channel id to check for
    * @param dirname path to the directory
    * @param cpw the channel password
    */
  def ftCreateDir(channel: ChannelType, dirname: String): js.Promise[js.Array[js.Any]] = js.native
  def ftCreateDir(channel: ChannelType, dirname: String, cpw: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes one or more files stored in a channels file repository
    * @param channel the channel id to check for
    * @param name path to the file to delete
    * @param cpw the channel password
    */
  def ftDeleteFile(channel: ChannelType, name: String): js.Promise[js.Array[js.Any]] = js.native
  def ftDeleteFile(channel: ChannelType, name: String, cpw: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays detailed information about one or more specified files stored in a channels file repository.
    * @param channel the channel id to check for
    * @param name the filepath to receive
    * @param cpw the channel password
    */
  def ftGetFileInfo(channel: ChannelType, name: String): js.Promise[FTGetFileInfo] = js.native
  def ftGetFileInfo(channel: ChannelType, name: String, cpw: String): js.Promise[FTGetFileInfo] = js.native
  
  /**
    * Displays a list of files and directories stored in the specified channels file repository.
    * @param channel the channel id to check for
    * @param path the path to list
    * @param cpw the channel password
    */
  def ftGetFileList(channel: ChannelType): js.Promise[js.Array[FTGetFileEntry]] = js.native
  def ftGetFileList(channel: ChannelType, path: js.UndefOr[scala.Nothing], cpw: String): js.Promise[js.Array[FTGetFileEntry]] = js.native
  def ftGetFileList(channel: ChannelType, path: String): js.Promise[js.Array[FTGetFileEntry]] = js.native
  def ftGetFileList(channel: ChannelType, path: String, cpw: String): js.Promise[js.Array[FTGetFileEntry]] = js.native
  
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
  
  /**
    * Lists currently active file transfers
    */
  def ftList(): js.Promise[js.Array[FileTransferEntry]] = js.native
  
  /**
    * Renames a file in a channels file repository.
    * If the two parameters tcid and tcpw are specified, the file will be moved into another channels file repository
    * @param channel the channel id to check for
    * @param oldname the path to the file which should be renamed
    * @param newname the path to the file with the new name
    * @param tcid target channel id if the file should be moved to a different channel
    * @param cpw the channel password from where the file gets renamed
    * @param tcpw the channel password from where the file will get transferred to
    */
  def ftRenameFile(channel: ChannelType, oldname: String, newname: String): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(
    channel: ChannelType,
    oldname: String,
    newname: String,
    tcid: js.UndefOr[scala.Nothing],
    cpw: js.UndefOr[scala.Nothing],
    tcpw: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(
    channel: ChannelType,
    oldname: String,
    newname: String,
    tcid: js.UndefOr[scala.Nothing],
    cpw: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(
    channel: ChannelType,
    oldname: String,
    newname: String,
    tcid: js.UndefOr[scala.Nothing],
    cpw: String,
    tcpw: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(channel: ChannelType, oldname: String, newname: String, tcid: String): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(
    channel: ChannelType,
    oldname: String,
    newname: String,
    tcid: String,
    cpw: js.UndefOr[scala.Nothing],
    tcpw: String
  ): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(channel: ChannelType, oldname: String, newname: String, tcid: String, cpw: String): js.Promise[js.Array[js.Any]] = js.native
  def ftRenameFile(channel: ChannelType, oldname: String, newname: String, tcid: String, cpw: String, tcpw: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Stops the running file transfer with server-side ID serverftfid.
    * @param serverftfid server file transfer id
    * @param del
    */
  def ftStop(serverftfid: Double): js.Promise[js.Array[js.Any]] = js.native
  def ftStop(serverftfid: Double, del: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Retrieves a Single Channel by the given Channel ID
    * @param channel the channel id
    */
  def getChannelById(channel: ChannelType): js.Promise[js.UndefOr[TeamSpeakChannel]] = js.native
  
  /**
    * Retrieves a Single Channel by the given Channel Name
    * @param channelName the name of the channel
    */
  def getChannelByName(channelName: String): js.Promise[js.UndefOr[TeamSpeakChannel]] = js.native
  
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup ID
    * @param group the channelgroup Id
    */
  def getChannelGroupById(group: GroupType): js.Promise[js.UndefOr[TeamSpeakChannelGroup]] = js.native
  
  /**
    * Retrieves a single ChannelGroup by the given ChannelGroup Name
    * @param name the channelGroup name
    */
  def getChannelGroupByName(name: String): js.Promise[js.UndefOr[TeamSpeakChannelGroup]] = js.native
  
  /**
    * Retrieves a Single Client by the given Client Database ID
    * @param client the client database Id
    */
  def getClientByDbid(client: ClientType): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  
  /**
    * Retrieves a Single Client by the given Client ID
    * @param client the client id
    */
  def getClientById(client: ClientType): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param clientNickname the nickname of the client
    */
  def getClientByName(clientNickname: String): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  
  /**
    * Retrieves a Single Client by the given Client Unique Identifier
    * @param client the client unique identifier
    */
  def getClientByUid(client: ClientType): js.Promise[js.UndefOr[TeamSpeakClient]] = js.native
  
  /**
    * gets the icon id of a resolveable Perm List
    * @param permlist expects a promise which resolves to a permission list
    */
  def getIconId(permlist: js.Promise[js.Array[Permission[_]]]): js.Promise[Double] = js.native
  
  /**
    * retrieves an instance of the Permission
    */
  var getPermBuilder: js.Any = js.native
  
  /**
    * Retrieves a single ServerGroup by the given ServerGroup ID
    * @param group the servergroup id
    */
  def getServerGroupById(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[js.UndefOr[TeamSpeakServerGroup]] = js.native
  
  /**
    * Retrieves a single ServerGroup by the given ServerGroup Name
    * @param name the servergroup name
    */
  def getServerGroupByName(name: String): js.Promise[js.UndefOr[TeamSpeakServerGroup]] = js.native
  
  /**
    * Sends a text message to all clients on all virtual servers in the TeamSpeak 3 Server instance.
    * @param msg message which will be sent to all instances
    */
  def gm(msg: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * parses the whole cache by given objects
    * @param cache the cache object
    * @param list the list to check against the cache
    * @param key the key used to identify the object inside the cache
    * @param node the class which should be used
    */
  var handleCache: js.Any = js.native
  
  /** subscribes to some query events if necessary */
  var handleNewListener: js.Any = js.native
  
  /** handles initial commands after successfully connecting to a TeamSpeak Server */
  var handleReady: js.Any = js.native
  
  /**
    * Displays detailed connection information about the server instance including uptime,
    * number of virtual servers online, traffic information, etc.
    */
  def hostInfo(): js.Promise[HostInfo] = js.native
  
  /**
    * wether the query client should get handled or not
    * @param type the client type
    */
  var ignoreQueryClient: js.Any = js.native
  
  /**
    * Changes the server instance configuration using given properties.
    * @param properties the props you want to change
    */
  def instanceEdit(properties: InstanceEdit): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays the server instance configuration including database revision number,
    * the file transfer port, default group IDs, etc.
    */
  def instanceInfo(): js.Promise[InstanceInfo] = js.native
  
  /**
    * checks if the server is subscribed to a specific event
    * @param event event name which was subscribed to
    * @param id context to check
    */
  var isSubscribedToEvent: js.Any = js.native
  
  /**
    * Writes a custom entry into the servers log.
    * Depending on your permissions, you'll be able to add entries into the server instance log and/or your virtual servers log.
    * The loglevel parameter specifies the type of the entry
    * @param loglevel level 1 to 4
    * @param logmsg message to log
    */
  def logAdd(loglevel: LogLevel, logmsg: String): js.Promise[js.Array[js.Any]] = js.native
  
  def logQueryTiming(): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a specified number of entries from the servers log.
    * If instance is set to 1, the server will return lines from the master logfile (ts3server_0.log) instead of the selected virtual server logfile.
    * @param lines amount of lines to receive
    * @param reverse invert output (like Array.reverse)
    * @param instance instance or virtualserver log
    * @param beginPos begin at position
    */
  def logView(): js.Promise[js.Array[LogView]] = js.native
  def logView(
    lines: js.UndefOr[scala.Nothing],
    reverse: js.UndefOr[scala.Nothing],
    instance: js.UndefOr[scala.Nothing],
    beginPos: Double
  ): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: js.UndefOr[scala.Nothing], reverse: js.UndefOr[scala.Nothing], instance: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(
    lines: js.UndefOr[scala.Nothing],
    reverse: js.UndefOr[scala.Nothing],
    instance: Double,
    beginPos: Double
  ): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: js.UndefOr[scala.Nothing], reverse: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(
    lines: js.UndefOr[scala.Nothing],
    reverse: Double,
    instance: js.UndefOr[scala.Nothing],
    beginPos: Double
  ): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: js.UndefOr[scala.Nothing], reverse: Double, instance: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: js.UndefOr[scala.Nothing], reverse: Double, instance: Double, beginPos: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(
    lines: Double,
    reverse: js.UndefOr[scala.Nothing],
    instance: js.UndefOr[scala.Nothing],
    beginPos: Double
  ): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: js.UndefOr[scala.Nothing], instance: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: js.UndefOr[scala.Nothing], instance: Double, beginPos: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double, instance: js.UndefOr[scala.Nothing], beginPos: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double, instance: Double): js.Promise[js.Array[LogView]] = js.native
  def logView(lines: Double, reverse: Double, instance: Double, beginPos: Double): js.Promise[js.Array[LogView]] = js.native
  
  /**
    * Authenticates with the TeamSpeak 3 Server instance using given ServerQuery login credentials.
    * @param username the username which you want to login with
    * @param password the password you want to login with
    */
  def login(username: String, password: String): js.Promise[js.Array[js.Any]] = js.native
  
  /** Deselects the active virtual server and logs out from the server instance. */
  def logout(): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Sends an offline message to the client specified by uid.
    * @param client client unique identifier
    * @param subject subject of the message
    * @param message message text
    */
  def messageAdd(client: ClientType, subject: String, message: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Sends an offline message to the client specified by uid.
    * @param msgid the message id which should be deleted
    */
  def messageDel(msgid: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param msgid the message id
    */
  def messageGet(msgid: String): js.Promise[MessageGet] = js.native
  
  /**
    * Displays a list of offline messages you've received.
    * The output contains the senders unique identifier, the messages subject, etc.
    */
  def messageList(): js.Promise[js.Array[MessageEntry]] = js.native
  
  /**
    * Displays an existing offline message with the given id from the inbox.
    * @param msgid the message id
    * @param flag if flag is set to 1 the message will be marked as read
    */
  def messageUpdate(msgid: String): js.Promise[js.Array[js.Any]] = js.native
  def messageUpdate(msgid: String, flag: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  @JSName("on")
  def on_channelcreate(event: channelcreate, listener: js.Function1[/* event */ ChannelCreate, Unit]): this.type = js.native
  @JSName("on")
  def on_channeldelete(event: channeldelete, listener: js.Function1[/* event */ ChannelDelete, Unit]): this.type = js.native
  @JSName("on")
  def on_channeledit(
    event: channeledit,
    listener: js.Function1[/* event */ typings.ts3NodejsLibrary.eventsMod.ChannelEdit, Unit]
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
    * @param permsid single permission name
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
    * @param client the client database id
    * @param channel one or more permission names
    * @param permid one or more permission ids
    * @param permsid one or more permission names
    */
  def permOverview(client: ClientType, channel: ChannelType): js.Promise[js.Array[PermOverviewEntry]] = js.native
  def permOverview(client: ClientType, channel: ChannelType, perms: js.Array[Double | String]): js.Promise[js.Array[PermOverviewEntry]] = js.native
  
  /**
    * Restores the default permission settings on the selected virtual server and creates a new initial administrator token.
    * Please note that in case of an error during the permreset call - e.g. when the database has been modified or corrupted - the virtual server will be deleted from the database.
    */
  def permReset(): js.Promise[Token] = js.native
  
  /**
    * Retrieves a list of permissions available on the server instance including ID, name and description.
    */
  def permissionList(): js.Promise[js.Array[PermissionEntry]] = js.native
  
  /** priorizes the next command, this commands will be first in execution */
  def priorize(): this.type = js.native
  
  var priorizeNextCommand: js.Any = js.native
  
  /**
    * Create a new token.+
    * If type is set to 0, the ID specified with tokenid will be a server group ID.
    * Otherwise, tokenid is used as a channel group ID and you need to provide a valid channel ID using channelid.
    * @param tokentype token type
    * @param group depends on the type given, add either a valid channelgroup or servergroup
    * @param channel depends on the type given, add a valid channel id
    * @param description token description
    * @param customset token custom set
    */
  def privilegeKeyAdd(tokentype: ChannelGroup, group: GroupType, channel: ChannelType): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ChannelGroup,
    group: GroupType,
    channel: ChannelType,
    description: js.UndefOr[scala.Nothing],
    customset: String
  ): js.Any = js.native
  def privilegeKeyAdd(tokentype: ChannelGroup, group: GroupType, channel: ChannelType, description: String): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ChannelGroup,
    group: GroupType,
    channel: ChannelType,
    description: String,
    customset: String
  ): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ServerGroup,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType
  ): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ServerGroup,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    channel: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    customset: String
  ): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ServerGroup,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    channel: js.UndefOr[scala.Nothing],
    description: String
  ): js.Any = js.native
  def privilegeKeyAdd(
    tokentype: ServerGroup,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    channel: js.UndefOr[scala.Nothing],
    description: String,
    customset: String
  ): js.Any = js.native
  
  /**
    * Deletes an existing token matching the token key specified with token.
    * @param token the token which should be deleted
    */
  def privilegeKeyDelete(token: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Retrieves a list of privilege keys available including their type and group IDs.
    */
  def privilegeKeyList(): js.Promise[js.Array[PrivilegeKeyEntry]] = js.native
  
  /**
    * Use a token key gain access to a server or channel group.
    * Please note that the server will automatically delete the token after it has been used.
    * @param token the token which should be used
    */
  def privilegeKeyUse(token: String): js.Promise[js.Array[js.Any]] = js.native
  
  var query: js.Any = js.native
  
  /**
    * Adds a new query client login, or enables query login for existing clients.
    * When no virtual server has been selected, the command will create global query logins.
    * Otherwise the command enables query login for existing client, and cldbid must be specified.
    * @param clientLoginName the login name
    * @param client optional database id or teamspeak client
    */
  def queryLoginAdd(clientLoginName: String): js.Promise[QueryLoginAdd] = js.native
  def queryLoginAdd(clientLoginName: String, client: ClientType): js.Promise[QueryLoginAdd] = js.native
  
  /**
    * Deletes an existing server query login on selected server.
    * When no virtual server has been selected, deletes global query logins instead.
    * @param client client database id or teamspeak client object
    */
  def queryLoginDel(client: ClientType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * List existing query client logins.
    * The pattern parameter can include regular characters and SQL wildcard characters (e.g. %).
    * Only displays query logins of the selected virtual server, or all query logins when no virtual server have been  selected.
    * @param pattern the pattern to filter for client login names
    * @param start the offset from where clients should be listed
    * @param duration how many clients should be listed
    */
  def queryLoginList(): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], duration: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: js.UndefOr[scala.Nothing], start: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: js.UndefOr[scala.Nothing], start: Double, duration: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: String): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: String, start: js.UndefOr[scala.Nothing], duration: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: String, start: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  def queryLoginList(pattern: String, start: Double, duration: Double): js.Promise[js.Array[QueryLoginEntry]] = js.native
  
  /** closes the ServerQuery connection to the TeamSpeak server instance. */
  def quit(): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * attempts a reconnect to the teamspeak server with full context features
    * @param attempts the amount of times it should try to reconnect (-1 = try forever)
    * @param timeout time in ms to wait inbetween reconnect
    */
  def reconnect(): js.Promise[this.type] = js.native
  def reconnect(attempts: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[this.type] = js.native
  def reconnect(attempts: Double): js.Promise[this.type] = js.native
  def reconnect(attempts: Double, timeout: Double): js.Promise[this.type] = js.native
  
  /**
    * Subscribes to an Event
    * @param event the event on which should be subscribed
    * @param id the channel id, only required when subscribing to the "channel" event
    */
  def registerEvent(event: String): js.Promise[js.Array[js.Any]] = js.native
  def registerEvent(event: String, id: String): js.Promise[js.Array[js.Any]] = js.native
  
  def sendTextMessage(target: ChannelType, targetmode: CHANNEL, msg: String): js.Any = js.native
  def sendTextMessage(target: ClientType, targetmode: CLIENT, msg: String): js.Any = js.native
  /**
    * Sends a text message a specified target.
    * The type of the target is determined by targetmode while target specifies the ID of the recipient,
    * whether it be a virtual server, a channel or a client.
    * @param target target client id or channel id which should receive the message
    * @param targetmode targetmode (1: client, 2: channel, 3: server)
    * @param msg the message the client should receive
    */
  @JSName("sendTextMessage")
  def sendTextMessage_0(target: `0`, targetmode: SERVER, msg: String): js.Any = js.native
  
  /**
    * Creates a new virtual server using the given properties and displays its ID, port and initial administrator privilege key.
    * If virtualserverPort is not specified, the server will test for the first unused UDP port
    * @param properties the server properties
    */
  def serverCreate(properties: typings.ts3NodejsLibrary.propertyTypesMod.ServerEdit): js.Promise[ServerCreate] = js.native
  
  /**
    * deletes the teamspeak server
    * @param server the server id to delete
    */
  def serverDelete(server: ServerType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Changes the selected virtual servers configuration using given properties.
    * Note that this command accepts multiple properties which means that you're able to change all settings of the selected virtual server at once.
    */
  def serverEdit(properties: typings.ts3NodejsLibrary.propertyTypesMod.ServerEdit): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Adds one or more clients to a server group specified with sgid.
    * Please note that a client cannot be added to default groups or template groups
    * @param client one or more client database ids which should be added
    * @param group the servergroup id which the client(s) should be added to
    */
  def serverGroupAddClient(
    client: MultiClientType,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType
  ): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Adds a specified permissions to the server group.
    * A permission can be specified by permid or permsid.
    * @param group the serverGroup id
    * @param perm the permission object
    */
  def serverGroupAddPerm(
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    perm: js.UndefOr[scala.Nothing]
  ): Permission[_] = js.native
  def serverGroupAddPerm(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, perm: PermType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * returns the IDs of all clients currently residing in the server group.
    * @param group the servergroup id
    */
  def serverGroupClientList(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[js.Array[ServerGroupClientEntry]] = js.native
  
  /**
    * Creates a copy of the server group specified with ssgid.
    * If tsgid is set to 0, the server will create a new group.
    * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
    * If a target group is set, the name parameter will be ignored.
    * @param sourceGroup the source ServerGroup
    * @param targetGroup the target ServerGroup, 0 to create a new Group
    * @param type the type of the servergroup (0 = Query Group | 1 = Normal Group)
    * @param name name of the group
    */
  def serverGroupCopy(sourceGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(
    sourceGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    targetGroup: js.UndefOr[typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType],
    `type`: js.UndefOr[scala.Nothing],
    name: String
  ): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(
    sourceGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    targetGroup: js.UndefOr[typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType],
    `type`: Double
  ): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(
    sourceGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    targetGroup: js.UndefOr[typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType],
    `type`: Double,
    name: String
  ): js.Promise[ServerGroupCopy] = js.native
  def serverGroupCopy(
    sourceGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    targetGroup: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType
  ): js.Promise[ServerGroupCopy] = js.native
  
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
    * @param group the servergroup id
    * @param force if set to 1 the servergoup will be deleted even when clients stil belong to this group
    */
  def serverGroupDel(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[js.Array[js.Any]] = js.native
  def serverGroupDel(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, force: Boolean): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Removes one or more clients from the server group specified with sgid.
    * @param client one or more client database ids which should be added
    * @param group the servergroup id which the client(s) should be removed from
    */
  def serverGroupDelClient(
    client: MultiClientType,
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType
  ): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Removes a set of specified permissions from the server group.
    * A permission can be specified by permid or permsid.
    * @param group the servergroup id
    * @param perm the permid or permsid
    */
  def serverGroupDelPerm(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, perm: String): js.Promise[js.Array[js.Any]] = js.native
  def serverGroupDelPerm(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, perm: Double): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays a list of server groups available.
    * Depending on your permissions, the output may also contain global ServerQuery groups and template groups.
    */
  def serverGroupList(): js.Promise[js.Array[TeamSpeakServerGroup]] = js.native
  def serverGroupList(filter: PartialServerGroupEntry): js.Promise[js.Array[TeamSpeakServerGroup]] = js.native
  
  /**
    * Displays a list of permissions assigned to the server group specified with sgid.
    * @param sgid the servergroup id
    * @param permsid if the permsid option is set to true the output will contain the permission names
    */
  def serverGroupPermList(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[js.Array[Permission[Sgid]]] = js.native
  def serverGroupPermList(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, permsid: Boolean): js.Promise[js.Array[Permission[Sgid]]] = js.native
  
  /**
    * Create a new privilegekey token for a ServerGroup with the given description
    * @param group servergroup which should be generated the token for
    * @param description token description
    * @param tokencustomset token custom set
    */
  def serverGroupPrivilegeKeyAdd(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType): js.Promise[Token] = js.native
  def serverGroupPrivilegeKeyAdd(
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    description: js.UndefOr[scala.Nothing],
    customset: String
  ): js.Promise[Token] = js.native
  def serverGroupPrivilegeKeyAdd(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, description: String): js.Promise[Token] = js.native
  def serverGroupPrivilegeKeyAdd(
    group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType,
    description: String,
    customset: String
  ): js.Promise[Token] = js.native
  
  /**
    * Changes the name of the server group
    * @param group the servergroup id
    * @param name new name of the servergroup
    */
  def serverGroupRename(group: typings.ts3NodejsLibrary.serverGroupMod.TeamSpeakServerGroup.GroupType, name: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * displays all server groups the client specified with cldbid is currently residing in
    * @param client the client database id to check
    */
  def serverGroupsByClientId(client: ClientType): js.Promise[js.Array[ServerGroupsByClientId]] = js.native
  
  /**
    * Displays the database ID of the virtual server running on the UDP port
    * @param virtualserverPort the server port where data should be retrieved
    */
  def serverIdGetByPort(virtualserverPort: Double): js.Promise[ServerIdGetByPort] = js.native
  
  /**
    * Displays detailed configuration information about the selected virtual server
    * including unique ID, number of clients online, configuration, etc.
    */
  def serverInfo(): js.Promise[ServerInfo] = js.native
  
  /**
    * Displays a list of virtual servers including their ID, status, number of clients online, etc.
    */
  def serverList(): js.Promise[js.Array[TeamSpeakServer]] = js.native
  def serverList(filter: PartialServerEntry): js.Promise[js.Array[TeamSpeakServer]] = js.native
  
  /**
    * Stops the entire TeamSpeak 3 Server instance by shutting down the process.
    * @param reasonmsg specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverProcessStop(): js.Promise[js.Array[js.Any]] = js.native
  def serverProcessStop(reasonmsg: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Starts the virtual server. Depending on your permissions,
    * you're able to start either your own virtual server only or all virtual servers in the server instance.
    * @param server the server id to start
    */
  def serverStart(server: ServerType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Stops the virtual server. Depending on your permissions,
    * you're able to stop either your own virtual server only or all virtual servers in the server instance.
    * @param server the server id to stop
    * @param reasonmsg Specifies a text message that is sent to the clients before the client disconnects (requires TeamSpeak Server 3.2.0 or newer).
    */
  def serverStop(server: ServerType): js.Promise[js.Array[js.Any]] = js.native
  def serverStop(server: ServerType, reasonmsg: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Sets a new temporary server password specified with pw. The temporary
    * password will be valid for the number of seconds specified with duration. The
    * client connecting with this password will automatically join the channel
    * specified with tcid. If tcid is set to 0, the client will join the default
    * channel.
    */
  def serverTempPasswordAdd(props: ServerTempPasswordAdd): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Deletes the temporary server password specified with pw.
    * @param pw the password to delete
    */
  def serverTempPasswordDel(pw: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Returns a list of active temporary server passwords. The output contains the
    * clear-text password, the nickname and unique identifier of the creating
    * client.
    */
  def serverTempPasswordList(): js.Promise[js.Array[ServerTempPasswordEntry]] = js.native
  
  var serverVersion: js.Any = js.native
  
  var servergroups: js.Any = js.native
  
  var servers: js.Any = js.native
  
  /**
    * Sets the channel group of a client
    * @param group the channelgroup which the client should get assigned
    * @param channel the channel in which the client should be assigned the group
    * @param client the client database id which should be added to the group
    */
  def setClientChannelGroup(group: GroupType, channel: ChannelType, client: ClientType): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Subscribes to an Event.
    */
  def unregisterEvent(): js.Promise[js.Array[js.Any]] = js.native
  
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
    * uploads a file
    * @param path the path whith the filename where the file should be uploaded to
    * @param data the data to upload
    * @param channel channel id to upload to (0 = server)
    * @param cpw channel password of the channel which will be uploaded to
    */
  def uploadFile(path: String, data: String): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: String, channel: js.UndefOr[ChannelType], cpw: String): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: String, channel: ChannelType): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer, channel: js.UndefOr[ChannelType], cpw: String): js.Promise[Unit] = js.native
  def uploadFile(path: String, data: Buffer, channel: ChannelType): js.Promise[Unit] = js.native
  
  /**
    * uploads an icon to the teamspeak server and returns its id
    * @param data icon buffer to upload
    */
  def uploadIcon(data: Buffer): js.Promise[Double] = js.native
  
  /**
    * Selects the virtual server specified with the port to allow further interaction.
    * @param port the port the server runs on
    * @param clientNickname set nickname when selecting a server
    */
  def useByPort(port: Double): js.Promise[js.Array[js.Any]] = js.native
  def useByPort(port: Double, clientNickname: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Selects the virtual server specified with the sid to allow further interaction.
    * @param server the server id
    * @param clientNickname set nickname when selecting a server
    */
  def useBySid(server: ServerType): js.Promise[js.Array[js.Any]] = js.native
  def useBySid(server: ServerType, clientNickname: String): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Displays the servers version information including platform and build number.
    * @param refresh if this parameter has been set it will send a command to the server otherwise will use the cached info
    */
  def version(): js.Promise[js.UndefOr[Version]] = js.native
  def version(refresh: Boolean): js.Promise[js.UndefOr[Version]] = js.native
  
  /** returns information about your current ServerQuery connection including your loginname, etc. */
  def whoami(): js.Promise[Whoami] = js.native
}
