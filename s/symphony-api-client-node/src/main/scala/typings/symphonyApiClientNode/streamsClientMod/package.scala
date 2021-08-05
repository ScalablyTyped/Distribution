package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def activateRoom(streamId: java.lang.String): js.Promise[typings.symphonyApiClientNode.streamsClientMod.ActivateRoomResponse] = typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("activateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.ActivateRoomResponse]]

inline def addMemberToRoom(streamId: java.lang.String, userId: scala.Double): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("addMemberToRoom")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult]]

inline def createRoom(
  room: java.lang.String,
  description: js.UndefOr[java.lang.String],
  keywords: js.UndefOr[js.Array[typings.symphonyApiClientNode.streamsClientMod.Keyword]],
  membersCanInvite: js.UndefOr[scala.Boolean],
  discoverable: js.UndefOr[scala.Boolean],
  anyoneCanJoin: js.UndefOr[scala.Boolean],
  readOnly: js.UndefOr[scala.Boolean],
  copyProtected: js.UndefOr[scala.Boolean],
  crossPod: js.UndefOr[scala.Boolean],
  viewHistory: js.UndefOr[scala.Boolean]
): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("createRoom")(room.asInstanceOf[js.Any], description.asInstanceOf[js.Any], keywords.asInstanceOf[js.Any], membersCanInvite.asInstanceOf[js.Any], discoverable.asInstanceOf[js.Any], anyoneCanJoin.asInstanceOf[js.Any], readOnly.asInstanceOf[js.Any], copyProtected.asInstanceOf[js.Any], crossPod.asInstanceOf[js.Any], viewHistory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo]]

inline def deactivateRoom(streamId: java.lang.String): js.Promise[typings.symphonyApiClientNode.streamsClientMod.ActivateRoomResponse] = typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("deactivateRoom")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.ActivateRoomResponse]]

inline def demoteUserFromOwner(streamId: java.lang.String, userId: scala.Double): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("demoteUserFromOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult]]

inline def getRoomInfo(streamId: java.lang.String): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo] = typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRoomInfo")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo]]

inline def getRoomMembers(streamId: java.lang.String): js.Promise[js.Array[typings.symphonyApiClientNode.streamsClientMod.RoomMember]] = typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("getRoomMembers")(streamId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.symphonyApiClientNode.streamsClientMod.RoomMember]]]

inline def getUserIMStreamId(userIDs: js.Array[scala.Double]): js.Promise[typings.symphonyApiClientNode.streamsClientMod.UserId] = typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUserIMStreamId")(userIDs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.UserId]]

inline def getUserStreams(
  skip: scala.Double,
  limit: scala.Double,
  streamTypes: js.Array[typings.symphonyApiClientNode.streamsClientMod.StreamType],
  includeInactiveStreams: scala.Boolean
): js.Promise[typings.symphonyApiClientNode.streamsClientMod.UserStream] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("getUserStreams")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], streamTypes.asInstanceOf[js.Any], includeInactiveStreams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.UserStream]]

inline def promoteUserToOwner(streamId: java.lang.String, userId: scala.Double): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("promoteUserToOwner")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult]]

inline def removeMemberFromRoom(streamId: java.lang.String, userId: scala.Double): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("removeMemberFromRoom")(streamId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomMemberOperationResult]]

inline def searchRooms(
  skip: js.UndefOr[scala.Double],
  limit: js.UndefOr[scala.Double],
  query: js.UndefOr[java.lang.String],
  labels: js.UndefOr[js.Array[java.lang.String]],
  active: js.UndefOr[scala.Boolean],
  includePrivateRooms: js.UndefOr[scala.Boolean],
  creator: js.UndefOr[typings.symphonyApiClientNode.streamsClientMod.UserId],
  owner: js.UndefOr[typings.symphonyApiClientNode.streamsClientMod.UserId],
  member: js.UndefOr[typings.symphonyApiClientNode.streamsClientMod.UserId],
  sortOrder: js.UndefOr[
  typings.symphonyApiClientNode.symphonyApiClientNodeStrings.BASIC | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.RELEVANCE
]
): js.Promise[typings.symphonyApiClientNode.streamsClientMod.SearchRoomResponse] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("searchRooms")(skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], query.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], active.asInstanceOf[js.Any], includePrivateRooms.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], member.asInstanceOf[js.Any], sortOrder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.SearchRoomResponse]]

inline def updateRoom(
  streamId: java.lang.String,
  room: java.lang.String,
  description: js.UndefOr[java.lang.String],
  keywords: js.UndefOr[js.Array[typings.symphonyApiClientNode.streamsClientMod.Keyword]],
  membersCanInvite: js.UndefOr[scala.Boolean],
  discoverable: js.UndefOr[scala.Boolean],
  anyoneCanJoin: js.UndefOr[scala.Boolean],
  readOnly: js.UndefOr[scala.Boolean],
  copyProtected: js.UndefOr[scala.Boolean],
  crossPod: js.UndefOr[scala.Boolean],
  viewHistory: js.UndefOr[scala.Boolean]
): js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo] = (typings.symphonyApiClientNode.streamsClientMod.^.asInstanceOf[js.Dynamic].applyDynamic("updateRoom")(streamId.asInstanceOf[js.Any], room.asInstanceOf[js.Any], description.asInstanceOf[js.Any], keywords.asInstanceOf[js.Any], membersCanInvite.asInstanceOf[js.Any], discoverable.asInstanceOf[js.Any], anyoneCanJoin.asInstanceOf[js.Any], readOnly.asInstanceOf[js.Any], copyProtected.asInstanceOf[js.Any], crossPod.asInstanceOf[js.Any], viewHistory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.symphonyApiClientNode.streamsClientMod.RoomInfo]]
