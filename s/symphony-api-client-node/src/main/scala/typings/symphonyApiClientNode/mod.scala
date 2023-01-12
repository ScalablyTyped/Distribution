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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("symphony-api-client-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def acceptConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  inline def activateRoom(streamId: String): js.Promise[ActivateRoomResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("activateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ActivateRoomResponse]]
  
  inline def addMemberToRoom(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMemberToRoom")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]
  
  inline def adminListEnterpriseStreamsV2(
    streamTypes: js.Array[StreamType],
    scope: String,
    origin: String,
    privacy: String,
    status: String,
    startDate: Double,
    endDate: Double,
    skip: Double,
    limit: Double
  ): js.Promise[AdminStreamListResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("adminListEnterpriseStreamsV2")(streamTypes.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], privacy.asInstanceOf[js.Any], status.asInstanceOf[js.Any], startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AdminStreamListResponse]]
  
  inline def authenticateBot(SymConfig: SymphonyConfiguration): js.Promise[AuthInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateBot")(SymConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AuthInfo]]
  
  inline def authenticateExtApp(): js.Promise[AppInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateExtApp")().asInstanceOf[js.Promise[AppInfo]]
  
  inline def authenticateOboApp(): js.Promise[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateOboApp")().asInstanceOf[js.Promise[Token]]
  
  inline def createRoom(
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
  ): js.Promise[RoomInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoom")(room.asInstanceOf[js.Any], description.asInstanceOf[js.Any], keywords.asInstanceOf[js.Any], membersCanInvite.asInstanceOf[js.Any], discoverable.asInstanceOf[js.Any], anyoneCanJoin.asInstanceOf[js.Any], readOnly.asInstanceOf[js.Any], copyProtected.asInstanceOf[js.Any], crossPod.asInstanceOf[js.Any], viewHistory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomInfo]]
  
  inline def createSignal(name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean, sessionToken: String): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSignal")(name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  
  inline def deactivateRoom(streamId: String): js.Promise[ActivateRoomResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ActivateRoomResponse]]
  
  inline def deleteSignal(id: String, sessionToken: String): js.Promise[DeleteOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSignal")(id.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteOperationResult]]
  
  inline def demoteUserFromOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("demoteUserFromOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]
  
  inline def formBuilder(formId: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formBuilder")(formId.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def forwardMessage(conversationId: String, message: String, data: Any): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardMessage")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  inline def getAcceptedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptedConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getAllConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getAttachment(streamId: String, attachmentId: String, messageId: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttachment")(streamId.asInstanceOf[js.Any], attachmentId.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getBotUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBotUser")().asInstanceOf[Unit]
  
  inline def getCashtags(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCashtags")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getConnectionRequestStatus(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionRequestStatus")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  inline def getConnections(status: String, commaSeparatedUserIds: String, sessionToken: String): js.Promise[js.Array[Connection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnections")(status.asInstanceOf[js.Any], commaSeparatedUserIds.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getDatafeedEventsService(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatafeedEventsService")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFirehoseEventsService(subscriberCallback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirehoseEventsService")(subscriberCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getHashtags(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashtags")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getInboundPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInboundPendingConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getMentions(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getMessage(messageId: String): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
  
  inline def getMessages(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")(streamId.asInstanceOf[js.Any], since.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Message]]]
  
  inline def getPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getRejectedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRejectedConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def getRoomInfo(streamId: String): js.Promise[RoomInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoomInfo")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RoomInfo]]
  
  inline def getRoomMembers(streamId: String): js.Promise[js.Array[RoomMember]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoomMembers")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RoomMember]]]
  
  inline def getSignal(id: String, sessionToken: String): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignal")(id.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  
  inline def getSignalSubscribers(id: String, skip: Double, limit: Double, sessionToken: String): js.Promise[SignalSubscribersResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignalSubscribers")(id.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignalSubscribersResponse]]
  
  inline def getUser(id: String): js.Promise[AdminUserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdminUserInfo]]
  
  inline def getUserFromEmail(email: String): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
  inline def getUserFromEmail(email: String, local: Boolean): js.Promise[User] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromEmail")(email.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[User]]
  
  inline def getUserFromUsername(username: String): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserFromUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
  
  inline def getUserIMStreamId(userIDs: js.Array[Double]): js.Promise[UserId] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserIMStreamId")(userIDs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserId]]
  
  inline def getUserPresence(userId: Double, local: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserPresence")(userId.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getUserStreams(skip: Double, limit: Double, streamTypes: js.Array[StreamType], includeInactiveStreams: Boolean): js.Promise[UserStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserStreams")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], streamTypes.asInstanceOf[js.Any], includeInactiveStreams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserStream]]
  
  inline def getUsersFromEmailList(commaSeparatedEmails: String): js.Promise[UsersList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromEmailList")(commaSeparatedEmails.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UsersList]]
  inline def getUsersFromEmailList(commaSeparatedEmails: String, local: Boolean): js.Promise[UsersList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromEmailList")(commaSeparatedEmails.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UsersList]]
  
  inline def getUsersFromIdList(commaSeparatedIds: String): js.Promise[UsersList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromIdList")(commaSeparatedIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UsersList]]
  inline def getUsersFromIdList(commaSeparatedIds: String, local: Boolean): js.Promise[UsersList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUsersFromIdList")(commaSeparatedIds.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UsersList]]
  
  inline def importMessages(messageList: js.Array[ImportMessage]): js.Promise[js.Array[ImportMessageResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("importMessages")(messageList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ImportMessageResult]]]
  
  inline def initBot(pathToConfigFile: String): js.Promise[AuthInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("initBot")(pathToConfigFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AuthInfo]]
  inline def initBot(pathToConfigFile: String, pathToLoadBalancerConfigFile: String): js.Promise[AuthInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("initBot")(pathToConfigFile.asInstanceOf[js.Any], pathToLoadBalancerConfigFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AuthInfo]]
  
  inline def listSignals(skip: Double, limit: Double, sessionToken: String): js.Promise[js.Array[Signal]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listSignals")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Signal]]]
  
  inline def listUsers(skip: Double, limit: Double): js.Promise[js.Array[AdminUserInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listUsers")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AdminUserInfo]]]
  
  inline def oboAuthenticateByUserId(userId: Double): js.Promise[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboAuthenticateByUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Token]]
  
  inline def oboGetAllConnections(status: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboGetAllConnections")(status.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  inline def oboGetConnection(userId: String): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboGetConnection")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
  
  inline def oboGetUserIMStreamId(userToken: String, userIds: js.Array[Double]): js.Promise[UserId] = (^.asInstanceOf[js.Dynamic].applyDynamic("oboGetUserIMStreamId")(userToken.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserId]]
  
  inline def oboSendMessage(userToken: String, conversationId: String, message: String, data: Any, format: String): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("oboSendMessage")(userToken.asInstanceOf[js.Any], conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  inline def promoteUserToOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("promoteUserToOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]
  
  inline def registerInterestExtUser(userIds: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInterestExtUser")(userIds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rejectConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  inline def removeConnection(userId: String, sessionToken: String): js.Promise[RemoveConnectionReponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeConnection")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RemoveConnectionReponse]]
  
  inline def removeMemberFromRoom(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMemberFromRoom")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]
  
  inline def searchRooms(
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
  ): js.Promise[SearchRoomResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchRooms")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], query.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], active.asInstanceOf[js.Any], includePrivateRooms.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], member.asInstanceOf[js.Any], sortOrder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchRoomResponse]]
  
  inline def searchUsers(query: String): js.Promise[SearchUserResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Double, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Boolean, skip: Unit, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Double, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Double): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  inline def searchUsers(query: String, local: Unit, skip: Unit, limit: Unit, filter: UserFilter): js.Promise[SearchUserResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchUsers")(query.asInstanceOf[js.Any], local.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchUserResponse]]
  
  inline def sendConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  inline def sendMessage(conversationId: String, message: String, data: Any, format: String, sessionToken: String): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  inline def sendMessageWithAttachment(
    conversationId: String,
    message: String,
    data: Any,
    fileName: String,
    fileType: String,
    fileContent: Any,
    format: String
  ): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageWithAttachment")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileContent.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  @JSImport("symphony-api-client-node", "sessionToken")
  @js.native
  val sessionToken: String = js.native
  
  inline def setDebugMode(mode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPresence(status: String): js.Promise[UserPresenceResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPresence")(status.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserPresenceResponse]]
  
  inline def stopDatafeedEventsService(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDatafeedEventsService")().asInstanceOf[Unit]
  
  inline def stopFirehoseEventsService(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopFirehoseEventsService")().asInstanceOf[Unit]
  
  inline def streamMembers(id: String, skip: Double, limit: Double): js.Promise[StreamMembers_] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamMembers")(id.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamMembers_]]
  
  inline def subscribeSignal(id: String, userIds: js.Array[Double], userCanUnsubscribe: Boolean, sessionToken: String): js.Promise[SignalSubscriptionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeSignal")(id.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], userCanUnsubscribe.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignalSubscriptionResult]]
  
  inline def suppressMessage(id: String): js.Promise[SuppressedMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressMessage")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SuppressedMessage]]
  
  inline def unsubscribeSignal(id: String, userIds: js.Array[Double], sessionToken: String): js.Promise[SignalSubscriptionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribeSignal")(id.asInstanceOf[js.Any], userIds.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignalSubscriptionResult]]
  
  inline def updateRoom(
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
  ): js.Promise[RoomInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRoom")(streamId.asInstanceOf[js.Any], room.asInstanceOf[js.Any], description.asInstanceOf[js.Any], keywords.asInstanceOf[js.Any], membersCanInvite.asInstanceOf[js.Any], discoverable.asInstanceOf[js.Any], anyoneCanJoin.asInstanceOf[js.Any], readOnly.asInstanceOf[js.Any], copyProtected.asInstanceOf[js.Any], crossPod.asInstanceOf[js.Any], viewHistory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomInfo]]
  
  inline def updateSignal(id: String): js.Promise[Signal] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: String): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: String, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: String, visibleOnProfile: Unit, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Unit,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: String,
    visibleOnProfile: Unit,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: Unit, visibleOnProfile: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: Unit, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: Unit,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: Unit,
    visibleOnProfile: Boolean,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: String, query: Unit, visibleOnProfile: Unit, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: Unit,
    visibleOnProfile: Unit,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: String,
    query: Unit,
    visibleOnProfile: Unit,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: String): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: String, visibleOnProfile: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: String, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: String,
    visibleOnProfile: Boolean,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: String, visibleOnProfile: Unit, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: String,
    visibleOnProfile: Unit,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: String,
    visibleOnProfile: Unit,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: Unit, visibleOnProfile: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: Unit, visibleOnProfile: Boolean, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: Unit,
    visibleOnProfile: Boolean,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: Unit,
    visibleOnProfile: Boolean,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(id: String, name: Unit, query: Unit, visibleOnProfile: Unit, companyWide: Boolean): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: Unit,
    visibleOnProfile: Unit,
    companyWide: Boolean,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  inline def updateSignal(
    id: String,
    name: Unit,
    query: Unit,
    visibleOnProfile: Unit,
    companyWide: Unit,
    sessionToken: String
  ): js.Promise[Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSignal")(id.asInstanceOf[js.Any], name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], visibleOnProfile.asInstanceOf[js.Any], companyWide.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Signal]]
  
  inline def verifyJwt(jwt: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait AppInfo extends StObject {
    
    var appId: String
    
    var appToken: String
  }
  object AppInfo {
    
    inline def apply(appId: String, appToken: String): AppInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appToken = appToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppInfo] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppToken(value: String): Self = StObject.set(x, "appToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthInfo extends StObject {
    
    var kmAuthToken: String
    
    var sessionAuthToken: String
  }
  object AuthInfo {
    
    inline def apply(kmAuthToken: String, sessionAuthToken: String): AuthInfo = {
      val __obj = js.Dynamic.literal(kmAuthToken = kmAuthToken.asInstanceOf[js.Any], sessionAuthToken = sessionAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthInfo] (val x: Self) extends AnyVal {
      
      inline def setKmAuthToken(value: String): Self = StObject.set(x, "kmAuthToken", value.asInstanceOf[js.Any])
      
      inline def setSessionAuthToken(value: String): Self = StObject.set(x, "sessionAuthToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymphonyConfiguration extends StObject {
    
    var agentContextPath: js.UndefOr[String] = js.undefined
    
    var agentHost: js.UndefOr[String] = js.undefined
    
    var agentPort: js.UndefOr[Double] = js.undefined
    
    var appCertName: js.UndefOr[String] = js.undefined
    
    var appCertPassword: js.UndefOr[String] = js.undefined
    
    var appCertPath: js.UndefOr[String] = js.undefined
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appPrivateKeyName: js.UndefOr[String] = js.undefined
    
    var appPrivateKeyPath: js.UndefOr[String] = js.undefined
    
    var botCertName: js.UndefOr[String] = js.undefined
    
    var botCertPassword: js.UndefOr[String] = js.undefined
    
    var botCertPath: js.UndefOr[String] = js.undefined
    
    var botEmailAddress: js.UndefOr[String] = js.undefined
    
    var botPrivateKeyName: js.UndefOr[String] = js.undefined
    
    var botPrivateKeyPath: js.UndefOr[String] = js.undefined
    
    var botUsername: js.UndefOr[String] = js.undefined
    
    var keyAuthContextPath: js.UndefOr[String] = js.undefined
    
    var keyAuthHost: js.UndefOr[String] = js.undefined
    
    var keyAuthPort: js.UndefOr[Double] = js.undefined
    
    var keyManagerProxyPassword: js.UndefOr[String] = js.undefined
    
    var keyManagerProxyURL: js.UndefOr[String] = js.undefined
    
    var keyManagerProxyUsername: js.UndefOr[String] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var maxWaitInterval: js.UndefOr[Double] = js.undefined
    
    var nodeTlsRejectUnauthorized: js.UndefOr[Double] = js.undefined
    
    var podContextPath: js.UndefOr[String] = js.undefined
    
    var podHost: js.UndefOr[String] = js.undefined
    
    var podPort: js.UndefOr[Double] = js.undefined
    
    var podProxyPassword: js.UndefOr[String] = js.undefined
    
    var podProxyURL: js.UndefOr[String] = js.undefined
    
    var podProxyUsername: js.UndefOr[String] = js.undefined
    
    var proxyPassword: js.UndefOr[String] = js.undefined
    
    var proxyURL: js.UndefOr[String] = js.undefined
    
    var proxyUsername: js.UndefOr[String] = js.undefined
    
    var sessionAuthContextPath: js.UndefOr[String] = js.undefined
    
    var sessionAuthHost: js.UndefOr[String] = js.undefined
    
    var sessionAuthPort: js.UndefOr[Double] = js.undefined
  }
  object SymphonyConfiguration {
    
    inline def apply(): SymphonyConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymphonyConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymphonyConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAgentContextPath(value: String): Self = StObject.set(x, "agentContextPath", value.asInstanceOf[js.Any])
      
      inline def setAgentContextPathUndefined: Self = StObject.set(x, "agentContextPath", js.undefined)
      
      inline def setAgentHost(value: String): Self = StObject.set(x, "agentHost", value.asInstanceOf[js.Any])
      
      inline def setAgentHostUndefined: Self = StObject.set(x, "agentHost", js.undefined)
      
      inline def setAgentPort(value: Double): Self = StObject.set(x, "agentPort", value.asInstanceOf[js.Any])
      
      inline def setAgentPortUndefined: Self = StObject.set(x, "agentPort", js.undefined)
      
      inline def setAppCertName(value: String): Self = StObject.set(x, "appCertName", value.asInstanceOf[js.Any])
      
      inline def setAppCertNameUndefined: Self = StObject.set(x, "appCertName", js.undefined)
      
      inline def setAppCertPassword(value: String): Self = StObject.set(x, "appCertPassword", value.asInstanceOf[js.Any])
      
      inline def setAppCertPasswordUndefined: Self = StObject.set(x, "appCertPassword", js.undefined)
      
      inline def setAppCertPath(value: String): Self = StObject.set(x, "appCertPath", value.asInstanceOf[js.Any])
      
      inline def setAppCertPathUndefined: Self = StObject.set(x, "appCertPath", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAppPrivateKeyName(value: String): Self = StObject.set(x, "appPrivateKeyName", value.asInstanceOf[js.Any])
      
      inline def setAppPrivateKeyNameUndefined: Self = StObject.set(x, "appPrivateKeyName", js.undefined)
      
      inline def setAppPrivateKeyPath(value: String): Self = StObject.set(x, "appPrivateKeyPath", value.asInstanceOf[js.Any])
      
      inline def setAppPrivateKeyPathUndefined: Self = StObject.set(x, "appPrivateKeyPath", js.undefined)
      
      inline def setBotCertName(value: String): Self = StObject.set(x, "botCertName", value.asInstanceOf[js.Any])
      
      inline def setBotCertNameUndefined: Self = StObject.set(x, "botCertName", js.undefined)
      
      inline def setBotCertPassword(value: String): Self = StObject.set(x, "botCertPassword", value.asInstanceOf[js.Any])
      
      inline def setBotCertPasswordUndefined: Self = StObject.set(x, "botCertPassword", js.undefined)
      
      inline def setBotCertPath(value: String): Self = StObject.set(x, "botCertPath", value.asInstanceOf[js.Any])
      
      inline def setBotCertPathUndefined: Self = StObject.set(x, "botCertPath", js.undefined)
      
      inline def setBotEmailAddress(value: String): Self = StObject.set(x, "botEmailAddress", value.asInstanceOf[js.Any])
      
      inline def setBotEmailAddressUndefined: Self = StObject.set(x, "botEmailAddress", js.undefined)
      
      inline def setBotPrivateKeyName(value: String): Self = StObject.set(x, "botPrivateKeyName", value.asInstanceOf[js.Any])
      
      inline def setBotPrivateKeyNameUndefined: Self = StObject.set(x, "botPrivateKeyName", js.undefined)
      
      inline def setBotPrivateKeyPath(value: String): Self = StObject.set(x, "botPrivateKeyPath", value.asInstanceOf[js.Any])
      
      inline def setBotPrivateKeyPathUndefined: Self = StObject.set(x, "botPrivateKeyPath", js.undefined)
      
      inline def setBotUsername(value: String): Self = StObject.set(x, "botUsername", value.asInstanceOf[js.Any])
      
      inline def setBotUsernameUndefined: Self = StObject.set(x, "botUsername", js.undefined)
      
      inline def setKeyAuthContextPath(value: String): Self = StObject.set(x, "keyAuthContextPath", value.asInstanceOf[js.Any])
      
      inline def setKeyAuthContextPathUndefined: Self = StObject.set(x, "keyAuthContextPath", js.undefined)
      
      inline def setKeyAuthHost(value: String): Self = StObject.set(x, "keyAuthHost", value.asInstanceOf[js.Any])
      
      inline def setKeyAuthHostUndefined: Self = StObject.set(x, "keyAuthHost", js.undefined)
      
      inline def setKeyAuthPort(value: Double): Self = StObject.set(x, "keyAuthPort", value.asInstanceOf[js.Any])
      
      inline def setKeyAuthPortUndefined: Self = StObject.set(x, "keyAuthPort", js.undefined)
      
      inline def setKeyManagerProxyPassword(value: String): Self = StObject.set(x, "keyManagerProxyPassword", value.asInstanceOf[js.Any])
      
      inline def setKeyManagerProxyPasswordUndefined: Self = StObject.set(x, "keyManagerProxyPassword", js.undefined)
      
      inline def setKeyManagerProxyURL(value: String): Self = StObject.set(x, "keyManagerProxyURL", value.asInstanceOf[js.Any])
      
      inline def setKeyManagerProxyURLUndefined: Self = StObject.set(x, "keyManagerProxyURL", js.undefined)
      
      inline def setKeyManagerProxyUsername(value: String): Self = StObject.set(x, "keyManagerProxyUsername", value.asInstanceOf[js.Any])
      
      inline def setKeyManagerProxyUsernameUndefined: Self = StObject.set(x, "keyManagerProxyUsername", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxWaitInterval(value: Double): Self = StObject.set(x, "maxWaitInterval", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitIntervalUndefined: Self = StObject.set(x, "maxWaitInterval", js.undefined)
      
      inline def setNodeTlsRejectUnauthorized(value: Double): Self = StObject.set(x, "nodeTlsRejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setNodeTlsRejectUnauthorizedUndefined: Self = StObject.set(x, "nodeTlsRejectUnauthorized", js.undefined)
      
      inline def setPodContextPath(value: String): Self = StObject.set(x, "podContextPath", value.asInstanceOf[js.Any])
      
      inline def setPodContextPathUndefined: Self = StObject.set(x, "podContextPath", js.undefined)
      
      inline def setPodHost(value: String): Self = StObject.set(x, "podHost", value.asInstanceOf[js.Any])
      
      inline def setPodHostUndefined: Self = StObject.set(x, "podHost", js.undefined)
      
      inline def setPodPort(value: Double): Self = StObject.set(x, "podPort", value.asInstanceOf[js.Any])
      
      inline def setPodPortUndefined: Self = StObject.set(x, "podPort", js.undefined)
      
      inline def setPodProxyPassword(value: String): Self = StObject.set(x, "podProxyPassword", value.asInstanceOf[js.Any])
      
      inline def setPodProxyPasswordUndefined: Self = StObject.set(x, "podProxyPassword", js.undefined)
      
      inline def setPodProxyURL(value: String): Self = StObject.set(x, "podProxyURL", value.asInstanceOf[js.Any])
      
      inline def setPodProxyURLUndefined: Self = StObject.set(x, "podProxyURL", js.undefined)
      
      inline def setPodProxyUsername(value: String): Self = StObject.set(x, "podProxyUsername", value.asInstanceOf[js.Any])
      
      inline def setPodProxyUsernameUndefined: Self = StObject.set(x, "podProxyUsername", js.undefined)
      
      inline def setProxyPassword(value: String): Self = StObject.set(x, "proxyPassword", value.asInstanceOf[js.Any])
      
      inline def setProxyPasswordUndefined: Self = StObject.set(x, "proxyPassword", js.undefined)
      
      inline def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
      
      inline def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
      
      inline def setProxyUsername(value: String): Self = StObject.set(x, "proxyUsername", value.asInstanceOf[js.Any])
      
      inline def setProxyUsernameUndefined: Self = StObject.set(x, "proxyUsername", js.undefined)
      
      inline def setSessionAuthContextPath(value: String): Self = StObject.set(x, "sessionAuthContextPath", value.asInstanceOf[js.Any])
      
      inline def setSessionAuthContextPathUndefined: Self = StObject.set(x, "sessionAuthContextPath", js.undefined)
      
      inline def setSessionAuthHost(value: String): Self = StObject.set(x, "sessionAuthHost", value.asInstanceOf[js.Any])
      
      inline def setSessionAuthHostUndefined: Self = StObject.set(x, "sessionAuthHost", js.undefined)
      
      inline def setSessionAuthPort(value: Double): Self = StObject.set(x, "sessionAuthPort", value.asInstanceOf[js.Any])
      
      inline def setSessionAuthPortUndefined: Self = StObject.set(x, "sessionAuthPort", js.undefined)
    }
  }
}
