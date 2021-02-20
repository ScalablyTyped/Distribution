package typings.tizenTvWebapis.avplayMod

import typings.tizenTvWebapis.tizenTvWebapisStrings.ADAPTIVE_INFO
import typings.tizenTvWebapis.tizenTvWebapisStrings.AUDIO
import typings.tizenTvWebapis.tizenTvWebapisStrings.AVAILABLE_BITRATE
import typings.tizenTvWebapis.tizenTvWebapisStrings.COOKIE
import typings.tizenTvWebapis.tizenTvWebapisStrings.CURRENT_BANDWIDTH
import typings.tizenTvWebapis.tizenTvWebapisStrings.EME_PLAYREADY
import typings.tizenTvWebapis.tizenTvWebapisStrings.EME_WIDEVINE_CDM
import typings.tizenTvWebapis.tizenTvWebapisStrings.Finalize
import typings.tizenTvWebapis.tizenTvWebapisStrings.GET_LIVE_DURATION
import typings.tizenTvWebapis.tizenTvWebapisStrings.GetUID
import typings.tizenTvWebapis.tizenTvWebapisStrings.IDLE
import typings.tizenTvWebapis.tizenTvWebapisStrings.IS_LIVE
import typings.tizenTvWebapis.tizenTvWebapisStrings.Initialize
import typings.tizenTvWebapis.tizenTvWebapisStrings.InstallLicense
import typings.tizenTvWebapis.tizenTvWebapisStrings.LISTEN_SPARSE_TRACK
import typings.tizenTvWebapis.tizenTvWebapisStrings.NONE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PAUSED
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_BUFFER_FOR_PLAY
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_BUFFER_FOR_RESUME
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_BUFFER_SIZE_IN_BYTE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_BUFFER_SIZE_IN_SECOND
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_DISPLAY_MODE_FULL_SCREEN
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYER_DISPLAY_MODE_LETTER_BOX
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYING
import typings.tizenTvWebapis.tizenTvWebapisStrings.PLAYREADY
import typings.tizenTvWebapis.tizenTvWebapisStrings.PORTRAIT_MODE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PREBUFFER_MODE
import typings.tizenTvWebapis.tizenTvWebapisStrings.PROPERTY_HD_AUDIO
import typings.tizenTvWebapis.tizenTvWebapisStrings.ProcessInitiator
import typings.tizenTvWebapis.tizenTvWebapisStrings.READY
import typings.tizenTvWebapis.tizenTvWebapisStrings.SET_MIXEDFRAME
import typings.tizenTvWebapis.tizenTvWebapisStrings.SET_MODE_4K
import typings.tizenTvWebapis.tizenTvWebapisStrings.SET_VR360_MODE
import typings.tizenTvWebapis.tizenTvWebapisStrings.SetProperties
import typings.tizenTvWebapis.tizenTvWebapisStrings.TEXT
import typings.tizenTvWebapis.tizenTvWebapisStrings.USER_AGENT
import typings.tizenTvWebapis.tizenTvWebapisStrings.USE_VIDEOMIXER
import typings.tizenTvWebapis.tizenTvWebapisStrings.VERIMATRIX
import typings.tizenTvWebapis.tizenTvWebapisStrings.VIDEO
import typings.tizenTvWebapis.tizenTvWebapisStrings.WIDEVINE
import typings.tizenTvWebapis.tizenTvWebapisStrings.WIDEVINE_CDM
import typings.tizenTvWebapis.tizenTvWebapisStrings.widevine_app_session
import typings.tizenTvWebapis.tizenTvWebapisStrings.widevine_data_type
import typings.tizenTvWebapis.tizenTvWebapisStrings.widevine_license_data
import typings.tizenTvWebapis.webapisMod.ErrorCallback
import typings.tizenTvWebapis.webapisMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlayManager extends StObject {
  
  /**
    * Destroys the player object.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def close(): Unit = js.native
  
  /**
    * Retrieves the currently-playing video, audio, or subtitle stream information, and notifies that a stream is playing.
    * @returns AVPlayStreamInfo structure containing tracktype, extraInfo and index for the current stream
    * @throw WebAPIException NotSupportedError, InvalidStateError, UnknownError
    * @since 2.3
    * @note For the adaptive streaming such as HLS, DASH and SmoothStreaming, the 'language' is same as what represented on given manifest file.
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    */
  def getCurrentStreamInfo(): AVPlayStreamInfo = js.native
  
  /**
    * Retrieves the current playback time.
    * @returns unsigned long number Current playback time, in milliseconds.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def getCurrentTime(): Double = js.native
  
  /**
    * Retrieves the total media duration.
    * @returns unsigned long number Duration, in milliseconds
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states:"NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def getDuration(): Double = js.native
  
  /**
    * Retrieves the current player state.
    * @returns AVPlayPlayerState "NONE", "IDLE", "READY", "PLAYING", "PAUSED".
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def getState(): AVPlayPlayerState | NONE | IDLE | READY | PLAYING | PAUSED = js.native
  
  /**
    * Retrieves a specific property value obtained by the streaming engine (Smooth Streaming, HLS, DASH, or Widevine).
    * @returns string Property value
    * @param propertyType AVPlayStreamingPropertyType { "IS_LIVE", "AVAILABLE_BITRATE", "GET_LIVE_DURATION","CURRENT_BANDWIDTH"};
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @note GET_SERVER_TIME_SCALE and GET_ABSOLUTE_SERVER_TIME: Supported for Smooth Streaming only.
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    */
  def getStreamingProperty(propertyType: AVPlayStreamingPropertyType): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_ADAPTIVEINFO(propertyType: ADAPTIVE_INFO): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_AVAILABLEBITRATE(propertyType: AVAILABLE_BITRATE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_COOKIE(propertyType: COOKIE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_CURRENTBANDWIDTH(propertyType: CURRENT_BANDWIDTH): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_GETLIVEDURATION(propertyType: GET_LIVE_DURATION): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_ISLIVE(propertyType: IS_LIVE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_LISTENSPARSETRACK(propertyType: LISTEN_SPARSE_TRACK): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_PORTRAITMODE(propertyType: PORTRAIT_MODE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_PREBUFFERMODE(propertyType: PREBUFFER_MODE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_PROPERTYHDAUDIO(propertyType: PROPERTY_HD_AUDIO): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_SETMIXEDFRAME(propertyType: SET_MIXEDFRAME): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_SETMODE4K(propertyType: SET_MODE_4K): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_SETVR360MODE(propertyType: SET_VR360_MODE): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_USERAGENT(propertyType: USER_AGENT): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_USEVIDEOMIXER(propertyType: USE_VIDEOMIXER): String = js.native
  @JSName("getStreamingProperty")
  def getStreamingProperty_WIDEVINE(propertyType: WIDEVINE): String = js.native
  
  /**
    * Retrieves the currently-playing stream information.
    * @returns AVPlayStreamInfo[] structure containing tracktype, extraInfo and Index of current stream
    * Returns information for the all available tracks in the stream. The information is returned in the following structure:
    * For video tracks:
    * "{"fourCC":"%s","Width":"%u","Height":"%u","Bit_rate":"%u"}"
    * For audio track:
    * "{"language":"%s","channels":"%d","sample_rate":"%d","bit_rate":"%d","fourCC":"%s"}"
    * For subtitle tracks:
    * "{"track_num":"%d","track_lang":"%s","subtitle_type":"%d","fourCC":"%s"}"
    * Some of them are not constant value(E.g. Video:Width, Height, and Bit_rate,  Audio:channels, sample_rate, and bit_rate) for adaptive streaming such as HLS, DASH and SmoothStreaming.
    * @throw WebAPIException NotSupportedError, InvalidStateError, UnknownError
    * @since 2.3
    * @note For the adaptive streaming such as HLS, DASH and SmoothStreaming, the 'language' is same as what represented on given manifest file.
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    */
  def getTotalTrackInfo(): js.Array[AVPlayStreamInfo] = js.native
  
  /**
    * Gets the device UID. The input would be the drm type.
    * @param drmType AVPlayDrmType {"VERIMATRIX"} // only VERIMATRIX is supported AVPlayDrmType for getUID interface.
    * @returns string
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/drmplay
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, SecurityError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED".
    */
  def getUID(drmType: AVPlayDrmType): String = js.native
  @JSName("getUID")
  def getUID_EMEPLAYREADY(drmType: EME_PLAYREADY): String = js.native
  @JSName("getUID")
  def getUID_EMEWIDEVINECDM(drmType: EME_WIDEVINE_CDM): String = js.native
  @JSName("getUID")
  def getUID_PLAYREADY(drmType: PLAYREADY): String = js.native
  @JSName("getUID")
  def getUID_VERIMATRIX(drmType: VERIMATRIX): String = js.native
  @JSName("getUID")
  def getUID_WIDEVINECDM(drmType: WIDEVINE_CDM): String = js.native
  
  /**
    * Retrieves the AVPlay version.
    * @returns string string current version
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def getVersion(): String = js.native
  
  /**
    * Skips playback backward by a specific amount of time. The player state is unchanged.
    * For HTTP streaming, this method is successful even when the resulting timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    * @param milliseconds Time to skip backward, in milliseconds
    * @param successCallback Callback method to invoke when the call is successful
    * @param errorCallback Callback method to invoke when an error occurs
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    */
  def jumpBackward(milliseconds: Double): Unit = js.native
  def jumpBackward(milliseconds: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def jumpBackward(milliseconds: Double, onsuccess: SuccessCallback): Unit = js.native
  def jumpBackward(milliseconds: Double, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Skips playback forward by a specific amount of time. The player state is unchanged.
    * Passing the optional callbacks is recommended. For best performance, ensure that the previous call to this API was successful.
    * For HTTP streaming, this method is successful even when the resulting timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    * @param milliseconds Time to skip forward, in milliseconds
    * @param successCallback Callback method to invoke when the call is successful
    * @param errorCallback Callback method to invoke when an error occurs
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    */
  def jumpForward(milliseconds: Double): Unit = js.native
  def jumpForward(milliseconds: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def jumpForward(milliseconds: Double, onsuccess: SuccessCallback): Unit = js.native
  def jumpForward(milliseconds: Double, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Instantiates the player object with a content URL as the input parameter.
    * @param url Content URL for playback. It can be an absolute local path or a remote URL from a network-based stream server.
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE"
    */
  def open(url: String): Unit = js.native
  
  /**
    * Pauses playback. If this method is called successfully, current time updates are stopped.
    * @throw WebAPIException with error type NotSupportedError, InvalidStateError, InvalidAccessError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "PLAYING", "PAUSED"
    */
  def pause(): Unit = js.native
  
  /**
    * Starts stream playback, or resumes stream playback after pause.
    * @throw WebAPIException NotSupportedError, InvalidStateError, UnknownError
    * @since 2.3
    * @note Adaptive streaming using TS container (for e.g. HLS) with audio sample rate changing across variants may cause audio loss.
    * @constraint Can be called in the following states: "READY", "PLAYING", "PAUSED"
    */
  def play(): Unit = js.native
  
  /**
    * Prepares the media player for playback synchronously. The player must already be created with a valid URI.
    * @throw WebAPIException NotSupportedError, InvalidValuesError, InvalidAccessError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY"
    */
  def prepare(): Unit = js.native
  
  /**
    * Prepares the media player for playback asynchronously. This method is preferred over prepare because it returns immediately and does not block the application thread during preparation.
    * When preparation is successful, the success callback is returned and the player is in READY state. If preparation fails, the error callback returns the error value.
    * When prepareAsync is used with "PREBUFFER_MODE", successCallback is invoked when prebuffering is complete, instead of when preparation is complete.
    * @param successCallback Callback method to invoke when the call is successful
    * @param errorCallback WebAPIError error type NotSupportedError, InvalidStateError, UnknownError
    * with error type InvalidValuesError, if given URL through open() is invalid. e.g., webapis.avplay.open("InvalidURL").
    * with error type InvalidAccessError, if given URL through open() is valid, but not exist or Network Issue. e.g., webapis.avplay.open("http://abc").
    * @throw WebAPIException TypeMismatchError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY"
    */
  def prepareAsync(): Unit = js.native
  def prepareAsync(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def prepareAsync(onsuccess: SuccessCallback): Unit = js.native
  def prepareAsync(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * During multitasking, restores the player state when the application is resumed. For live streaming or DRM-encrypted content playback, you must check whether the streaming URL has changed or the DRM session or license has expired, and specify the new URL and DRM information as needed.
    * @param URL updated URL after suspend. If null, the stored URL is used.
    * For live streaming or DRM-encrypted content playback, in case the URL has changed or the DRM license or session has expired, checking for and passing the newest URL is recommended.
    * @param resumeTime (milliseconds) Optional. Position from which to resume playback. If 0, the stored position is used.
    * For live streaming, this parameter is not meaningful. Do not pass 0 for this parameter.
    * For DRM-encrypted content playback, if the DRM session has expired, to recreate the playback pipeline, pass 0 for this parameter.
    * @param bPrepare Optional boolean. false (default): Player sets the resume behavior automatically. true: Player does not resume automatically. The application must invoke the prepare and play methods.
    * For live streaming, this parameter is not meaningful. Do not pass true for this parameter.
    * For DRM-encrypted content playback: if the DRM session has expired, pass true for this parameter.
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "PLAYING", "PAUSED"
    */
  def restore(URL: String): Unit = js.native
  def restore(URL: String, resumeTime: js.UndefOr[scala.Nothing], bPrepare: Boolean): Unit = js.native
  def restore(URL: String, resumeTime: Double): Unit = js.native
  def restore(URL: String, resumeTime: Double, bPrepare: Boolean): Unit = js.native
  
  /**
    * During multitasking, restores the player state when the application is resumed. restoreAsync is an asynchronous interface.
    * Other API, restore is a synchronous interface which blocks the application thread.
    * This method is preferred over restore because it returns immediately and does not block the application thread during its restoration.
    * When player is restored successful, the success callback is returned and player resumed the playback from the restored playback position, state, properties etc.
    * If restoration fails, the error callback returns the error value.
    * Application is required to make further calls to avplay on its success or failure callback happens.
    * For live streaming or DRM-encrypted content playback, you must check whether the streaming URL has changed or the DRM session or license has expired, and specify the new URL and DRM information as needed.
    * @param URL updated URL after suspend. If null, the stored URL is used.
    * For live streaming or DRM-encrypted content playback, in case the URL has changed or the DRM license or session has expired, checking for and passing the newest URL is recommended.
    * @param resumeTime (milliseconds) Optional. Position from which to resume playback. If 0, the stored position is used.
    * For live streaming, this parameter is not meaningful. Do not pass 0 for this parameter.
    * For DRM-encrypted content playback, if the DRM session has expired, to recreate the playback pipeline, pass 0 for this parameter.
    * @param bPrepare Optional boolean. false (default): Player sets the resume behavior automatically. true: Player does not resume automatically. The application must invoke the prepare and play methods.
    * For live streaming, this parameter is not meaningful. Do not pass true for this parameter.
    * For DRM-encrypted content playback: if the DRM session has expired, pass true for this parameter.
    * @param successCallback Callback method to invoke when the call is successful
    * @param errorCallback Callback method to invoke when an error occurs
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "PLAYING", "PAUSED"
    */
  def restoreAsync(URL: String): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: js.UndefOr[scala.Nothing],
    bPrepare: js.UndefOr[scala.Nothing],
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: js.UndefOr[scala.Nothing],
    bPrepare: js.UndefOr[scala.Nothing],
    onsuccess: SuccessCallback
  ): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: js.UndefOr[scala.Nothing],
    bPrepare: js.UndefOr[scala.Nothing],
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: js.UndefOr[scala.Nothing], bPrepare: Boolean): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: js.UndefOr[scala.Nothing],
    bPrepare: Boolean,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: js.UndefOr[scala.Nothing], bPrepare: Boolean, onsuccess: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: js.UndefOr[scala.Nothing],
    bPrepare: Boolean,
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: js.UndefOr[scala.Nothing],
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: js.UndefOr[scala.Nothing], onsuccess: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: js.UndefOr[scala.Nothing],
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: Boolean): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Boolean,
    onsuccess: js.UndefOr[scala.Nothing],
    onerror: ErrorCallback
  ): Unit = js.native
  def restoreAsync(URL: String, resumeTime: Double, bPrepare: Boolean, onsuccess: SuccessCallback): Unit = js.native
  def restoreAsync(
    URL: String,
    resumeTime: Double,
    bPrepare: Boolean,
    onsuccess: SuccessCallback,
    onerror: ErrorCallback
  ): Unit = js.native
  
  /**
    * Skips playback to a specific timestamp.
    * For HTTP streaming, this method is successful even when the specified timestamp is invalid. The internal player automatically resets an out-of-range value to an in-range one.
    * @param milliseconds Timestamp to skip to
    * @param successCallback Callback method to invoke when the call is successful
    * @param errorCallback Callback method to invoke when an error occurs
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE","READY", "PLAYING" (buffered data is flushed and buffering starts over), "PAUSED"
    * During this async operation, the other API would not be allowed. So, the application needs to wait for one of both callbacks( SuccessCallback, errorCallback) before any other API call.
    * For LIVE stream case, seek position must be within DVR range. DVR range could be retrieved using GET_LIVE_DURATION property in getStreamingProperty API.
    */
  def seekTo(milliseconds: Double): Unit = js.native
  def seekTo(milliseconds: Double, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
  def seekTo(milliseconds: Double, onsuccess: SuccessCallback): Unit = js.native
  def seekTo(milliseconds: Double, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  
  /**
    * Sets the buffer size for the play and resume scenarios. The time buffer size must be at least 4 seconds.
    * For example, if a 10 second buffer size is set, playback can only start or resume after 10 seconds of media has accumulated in the buffer.
    * Play scenarios include user-initiated streaming playback and whenever media playback is starting for the first time.
    * Resume scenarios include resuming playback after pause or seek operations, or when lack of data causes playback rebuffering.
    * @param option "PLAYER_BUFFER_FOR_PLAY" or "PLAYER_BUFFER_FOR_RESUME"
    * @param unit "PLAYER_BUFFER_SIZE_IN_SECOND"
    * @param amount Data amount to be buffered, in seconds as specified by the unit parameter
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @note unit "PLAYER_BUFFER_SIZE_IN_BYTE" has been deprecated from Tizen version 5.0
    * @constraint Can be called in the following states: "IDLE"
    */
  def setBufferingParam(option: AVPlayBufferOption, unit: AVPlayBufferSizeUnit, amount: Double): Unit = js.native
  def setBufferingParam(option: PLAYER_BUFFER_FOR_PLAY, unit: PLAYER_BUFFER_SIZE_IN_BYTE, amount: Double): Unit = js.native
  def setBufferingParam(option: PLAYER_BUFFER_FOR_PLAY, unit: PLAYER_BUFFER_SIZE_IN_SECOND, amount: Double): Unit = js.native
  def setBufferingParam(option: PLAYER_BUFFER_FOR_RESUME, unit: PLAYER_BUFFER_SIZE_IN_BYTE, amount: Double): Unit = js.native
  def setBufferingParam(option: PLAYER_BUFFER_FOR_RESUME, unit: PLAYER_BUFFER_SIZE_IN_SECOND, amount: Double): Unit = js.native
  @JSName("setBufferingParam")
  def setBufferingParam_PLAYERBUFFERFORPLAY(option: PLAYER_BUFFER_FOR_PLAY, unit: AVPlayBufferSizeUnit, amount: Double): Unit = js.native
  @JSName("setBufferingParam")
  def setBufferingParam_PLAYERBUFFERFORRESUME(option: PLAYER_BUFFER_FOR_RESUME, unit: AVPlayBufferSizeUnit, amount: Double): Unit = js.native
  @JSName("setBufferingParam")
  def setBufferingParam_PLAYERBUFFERSIZEINBYTE(option: AVPlayBufferOption, unit: PLAYER_BUFFER_SIZE_IN_BYTE, amount: Double): Unit = js.native
  @JSName("setBufferingParam")
  def setBufferingParam_PLAYERBUFFERSIZEINSECOND(option: AVPlayBufferOption, unit: PLAYER_BUFFER_SIZE_IN_SECOND, amount: Double): Unit = js.native
  
  /**
    * Sets the video screen mode in the specified display area.
    * @param displayMode "PLAYER_DISPLAY_MODE_LETTER_BOX", "PLAYER_DISPLAY_MODE_FULL_SCREEN", or "PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO"
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def setDisplayMethod(displayMode: AVPlayDisplayMode): Unit = js.native
  @JSName("setDisplayMethod")
  def setDisplayMethod_PLAYERDISPLAYMODEAUTOASPECTRATIO(displayMode: PLAYER_DISPLAY_MODE_AUTO_ASPECT_RATIO): Unit = js.native
  @JSName("setDisplayMethod")
  def setDisplayMethod_PLAYERDISPLAYMODEFULLSCREEN(displayMode: PLAYER_DISPLAY_MODE_FULL_SCREEN): Unit = js.native
  @JSName("setDisplayMethod")
  def setDisplayMethod_PLAYERDISPLAYMODELETTERBOX(displayMode: PLAYER_DISPLAY_MODE_LETTER_BOX): Unit = js.native
  
  /**
    * Sets the display area for video content playback.
    * The 4 parameters specify the left side, top, window width, and window height based on a 1920 x 1080 resolution screen, regardless of the actual application resolution.
    * @param x Display area top-left X-coordinate. Must be less than the TV screen width.
    * @param y Display area top-left Y-coordinate. Must be less than the TV screen height.
    * @param width Display area width. Must be less than the TV screen width.
    * @param height Display area height from source image. Must be less than the source image height.
    * @throw WebAPIException with error type TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states:"IDLE", "READY", "PLAYING", "PAUSED" (when APP is using normal calling sequence , OPEN+setDisplay+PREPARE etc).
    */
  def setDisplayRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Updates the DRM information, such as SetProperties. You can change the DRM mode and run the control feature. The AVPlayDrmOperation and jsonParam parameters depend on the DRM type.
    * Please refer to the specification (https://developer.samsung.com/tv/develop/specifications/general-specifications) for the supported DRM.
    * @param drmType AVPlayDrmType {"PLAYREADY", "EME_PLAYREADY", "VERIMATRIX", "WIDEVINE_CDM", "EME_WIDEVINE_CDM"}
    * @param drmOperation AVPlayDrmOperation : String specifying the DRM operation to be performed. The valid values are depending on the DRM Types.
    * This is mainly used for setting DRM information, such as the license server, application-specific custom data, SOAP or HTTP header, the genChallenge mode, and license usage.
    * @param jsonParam string DRM parameter represented by JSON string. You can use the JSON.stringify method to generate the JSON string.
    * @returns string
    * @privilegeLevel Public
    * @privilegeName http://developer.samsung.com/privilege/drmplay
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, SecurityError, InvalidStateError, UnknownError
    * @since 2.3
    * @note 'GetUID' operation has been deprecated from Tizen version 5.0, rather application should use getUID() API.
    * 'Initialize' and 'Finalize' operations have been deprecated from Tizen version 5.0. Because these are being executed by avplay itself.
    * 'widevine_app_session' and 'widevine_data_type' operations have been deprecated from Tizen version 5.0. Because these are merged into "SetProperties". Please refer to setDrm() example.
    * @constraint Can be called in the following states: "IDLE"
    */
  def setDrm(
    drmType: AVPlayDrmType | PLAYREADY | EME_PLAYREADY | VERIMATRIX | WIDEVINE_CDM | EME_WIDEVINE_CDM,
    drmOperation: AVPlayDrmOperation | SetProperties | InstallLicense | ProcessInitiator | GetUID | Initialize | Finalize | widevine_license_data | widevine_app_session | widevine_data_type,
    jsonParam: String
  ): String = js.native
  
  /**
    * Sets the local path for the external subtitle file. Only absolute local paths are supported. If the subtitle file is stored remotely, you must first download the file to local storage, and pass the absolute local path.
    * @param filePath Absolute local path
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def setExternalSubtitlePath(filePath: String): Unit = js.native
  
  /**
    * Sets asynchronous callback methods for player information notifications, such as buffering progress, player information, playback mode, and DRM mode information.
    * @param playbackCallback AVPlayPlaybackCallback
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE" (recommended), "READY", "PLAYING", "PAUSED"
    * To avoid missing necessary information, the onbufferingstart, onbufferingprogress, onbufferingcomplete, onerror, onevent, and ondrmevent listeners must be set during the "IDLE" state.
    */
  def setListener(playbackCallback: AVPlayPlaybackCallback): Unit = js.native
  
  /**
    * Switches audio or subtitle tracks during playback.
    * @param trackType "AUDIO" or "TEXT"
    * @param trackIndex AVPlayStreamInfo index
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @note Since tizen version 5.0, the trackType "AUDIO" is supported for DASH streaming.
    * @constraint Can be called in the following states: "READY" (for Smooth Streaming only), "PLAYING", "PAUSED" (for TEXT tracks only)
    * If buffering is not complete, calling this method for an AUDIO track returns an error.
    * The trackType "TEXT" is not supported for DASH streaming.
    */
  def setSelectTrack(trackType: AVPlayStreamType, trackIndex: Double): Unit = js.native
  @JSName("setSelectTrack")
  def setSelectTrack_AUDIO(trackType: AUDIO, trackIndex: Double): Unit = js.native
  @JSName("setSelectTrack")
  def setSelectTrack_TEXT(trackType: TEXT, trackIndex: Double): Unit = js.native
  @JSName("setSelectTrack")
  def setSelectTrack_VIDEO(trackType: VIDEO, trackIndex: Double): Unit = js.native
  
  /**
    * Enables or disables external subtitles.
    * @param onoff Boolean value:
    * true: Subtitles are hidden
    * false: Subtitles are shown. The application does not receive any subtitle-related events.
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY" (when using the synchronous prepare method), "PLAYING", "PAUSED"
    */
  def setSilentSubtitle(onoff: Boolean): Unit = js.native
  
  /**
    * Retrieves the audio spectrum analysis result every 30 ms. You can use it for an equalizer effect video or in a PartyTV application. The spectrum is analyzed across an array of 31 bands, of which Bands[14] ~ Bands[18] generally have the largest values.
    * @param soundAnalysisCallback AVPlaySoundAnalysisCallback
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @note `deprecated` 2.4
    * @constraint Can be called in the following states: "IDLE"
    */
  def setSoundAnalysisListener(soundAnalysisCallback: AVPlaySoundAnalysisCallback): Unit = js.native
  
  /**
    * Sets the current playback rate. Positive parameter values play the media forwards, while negative values cause the media to play in reverse.
    *
    * The range of valid playback rates depends on the streaming protocol. If the input parameter is out of range, the player returns the PLAYER_ERROR_INVALID_PARAMETER flag.
    * @param playbackSpeed -16x, -8x, -4x, -2x, 1x, 2x, 4x, 8x, 16x
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "READY, "PLAYING", "PAUSED"
    * For the general HTTP and HTTPS, the supported playback rate is -8x ~ 8x. (Repeated seek)
    * Please refer to the specification (https://developer.samsung.com/tv/develop/specifications/general-specifications/#streaming-feature-support) for the supported range of other streaming types.
    */
  def setSpeed(playbackSpeed: Double): Unit = js.native
  
  /**
    * Sets specific feature values for HTTP, MMS, or specific streaming engine (Smooth Streaming, HLS, DASH, DivX Plus Streaming, or Widevine). The available streaming properties depend on the streaming protocol or engine.
    * Use the CUSTOM_MESSAGE property for streaming engine or CP-specific settings.
    * @param propertyType "COOKIE", "USER_AGENT", "PREBUFFER_MODE" , "ADAPTIVE_INFO", "SET_MODE_4K", "PROPERTY_HD_AUDIO", "LISTEN_SPARSE_TRACK", "WIDEVINE", "USE_VIDEOMIXER", "SET_MIXEDFRAME", "PORTRAIT_MODE"
    * @param propertyParam Value according to the propertyType. e.g. "ADAPTIVE_INFO" PropetyTypes are "BITRATES", "STARTBITRATE", "SKIPBITRATE".
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @note "USE_VIDEOMIXER", "SET_MIXEDFRAME" are only for product B2B and available from Tizen 2.4 onwards.
    * "PORTRAIT_MODE" is only for product B2B and available from Tizen 3.0 onwards.
    * "WIDEVINE" unit has been deprecated from Tizen version 4.0
    * "PROPERTY_HD_AUDIO" unit has been deprecated from Tizen version 2.4
    * @constraint Can be called in the following states: "IDLE"
    * "READY", "PLAYING", "PAUSED" is valid only for SET_MIXEDFRAME.
    */
  def setStreamingProperty(propertyType: AVPlayStreamingPropertyType, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_ADAPTIVEINFO(propertyType: ADAPTIVE_INFO, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_AVAILABLEBITRATE(propertyType: AVAILABLE_BITRATE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_COOKIE(propertyType: COOKIE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_CURRENTBANDWIDTH(propertyType: CURRENT_BANDWIDTH, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_GETLIVEDURATION(propertyType: GET_LIVE_DURATION, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_ISLIVE(propertyType: IS_LIVE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_LISTENSPARSETRACK(propertyType: LISTEN_SPARSE_TRACK, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_PORTRAITMODE(propertyType: PORTRAIT_MODE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_PREBUFFERMODE(propertyType: PREBUFFER_MODE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_PROPERTYHDAUDIO(propertyType: PROPERTY_HD_AUDIO, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_SETMIXEDFRAME(propertyType: SET_MIXEDFRAME, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_SETMODE4K(propertyType: SET_MODE_4K, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_SETVR360MODE(propertyType: SET_VR360_MODE, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_USERAGENT(propertyType: USER_AGENT, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_USEVIDEOMIXER(propertyType: USE_VIDEOMIXER, propertyParam: String): Unit = js.native
  @JSName("setStreamingProperty")
  def setStreamingProperty_WIDEVINE(propertyType: WIDEVINE, propertyParam: String): Unit = js.native
  
  /**
    * Adjusts external subtitle synchronization with the audio and video.
    * @param position Time delay in milliseconds. The duration can be a positive or negative number; a positive delay displays the subtitles later, while a negative delay displays the subtitles sooner.
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "PLAYING", "PAUSED"
    */
  def setSubtitlePosition(position: Double): Unit = js.native
  
  /**
    * Sets the stream buffering timeout. When the specified amount of time has passed, the onbufferingcomplete callback is invoked, irrespective of buffering progress.
    * If not set using this method, the default buffer size is 32MB or 10 seconds of playable data, and 20 seconds time-out.
    * @param seconds Buffering timeout duration, in seconds. Depending on network conditions, 3 to 10 seconds is recommended.
    * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def setTimeoutForBuffering(seconds: Double): Unit = js.native
  
  /**
    * Stops the player. Call this function after the video finishes playing.
    * @throw WebAPIException NotSupportedError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "NONE", "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def stop(): Unit = js.native
  
  /**
    * Pauses the player state when the application is sent to the background. Saves the current statistics for the ongoing playback session.
    * @throw WebAPIException NotSupportedError, InvalidStateError, UnknownError
    * @since 2.3
    * @constraint Can be called in the following states: "READY, "PLAYING", "PAUSED"
    */
  def suspend(): Unit = js.native
  
  /**
    * Unregisters the sound analysis listener.
    * @throw WebAPIException NotSupportedError, InvalidStateError, UnknownError
    * @since 2.3
    * @note `deprecated` 2.4
    * @constraint Can be called in the following states: "IDLE", "READY", "PLAYING", "PAUSED"
    */
  def unsetSoundAnalysisListener(): Unit = js.native
}
