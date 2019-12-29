package typings.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatHistoryReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomBanList
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomCreated
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomError
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomHistoryReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInfo
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInvitation
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInviteDeclined
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomMessageModified
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomMessageNotModified
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomMessageReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomMessageRemoved
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomNewParticipant
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomOperation
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomParticipantExit
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomParticipants
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomPresenceUpdate
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomStateUpdate
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomSubjectChange
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomsDataReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatStateUpdate
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.MessageModified
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.MessageNotModified
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.MessageReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.MessageRemoved
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.MessageStatus
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.PresenceUpdate
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.RosterItemChange
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.RosterPresenceUpdate
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.RosterReceived
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.SubscriptionRequest
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.SystemError
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.UCConnected
  - typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.UCDisconnected
*/
trait VoxImplantIMEvent extends js.Object

object VoxImplantIMEvent {
  @scala.inline
  def ChatRoomParticipants(participants: js.Array[ChatRoomParticipant], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageRemoved(
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageModified(content: String, id: String, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomPresenceUpdate(message: String, participant: ParticipantInfo, presence: UserStatuses, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomStateUpdate(from: String, resource: String, room: String, state: ChatStateType): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomNewParticipant(displayName: String, participant: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInfo(
    features: Double,
    info: typings.voximplantDashWebsdk.voximplantDashWebsdkMod.IMEventTypes.ChatRoomInfo,
    room: String,
    room_name: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], room_name = room_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInviteDeclined(invitee: String, reason: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(invitee = invitee.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomHistoryReceived(message_id: String, messages: js.Array[IMHistoryMessage], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageReceived(content: String, id: String, message_id: String, to: String, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageReceived(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def SystemError(errorData: js.Object, errorType: IMErrorType): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomsDataReceived(rooms: js.Array[ChatRoom]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageNotModified(code: Double, message_id: String, private_message: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomError(code: String, operation: String, room: String, text: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatHistoryReceived(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomParticipantExit(participant: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterPresenceUpdate(id: String, presence: UserStatuses, message: String = null, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomOperation(operation: ChatRoomOperationType, result: Boolean, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def PresenceUpdate(id: String, message: String, presence: UserStatuses, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageNotModified(code: Double, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomInvitation(body: String, from: String, password: String, reason: String, room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterReceived(id: String, roster: js.Array[RosterItem]): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatStateUpdate(id: String, state: ChatStateType, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageStatus(id: String, message_id: String, `type`: MessageEventType, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def RosterItemChange(
    displayName: String,
    groups: js.Array[String],
    id: String,
    `type`: RosterItemEvent,
    resource: String = null
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomMessageModified(
    content: String,
    from: String,
    message_id: String,
    private_message: String,
    resource: String,
    room: String,
    timestamp: String
  ): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomCreated(room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def MessageRemoved(id: String, message_id: String, to: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomBanList(participants: js.Array[ChatRoomParticipant], room: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(participants = participants.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def ChatRoomSubjectChange(id: String, resource: String, room: String, subject: String): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
  @scala.inline
  def SubscriptionRequest(id: String, `type`: SubscriptionRequestType, message: String = null, resource: String = null): VoxImplantIMEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantIMEvent]
  }
}

