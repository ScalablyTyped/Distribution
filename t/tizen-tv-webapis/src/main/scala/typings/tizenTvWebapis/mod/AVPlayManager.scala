package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlayManager extends StObject {
  
  /**
    * Destroys the player object.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def close(): Unit = js.native
  
  /**
    * Retrieves the currently-playing video, audio, or subtitle stream information, and notifies that a stream is playing.
    *
    * @returns AVPlayStreamInfo structure containing tracktype, extraInfo and index for the current stream
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note For the adaptive streaming such as HLS, DASH and SmoothStreaming, the 'language' is same as what represented on given manifest file.
    *
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getCurrentStreamInfo(): js.Array[AVPlayStreamInfo] = js.native
  
  /**
    * Retrieves the current playback time.
    *
    * @returns unsigned long number Current playback time, in milliseconds.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getCurrentTime(): Double = js.native
  
  /**
    * Retrieves the total media duration.
    *
    * @returns unsigned long number Duration, in milliseconds
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states:"NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getDuration(): Double = js.native
  
  /**
    * Retrieves the current player state.
    *
    * @returns AVPlayPlayerState "NONE", "IDLE", "READY", "PLAYING", "PAUSED".
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getState(): AVPlayPlayerState = js.native
  
  /**
    * Retrieves a specific property value obtained by the streaming engine (Smooth Streaming, HLS, DASH, or Widevine).
    *
    * @param propertyType AVPlayStreamingPropertyType { "IS_LIVE", "AVAILABLE_BITRATE", "GET_LIVE_DURATION","CURRENT_BANDWIDTH"};
    *
    * @returns DOMString Property value
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note GET_SERVER_TIME_SCALE and GET_ABSOLUTE_SERVER_TIME: Supported for Smooth Streaming only.
    *
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getStreamingProperty(propertyType: AVPlayStreamingPropertyType): String = js.native
  
  /**
    * Retrieves the currently-playing stream information.
    *
    * @returns AVPlayStreamInfo[] structure containing tracktype, extraInfo and Index of current stream
    * Returns information for the all available tracks in the stream. The information is returned in the following structure:
    * For video tracks:
    * "{"fourCC":"%s","Width":"%u","Height":"%u","Bit_rate":"%u"}"
    * For audio track:
    * "{"language":"%s","channels":"%d","sample_rate":"%d","bit_rate":"%d","fourCC":"%s"}"
    * For subtitle tracks:
    * "{"track_num":"%d","track_lang":"%s","subtitle_type":"%d","fourCC":"%s"}"
    * Some of them are not constant value(E.g. Video:Width, Height, and Bit_rate,Audio:channels, sample_rate, and bit_rate) for adaptive streaming such as HLS, DASH and SmoothStreaming.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note For the adaptive streaming such as HLS, DASH and SmoothStreaming, the 'language' is same as what represented on given manifest file.
    *
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def getTotalTrackInfo(): js.Array[AVPlayStreamInfo] = js.native
  
  /**
    * Gets the device UID. The input would be the drm type.
    *
    * @param drmType AVPlayDrmType {"VERIMATRIX"} // only VERIMATRIX is supported AVPlayDrmType for getUID interface.
    *
    * @returns DOMString
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/drmplay
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED".
    *
    * @since 2.3
    */
  def getUID(drmType: AVPlayDrmType): String = js.native
  
  /**
    * Retrieves the AVPlay version.
    *
    * @returns DOMString string current version
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 3.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    *
    * @since 2.3
    */
  def getVersion(): String = js.native
  
  /**
    * Skips playback backward by a specific amount of time. The player state is unchanged.
    * For HTTP streaming, this method is successful even when the resulting timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    *
    * @param milliseconds Time to skip backward, in milliseconds
    *
    * @param successCallback Callback method to invoke when the call is successful
    *
    * @param errorCallback Callback method to invoke when an error occurs
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    *
    * @since 2.3
    */
  def jumpBackward(milliseconds: Double): Unit = js.native
  def jumpBackward(milliseconds: Double, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def jumpBackward(milliseconds: Double, successCallback: SuccessCallback): Unit = js.native
  def jumpBackward(milliseconds: Double, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Skips playback forward by a specific amount of time. The player state is unchanged.
    * Passing the optional callbacks is recommended. For best performance, ensure that the previous call to this API was successful.
    * For HTTP streaming, this method is successful even when the resulting timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    *
    * @param milliseconds Time to skip forward, in milliseconds
    *
    * @param successCallback Callback method to invoke when the call is successful
    *
    * @param errorCallback Callback method to invoke when an error occurs
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    *
    * @since 2.3
    */
  def jumpForward(milliseconds: Double): Unit = js.native
  def jumpForward(milliseconds: Double, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def jumpForward(milliseconds: Double, successCallback: SuccessCallback): Unit = js.native
  def jumpForward(milliseconds: Double, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Instantiates the player object with a content URL as the input parameter.
    *
    * @param url Content URL for playback. It can be an absolute local path or a remote URL from a network-based stream server.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE"
    *
    * @since 2.3
    */
  def open(url: String): Unit = js.native
  
  /**
    * Pauses playback. If this method is called successfully, current time updates are stopped.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type InvalidAccessError, if this API couldn't operate at the moment. (E.g. During the async operation such as seekTo, etc.)
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def pause(): Unit = js.native
  
  /**
    * Starts stream playback, or resumes stream playback after pause.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note Adaptive streaming using TS container (for e.g. HLS) with audio sample rate changing across variants may cause audio loss.
    *
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def play(): Unit = js.native
  
  /**
    * Prepares the media player for playback synchronously. The player must already be created with a valid URI.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if given URL through open() is invalid. e.g., webapis.avplay.open("InvalidURL").
    *
    * @throw WebAPIException with error type InvalidAccessError, if given URL through open() is valid, but not exist or Network Issue. e.g., webapis.avplay.open("http://abc").
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY"
    *
    * @since 2.3
    */
  def prepare(): Unit = js.native
  
  /**
    * Prepares the media player for playback asynchronously. This method is preferred over prepare because it returns immediately and does not block the application thread during preparation.
    * When preparation is successful, the success callback is returned and the player is in READY state. If preparation fails, the error callback returns the error value.
    * When prepareAsync is used with "PREBUFFER_MODE", successCallback is invoked when prebuffering is complete, instead of when preparation is complete.
    *
    * @param successCallback Callback method to invoke when the call is successful
    *
    * @param errorCallback Callback method to invoke when an error occurs
    *
    * @param errorCallback method, with error type NotSupportedError, if this feature is not supported.
    *
    * @param errorCallback method, with error type InvalidValuesError, if given URL through open() is invalid. e.g., webapis.avplay.open("InvalidURL").
    *
    * @param errorCallback method, with error type InvalidAccessError, if given URL through open() is valid, but not exist or Network Issue. e.g., webapis.avplay.open("http://abc").
    *
    * @param errorCallback method, with error type InvalidStateError, if it is called in an invalid state.
    *
    * @param errorCallback method, with error type UnknownError, for any other error.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY"
    *
    * @since 2.3
    */
  def prepareAsync(): Unit = js.native
  def prepareAsync(successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def prepareAsync(successCallback: SuccessCallback): Unit = js.native
  def prepareAsync(successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * During multitasking, restores the player state when the application is resumed. For live streaming or DRM-encrypted content playback, you must check whether the streaming URL has changed or the DRM session or license has expired, and specify the new URL and DRM information as needed.
    *
    * @param URL updated URL after suspend. If null, the stored URL is used.
    * For live streaming or DRM-encrypted content playback, in case the URL has changed or the DRM license or session has expired, checking for and passing the newest URL is recommended.
    *
    * @param resumeTime (milliseconds) Optional. Position from which to resume playback. If 0, the stored position is used.
    * For live streaming, this parameter is not meaningful. Do not pass 0 for this parameter.
    * For DRM-encrypted content playback, if the DRM session has expired, to recreate the playback pipeline, pass 0 for this parameter.
    *
    * @param bPrepare Optional boolean. false (default): Player sets the resume behavior automatically. true: Player does not resume automatically. The application must invoke the prepare and play methods.
    * For live streaming, this parameter is not meaningful. Do not pass true for this parameter.
    * For DRM-encrypted content playback: if the DRM session has expired, pass true for this parameter.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def restore(URL: String): Unit = js.native
  def restore(URL: String, resumeTime: Double): Unit = js.native
  def restore(URL: String, resumeTime: Double, bPrepare: Boolean): Unit = js.native
  def restore(URL: String, resumeTime: Unit, bPrepare: Boolean): Unit = js.native
  
  /**
    * During multitasking, restores the player state when the application is resumed. restoreAsync is an asynchronous interface.
    * Other API, restore is a synchronous interface which blocks the application thread.
    * This method is preferred over restore because it returns immediately and does not block the application thread during its restoration.
    * When player is restored successful, the success callback is returned and player resumed the playback from the restored playback position, state, properties etc.
    * If restoration fails, the error callback returns the error value.
    * Application is required to make further calls to avplay on its success or failure callback happens.
    * For live streaming or DRM-encrypted content playback, you must check whether the streaming URL has changed or the DRM session or license has expired, and specify the new URL and DRM information as needed.
    *
    * @param URL updated URL after suspend. If null, the stored URL is used.
    * For live streaming or DRM-encrypted content playback, in case the URL has changed or the DRM license or session has expired, checking for and passing the newest URL is recommended.
    *
    * @param resumeTime (milliseconds) Optional. Position from which to resume playback. If 0, the stored position is used.
    * For live streaming, this parameter is not meaningful. Do not pass 0 for this parameter.
    * For DRM-encrypted content playback, if the DRM session has expired, to recreate the playback pipeline, pass 0 for this parameter.
    *
    * @param bPrepare Optional boolean. false (default): Player sets the resume behavior automatically. true: Player does not resume automatically. The application must invoke the prepare and play methods.
    * For live streaming, this parameter is not meaningful. Do not pass true for this parameter.
    * For DRM-encrypted content playback: if the DRM session has expired, pass true for this parameter.
    *
    * @param successCallback Callback method to invoke when the call is successful
    *
    * @param errorCallback Callback method to invoke when an error occurs
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @constraint Can be called in the following states: "NONE", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def restoreAsync(URL: String): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: Boolean): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: Boolean, successCallback: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Boolean,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Unit,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: Unit, successCallback: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Unit,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Unit, bPrepare: Boolean): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Unit,
    bPrepare: Boolean,
    successCallback: Unit,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Unit, bPrepare: Boolean, successCallback: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Unit,
    bPrepare: Boolean,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Unit, bPrepare: Unit, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Unit, bPrepare: Unit, successCallback: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Unit,
    bPrepare: Unit,
    successCallback: SuccessCallback,
    errorCallback: ErrorCallback
  ): Unit = js.native
  
  /**
    * Skips playback to a specific timestamp.
    * For HTTP streaming, this method is successful even when the specified timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    *
    * @param milliseconds Timestamp to skip to
    *
    * @param successCallback Callback method to invoke when the call is successful
    *
    * @param errorCallback Callback method to invoke when an error occurs
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE","READY", "PLAYING" (buffered data is flushed and buffering starts over), "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    * For LIVE stream case, seek position must be within DVR range. DVR range could be retrieved using GET_LIVE_DURATION property in getStreamingProperty API.
    *
    * @since 2.3
    */
  def seekTo(milliseconds: Double): Unit = js.native
  def seekTo(milliseconds: Double, successCallback: Unit, errorCallback: ErrorCallback): Unit = js.native
  def seekTo(milliseconds: Double, successCallback: SuccessCallback): Unit = js.native
  def seekTo(milliseconds: Double, successCallback: SuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Sets the buffer size for the play and resume scenarios. The time buffer size must be at least 4 seconds.
    * For example, if a 10 second buffer size is set, playback can only start or resume after 10 seconds of media has accumulated in the buffer.
    * Play scenarios include user-initiated streaming playback and whenever media playback is starting for the first time.
    * Resume scenarios include resuming playback after pause or seek operations, or when lack of data causes playback rebuffering.
    *
    * @param option "PLAYER_BUFFER_FOR_PLAY" or "PLAYER_BUFFER_FOR_RESUME"
    *
    * @param unit "PLAYER_BUFFER_SIZE_IN_SECOND"
    *
    * @param amount Data amount to be buffered, in seconds as specified by the unit parameter
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @note unit "PLAYER_BUFFER_SIZE_IN_BYTE" has been deprecated from Tizen version 5.0
    *
    * @constraint Can be called in the following states: "IDLE"
    *
    * @since 2.3
    */
  def setBufferingParam(option: AVPlayBufferOption, unit: AVPlayBufferSizeUnit, amount: Double): Unit = js.native
  
  /**
    * Sets the video screen mode in the specified display area.
    *
    * @param displayMode "PLAYER_DISPLAY_MODE_LETTER_BOX", "PLAYER_DISPLAY_MODE_FULL_SCREEN", or "PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO"
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def setDisplayMethod(displayMode: AVPlayDisplayMode): Unit = js.native
  
  /**
    * Sets the display area for video content playback.
    * The 4 parameters specify the left side, top, window width, and window height based on a 1920 x 1080 resolution screen, regardless of the actual application resolution.
    *
    * @param x Display area top-left X-coordinate. Must be less than the TV screen width.
    *
    * @param y Display area top-left Y-coordinate. Must be less than the TV screen height.
    *
    * @param width Display area width. Must be less than the TV screen width.
    *
    * @param height Display area height from source image. Must be less than the source image height.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states:"IDLE", "READY", "PLAYING", "PAUSED" (when APP is using normal calling sequence , OPEN+setDisplay+PREPARE etc).
    *
    * @since 2.3
    */
  def setDisplayRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Updates the DRM information, such as SetProperties. You can change the DRM mode and run the control feature. The AVPlayDrmOperation and jsonParam parameters depend on the DRM type.
    * Please refer to the specification (https://developer.samsung.com/tv/develop/specifications/general-specifications) for the supported DRM.
    *
    * @param drmType AVPlayDrmType {"PLAYREADY", "EME_PLAYREADY", "VERIMATRIX", "WIDEVINE_CDM", "EME_WIDEVINE_CDM"}
    *
    * @param drmOperation AVPlayDrmOperation : String specifying the DRM operation to be performed. The valid values are depending on the DRM Types.
    * This is mainly used for setting DRM information, such as the license server, application-specific custom data, SOAP or HTTP header, the genChallenge mode, and license usage.
    *
    * @param jsonParam DOMString DRM parameter represented by JSON string. You can use the JSON.stringify method to generate the JSON string.
    *
    * @returns DRMString
    *
    * @privilegeLevel Public
    *
    * @privilegeName http://developer.samsung.com/privilege/drmplay
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    * Examples of exception scenarios include an invalid DRM session, or failure to create the underlying DRM module or configuration. In these scenarios, an exception is thrown and the method call returns FALSE.
    *
    *
    * @version 4.0
    *
    * @note 'GetUID' operation has been deprecated from Tizen version 5.0, rather application should use getUID() API.
    *
    * @note 'Initialize' and 'Finalize' operations have been deprecated from Tizen version 5.0. Because these are being executed by avplay itself.
    *
    * @note 'widevine_app_session' and 'widevine_data_type' operations have been deprecated from Tizen version 5.0. Because these are merged into "SetProperties". Please refer to setDrm() example.
    *
    * @constraint Can be called in the following states: "IDLE"
    *
    * @since 2.3
    */
  def setDrm(drmType: AVPlayDrmType, drmOperation: AVPlayDrmOperation, jsonParam: String): String = js.native
  
  /**
    * Sets the local path for the external subtitle file. Only absolute local paths are supported. If the subtitle file is stored remotely, you must first download the file to local storage, and pass the absolute local path.
    *
    * @param filePath Absolute local path
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def setExternalSubtitlePath(filePath: String): Unit = js.native
  
  /**
    * Sets asynchronous callback methods for player information notifications, such as buffering progress, player information, playback mode, and DRM mode information.
    *
    * @param playbackCallback AVPlayPlaybackCallback
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE" (recommended), "READY", "PLAYING", "PAUSED"
    * To avoid missing necessary information, the onbufferingstart, onbufferingprogress, onbufferingcomplete, onerror, onevent, and ondrmevent listeners must be set during the "IDLE" state.
    *
    * @since 2.3
    */
  def setListener(playbackCallback: AVPlayPlaybackCallback): Unit = js.native
  
  /**
    * Switches audio or subtitle tracks during playback.
    *
    * @param trackType "AUDIO" or "TEXT"
    *
    * @param trackIndex AVPlayStreamInfo index
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @note Since tizen version 5.0, the trackType "AUDIO" is supported for DASH streaming.
    *
    * @constraint The trackType "TEXT" is not supported for DASH streaming.
    *
    * @since 2.3
    */
  def setSelectTrack(trackType: AVPlayStreamType, trackIndex: Double): Unit = js.native
  
  /**
    * Enables or disables external subtitles.
    *
    * @param onoff Boolean value:
    * - true: Subtitles are hidden
    * - false: Subtitles are shown. The application does not receive any subtitle-related events.
    *
    *
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def setSilentSubtitle(onoff: Boolean): Unit = js.native
  
  /**
    * Retrieves the audio spectrum analysis result every 30 ms. You can use it for an equalizer effect video or in a PartyTV application. The spectrum is analyzed across an array of 31 bands, of which Bands[14] ~ Bands[18] generally have the largest values.
    *
    * @param soundAnalysisCallback AVPlaySoundAnalysisCallback
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @constraint Can be called in the following states: "IDLE"
    *
    * @since 2.3
    */
  def setSoundAnalysisListener(soundAnalysisCallback: AVPlaySoundAnalysisCallback): Unit = js.native
  
  /**
    * Sets the current playback rate. Positive parameter values play the media forwards, while negative values cause the media to play in reverse.
    * The range of valid playback rates depends on the streaming protocol. If the input parameter is out of range, the player returns the PLAYER_ERROR_INVALID_PARAMETER flag.
    *
    * @param playbackSpeed -16x, -8x, -4x, -2x, 1x, 2x, 4x, 8x, 16x
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "READY, "PLAYING", "PAUSED"
    * For the general HTTP and HTTPS, the supported playback rate is -8x ~ 8x. (Repeated seek)
    * Please refer to the specification (https://developer.samsung.com/tv/develop/specifications/general-specifications/#streaming-feature-support) for the supported range of other streaming types.
    *
    * @since 2.3
    */
  def setSpeed(playbackSpeed: Double): Unit = js.native
  
  /**
    * Sets specific feature values for HTTP, MMS, or specific streaming engine (Smooth Streaming, HLS, DASH, DivX Plus Streaming, or Widevine). The available streaming properties depend on the streaming protocol or engine.
    * Use the CUSTOM_MESSAGE property for streaming engine or CP-specific settings.
    *
    * @param propertyType "COOKIE", "USER_AGENT", "PREBUFFER_MODE" , "ADAPTIVE_INFO", "SET_MODE_4K", "PROPERTY_HD_AUDIO", "LISTEN_SPARSE_TRACK", "WIDEVINE", "USE_VIDEOMIXER", "SET_MIXEDFRAME", "PORTRAIT_MODE"
    *
    * @param propertyParam Value according to the propertyType. e.g. "ADAPTIVE_INFO" PropetyTypes are "BITRATES", "STARTBITRATE", "SKIPBITRATE".
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 4.0
    *
    * @constraint "READY", "PLAYING", "PAUSED" is valid only for SET_MIXEDFRAME.
    *
    * @since 2.3
    */
  def setStreamingProperty(propertyType: AVPlayStreamingPropertyType, propertyParam: String): Unit = js.native
  
  /**
    * Adjusts external subtitle synchronization with the audio and video.
    *
    * @param position Time delay in milliseconds. The duration can be a positive or negative number; a positive delay displays the subtitles later, while a negative delay displays the subtitles sooner.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def setSubtitlePosition(position: Double): Unit = js.native
  
  /**
    * Sets the stream buffering timeout. When the specified amount of time has passed, the onbufferingcomplete callback is invoked, irrespective of buffering progress.
    * If not set using this method, the default buffer size is 32MB or 10 seconds of playable data, and 20 seconds time-out.
    *
    * @param seconds Buffering timeout duration, in seconds. Depending on network conditions, 3 to 10 seconds is recommended.
    *
    * @returns void
    *
    * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidValuesError, if any input parameter contains an invalid value.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def setTimeoutForBuffering(seconds: Double): Unit = js.native
  
  /**
    * Stops the player. Call this function after the video finishes playing.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 3.0
    *
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def stop(): Unit = js.native
  
  /**
    * Pauses the player state when the application is sent to the background. Saves the current statistics for the ongoing playback session.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @constraint Can be called in the following states: "READY, "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def suspend(): Unit = js.native
  
  /**
    * Unregisters the sound analysis listener.
    *
    * @returns void
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    *
    * @throw WebAPIException with error type InvalidStateError, if it is called in an invalid state.
    *
    * @throw WebAPIException with error type UnknownError, for any other error.
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    *
    * @since 2.3
    */
  def unsetSoundAnalysisListener(): Unit = js.native
}
