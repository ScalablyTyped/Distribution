package typings.symphonyApiClientNode.streamsClientMod

import typings.symphonyApiClientNode.streamsClientMod.^
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.BASIC
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.RELEVANCE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def activateRoom(streamId: String): js.Promise[ActivateRoomResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("activateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ActivateRoomResponse]]

inline def addMemberToRoom(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMemberToRoom")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]

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

inline def deactivateRoom(streamId: String): js.Promise[ActivateRoomResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ActivateRoomResponse]]

inline def demoteUserFromOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("demoteUserFromOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]

inline def getRoomInfo(streamId: String): js.Promise[RoomInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoomInfo")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RoomInfo]]

inline def getRoomMembers(streamId: String): js.Promise[js.Array[RoomMember]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoomMembers")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RoomMember]]]

inline def getUserIMStreamId(userIDs: js.Array[Double]): js.Promise[UserId] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserIMStreamId")(userIDs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserId]]

inline def getUserStreams(skip: Double, limit: Double, streamTypes: js.Array[StreamType], includeInactiveStreams: Boolean): js.Promise[UserStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserStreams")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], streamTypes.asInstanceOf[js.Any], includeInactiveStreams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserStream]]

inline def promoteUserToOwner(streamId: String, userId: Double): js.Promise[RoomMemberOperationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("promoteUserToOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RoomMemberOperationResult]]

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
