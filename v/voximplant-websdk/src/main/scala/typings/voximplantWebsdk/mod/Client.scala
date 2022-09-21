package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Client class used to control platform functions. Can't be instantiatied directly (singleton), please use VoxImplant.getInstance to get the class instance
  */
@js.native
trait Client extends StObject {
  
  /**
    *    Register handler for specified event
    *
    *    @param eventName Event name
    *    @param eventHandler Handler function. A single parameter is passed - object with the event information
    */
  def addEventListener(
    eventName: Events,
    eventHandler: js.Function1[/* eventObject */ VoxImplantEvent | VoxImplantIMEvent, Any]
  ): Unit = js.native
  def addEventListener(
    eventName: IMEvents,
    eventHandler: js.Function1[/* eventObject */ VoxImplantEvent | VoxImplantIMEvent, Any]
  ): Unit = js.native
  
  /**
    *    Add roster item (IM)
    *
    *    @param user_id User id
    *    @param name Display name
    *    @param group User group
    */
  def addRosterItem(user_id: String, name: String): Unit = js.native
  def addRosterItem(user_id: String, name: String, group: String): Unit = js.native
  
  /**
    *    Add roster item group (IM)
    *
    *    @param user_id User id
    *    @param group Group name
    */
  def addRosterItemGroup(user_id: String, group: String): Unit = js.native
  
