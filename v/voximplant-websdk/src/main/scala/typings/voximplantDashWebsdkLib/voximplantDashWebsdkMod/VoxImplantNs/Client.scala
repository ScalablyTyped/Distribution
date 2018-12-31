package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Client class used to control platform functions. Can't be instantiatied directly (singleton), please use VoxImplant.getInstance to get the class instance
	*/
@js.native
trait Client extends js.Object {
  /**
  		*	Register handler for specified event
  		*
  		*	@param eventName Event name
  		*	@param eventHandler Handler function. A single parameter is passed - object with the event information
  		*/
  def addEventListener(
    eventName: Events,
    eventHandler: js.Function1[/* eventObject */ VoxImplantEvent | VoxImplantIMEvent, _]
  ): scala.Unit = js.native
  def addEventListener(
    eventName: IMEvents,
    eventHandler: js.Function1[/* eventObject */ VoxImplantEvent | VoxImplantIMEvent, _]
  ): scala.Unit = js.native
  /**
  		*	Add roster item (IM)
  		*
  		*	@param user_id User id
  		*	@param name Display name
  		*	@param group User group
  		*/
  def addRosterItem(user_id: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def addRosterItem(user_id: java.lang.String, name: java.lang.String, group: java.lang.String): scala.Unit = js.native
  /**
  		*	Add roster item group (IM)
  		*
  		*	@param user_id User id
  		*	@param group Group name
  		*/
  def addRosterItemGroup(user_id: java.lang.String, group: java.lang.String): scala.Unit = js.native
  /**
  		*	Enable microphone/camera if micRequired in VoxImplant.Config was set to false (WebRTC mode only)
  		*
  		*	@param successCallback A function called in case of successful audio recording device change
  		*	@param failedCallback A function called in case of problems while changing audio recording device
  		*/
  def attachRecordingDevice(): scala.Unit = js.native
  def attachRecordingDevice(successCallback: js.Function0[_]): scala.Unit = js.native
  def attachRecordingDevice(successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Get a list of all currently available audio playback devices
  		*/
  def audioOutputs(): js.Array[AudioOutputInfo] = js.native
  /**
  		*	Get a list of all currently available audio sources / microphones
  		*/
  def audioSources(): js.Array[AudioSourceInfo] = js.native
  /**
  		*	Ban user from the chat room
  		*
  		*	@param room Room id
  		*	@param user_id User id
  		*	@param reason Ban reason
  		*/
  def banChatRoomUser(room: java.lang.String, user_id: java.lang.String): scala.Unit = js.native
  def banChatRoomUser(room: java.lang.String, user_id: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  /**
  		*	Create call
  		*
  		*	@param number The number to call
  		*	@param useVideo Tells if video should be supported for the call
  		*	@param customData Custom string associated with the call session. It can be later obtained from Call History using HTTP API
  		*	@param extraHeaders Optional custom parameters (SIP headers) that should be passed with call (INVITE) message. Parameter names must start with "X-" to be processed by application. IMPORTANT: Headers size limit is 200 bytes
  		*/
  def call(number: java.lang.String): Call = js.native
  def call(number: java.lang.String, useVideo: scala.Boolean): Call = js.native
  def call(number: java.lang.String, useVideo: scala.Boolean, customData: java.lang.String): Call = js.native
  def call(
    number: java.lang.String,
    useVideo: scala.Boolean,
    customData: java.lang.String,
    extraHeaders: js.Object
  ): Call = js.native
  /**
  		*	Get current config
  		*/
  def config(): Config = js.native
  /**
  		*	Connect to VoxImplant Cloud
  		*/
  def connect(): scala.Unit = js.native
  /**
  		*	Check if connected to VoxImplant Cloud
  		*/
  def connected(): scala.Boolean = js.native
  /**
  		*	Create multi-user chat room and join it
  		*
  		*	@param pass Password for room access
  		*	@param users User ids of the invited users to the chat room
  		*/
  def createChatRoom(): java.lang.String = js.native
  def createChatRoom(pass: java.lang.String): java.lang.String = js.native
  def createChatRoom(pass: java.lang.String, users: js.Array[java.lang.String]): java.lang.String = js.native
  /**
  		*	Decline invitation to join chat room
  		*
  		*	@param room Room id
  		*	@param user_id User id (inviter)
  		*	@param reason User-supplied decline reason
  		*/
  def declineChatRoomInvite(room: java.lang.String, user_id: java.lang.String): scala.Unit = js.native
  def declineChatRoomInvite(room: java.lang.String, user_id: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  /**
  		*	Disable microphone/camera if micRequired in VoxImplant.Config was set to false (WebRTC mode only)
  		*/
  def detachRecordingDevice(): scala.Unit = js.native
  /**
  		*	Disconnect from VoxImplant Cloud
  		*/
  def disconnect(): scala.Unit = js.native
  /**
  		*	Edit message in the chat room
  		*
  		*	@param room Room id
  		*	@param message_id Message id
  		*	@param msg New message content
  		*/
  def editChatRoomMessage(room: java.lang.String, message_id: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  /**
  		*	Edit message sent to user
  		*
  		*	@param room Room id
  		*	@param message_id Message id
  		*	@param msg New message content
  		*/
  def editInstantMessage(room: java.lang.String, message_id: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  /**
  		*	Get chat room history
  		*
  		*	@param room Room id
  		*	@param message_id Message id (to get messages sent before/after the message)
  		*	@param direction False/true to get messages older/newer than the message with specified id
  		*	@param count Number of messages
  		*/
  def getChatRoomHistory(room: java.lang.String): scala.Unit = js.native
  def getChatRoomHistory(room: java.lang.String, message_id: java.lang.String): scala.Unit = js.native
  def getChatRoomHistory(room: java.lang.String, message_id: java.lang.String, direction: scala.Boolean): scala.Unit = js.native
  def getChatRoomHistory(
    room: java.lang.String,
    message_id: java.lang.String,
    direction: scala.Boolean,
    count: scala.Double
  ): scala.Unit = js.native
  /**
  		*	Get messages in a conversation with particular use
  		*
  		*	@param user_id User id
  		*	@param message_id Message id (to get messages sent before/after the message)
  		*	@param direction False/true to get messages older/newer than the message with specified id
  		*	@param count Number of messages
  		*/
  def getInstantMessagingHistory(user_id: java.lang.String): scala.Unit = js.native
  def getInstantMessagingHistory(user_id: java.lang.String, message_id: java.lang.String): scala.Unit = js.native
  def getInstantMessagingHistory(user_id: java.lang.String, message_id: java.lang.String, direction: scala.Boolean): scala.Unit = js.native
  def getInstantMessagingHistory(
    user_id: java.lang.String,
    message_id: java.lang.String,
    direction: scala.Boolean,
    count: scala.Double
  ): scala.Unit = js.native
  /**
  		*	Initialize SDK. SDKReady event will be dispatched after succesful SDK initialization. SDK can't be used until it's initialized
  		*
  		*	@param config Client configuration options
  		*/
  def init(): scala.Unit = js.native
  def init(config: Config): scala.Unit = js.native
  /**
  		*	Invite user to join chat room
  		*
  		*	@param room Room id
  		*	@param user_id User id (invitee)
  		*	@param reason User-supplied reason for the invitation
  		*/
  def inviteToChatRoom(room: java.lang.String, user_id: java.lang.String): scala.Unit = js.native
  def inviteToChatRoom(room: java.lang.String, user_id: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  /**
  		*	Check if WebRTC support is available
  		*/
  def isRTCsupported(): scala.Boolean = js.native
  /**
  		*	Join multi-user chat room
  		*
  		*	@param room Room id
  		*	@param pass Password for room access
  		*/
  def joinChatRoom(room: java.lang.String): scala.Unit = js.native
  def joinChatRoom(room: java.lang.String, pass: java.lang.String): scala.Unit = js.native
  /**
  		*	Leave multi-user chat room
  		*
  		*	@param room Room id
  		*	@param msg Message for other participants
  		*/
  def leaveChatRoom(room: java.lang.String): scala.Unit = js.native
  def leaveChatRoom(room: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  /**
  		*	Login into application
  		*
  		*	@param username
  		*	@param password
  		*	@param options Login options
  		*/
  def login(username: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def login(username: java.lang.String, password: java.lang.String, options: LoginOptions): scala.Unit = js.native
  /**
  		*	Login into application using 'code' auth method
  		*
  		*	@param username
  		*	@param code
  		*	@param options Login options
  		*/
  def loginWithCode(username: java.lang.String, code: java.lang.String): scala.Unit = js.native
  def loginWithCode(username: java.lang.String, code: java.lang.String, options: LoginOptions): scala.Unit = js.native
  /**
  		*	Login into application using 'onetimekey' auth method
  		*
  		*	@param username
  		*	@param hash
  		*	@param options Login options
  		*/
  def loginWithOneTimeKey(username: java.lang.String, hash: java.lang.String): scala.Unit = js.native
  def loginWithOneTimeKey(username: java.lang.String, hash: java.lang.String, options: LoginOptions): scala.Unit = js.native
  /**
  		*	Move roster item group (IM)
  		*
  		*	@param user_id User id
  		*	@param groupSrc Group name (source)
  		*	@param groupDst Group name (destination)
  		*/
  def moveRosterItemGroup(user_id: java.lang.String, groupSrc: java.lang.String, groupDst: java.lang.String): scala.Unit = js.native
  /**
  		*	Play ToneScript using WebAudio API
  		*
  		*	@param script Tonescript string
  		*	@param loop Loop playback if true
  		*/
  def playToneScript(script: java.lang.String): scala.Unit = js.native
  def playToneScript(script: java.lang.String, loop: scala.Boolean): scala.Unit = js.native
  /**
  		*	Remove roster item group (IM)
  		*
  		*	@param user_id User id
  		*	@param group Group name
  		*/
  def remoteRosterItemGroup(user_id: java.lang.String, group: java.lang.String): scala.Unit = js.native
  /**
  		*	Remove message in the chat room
  		*
  		*	@param room Room id
  		*	@param message_id Message id
  		*/
  def removeChatRoomMessage(room: java.lang.String, message_id: java.lang.String): scala.Unit = js.native
  /**
  		*	Remove user from the chat room
  		*
  		*	@param room Room id
  		*	@param user_id User id
  		*	@param reason Reason
  		*/
  def removeChatRoomUser(room: java.lang.String, user_id: java.lang.String): scala.Unit = js.native
  def removeChatRoomUser(room: java.lang.String, user_id: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  /**
  		*	Remove handler for specified event
  		*
  		*	@param eventName Event name
  		*	@param eventHandler Handler function
  		*/
  def removeEventListener(eventName: Events, eventHandler: js.Function0[_]): scala.Unit = js.native
  def removeEventListener(eventName: IMEvents, eventHandler: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Remove message sent to user
  		*
  		*	@param user_id User id
  		*	@param message_id Message id
  		*/
  def removeInstantMessage(user_id: java.lang.String, message_id: java.lang.String): scala.Unit = js.native
  /**
  		*	Remove roster item (IM)
  		*
  		*	@param user_id User id
  		*/
  def removeRosterItem(user_id: java.lang.String): scala.Unit = js.native
  /**
  		*	Rename roster item (IM)
  		*
  		*	@param user_id User id
  		*	@param name New display name
  		*/
  def renameRosterItem(user_id: java.lang.String, name: java.lang.String): scala.Unit = js.native
  /**
  		*	Request a key for 'onetimekey' auth method. Server will send the key in AuthResult event with code 302
  		*
  		*	@param username
  		*/
  def requestOneTimeLoginKey(username: java.lang.String): scala.Unit = js.native
  /**
  		*	Send message to chat room
  		*
  		*	@param room Room id
  		*	@param msg Message for other participants
  		*/
  def sendChatRoomMessage(room: java.lang.String, msg: java.lang.String): java.lang.String = js.native
  /**
  		*	Send message to user (IM)
  		*
  		*	@param user_id User id
  		*	@param content Message content
  		*/
  def sendInstantMessage(user_id: java.lang.String, content: java.lang.String): java.lang.String = js.native
  /**
  		*	Start/stop sending local video to remote party/parties
  		*
  		*	@param flag Start/stop - true/false
  		*/
  def sendVideo(flag: scala.Boolean): scala.Unit = js.native
  /**
  		*	Set active call
  		*
  		*	@param call VoxImplant call instance
  		*	@param active If true make call active, otherwise make call inactive
  		*/
  def setCallActive(call: Call, active: scala.Boolean): scala.Unit = js.native
  /**
  		*	Set chat room session state info
  		*
  		*	@param room Room id
  		*	@param status Chat session status
  		*/
  def setChatRoomState(room: java.lang.String, status: ChatStateType): scala.Unit = js.native
  /**
  		*	Set new chat room subject
  		*
  		*	@param room Room id
  		*	@param subject New subject
  		*/
  def setChatRoomSubject(room: java.lang.String, subject: java.lang.String): scala.Unit = js.native
  /**
  		*	Set chat session state info
  		*
  		*	@param user_id User id
  		*	@param status Chat session status. See VoxImplant.ChatStateType enum
  		*/
  def setChatState(user_id: java.lang.String, status: ChatStateType): scala.Unit = js.native
  /**
  		*	Set local video position
  		*
  		*	@param x Horizontal position (px)
  		*	@param y Vertical position (px)
  		*/
  def setLocalVideoPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
  		*	Set local video size
  		*
  		*	@param width Width in pixels
  		*	@param height Height in pixels
  		*/
  def setLocalVideoSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
  		*	Set local video size
  		*
  		*	@param user_id User id
  		*	@param type Message event type: VoxImplant.MessageEventType.Delivered or VoxImplant.MessageEventType.Displayed. See VoxImplant.MessageEventType enum
  		*	@param message_id Message id(s)
  		*/
  def setMessageStatus(user_id: java.lang.String, `type`: MessageEventType, message_id: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  		*	Set ACD status
  		*
  		*	@param status Presence status string, see VoxImplant.OperatorACDStatuses
  		*/
  def setOperatorACDStatus(status: OperatorACDStatuses): scala.Unit = js.native
  /**
  		*	Set presence
  		*
  		*	@param status Presence status from VoxImplant.UserStatuses
  		*	@param msg Presence text message
  		*/
  def setPresenceStatus(status: UserStatuses, msg: java.lang.String): scala.Unit = js.native
  /**
  		*	Set background color of flash app (only for Flash mode)
  		*
  		*	@param color Color in web format (i.e. #000000 for black)
  		*/
  def setSwfColor(color: java.lang.String): scala.Unit = js.native
  /**
  		*	Set bandwidth limit for video calls. Currently supported by Chrome/Chromium. The limit will be applied for the next call. (WebRTC mode only)
  		*
  		*	@param bandwidth Bandwidth limit in kilobits per second (kbps)
  		*/
  def setVideoBandwidth(bandwidth: scala.Double): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: js.Function0[_]): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Set video settings globally. This settings will be used for the next call.
  		*
  		*	@param settings Video settings
  		*	@param successCallback Success callback function
  		*	@param failedCallback Failed callback function
  		*/
  def setVideoSettings(settings: VideoSettings): scala.Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[_]): scala.Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Show flash settings panel
  		*
  		*	@param panel Settings type - default/microphone/camera/etc as described in SecurityPanel class
  		*/
  def showFlashSettingsPanel(): scala.Unit = js.native
  def showFlashSettingsPanel(panel: java.lang.String): scala.Unit = js.native
  /**
  		*	Show/hide local video
  		*
  		*	@param flag Show/hide - true/false
  		*/
  def showLocalVideo(flag: scala.Boolean): scala.Unit = js.native
  /**
  		*	Stop playing ToneScript using WebAudio API
  		*/
  def stopPlayback(): scala.Unit = js.native
  /**
  		*	Transfer call, depending on the result VoxImplant.CallEvents.TransferComplete or VoxImplant.CallEvents.TransferFailed event will be dispatched
  		*
  		*	@param call1 Call which will be transferred
  		*	@param call2 Call where call1 will be transferred
  		*/
  def transferCall(call1: Call, call2: Call): scala.Unit = js.native
  /**
  		*	Remove a ban on a user in the chat room
  		*
  		*	@param room Room id
  		*	@param user_id User id
  		*	@param reason Reason
  		*/
  def unbanChatRoomUser(room: java.lang.String, user_id: java.lang.String): scala.Unit = js.native
  def unbanChatRoomUser(room: java.lang.String, user_id: java.lang.String, reason: java.lang.String): scala.Unit = js.native
  def useAudioSource(id: java.lang.String): scala.Unit = js.native
  def useAudioSource(id: java.lang.String, successCallback: js.Function0[_]): scala.Unit = js.native
  def useAudioSource(id: java.lang.String, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Use specified audio source , use audioSources to get the list of available audio sources
  		*
  		*	@param id Id of the audio source
  		*	@param successCallback Called in WebRTC mode if audio source changed successfully
  		*	@param failedCallback Called in WebRTC mode if audio source couldn't be changed successfully
  		*/
  def useAudioSource(id: scala.Double): scala.Unit = js.native
  def useAudioSource(id: scala.Double, successCallback: js.Function0[_]): scala.Unit = js.native
  def useAudioSource(id: scala.Double, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  def useVideoSource(id: java.lang.String): scala.Unit = js.native
  def useVideoSource(id: java.lang.String, successCallback: js.Function0[_]): scala.Unit = js.native
  def useVideoSource(id: java.lang.String, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Use specified audio source , use audioSources to get the list of available audio sources
  		*
  		*	@param id Id of the video source
  		*	@param successCallback Called in WebRTC mode if video source changed successfully
  		*	@param failedCallback Called in WebRTC mode if video source couldn't be changed successfully
  		*/
  def useVideoSource(id: scala.Double): scala.Unit = js.native
  def useVideoSource(id: scala.Double, successCallback: js.Function0[_]): scala.Unit = js.native
  def useVideoSource(id: scala.Double, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Get a list of all currently available video sources / cameras
  		*/
  def videoSources(): js.Array[VideoSourceInfo] = js.native
}

