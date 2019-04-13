package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  /**
  		*	Returns information about the call's media state (active/inactive)
  		*/
  def active(): scala.Boolean = js.native
  /**
  		*	Register handler for specified event
  		*
  		*	@param eventName Event name
  		*	@param eventHandler Handler function. A single parameter is passed - object with the event information
  		*/
  def addEventListener(eventName: CallEvents, eventHandler: js.Function1[/* eventObject */ VoxImplantCallEvent, _]): scala.Unit = js.native
  /**
  		*	Answer on incoming call
  		*
  		*	@param customData Set custom string associated with call session. It can be later obtained from Call History using HTTP API
  		*	@param extraHeaders Optional custom parameters (SIP headers) that should be sent after accepting incoming call. Parameter names must start with "X-" to be processed by application
  		*/
  def answer(): scala.Unit = js.native
  def answer(customData: java.lang.String): scala.Unit = js.native
  def answer(customData: java.lang.String, extraHeaders: js.Object): scala.Unit = js.native
  /**
  		*	Reject incoming call
  		*
  		*	@param extraHeaders Optional custom parameters (SIP headers) that should be sent after accepting incoming call. Parameter names must start with "X-" to be processed by application
  		*/
  def decline(): scala.Unit = js.native
  def decline(extraHeaders: js.Object): scala.Unit = js.native
  /**
  		*	Returns display name
  		*/
  def displayName(): java.lang.String = js.native
  /**
  		*	Returns HTML video element's id for the call (WebRTC mode)
  		*/
  def getVideoElementId(): java.lang.String = js.native
  /**
  		*	Hangup call
  		*
  		*	@param extraHeaders Optional custom parameters (SIP headers) that should be sent after disconnecting/cancelling call. Parameter names must start with "X-" to be processed by application
  		*/
  def hangup(): scala.Unit = js.native
  def hangup(extraHeaders: js.Object): scala.Unit = js.native
  /**
  		*	Returns headers object
  		*/
  def headers(): js.Object = js.native
  /**
  		*	Returns call id
  		*/
  def id(): java.lang.String = js.native
  /**
  		*	Mute microphone
  		*/
  def muteMicrophone(): scala.Unit = js.native
  /**
  		*	Mute sound
  		*/
  def mutePlayback(): scala.Unit = js.native
  /**
  		*	Returns dialed number or caller id
  		*/
  def number(): java.lang.String = js.native
  /**
  		*	Reject incoming call
  		*
  		*	@param extraHeaders Optional custom parameters (SIP headers) that should be sent after disconnecting/cancelling call. Parameter names must start with "X-" to be processed by application
  		*/
  def reject(): scala.Unit = js.native
  def reject(extraHeaders: js.Object): scala.Unit = js.native
  /**
  		*	Remove handler for specified event
  		*
  		*	@param eventName Event name
  		*	@param eventHandler Handler function
  		*/
  def removeEventListener(eventName: CallEvents, eventHandler: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Send Info (SIP INFO) message inside the call
  		*
  		*	@param mimeType MIME type of the message
  		*	@param body Message content
  		*	@param extraHeaders Optional headers to be passed with the message
  		*/
  def sendInfo(mimeType: java.lang.String, body: java.lang.String): scala.Unit = js.native
  def sendInfo(mimeType: java.lang.String, body: java.lang.String, extraHeaders: js.Object): scala.Unit = js.native
  /**
  		*	Send text message
  		*
  		*	@param msg Message text
  		*/
  def sendMessage(msg: java.lang.String): scala.Unit = js.native
  /**
  		*	Send tone (DTMF)
  		*
  		*	@param key Send tone according to pressed key: 0-9 , * , #
  		*/
  def sendTone(key: java.lang.String): scala.Unit = js.native
  /**
  		*	Set remote video position
  		*
  		*	@param x Horizontal position (px)
  		*	@param y Vertical position (px)
  		*/
  def setRemoteVideoPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
  		*	Set remote video size
  		*
  		*	@param width Width in pixels
  		*	@param height Height in pixels
  		*/
  def setRemoteVideoSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: js.Function0[_]): scala.Unit = js.native
  def setVideoSettings(settings: FlashVideoSettings, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Set video settings
  		*
  		*	@param settings Video settings for current call
  		*	@param successCallback Called in WebRTC mode if video settings were applied successfully
  		*	@param failedCallback Called in WebRTC mode if video settings couldn't be applied
  		*/
  def setVideoSettings(settings: VideoSettings): scala.Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[_]): scala.Unit = js.native
  def setVideoSettings(settings: VideoSettings, successCallback: js.Function0[_], failedCallback: js.Function0[_]): scala.Unit = js.native
  /**
  		*	Show/hide remote party video
  		*
  		*	@param flag Show/hide - true/false
  		*/
  def showRemoteVideo(flag: scala.Boolean): scala.Unit = js.native
  /**
  		*	Get call's current state
  		*/
  def state(): java.lang.String = js.native
  /**
  		*	Unmute microphone
  		*/
  def unmuteMicrophone(): scala.Unit = js.native
  /**
  		*	Unmute sound
  		*/
  def unmutePlayback(): scala.Unit = js.native
}