  /**
    *    Enable microphone/camera if micRequired in VoxImplant.Config was set to false (WebRTC mode only)
    *
    *    @param successCallback A function called in case of successful audio recording device change
    *    @param failedCallback A function called in case of problems while changing audio recording device
    */
  def attachRecordingDevice(): Unit = js.native
  def attachRecordingDevice(successCallback: js.Function0[Any]): Unit = js.native
  def attachRecordingDevice(successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def attachRecordingDevice(successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  
  /**
    *    Get a list of all currently available audio playback devices
    */
  def audioOutputs(): js.Array[AudioOutputInfo] = js.native
  
  /**
    *    Get a list of all currently available audio sources / microphones
    */
  def audioSources(): js.Array[AudioSourceInfo] = js.native
  
  /**
    *    Ban user from the chat room
    *
    *    @param room Room id
    *    @param user_id User id
    *    @param reason Ban reason
    */
  def banChatRoomUser(room: String, user_id: String): Unit = js.native
  def banChatRoomUser(room: String, user_id: String, reason: String): Unit = js.native
  
  /**
    *    Create call
    *
    *    @param number The number to call
    *    @param useVideo Tells if video should be supported for the call
    *    @param customData Custom string associated with the call session. It can be later obtained from Call History using HTTP API
    *    @param extraHeaders Optional custom parameters (SIP headers) that should be passed with call (INVITE) message. Parameter names must start with "X-" to be processed by application. IMPORTANT: Headers size limit is 200 bytes
    */
  def call(number: String): Call = js.native
  def call(number: String, useVideo: Boolean): Call = js.native
  def call(number: String, useVideo: Boolean, customData: String): Call = js.native
  def call(number: String, useVideo: Boolean, customData: String, extraHeaders: js.Object): Call = js.native
  def call(number: String, useVideo: Boolean, customData: Unit, extraHeaders: js.Object): Call = js.native
  def call(number: String, useVideo: Unit, customData: String): Call = js.native
  def call(number: String, useVideo: Unit, customData: String, extraHeaders: js.Object): Call = js.native
  def call(number: String, useVideo: Unit, customData: Unit, extraHeaders: js.Object): Call = js.native
  
  /**
    *    Get current config
    */
  def config(): Config = js.native
  
  /**
    *    Connect to VoxImplant Cloud
    */
  def connect(): Unit = js.native
  
  /**
    *    Check if connected to VoxImplant Cloud
    */
  def connected(): Boolean = js.native
  
  /**
    *    Create multi-user chat room and join it
    *
    *    @param pass Password for room access
    *    @param users User ids of the invited users to the chat room
    */
  def createChatRoom(): String = js.native
  def createChatRoom(pass: String): String = js.native
  def createChatRoom(pass: String, users: js.Array[String]): String = js.native
  def createChatRoom(pass: Unit, users: js.Array[String]): String = js.native
  
  /**
    *    Decline invitation to join chat room
    *
    *    @param room Room id
    *    @param user_id User id (inviter)
    *    @param reason User-supplied decline reason
    */
  def declineChatRoomInvite(room: String, user_id: String): Unit = js.native
  def declineChatRoomInvite(room: String, user_id: String, reason: String): Unit = js.native
  
  /**
    *    Disable microphone/camera if micRequired in VoxImplant.Config was set to false (WebRTC mode only)
    */
  def detachRecordingDevice(): Unit = js.native
  
  /**
    *    Disconnect from VoxImplant Cloud
    */
  def disconnect(): Unit = js.native
  
  /**
    *    Edit message in the chat room
    *
    *    @param room Room id
    *    @param message_id Message id
    *    @param msg New message content
    */
  def editChatRoomMessage(room: String, message_id: String, msg: String): Unit = js.native
  
  /**
    *    Edit message sent to user
    *
    *    @param room Room id
    *    @param message_id Message id
    *    @param msg New message content
    */
  def editInstantMessage(room: String, message_id: String, msg: String): Unit = js.native
  
  /**
    *    Get chat room history
    *
    *    @param room Room id
    *    @param message_id Message id (to get messages sent before/after the message)
    *    @param direction False/true to get messages older/newer than the message with specified id
    *    @param count Number of messages
    */
  def getChatRoomHistory(room: String): Unit = js.native
  def getChatRoomHistory(room: String, message_id: String): Unit = js.native
  def getChatRoomHistory(room: String, message_id: String, direction: Boolean): Unit = js.native
  def getChatRoomHistory(room: String, message_id: String, direction: Boolean, count: Double): Unit = js.native
  def getChatRoomHistory(room: String, message_id: String, direction: Unit, count: Double): Unit = js.native
  def getChatRoomHistory(room: String, message_id: Unit, direction: Boolean): Unit = js.native
  def getChatRoomHistory(room: String, message_id: Unit, direction: Boolean, count: Double): Unit = js.native
  def getChatRoomHistory(room: String, message_id: Unit, direction: Unit, count: Double): Unit = js.native
  
  /**
    *    Get messages in a conversation with particular use
    *
    *    @param user_id User id
    *    @param message_id Message id (to get messages sent before/after the message)
    *    @param direction False/true to get messages older/newer than the message with specified id
    *    @param count Number of messages
    */
  def getInstantMessagingHistory(user_id: String): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: String): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: String, direction: Boolean): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: String, direction: Boolean, count: Double): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: String, direction: Unit, count: Double): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: Unit, direction: Boolean): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: Unit, direction: Boolean, count: Double): Unit = js.native
  def getInstantMessagingHistory(user_id: String, message_id: Unit, direction: Unit, count: Double): Unit = js.native
  
  /**
    *    Initialize SDK. SDKReady event will be dispatched after succesful SDK initialization. SDK can't be used until it's initialized
    *
    *    @param config Client configuration options
    */
  def init(): Unit = js.native
  def init(config: Config): Unit = js.native
  
  /**
    *    Invite user to join chat room
    *
    *    @param room Room id
    *    @param user_id User id (invitee)
    *    @param reason User-supplied reason for the invitation
    */
  def inviteToChatRoom(room: String, user_id: String): Unit = js.native
  def inviteToChatRoom(room: String, user_id: String, reason: String): Unit = js.native
  
  /**
    *    Check if WebRTC support is available
    */
  def isRTCsupported(): Boolean = js.native
  
  /**
    *    Join multi-user chat room
    *
    *    @param room Room id
    *    @param pass Password for room access
    */
  def joinChatRoom(room: String): Unit = js.native
  def joinChatRoom(room: String, pass: String): Unit = js.native
  
  /**
    *    Leave multi-user chat room
    *
    *    @param room Room id
    *    @param msg Message for other participants
    */
  def leaveChatRoom(room: String): Unit = js.native
  def leaveChatRoom(room: String, msg: String): Unit = js.native
  
  /**
    *    Login into application
    *
    *    @param username
    *    @param password
    *    @param options Login options
    */
  def login(username: String, password: String): Unit = js.native
  def login(username: String, password: String, options: LoginOptions): Unit = js.native
  
  /**
    *    Login into application using 'code' auth method
    *
    *    @param username
    *    @param code
    *    @param options Login options
    */
  def loginWithCode(username: String, code: String): Unit = js.native
  def loginWithCode(username: String, code: String, options: LoginOptions): Unit = js.native
  
  /**
    *    Login into application using 'onetimekey' auth method
    *
    *    @param username
    *    @param hash
    *    @param options Login options
    */
  def loginWithOneTimeKey(username: String, hash: String): Unit = js.native
  def loginWithOneTimeKey(username: String, hash: String, options: LoginOptions): Unit = js.native
  
  /**
    *    Move roster item group (IM)
    *
    *    @param user_id User id
    *    @param groupSrc Group name (source)
    *    @param groupDst Group name (destination)
    */
  def moveRosterItemGroup(user_id: String, groupSrc: String, groupDst: String): Unit = js.native
  
  /**
    *    Play ToneScript using WebAudio API
    *
    *    @param script Tonescript string
    *    @param loop Loop playback if true
    */
  def playToneScript(script: String): Unit = js.native
  def playToneScript(script: String, loop: Boolean): Unit = js.native
  
  /**
    *    Remove roster item group (IM)
    *
    *    @param user_id User id
    *    @param group Group name
    */
  def remoteRosterItemGroup(user_id: String, group: String): Unit = js.native
  
  /**
    *    Remove message in the chat room
    *
    *    @param room Room id
    *    @param message_id Message id
    */
  def removeChatRoomMessage(room: String, message_id: String): Unit = js.native
  
  /**
    *    Remove user from the chat room
    *
    *    @param room Room id
    *    @param user_id User id
    *    @param reason Reason
    */
  def removeChatRoomUser(room: String, user_id: String): Unit = js.native
  def removeChatRoomUser(room: String, user_id: String, reason: String): Unit = js.native
  
  /**
    *    Remove handler for specified event
    *
    *    @param eventName Event name
    *    @param eventHandler Handler function
    */
  def removeEventListener(eventName: Events, eventHandler: js.Function0[Any]): Unit = js.native
  def removeEventListener(eventName: IMEvents, eventHandler: js.Function0[Any]): Unit = js.native
  
  /**
    *    Remove message sent to user
    *
    *    @param user_id User id
    *    @param message_id Message id
    */
  def removeInstantMessage(user_id: String, message_id: String): Unit = js.native
  
  /**
    *    Remove roster item (IM)
    *
    *    @param user_id User id
    */
  def removeRosterItem(user_id: String): Unit = js.native
  
  /**
    *    Rename roster item (IM)
    *
    *    @param user_id User id
    *    @param name New display name
    */
  def renameRosterItem(user_id: String, name: String): Unit = js.native
  
  /**
    *    Request a key for 'onetimekey' auth method. Server will send the key in AuthResult event with code 302
    *
    *    @param username
    */
  def requestOneTimeLoginKey(username: String): Unit = js.native
  
  /**
    *    Send message to chat room
    *
    *    @param room Room id
    *    @param msg Message for other participants
    */
  def sendChatRoomMessage(room: String, msg: String): String = js.native
  
  /**
    *    Send message to user (IM)
    *
    *    @param user_id User id
    *    @param content Message content
    */
  def sendInstantMessage(user_id: String, content: String): String = js.native
  
  /**
    *    Start/stop sending local video to remote party/parties
    *
    *    @param flag Start/stop - true/false
    */
  def sendVideo(flag: Boolean): Unit = js.native
  
  /**
    *    Set active call
    *
    *    @param call VoxImplant call instance
    *    @param active If true make call active, otherwise make call inactive
    */
  def setCallActive(call: Call, active: Boolean): Unit = js.native
  
  /**
    *    Set chat room session state info
    *
    *    @param room Room id
    *    @param status Chat session status
    */
  def setChatRoomState(room: String, status: ChatStateType): Unit = js.native
  
  /**
    *    Set new chat room subject
    *
    *    @param room Room id
    *    @param subject New subject
    */
  def setChatRoomSubject(room: String, subject: String): Unit = js.native
  
  /**
    *    Set chat session state info
    *
    *    @param user_id User id
    *    @param status Chat session status. See VoxImplant.ChatStateType enum
    */
  def setChatState(user_id: String, status: ChatStateType): Unit = js.native
  
  /**
    *    Set local video position
    *
    *    @param x Horizontal position (px)
    *    @param y Vertical position (px)
    */
  def setLocalVideoPosition(x: Double, y: Double): Unit = js.native
  
  /**
    *    Set local video size
    *
    *    @param width Width in pixels
    *    @param height Height in pixels
    */
  def setLocalVideoSize(width: Double, height: Double): Unit = js.native
  
  /**
    *    Set local video size
    *
    *    @param user_id User id
    *    @param type Message event type: VoxImplant.MessageEventType.Delivered or VoxImplant.MessageEventType.Displayed. See VoxImplant.MessageEventType enum
    *    @param message_id Message id(s)
    */
  def setMessageStatus(user_id: String, `type`: MessageEventType, message_id: js.Array[String]): Unit = js.native
  
  /**
    *    Set ACD status
    *
    *    @param status Presence status string, see VoxImplant.OperatorACDStatuses
    */
  def setOperatorACDStatus(status: OperatorACDStatuses): Unit = js.native
  
  /**
    *    Set presence
    *
    *    @param status Presence status from VoxImplant.UserStatuses
    *    @param msg Presence text message
    */
  def setPresenceStatus(status: UserStatuses, msg: String): Unit = js.native
  
  /**
    *    Set background color of flash app (only for Flash mode)
    *
    *    @param color Color in web format (i.e. #000000 for black)
    */
  def setSwfColor(color: String): Unit = js.native
  
  /**
    *    Set bandwidth limit for video calls. Currently supported by Chrome/Chromium. The limit will be applied for the next call. (WebRTC mode only)
    *
    *    @param bandwidth Bandwidth limit in kilobits per second (kbps)
    */
  def setVideoBandwidth(bandwidth: Double): Unit = js.native
  
  def setVideoSettings(settings: FlashVideoSettings): Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: js.Function0[Any]): Unit = js.native
  def setVideoSettings(
    settings: FlashVideoSettings,
    successCallback: js.Function0[Any],
    failedCallback: js.Function0[Any]
  ): Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  /**
    *    Set video settings globally. This settings will be used for the next call.
    *
    *    @param settings Video settings
    *    @param successCallback Success callback function
    *    @param failedCallback Failed callback function
    */
  def setVideoSettings(settings: VideoSettings): Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[Any]): Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  
  /**
    *    Show flash settings panel
    *
    *    @param panel Settings type - default/microphone/camera/etc as described in SecurityPanel class
    */
  def showFlashSettingsPanel(): Unit = js.native
  def showFlashSettingsPanel(panel: String): Unit = js.native
  
  /**
    *    Show/hide local video
    *
    *    @param flag Show/hide - true/false
    */
  def showLocalVideo(flag: Boolean): Unit = js.native
  
  /**
    *    Stop playing ToneScript using WebAudio API
    */
  def stopPlayback(): Unit = js.native
  
  /**
    *    Transfer call, depending on the result VoxImplant.CallEvents.TransferComplete or VoxImplant.CallEvents.TransferFailed event will be dispatched
    *
    *    @param call1 Call which will be transferred
    *    @param call2 Call where call1 will be transferred
    */
  def transferCall(call1: Call, call2: Call): Unit = js.native
  
  /**
    *    Remove a ban on a user in the chat room
    *
    *    @param room Room id
    *    @param user_id User id
    *    @param reason Reason
    */
  def unbanChatRoomUser(room: String, user_id: String): Unit = js.native
  def unbanChatRoomUser(room: String, user_id: String, reason: String): Unit = js.native
  
  def useAudioSource(id: String): Unit = js.native
  def useAudioSource(id: String, successCallback: js.Function0[Any]): Unit = js.native
  def useAudioSource(id: String, successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def useAudioSource(id: String, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  /**
    *    Use specified audio source , use audioSources to get the list of available audio sources
    *
    *    @param id Id of the audio source
    *    @param successCallback Called in WebRTC mode if audio source changed successfully
    *    @param failedCallback Called in WebRTC mode if audio source couldn't be changed successfully
    */
  def useAudioSource(id: Double): Unit = js.native
  def useAudioSource(id: Double, successCallback: js.Function0[Any]): Unit = js.native
  def useAudioSource(id: Double, successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def useAudioSource(id: Double, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  
  def useVideoSource(id: String): Unit = js.native
  def useVideoSource(id: String, successCallback: js.Function0[Any]): Unit = js.native
  def useVideoSource(id: String, successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def useVideoSource(id: String, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  /**
    *    Use specified audio source , use audioSources to get the list of available audio sources
    *
    *    @param id Id of the video source
    *    @param successCallback Called in WebRTC mode if video source changed successfully
    *    @param failedCallback Called in WebRTC mode if video source couldn't be changed successfully
    */
  def useVideoSource(id: Double): Unit = js.native
  def useVideoSource(id: Double, successCallback: js.Function0[Any]): Unit = js.native
  def useVideoSource(id: Double, successCallback: js.Function0[Any], failedCallback: js.Function0[Any]): Unit = js.native
  def useVideoSource(id: Double, successCallback: Unit, failedCallback: js.Function0[Any]): Unit = js.native
  
  /**
    *    Get a list of all currently available video sources / cameras
    */
  def videoSources(): js.Array[VideoSourceInfo] = js.native
}
