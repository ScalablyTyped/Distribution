package typings.titanium.Titanium.Media

import typings.titanium.CameraOptionsType
import typings.titanium.Dictionary
import typings.titanium.MediaAuthorizationResponse
import typings.titanium.MediaQueryType
import typings.titanium.MusicLibraryOptionsType
import typings.titanium.PhotoGalleryOptionsType
import typings.titanium.PreviewImageOptions
import typings.titanium.RequestCameraAccessResult
import typings.titanium.RequestMusicLibraryAccessResult
import typings.titanium.RequestPhotoGalleryAccessResult
import typings.titanium.RouteDescription
import typings.titanium.ScreenshotResult
import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.MediaCamerareadyEvent
import typings.titanium.Titanium.MediaRoutechangeEvent
import typings.titanium.Titanium.MediaVolumeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.cameraready
import typings.titanium.titaniumStrings.routechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Media")
@js.native
object ^ extends js.Object {
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_640x480: Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_IFRAME_1280x720: Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_IFRAME_960x540: Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * An instance of <Titanium.Media.MusicPlayer> representing the app-specific music player.
  		 */
  val appMusicPlayer: MusicPlayer = js.native
  /**
  		 * Returns `true` if the device is playing audio.
  		 */
  val audioPlaying: Boolean = js.native
  /**
  		 * A constant for the audio session category to be used.
  		 */
  var audioSessionCategory: String = js.native
  /**
  		 * Array of media type constants supported for the camera.
  		 */
  var availableCameraMediaTypes: js.Array[_] = js.native
  /**
  		 * Array indicating which cameras are available, `CAMERA_FRONT`, `CAMERA_REAR` or both.
  		 */
  val availableCameras: js.Array[Double] = js.native
  /**
  		 * Array of media type constants supported for saving to the device's camera roll or saved images album.
  		 */
  var availablePhotoGalleryMediaTypes: js.Array[_] = js.native
  /**
  		 * Array of media type constants supported for the photo library.
  		 */
  var availablePhotoMediaTypes: js.Array[_] = js.native
  /**
  		 * Current average microphone level in dB or -1 if microphone monitoring is disabled.
  		 */
  var averageMicrophonePower: Double = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Returns the authorization status for the camera.
  		 */
  val cameraAuthorization: Double = js.native
  /**
  		 * Determines how the flash is fired when using the device's camera.
  		 */
  var cameraFlashMode: Double = js.native
  /**
  		 * `true` if the device has a recording input device available.
  		 */
  val canRecord: Boolean = js.native
  /**
  		 * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
  		 */
  val currentRoute: RouteDescription = js.native
  /**
  		 * `true` if the device has camera support.
  		 */
  val isCameraSupported: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Current microphone level peak power in dB or -1 if microphone monitoring is disabled.
  		 */
  val peakMicrophonePower: Double = js.native
  /**
  		 * An instance of <Titanium.Media.MusicPlayer> representing the system-wide music player.
  		 */
  val systemMusicPlayer: MusicPlayer = js.native
  /**
  		 * Current volume of the playback device.
  		 */
  val volume: Double = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  @JSName("addEventListener")
  def addEventListener_cameraready(
    name: cameraready,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaCamerareadyEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_routechange(
    name: routechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaRoutechangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volume(
    name: typings.titanium.titaniumStrings.volume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaVolumeEvent, Unit]
  ): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Plays a device beep notification.
  		 */
  def beep(): Unit = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.AudioPlayer>.
  		 */
  def createAudioPlayer(): AudioPlayer = js.native
  def createAudioPlayer(parameters: Dictionary[AudioPlayer]): AudioPlayer = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.AudioRecorder>.
  		 */
  def createAudioRecorder(): AudioRecorder = js.native
  def createAudioRecorder(parameters: Dictionary[AudioRecorder]): AudioRecorder = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.Sound>.
  		 */
  def createSound(): Sound = js.native
  def createSound(parameters: Dictionary[Sound]): Sound = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.SystemAlert>.
  		 * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
  		 */
  def createSystemAlert(): SystemAlert = js.native
  def createSystemAlert(parameters: Dictionary[SystemAlert]): SystemAlert = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.VideoPlayer>.
  		 */
  def createVideoPlayer(): VideoPlayer = js.native
  def createVideoPlayer(parameters: Dictionary[VideoPlayer]): VideoPlayer = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  @JSName("fireEvent")
  def fireEvent_cameraready(name: cameraready): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cameraready(name: cameraready, event: MediaCamerareadyEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_routechange(name: routechange): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_routechange(name: routechange, event: MediaRoutechangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_volume(name: typings.titanium.titaniumStrings.volume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_volume(name: typings.titanium.titaniumStrings.volume, event: MediaVolumeEvent): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Media.apiName> property.
  		 * @deprecated Access <Titanium.Media.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Media.appMusicPlayer> property.
  		 * @deprecated Access <Titanium.Media.appMusicPlayer> instead.
  		 */
  def getAppMusicPlayer(): MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioPlaying> property.
  		 * @deprecated Access <Titanium.Media.audioPlaying> instead.
  		 */
  def getAudioPlaying(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioSessionCategory> property.
  		 * @deprecated Access <Titanium.Media.audioSessionCategory> instead.
  		 */
  def getAudioSessionCategory(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 * @deprecated Access <Titanium.Media.availableCameraMediaTypes> instead.
  		 */
  def getAvailableCameraMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameras> property.
  		 * @deprecated Access <Titanium.Media.availableCameras> instead.
  		 */
  def getAvailableCameras(): js.Array[Double] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
  		 * @deprecated Access <Titanium.Media.availablePhotoGalleryMediaTypes> instead.
  		 */
  def getAvailablePhotoGalleryMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
  		 * @deprecated Access <Titanium.Media.availablePhotoMediaTypes> instead.
  		 */
  def getAvailablePhotoMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.averageMicrophonePower> property.
  		 * @deprecated Access <Titanium.Media.averageMicrophonePower> instead.
  		 */
  def getAverageMicrophonePower(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.bubbleParent> property.
  		 * @deprecated Access <Titanium.Media.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraAuthorization> property.
  		 * @deprecated Access <Titanium.Media.cameraAuthorization> instead.
  		 */
  def getCameraAuthorization(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraFlashMode> property.
  		 * @deprecated Access <Titanium.Media.cameraFlashMode> instead.
  		 */
  def getCameraFlashMode(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.canRecord> property.
  		 * @deprecated Access <Titanium.Media.canRecord> instead.
  		 */
  def getCanRecord(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.currentRoute> property.
  		 * @deprecated Access <Titanium.Media.currentRoute> instead.
  		 */
  def getCurrentRoute(): RouteDescription = js.native
  /**
  		 * Gets the value of the <Titanium.Media.isCameraSupported> property.
  		 * @deprecated Access <Titanium.Media.isCameraSupported> instead.
  		 */
  def getIsCameraSupported(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.Media.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Media.peakMicrophonePower> property.
  		 * @deprecated Access <Titanium.Media.peakMicrophonePower> instead.
  		 */
  def getPeakMicrophonePower(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_640x480> property.
  		 * @deprecated Access <Titanium.Media.QUALITY_640x480> instead.
  		 */
  def getQUALITY_640x480(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_1280x720> property.
  		 * @deprecated Access <Titanium.Media.QUALITY_IFRAME_1280x720> instead.
  		 */
  def getQUALITY_IFRAME_1280x720(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_960x540> property.
  		 * @deprecated Access <Titanium.Media.QUALITY_IFRAME_960x540> instead.
  		 */
  def getQUALITY_IFRAME_960x540(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.systemMusicPlayer> property.
  		 * @deprecated Access <Titanium.Media.systemMusicPlayer> instead.
  		 */
  def getSystemMusicPlayer(): MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.volume> property.
  		 * @deprecated Access <Titanium.Media.volume> instead.
  		 */
  def getVolume(): Double = js.native
  /**
  		 * Returns `true` if the app has audio permissions.
  		 * @deprecated Use [Titanium.Media.hasAudioRecorderPermissions](Titanium.Media.hasAudioRecorderPermissions) instead.
  		 */
  def hasAudioPermissions(): Boolean = js.native
  /**
  		 * Returns `true` if the app has audio permissions.
  		 */
  def hasAudioRecorderPermissions(): Boolean = js.native
  /**
  		 * Returns `true` if the app has camera access.
  		 */
  def hasCameraPermissions(): Boolean = js.native
  /**
  		 * Returns `true` if the app has music library access.
  		 */
  def hasMusicLibraryPermissions(): Boolean = js.native
  /**
  		 * Returns `true` if the app has photo gallery permissions.
  		 */
  def hasPhotoGalleryPermissions(): Boolean = js.native
  /**
  		 * Hides the device camera UI.
  		 */
  def hideCamera(): Unit = js.native
  /**
  		 * Hides the music library.
  		 */
  def hideMusicLibrary(): Unit = js.native
  /**
  		 * Returns `true` if the source supports the specified media type.
  		 */
  def isMediaTypeSupported(source: String, `type`: String): Boolean = js.native
  /**
  		 * Shows the music library and allows the user to select one or more tracks.
  		 */
  def openMusicLibrary(options: MusicLibraryOptionsType): Unit = js.native
  /**
  		 * Opens the photo gallery image picker.
  		 */
  def openPhotoGallery(options: PhotoGalleryOptionsType): Unit = js.native
  /**
  		 * Displays the given image.
  		 */
  def previewImage(options: Dictionary[PreviewImageOptions]): Unit = js.native
  /**
  		 * Searches the music library for items matching the specified search predicates.
  		 */
  def queryMusicLibrary(query: MediaQueryType): js.Array[Item] = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  @JSName("removeEventListener")
  def removeEventListener_cameraready(
    name: cameraready,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaCamerareadyEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_routechange(
    name: routechange,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaRoutechangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volume(
    name: typings.titanium.titaniumStrings.volume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ MediaVolumeEvent, Unit]
  ): Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAudioRecorderPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, Unit]): Unit = js.native
  /**
  		 * Requests for camera access.
  		 */
  def requestCameraPermissions(callback: js.Function1[/* param0 */ RequestCameraAccessResult, Unit]): Unit = js.native
  /**
  		 * Request permissions for the native music-library.
  		 */
  def requestMusicLibraryPermissions(callback: js.Function1[/* param0 */ RequestMusicLibraryAccessResult, Unit]): Unit = js.native
  /**
  		 * Requests for photo gallery permissions.
  		 */
  def requestPhotoGalleryPermissions(callback: js.Function1[/* param0 */ RequestPhotoGalleryAccessResult, Unit]): Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def saveToPhotoGallery(media: Blob, callbacks: js.Any): Unit = js.native
  def saveToPhotoGallery(media: File, callbacks: js.Any): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.audioSessionCategory> property.
  		 * @deprecated Set the value using <Titanium.Media.audioSessionCategory> instead.
  		 */
  def setAudioSessionCategory(audioSessionCategory: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 * @deprecated Set the value using <Titanium.Media.availableCameraMediaTypes> instead.
  		 */
  def setAvailableCameraMediaTypes(availableCameraMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
  		 * @deprecated Set the value using <Titanium.Media.availablePhotoGalleryMediaTypes> instead.
  		 */
  def setAvailablePhotoGalleryMediaTypes(availablePhotoGalleryMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
  		 * @deprecated Set the value using <Titanium.Media.availablePhotoMediaTypes> instead.
  		 */
  def setAvailablePhotoMediaTypes(availablePhotoMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.averageMicrophonePower> property.
  		 * @deprecated Set the value using <Titanium.Media.averageMicrophonePower> instead.
  		 */
  def setAverageMicrophonePower(averageMicrophonePower: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.Media.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.cameraFlashMode> property.
  		 * @deprecated Set the value using <Titanium.Media.cameraFlashMode> instead.
  		 */
  def setCameraFlashMode(cameraFlashMode: Double): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.Media.lifecycleContainer> instead.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Overrides the default audio route when using the <Titanium.Media.AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD> session mode.
  		 */
  def setOverrideAudioRoute(route: Double): Unit = js.native
  /**
  		 * Shows the camera.
  		 */
  def showCamera(options: CameraOptionsType): Unit = js.native
  /**
  		 * Starts monitoring the microphone sound level.
  		 */
  def startMicrophoneMonitor(): Unit = js.native
  /**
  		 * Starts video capture using the camera specified.
  		 */
  def startVideoCapture(): Unit = js.native
  /**
  		 * Stops monitoring the microphone sound level.
  		 */
  def stopMicrophoneMonitor(): Unit = js.native
  /**
  		 * Stops video capture using the camera specified.
  		 */
  def stopVideoCapture(): Unit = js.native
  /**
  		 * Switches between front and rear-facing cameras. Make sure to set one of the below constants to determine
  		 * the camera you want to switch to.
  		 */
  def switchCamera(camera: Double): Unit = js.native
  /**
  		 * Uses the device camera to capture a photo.
  		 */
  def takePicture(): Unit = js.native
  /**
  		 * Takes a screen shot of the visible UI on the device.
  		 */
  def takeScreenshot(callback: js.Function1[/* param0 */ ScreenshotResult, Unit]): Unit = js.native
  /**
  		 * Makes the device vibrate.
  		 */
  def vibrate(): Unit = js.native
  def vibrate(pattern: js.Array[Double]): Unit = js.native
}

