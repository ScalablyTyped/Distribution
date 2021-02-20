package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.adminClientMod.AdminStreamListResponse
import typings.symphonyApiClientNode.adminClientMod.ImportMessage
import typings.symphonyApiClientNode.adminClientMod.ImportMessageResult
import typings.symphonyApiClientNode.adminClientMod.StreamMembers_
import typings.symphonyApiClientNode.adminClientMod.SuppressedMessage
import typings.symphonyApiClientNode.adminUserClientMod.AdminUserInfo
import typings.symphonyApiClientNode.connectionsClientMod.Connection
import typings.symphonyApiClientNode.connectionsClientMod.RemoveConnectionReponse
import typings.symphonyApiClientNode.messagesClientMod.Message
import typings.symphonyApiClientNode.presenceClientMod.UserPresenceResponse
import typings.symphonyApiClientNode.signalsClientMod.DeleteOperationResult
import typings.symphonyApiClientNode.signalsClientMod.Signal
import typings.symphonyApiClientNode.signalsClientMod.SignalSubscribersResponse
import typings.symphonyApiClientNode.signalsClientMod.SignalSubscriptionResult
import typings.symphonyApiClientNode.streamsClientMod.ActivateRoomResponse
import typings.symphonyApiClientNode.streamsClientMod.Keyword
import typings.symphonyApiClientNode.streamsClientMod.RoomInfo
import typings.symphonyApiClientNode.streamsClientMod.RoomMember
import typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult
import typings.symphonyApiClientNode.streamsClientMod.SearchRoomResponse
import typings.symphonyApiClientNode.streamsClientMod.StreamType
import typings.symphonyApiClientNode.streamsClientMod.UserId
import typings.symphonyApiClientNode.streamsClientMod.UserStream
import typings.symphonyApiClientNode.symBotAuthMod.Token
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.BASIC
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.RELEVANCE
import typings.symphonyApiClientNode.usersClientMod.SearchUserResponse
import typings.symphonyApiClientNode.usersClientMod.User
import typings.symphonyApiClientNode.usersClientMod.UserFilter
import typings.symphonyApiClientNode.usersClientMod.UsersList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("symphony-api-client-node", "ACCEPTED")
  @js.native
  val ACCEPTED: String = js.native
  
  @JSImport("symphony-api-client-node", "ALL")
  @js.native
  val ALL: String = js.native
  
  @JSImport("symphony-api-client-node", "MESSAGEML_FORMAT")
  @js.native
  val MESSAGEML_FORMAT: String = js.native
  
  @JSImport("symphony-api-client-node", "PENDING_INCOMING")
  @js.native
  val PENDING_INCOMING: String = js.native
  
  @JSImport("symphony-api-client-node", "PENDING_OUTGOING")
  @js.native
  val PENDING_OUTGOING: String = js.native
  
  @JSImport("symphony-api-client-node", "PRESENTATIONML_FORMAT")
  @js.native
  val PRESENTATIONML_FORMAT: String = js.native
  
  @JSImport("symphony-api-client-node", "REJECTED")
  @js.native
  val REJECTED: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_AVAILABLE")
  @js.native
  val STATUS_AVAILABLE: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_AWAY")
  @js.native
  val STATUS_AWAY: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_BE_RIGHT_BACK")
  @js.native
  val STATUS_BE_RIGHT_BACK: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_BUSY")
  @js.native
  val STATUS_BUSY: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_IN_A_MEETING")
  @js.native
  val STATUS_IN_A_MEETING: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_OFF_WORK")
  @js.native
  val STATUS_OFF_WORK: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_ON_THE_PHONE")
  @js.native
  val STATUS_ON_THE_PHONE: String = js.native
  
  @JSImport("symphony-api-client-node", "STATUS_OUT_OF_OFFICE")
  @js.native
  val STATUS_OUT_OF_OFFICE: String = js.native
  
  @JSImport("symphony-api-client-node", "acceptConnectionRequest")
  @js.native
  def acceptConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node", "activateRoom")
  @js.native
  def activateRoom(streamId: String): js.Promise[ActivateRoomResponse] = js.native
  
  @JSImport("symphony-api-client-node", "addMemberToRoom")
  @js.native
  def addMemberToRoom(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = js.native
  
  @JSImport("symphony-api-client-node", "adminListEnterpriseStreamsV2")
  @js.native
  def adminListEnterpriseStreamsV2(
    streamTypes: js.Array[StreamType],
    scope: String,
    origin: String,
    privacy: String,
    status: String,
    startDate: Double,
    endDate: Double,
    skip: Double,
    limit: Double
  ): js.Promise[AdminStreamListResponse] = js.native
  
  @JSImport("symphony-api-client-node", "authenticateBot")
  @js.native
  def authenticateBot(SymConfig: SymphonyConfiguration): js.Promise[AuthInfo] = js.native
  
  @JSImport("symphony-api-client-node", "authenticateExtApp")
  @js.native
  def authenticateExtApp(): js.Promise[AppInfo] = js.native
  
  @JSImport("symphony-api-client-node", "authenticateOboApp")
  @js.native
  def authenticateOboApp(): js.Promise[Token] = js.native
  
  @JSImport("symphony-api-client-node", "createRoom")
  @js.native
  def createRoom(
    room: String,
    description: js.UndefOr[String],
    keywords: js.UndefOr[js.Array[Keyword]],
    membersCanInvite: js.UndefOr[Boolean],
    discoverable: js.UndefOr[Boolean],
    anyoneCanJoin: js.UndefOr[Boolean],
    readOnly: js.UndefOr[Boolean],
    copyProtected: js.UndefOr[Boolean],
    crossPod: js.UndefOr[Boolean],
    viewHistory: js.UndefOr[Boolean]
  ): js.Promise[RoomInfo] = js.native
  
  @JSImport("symphony-api-client-node", "createSignal")
  @js.native
  def createSignal(name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean, sessionToken: String): js.Promise[Signal] = js.native
  
  @JSImport("symphony-api-client-node", "deactivateRoom")
  @js.native
  def deactivateRoom(streamId: String): js.Promise[ActivateRoomResponse] = js.native
  
  @JSImport("symphony-api-client-node", "deleteSignal")
  @js.native
  def deleteSignal(id: String, sessionToken: String): js.Promise[DeleteOperationResult] = js.native
  
  @JSImport("symphony-api-client-node", "demoteUserFromOwner")
  @js.native
  def demoteUserFromOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = js.native
  
  @JSImport("symphony-api-client-node", "formBuilder")
  @js.native
  def formBuilder(formId: js.Any): js.Any = js.native
  
  @JSImport("symphony-api-client-node", "forwardMessage")
  @js.native
  def forwardMessage(conversationId: String, message: String, data: js.Any): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node", "getAcceptedConnections")
  @js.native
  def getAcceptedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getAllConnections")
  @js.native
  def getAllConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getAttachment")
  @js.native
  def getAttachment(streamId: String, attachmentId: String, messageId: String): js.Promise[String] = js.native
  
  @JSImport("symphony-api-client-node", "getBotUser")
  @js.native
  def getBotUser(): Unit = js.native
  
  @JSImport("symphony-api-client-node", "getCashtags")
  @js.native
  def getCashtags(message: js.Any): js.Array[_] = js.native
  
  @JSImport("symphony-api-client-node", "getConnectionRequestStatus")
  @js.native
  def getConnectionRequestStatus(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node", "getConnections")
  @js.native
  def getConnections(status: String, commaSeparatedUserIds: String, sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getDatafeedEventsService")
  @js.native
  def getDatafeedEventsService(options: js.Any): js.Any = js.native
  
  @JSImport("symphony-api-client-node", "getFirehoseEventsService")
  @js.native
  def getFirehoseEventsService(subscriberCallback: js.Any): Unit = js.native
  
  @JSImport("symphony-api-client-node", "getHashtags")
  @js.native
  def getHashtags(message: js.Any): js.Array[_] = js.native
  
  @JSImport("symphony-api-client-node", "getInboundPendingConnections")
  @js.native
  def getInboundPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getMentions")
  @js.native
  def getMentions(message: js.Any): js.Array[_] = js.native
  
  @JSImport("symphony-api-client-node", "getMessage")
  @js.native
  def getMessage(messageId: String): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node", "getMessages")
  @js.native
  def getMessages(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = js.native
  
  @JSImport("symphony-api-client-node", "getPendingConnections")
  @js.native
  def getPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getRejectedConnections")
  @js.native
  def getRejectedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "getRoomInfo")
  @js.native
  def getRoomInfo(streamId: String): js.Promise[RoomInfo] = js.native
  
  @JSImport("symphony-api-client-node", "getRoomMembers")
  @js.native
  def getRoomMembers(streamId: String): js.Promise[js.Array[RoomMember]] = js.native
  
  @JSImport("symphony-api-client-node", "getSignal")
  @js.native
  def getSignal(id: String, sessionToken: String): js.Promise[Signal] = js.native
  
  @JSImport("symphony-api-client-node", "getSignalSubscribers")
  @js.native
  def getSignalSubscribers(id: String, skip: Double, limit: Double, sessionToken: String): js.Promise[SignalSubscribersResponse] = js.native
  
  @JSImport("symphony-api-client-node", "getUser")
  @js.native
  def getUser(id: String): js.Promise[AdminUserInfo] = js.native
  
  @JSImport("symphony-api-client-node", "getUserFromEmail")
  @js.native
  def getUserFromEmail(email: String): js.Promise[User] = js.native
  @JSImport("symphony-api-client-node", "getUserFromEmail")
  @js.native
  def getUserFromEmail(email: String, local: Boolean): js.Promise[User] = js.native
  
  @JSImport("symphony-api-client-node", "getUserFromUsername")
  @js.native
  def getUserFromUsername(username: String): js.Promise[User] = js.native
  
  @JSImport("symphony-api-client-node", "getUserIMStreamId")
  @js.native
  def getUserIMStreamId(userIDs: js.Array[Double]): js.Promise[UserId] = js.native
  
  @JSImport("symphony-api-client-node", "getUserPresence")
  @js.native
  def getUserPresence(userId: Double, local: Boolean): Unit = js.native
  
  @JSImport("symphony-api-client-node", "getUserStreams")
  @js.native
  def getUserStreams(skip: Double, limit: Double, streamTypes: js.Array[StreamType], includeInactiveStreams: Boolean): js.Promise[UserStream] = js.native
  
  @JSImport("symphony-api-client-node", "getUsersFromEmailList")
  @js.native
  def getUsersFromEmailList(commaSeparatedEmails: String): js.Promise[UsersList] = js.native
  @JSImport("symphony-api-client-node", "getUsersFromEmailList")
  @js.native
  def getUsersFromEmailList(commaSeparatedEmails: String, local: Boolean): js.Promise[UsersList] = js.native
  
  @JSImport("symphony-api-client-node", "getUsersFromIdList")
  @js.native
  def getUsersFromIdList(commaSeparatedIds: String): js.Promise[UsersList] = js.native
  @JSImport("symphony-api-client-node", "getUsersFromIdList")
  @js.native
  def getUsersFromIdList(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = js.native
  
  @JSImport("symphony-api-client-node", "importMessages")
  @js.native
  def importMessages(messageList: js.Array[ImportMessage]): js.Promise[js.Array[ImportMessageResult]] = js.native
  
  @JSImport("symphony-api-client-node", "initBot")
  @js.native
  def initBot(pathToConfigFile: String): js.Promise[AuthInfo] = js.native
  @JSImport("symphony-api-client-node", "initBot")
  @js.native
  def initBot(pathToConfigFile: String, pathToLoadBalancerConfigFile: String): js.Promise[AuthInfo] = js.native
  
  @JSImport("symphony-api-client-node", "listSignals")
  @js.native
  def listSignals(skip: Double, limit: Double, sessionToken: String): js.Promise[js.Array[Signal]] = js.native
  
  @JSImport("symphony-api-client-node", "listUsers")
  @js.native
  def listUsers(skip: Double, limit: Double): js.Promise[js.Array[AdminUserInfo]] = js.native
  
  @JSImport("symphony-api-client-node", "oboAuthenticateByUserId")
  @js.native
  def oboAuthenticateByUserId(userId: Double): js.Promise[Token] = js.native
  
  @JSImport("symphony-api-client-node", "oboGetAllConnections")
  @js.native
  def oboGetAllConnections(status: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node", "oboGetConnection")
  @js.native
  def oboGetConnection(userId: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node", "oboGetUserIMStreamId")
  @js.native
  def oboGetUserIMStreamId(userToken: String, userIds: js.Array[Double]): js.Promise[UserId] = js.native
  
  @JSImport("symphony-api-client-node", "oboSendMessage")
  @js.native
  def oboSendMessage(userToken: String, conversationId: String, message: String, data: js.Any, format: String): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node", "promoteUserToOwner")
  @js.native
  def promoteUserToOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = js.native
  
  @JSImport("symphony-api-client-node", "registerInterestExtUser")
  @js.native
  def registerInterestExtUser(userIds: js.Array[Double]): Unit = js.native
  
  @JSImport("symphony-api-client-node", "rejectConnectionRequest")
  @js.native
  def rejectConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node", "removeConnection")
  @js.native
  def removeConnection(userId: String, sessionToken: String): js.Promise[RemoveConnectionReponse] = js.native
  
  @JSImport("symphony-api-client-node", "removeMemberFromRoom")
  @js.native
  def removeMemberFromRoom(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = js.native
  
  @JSImport("symphony-api-client-node", "searchRooms")
  @js.native
  def searchRooms(
    skip: js.UndefOr[Double],
    limit: js.UndefOr[Double],
    query: js.UndefOr[String],
    labels: js.UndefOr[js.Array[String]],
    active: js.UndefOr[Boolean],
    includePrivateRooms: js.UndefOr[Boolean],
    creator: js.UndefOr[UserId],
    owner: js.UndefOr[UserId],
    member: js.UndefOr[UserId],
    sortOrder: js.UndefOr[BASIC | RELEVANCE]
  ): js.Promise[SearchRoomResponse] = js.native
  
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: Double,
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: Double,
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(
    query: String,
    local: Boolean,
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: js.UndefOr[scala.Nothing], filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  @JSImport("symphony-api-client-node", "searchUsers")
  @js.native
  def searchUsers(query: String, local: Boolean, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  
  @JSImport("symphony-api-client-node", "sendConnectionRequest")
  @js.native
  def sendConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node", "sendMessage")
  @js.native
  def sendMessage(conversationId: String, message: String, data: js.Any, format: String, sessionToken: String): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node", "sendMessageWithAttachment")
  @js.native
  def sendMessageWithAttachment(
    conversationId: String,
    message: String,
    data: js.Any,
    fileName: String,
    fileType: String,
    fileContent: js.Any,
    format: String
  ): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node", "sessionToken")
  @js.native
  val sessionToken: String = js.native
  
  @JSImport("symphony-api-client-node", "setDebugMode")
  @js.native
  def setDebugMode(mode: String): Unit = js.native
  
  @JSImport("symphony-api-client-node", "setPresence")
  @js.native
  def setPresence(status: String): js.Promise[UserPresenceResponse] = js.native
  
  @JSImport("symphony-api-client-node", "stopDatafeedEventsService")
  @js.native
  def stopDatafeedEventsService(): Unit = js.native
  
  @JSImport("symphony-api-client-node", "stopFirehoseEventsService")
  @js.native
  def stopFirehoseEventsService(): Unit = js.native
  
  @JSImport("symphony-api-client-node", "streamMembers")
  @js.native
  def streamMembers(id: String, skip: Double, limit: Double): js.Promise[StreamMembers_] = js.native
  
  @JSImport("symphony-api-client-node", "subscribeSignal")
  @js.native
  def subscribeSignal(id: String, userIds: js.Array[Double], userCanUnsubscribe: Boolean, sessionToken: String): js.Promise[SignalSubscriptionResult] = js.native
  
  @JSImport("symphony-api-client-node", "suppressMessage")
  @js.native
  def suppressMessage(id: String): js.Promise[SuppressedMessage] = js.native
  
  @JSImport("symphony-api-client-node", "unsubscribeSignal")
  @js.native
  def unsubscribeSignal(id: String, userIds: js.Array[Double], sessionToken: String): js.Promise[SignalSubscriptionResult] = js.native
  
  @JSImport("symphony-api-client-node", "updateRoom")
  @js.native
  def updateRoom(
    streamId: String,
    room: String,
    description: js.UndefOr[String],
    keywords: js.UndefOr[js.Array[Keyword]],
    membersCanInvite: js.UndefOr[Boolean],
    discoverable: js.UndefOr[Boolean],
    anyoneCanJoin: js.UndefOr[Boolean],
    readOnly: js.UndefOr[Boolean],
    copyProtected: js.UndefOr[Boolean],
    crossPod: js.UndefOr[Boolean],
    viewHistory: js.UndefOr[Boolean]
  ): js.Promise[RoomInfo] = js.native
  
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: js.UndefOr[scala.Nothing], query: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: js.UndefOr[scala.Nothing], query: String, visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: js.UndefOr[scala.Nothing],
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: js.UndefOr[scala.Nothing], visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: js.UndefOr[scala.Nothing],
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: js.UndefOr[scala.Nothing],
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: js.UndefOr[scala.Nothing],
    sessionToken: String
  ): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = js.native
  @JSImport("symphony-api-client-node", "updateSignal")
  @js.native
  def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = js.native
  
  @JSImport("symphony-api-client-node", "verifyJwt")
  @js.native
  def verifyJwt(jwt: String): js.Promise[String] = js.native
  
  @js.native
  trait AppInfo extends StObject {
    
    var appId: String = js.native
    
    var appToken: String = js.native
  }
  object AppInfo {
    
    @scala.inline
    def apply(appId: String, appToken: String): AppInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appToken = appToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInfo]
    }
    
    @scala.inline
    implicit class AppInfoMutableBuilder[Self <: AppInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppToken(value: String): Self = StObject.set(x, "appToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthInfo extends StObject {
    
    var kmAuthToken: String = js.native
    
    var sessionAuthToken: String = js.native
  }
  object AuthInfo {
    
    @scala.inline
    def apply(kmAuthToken: String, sessionAuthToken: String): AuthInfo = {
      val __obj = js.Dynamic.literal(kmAuthToken = kmAuthToken.asInstanceOf[js.Any], sessionAuthToken = sessionAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthInfo]
    }
    
    @scala.inline
    implicit class AuthInfoMutableBuilder[Self <: AuthInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmAuthToken(value: String): Self = StObject.set(x, "kmAuthToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAuthToken(value: String): Self = StObject.set(x, "sessionAuthToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SymphonyConfiguration extends StObject {
    
    var agentContextPath: js.UndefOr[String] = js.native
    
    var agentHost: js.UndefOr[String] = js.native
    
    var agentPort: js.UndefOr[Double] = js.native
    
    var appCertName: js.UndefOr[String] = js.native
    
    var appCertPassword: js.UndefOr[String] = js.native
    
    var appCertPath: js.UndefOr[String] = js.native
    
    var appId: js.UndefOr[String] = js.native
    
    var appPrivateKeyName: js.UndefOr[String] = js.native
    
    var appPrivateKeyPath: js.UndefOr[String] = js.native
    
    var botCertName: js.UndefOr[String] = js.native
    
    var botCertPassword: js.UndefOr[String] = js.native
    
    var botCertPath: js.UndefOr[String] = js.native
    
    var botEmailAddress: js.UndefOr[String] = js.native
    
    var botPrivateKeyName: js.UndefOr[String] = js.native
    
    var botPrivateKeyPath: js.UndefOr[String] = js.native
    
    var botUsername: js.UndefOr[String] = js.native
    
    var keyAuthContextPath: js.UndefOr[String] = js.native
    
    var keyAuthHost: js.UndefOr[String] = js.native
    
    var keyAuthPort: js.UndefOr[Double] = js.native
    
    var keyManagerProxyPassword: js.UndefOr[String] = js.native
    
    var keyManagerProxyURL: js.UndefOr[String] = js.native
    
    var keyManagerProxyUsername: js.UndefOr[String] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var maxWaitInterval: js.UndefOr[Double] = js.native
    
    var nodeTlsRejectUnauthorized: js.UndefOr[Double] = js.native
    
    var podContextPath: js.UndefOr[String] = js.native
    
    var podHost: js.UndefOr[String] = js.native
    
    var podPort: js.UndefOr[Double] = js.native
    
    var podProxyPassword: js.UndefOr[String] = js.native
    
    var podProxyURL: js.UndefOr[String] = js.native
    
    var podProxyUsername: js.UndefOr[String] = js.native
    
    var proxyPassword: js.UndefOr[String] = js.native
    
    var proxyURL: js.UndefOr[String] = js.native
    
    var proxyUsername: js.UndefOr[String] = js.native
    
    var sessionAuthContextPath: js.UndefOr[String] = js.native
    
    var sessionAuthHost: js.UndefOr[String] = js.native
    
    var sessionAuthPort: js.UndefOr[Double] = js.native
  }
  object SymphonyConfiguration {
    
    @scala.inline
    def apply(): SymphonyConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymphonyConfiguration]
    }
    
    @scala.inline
    implicit class SymphonyConfigurationMutableBuilder[Self <: SymphonyConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgentContextPath(value: String): Self = StObject.set(x, "agentContextPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentContextPathUndefined: Self = StObject.set(x, "agentContextPath", js.undefined)
      
      @scala.inline
      def setAgentHost(value: String): Self = StObject.set(x, "agentHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentHostUndefined: Self = StObject.set(x, "agentHost", js.undefined)
      
      @scala.inline
      def setAgentPort(value: Double): Self = StObject.set(x, "agentPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentPortUndefined: Self = StObject.set(x, "agentPort", js.undefined)
      
      @scala.inline
      def setAppCertName(value: String): Self = StObject.set(x, "appCertName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppCertNameUndefined: Self = StObject.set(x, "appCertName", js.undefined)
      
      @scala.inline
      def setAppCertPassword(value: String): Self = StObject.set(x, "appCertPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppCertPasswordUndefined: Self = StObject.set(x, "appCertPassword", js.undefined)
      
      @scala.inline
      def setAppCertPath(value: String): Self = StObject.set(x, "appCertPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppCertPathUndefined: Self = StObject.set(x, "appCertPath", js.undefined)
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAppPrivateKeyName(value: String): Self = StObject.set(x, "appPrivateKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppPrivateKeyNameUndefined: Self = StObject.set(x, "appPrivateKeyName", js.undefined)
      
      @scala.inline
      def setAppPrivateKeyPath(value: String): Self = StObject.set(x, "appPrivateKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppPrivateKeyPathUndefined: Self = StObject.set(x, "appPrivateKeyPath", js.undefined)
      
      @scala.inline
      def setBotCertName(value: String): Self = StObject.set(x, "botCertName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotCertNameUndefined: Self = StObject.set(x, "botCertName", js.undefined)
      
      @scala.inline
      def setBotCertPassword(value: String): Self = StObject.set(x, "botCertPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotCertPasswordUndefined: Self = StObject.set(x, "botCertPassword", js.undefined)
      
      @scala.inline
      def setBotCertPath(value: String): Self = StObject.set(x, "botCertPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotCertPathUndefined: Self = StObject.set(x, "botCertPath", js.undefined)
      
      @scala.inline
      def setBotEmailAddress(value: String): Self = StObject.set(x, "botEmailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotEmailAddressUndefined: Self = StObject.set(x, "botEmailAddress", js.undefined)
      
      @scala.inline
      def setBotPrivateKeyName(value: String): Self = StObject.set(x, "botPrivateKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotPrivateKeyNameUndefined: Self = StObject.set(x, "botPrivateKeyName", js.undefined)
      
      @scala.inline
      def setBotPrivateKeyPath(value: String): Self = StObject.set(x, "botPrivateKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotPrivateKeyPathUndefined: Self = StObject.set(x, "botPrivateKeyPath", js.undefined)
      
      @scala.inline
      def setBotUsername(value: String): Self = StObject.set(x, "botUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotUsernameUndefined: Self = StObject.set(x, "botUsername", js.undefined)
      
      @scala.inline
      def setKeyAuthContextPath(value: String): Self = StObject.set(x, "keyAuthContextPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAuthContextPathUndefined: Self = StObject.set(x, "keyAuthContextPath", js.undefined)
      
      @scala.inline
      def setKeyAuthHost(value: String): Self = StObject.set(x, "keyAuthHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAuthHostUndefined: Self = StObject.set(x, "keyAuthHost", js.undefined)
      
      @scala.inline
      def setKeyAuthPort(value: Double): Self = StObject.set(x, "keyAuthPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAuthPortUndefined: Self = StObject.set(x, "keyAuthPort", js.undefined)
      
      @scala.inline
      def setKeyManagerProxyPassword(value: String): Self = StObject.set(x, "keyManagerProxyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManagerProxyPasswordUndefined: Self = StObject.set(x, "keyManagerProxyPassword", js.undefined)
      
      @scala.inline
      def setKeyManagerProxyURL(value: String): Self = StObject.set(x, "keyManagerProxyURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManagerProxyURLUndefined: Self = StObject.set(x, "keyManagerProxyURL", js.undefined)
      
      @scala.inline
      def setKeyManagerProxyUsername(value: String): Self = StObject.set(x, "keyManagerProxyUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyManagerProxyUsernameUndefined: Self = StObject.set(x, "keyManagerProxyUsername", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setMaxWaitInterval(value: Double): Self = StObject.set(x, "maxWaitInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitIntervalUndefined: Self = StObject.set(x, "maxWaitInterval", js.undefined)
      
      @scala.inline
      def setNodeTlsRejectUnauthorized(value: Double): Self = StObject.set(x, "nodeTlsRejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTlsRejectUnauthorizedUndefined: Self = StObject.set(x, "nodeTlsRejectUnauthorized", js.undefined)
      
      @scala.inline
      def setPodContextPath(value: String): Self = StObject.set(x, "podContextPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodContextPathUndefined: Self = StObject.set(x, "podContextPath", js.undefined)
      
      @scala.inline
      def setPodHost(value: String): Self = StObject.set(x, "podHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodHostUndefined: Self = StObject.set(x, "podHost", js.undefined)
      
      @scala.inline
      def setPodPort(value: Double): Self = StObject.set(x, "podPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodPortUndefined: Self = StObject.set(x, "podPort", js.undefined)
      
      @scala.inline
      def setPodProxyPassword(value: String): Self = StObject.set(x, "podProxyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodProxyPasswordUndefined: Self = StObject.set(x, "podProxyPassword", js.undefined)
      
      @scala.inline
      def setPodProxyURL(value: String): Self = StObject.set(x, "podProxyURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodProxyURLUndefined: Self = StObject.set(x, "podProxyURL", js.undefined)
      
      @scala.inline
      def setPodProxyUsername(value: String): Self = StObject.set(x, "podProxyUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPodProxyUsernameUndefined: Self = StObject.set(x, "podProxyUsername", js.undefined)
      
      @scala.inline
      def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      @scala.inline
      def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
      
      @scala.inline
      def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
      
      @scala.inline
      def setSessionAuthContextPath(value: String): Self = StObject.set(x, "sessionAuthContextPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAuthContextPathUndefined: Self = StObject.set(x, "sessionAuthContextPath", js.undefined)
      
      @scala.inline
      def setSessionAuthHost(value: String): Self = StObject.set(x, "sessionAuthHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAuthHostUndefined: Self = StObject.set(x, "sessionAuthHost", js.undefined)
      
      @scala.inline
      def setSessionAuthPort(value: Double): Self = StObject.set(x, "sessionAuthPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionAuthPortUndefined: Self = StObject.set(x, "sessionAuthPort", js.undefined)
    }
  }
}
