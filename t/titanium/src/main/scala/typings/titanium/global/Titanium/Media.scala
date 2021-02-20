package typings.titanium.global.Titanium

import typings.titanium.CameraOptionsType
import typings.titanium.Dictionary
import typings.titanium.MediaAuthorizationResponse
import typings.titanium.MediaQueryType
import typings.titanium.MediaScannerResponse
import typings.titanium.MusicLibraryOptionsType
import typings.titanium.PhotoGalleryOptionsType
import typings.titanium.PreviewImageOptions
import typings.titanium.RequestCameraAccessResult
import typings.titanium.RequestMusicLibraryAccessResult
import typings.titanium.RequestPhotoGalleryAccessResult
import typings.titanium.RouteDescription
import typings.titanium.ScreenshotResult
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.MediaCamerareadyEvent
import typings.titanium.Titanium.MediaRoutechangeEvent
import typings.titanium.Titanium.MediaVolumeEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.cameraready
import typings.titanium.titaniumStrings.routechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level Media module.
  */
@JSGlobal("Titanium.Media")
@js.native
class Media ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top-level Media module.
  */
object Media {
  
  @JSGlobal("Titanium.Media")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Audio file format 3GPP2.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_3GP2")
  @js.native
  val AUDIO_FILEFORMAT_3GP2: Double = js.native
  
  /**
    * Audio file format 3GPP.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_3GPP")
  @js.native
  val AUDIO_FILEFORMAT_3GPP: Double = js.native
  
  /**
    * Audio file format Audio Interchange File Format (AIFF).
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_AIFF")
  @js.native
  val AUDIO_FILEFORMAT_AIFF: Double = js.native
  
  /**
    * Audio file format Adaptive Multi-Rate (AMR).
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_AMR")
  @js.native
  val AUDIO_FILEFORMAT_AMR: Double = js.native
  
  /**
    * Audio file format Apple Compressed Audio Format (CAF).
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_CAF")
  @js.native
  val AUDIO_FILEFORMAT_CAF: Double = js.native
  
  /**
    * Audio file format MP3.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_MP3")
  @js.native
  val AUDIO_FILEFORMAT_MP3: Double = js.native
  
  /**
    * Audio file format MP4.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_MP4")
  @js.native
  val AUDIO_FILEFORMAT_MP4: Double = js.native
  
  /**
    * Audio file format MP4A.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_MP4A")
  @js.native
  val AUDIO_FILEFORMAT_MP4A: Double = js.native
  
  /**
    * Audio file format WAVE.
    */
  @JSGlobal("Titanium.Media.AUDIO_FILEFORMAT_WAVE")
  @js.native
  val AUDIO_FILEFORMAT_WAVE: Double = js.native
  
  /**
    * Audio format MPEG4 AAC encoding.
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_AAC")
  @js.native
  val AUDIO_FORMAT_AAC: Double = js.native
  
  /**
    * Audio format 8-bit [aLaw encoding](https://en.wikipedia.org/wiki/A-law_algorithm).
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_ALAW")
  @js.native
  val AUDIO_FORMAT_ALAW: Double = js.native
  
  /**
    * Audio format Apple lossless encoding.
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_APPLE_LOSSLESS")
  @js.native
  val AUDIO_FORMAT_APPLE_LOSSLESS: Double = js.native
  
  /**
    * Audio format [iLBC encoding](https://en.wikipedia.org/wiki/Internet_Low_Bitrate_Codec).
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_ILBC")
  @js.native
  val AUDIO_FORMAT_ILBC: Double = js.native
  
  /**
    * Audio format Apple IMA4 encoding.
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_IMA4")
  @js.native
  val AUDIO_FORMAT_IMA4: Double = js.native
  
  /**
    * Audio format 16-bit, [linear PCM encoding](https://en.wikipedia.org/wiki/Pulse-code_modulation).
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_LINEAR_PCM")
  @js.native
  val AUDIO_FORMAT_LINEAR_PCM: Double = js.native
  
  /**
    * Audio format 8-bit [muLaw encoding](https://en.wikipedia.org/wiki/M-law_algorithm).
    */
  @JSGlobal("Titanium.Media.AUDIO_FORMAT_ULAW")
  @js.native
  val AUDIO_FORMAT_ULAW: Double = js.native
  
  /**
    * Line-type constant for headphones.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_HEADPHONES")
  @js.native
  val AUDIO_HEADPHONES: scala.Nothing = js.native
  
  /**
    * Line-type constant for headphones and microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_HEADPHONES_AND_MIC")
  @js.native
  val AUDIO_HEADPHONES_AND_MIC: scala.Nothing = js.native
  
  /**
    * Line-type constant for headset in/out.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_HEADSET_INOUT")
  @js.native
  val AUDIO_HEADSET_INOUT: scala.Nothing = js.native
  
  /**
    * Line-type constant for line-out.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_LINEOUT")
  @js.native
  val AUDIO_LINEOUT: scala.Nothing = js.native
  
  /**
    * Line-type constant for microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_MICROPHONE")
  @js.native
  val AUDIO_MICROPHONE: scala.Nothing = js.native
  
  /**
    * Line-type constant indicated mute switch is on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_MUTED")
  @js.native
  val AUDIO_MUTED: scala.Nothing = js.native
  
  /**
    * Line-type constant indicating receiver and microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_RECEIVER_AND_MIC")
  @js.native
  val AUDIO_RECEIVER_AND_MIC: scala.Nothing = js.native
  
  /**
    * For long-duration sounds such as rain, car engine noise, and so on.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_CATEGORY_AMBIENT")
  @js.native
  val AUDIO_SESSION_CATEGORY_AMBIENT: String = js.native
  
  /**
    * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_CATEGORY_PLAYBACK")
  @js.native
  val AUDIO_SESSION_CATEGORY_PLAYBACK: String = js.native
  
  /**
    * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD")
  @js.native
  val AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD: String = js.native
  
  /**
    * Session mode for recording audio; it silences playback audio.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_CATEGORY_RECORD")
  @js.native
  val AUDIO_SESSION_CATEGORY_RECORD: String = js.native
  
  /**
    * Session mode for long-duration sounds such as rain, car engine noise, and so on.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_CATEGORY_SOLO_AMBIENT")
  @js.native
  val AUDIO_SESSION_CATEGORY_SOLO_AMBIENT: String = js.native
  
  /**
    * For long-duration sounds such as rain, car engine noise, and so on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_MODE_AMBIENT")
  @js.native
  val AUDIO_SESSION_MODE_AMBIENT: scala.Nothing = js.native
  
  /**
    * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_MODE_PLAYBACK")
  @js.native
  val AUDIO_SESSION_MODE_PLAYBACK: scala.Nothing = js.native
  
  /**
    * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_MODE_PLAY_AND_RECORD")
  @js.native
  val AUDIO_SESSION_MODE_PLAY_AND_RECORD: scala.Nothing = js.native
  
  /**
    * Session mode for recording audio; it silences playback audio.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY_*` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_MODE_RECORD")
  @js.native
  val AUDIO_SESSION_MODE_RECORD: scala.Nothing = js.native
  
  /**
    * Session mode for long-duration sounds such as rain, car engine noise, and so on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_MODE_SOLO_AMBIENT")
  @js.native
  val AUDIO_SESSION_MODE_SOLO_AMBIENT: scala.Nothing = js.native
  
  /**
    * Constant that specifies audio should output to the default audio route. See <Titanium.Media.setOverrideAudioRoute> for more information.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_OVERRIDE_ROUTE_NONE")
  @js.native
  val AUDIO_SESSION_OVERRIDE_ROUTE_NONE: Double = js.native
  
  /**
    * Constant that specifies audio should output to the speaker. See <Titanium.Media.setOverrideAudioRoute> for more information.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_OVERRIDE_ROUTE_SPEAKER")
  @js.native
  val AUDIO_SESSION_OVERRIDE_ROUTE_SPEAKER: Double = js.native
  
  /**
    * Constant for output on a remote Air Play device. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_AIRPLAY")
  @js.native
  val AUDIO_SESSION_PORT_AIRPLAY: String = js.native
  
  /**
    * Constant for output on a Bluetooth A2DP device. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BLUETOOTHA2DP")
  @js.native
  val AUDIO_SESSION_PORT_BLUETOOTHA2DP: String = js.native
  
  /**
    * Constant for input or output on a Bluetooth Hands-Free Profile device. This can be both an input and output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BLUETOOTHHFP")
  @js.native
  val AUDIO_SESSION_PORT_BLUETOOTHHFP: String = js.native
  
  /**
    * Constant for output on a Bluetooth Low Energy device. This is an output port. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BLUETOOTHLE")
  @js.native
  val AUDIO_SESSION_PORT_BLUETOOTHLE: String = js.native
  
  /**
    * Constant for built-in microphone on an iOS device. This is an input port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BUILTINMIC")
  @js.native
  val AUDIO_SESSION_PORT_BUILTINMIC: String = js.native
  
  /**
    * Constant for the speaker you hold to your ear when on a phone call. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BUILTINRECEIVER")
  @js.native
  val AUDIO_SESSION_PORT_BUILTINRECEIVER: String = js.native
  
  /**
    * Constant for built-in speaker on an iOS device. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_BUILTINSPEAKER")
  @js.native
  val AUDIO_SESSION_PORT_BUILTINSPEAKER: String = js.native
  
  /**
    * Constant for Input or output via Car Audio. This can be both an input and output port. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_CARAUDIO")
  @js.native
  val AUDIO_SESSION_PORT_CARAUDIO: String = js.native
  
  /**
    * Constant for output via High-Definition Multimedia Interface. This is an output port
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_HDMI")
  @js.native
  val AUDIO_SESSION_PORT_HDMI: String = js.native
  
  /**
    * Constant for headphone or headset output. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_HEADPHONES")
  @js.native
  val AUDIO_SESSION_PORT_HEADPHONES: String = js.native
  
  /**
    * Constant for microphone on a wired headset. This is an input port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_HEADSETMIC")
  @js.native
  val AUDIO_SESSION_PORT_HEADSETMIC: String = js.native
  
  /**
    * Constant for line level input on a dock connector. This is an input port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_LINEIN")
  @js.native
  val AUDIO_SESSION_PORT_LINEIN: String = js.native
  
  /**
    * Constant for line level output on a dock connector. This is an output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_LINEOUT")
  @js.native
  val AUDIO_SESSION_PORT_LINEOUT: String = js.native
  
  /**
    * Constant for input or output on a Universal Serial Bus device. This can be both an input and output port.
    */
  @JSGlobal("Titanium.Media.AUDIO_SESSION_PORT_USBAUDIO")
  @js.native
  val AUDIO_SESSION_PORT_USBAUDIO: String = js.native
  
  /**
    * Line-type constant for speaker output.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_SPEAKER")
  @js.native
  val AUDIO_SPEAKER: scala.Nothing = js.native
  
  /**
    * Audio data is being buffered from the network.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_BUFFERING")
  @js.native
  val AUDIO_STATE_BUFFERING: Double = js.native
  
  /**
    * Audio playback is being initialized.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_INITIALIZED")
  @js.native
  val AUDIO_STATE_INITIALIZED: Double = js.native
  
  /**
    * Playback is paused.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_PAUSED")
  @js.native
  val AUDIO_STATE_PAUSED: Double = js.native
  
  /**
    * Audio playback is active.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_PLAYING")
  @js.native
  val AUDIO_STATE_PLAYING: Double = js.native
  
  /**
    * Audio playback is starting.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_STARTING")
  @js.native
  val AUDIO_STATE_STARTING: Double = js.native
  
  /**
    * Audio playback is stopped.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_STOPPED")
  @js.native
  val AUDIO_STATE_STOPPED: Double = js.native
  
  /**
    * Audio playback is stopping.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_STOPPING")
  @js.native
  val AUDIO_STATE_STOPPING: Double = js.native
  
  /**
    * Player is waiting for audio data from the network.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_WAITING_FOR_DATA")
  @js.native
  val AUDIO_STATE_WAITING_FOR_DATA: Double = js.native
  
  /**
    * Player is waiting for audio data to fill the queue.
    */
  @JSGlobal("Titanium.Media.AUDIO_STATE_WAITING_FOR_QUEUE")
  @js.native
  val AUDIO_STATE_WAITING_FOR_QUEUE: Double = js.native
  
  /**
    * Line-type constant indicating that audio is unavailable.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_UNAVAILABLE")
  @js.native
  val AUDIO_UNAVAILABLE: scala.Nothing = js.native
  
  /**
    * Line-type constant indicating that line-type is unknown or not determined.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  @JSGlobal("Titanium.Media.AUDIO_UNKNOWN")
  @js.native
  val AUDIO_UNKNOWN: scala.Nothing = js.native
  
  /**
    * Android-specific media-related functionality.
    */
  @JSGlobal("Titanium.Media.Android")
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  object Android {
    
    @JSGlobal("Titanium.Media.Android")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.Media.Android.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.apiName> property.
      * @deprecated Access <Titanium.Media.Android.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.bubbleParent> property.
      * @deprecated Access <Titanium.Media.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.Media.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Scans newly created or downloaded media files to make them available to other
      * Android media providers, such as the Gallery.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.scanMediaFiles")
    @js.native
    def scanMediaFiles(
      paths: js.Array[String],
      mimeTypes: js.Array[String],
      callback: js.Function1[/* param0 */ MediaScannerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Media.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Media.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.Media.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Media.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Media.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * Set the system homescreen wallpaper.
      */
    /* static member */
    @JSGlobal("Titanium.Media.Android.setSystemWallpaper")
    @js.native
    def setSystemWallpaper(image: typings.titanium.Titanium.Blob, scale: Boolean): Unit = js.native
  }
  
  /**
    * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
    */
  @JSGlobal("Titanium.Media.AudioPlayer")
  @js.native
  class AudioPlayer ()
    extends typings.titanium.Titanium.Media.AudioPlayer
  
  /**
    * An audio recorder object used for recording audio from the device microphone.
    */
  @JSGlobal("Titanium.Media.AudioRecorder")
  @js.native
  class AudioRecorder ()
    extends typings.titanium.Titanium.Media.AudioRecorder
  
  /**
    * Constant specifying that app is authorized to use camera. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.CAMERA_AUTHORIZATION_AUTHORIZED")
  @js.native
  val CAMERA_AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * Constant specifying that app is denied usage of camera. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.CAMERA_AUTHORIZATION_DENIED")
  @js.native
  val CAMERA_AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
    * @deprecated Use [Titanium.Media.CAMERA_AUTHORIZATION_UNKNOWN](Titanium.Media.CAMERA_AUTHORIZATION_UNKNOWN) instead.
    */
  @JSGlobal("Titanium.Media.CAMERA_AUTHORIZATION_NOT_DETERMINED")
  @js.native
  val CAMERA_AUTHORIZATION_NOT_DETERMINED: scala.Nothing = js.native
  
  /**
    * Constant specifying that app is restricted from using camera. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.CAMERA_AUTHORIZATION_RESTRICTED")
  @js.native
  val CAMERA_AUTHORIZATION_RESTRICTED: Double = js.native
  
  /**
    * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
    */
  @JSGlobal("Titanium.Media.CAMERA_AUTHORIZATION_UNKNOWN")
  @js.native
  val CAMERA_AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * Constant specifying to have the device determine to use the flash or not.
    */
  @JSGlobal("Titanium.Media.CAMERA_FLASH_AUTO")
  @js.native
  val CAMERA_FLASH_AUTO: Double = js.native
  
  /**
    * Constant specifying to never fire the flash.
    */
  @JSGlobal("Titanium.Media.CAMERA_FLASH_OFF")
  @js.native
  val CAMERA_FLASH_OFF: Double = js.native
  
  /**
    * Constant specifying to always fire the flash.
    */
  @JSGlobal("Titanium.Media.CAMERA_FLASH_ON")
  @js.native
  val CAMERA_FLASH_ON: Double = js.native
  
  /**
    * Constant specifying the front camera.
    */
  @JSGlobal("Titanium.Media.CAMERA_FRONT")
  @js.native
  val CAMERA_FRONT: Double = js.native
  
  /**
    * Constant indicating the rear camera.
    */
  @JSGlobal("Titanium.Media.CAMERA_REAR")
  @js.native
  val CAMERA_REAR: Double = js.native
  
  /**
    * Constant for media device busy error.
    */
  @JSGlobal("Titanium.Media.DEVICE_BUSY")
  @js.native
  val DEVICE_BUSY: Double = js.native
  
  /**
    * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
    */
  @JSGlobal("Titanium.Media.Item")
  @js.native
  class Item ()
    extends typings.titanium.Titanium.Media.Item
  
  /**
    * Media type constant for live photo media.
    */
  @JSGlobal("Titanium.Media.MEDIA_TYPE_LIVEPHOTO")
  @js.native
  val MEDIA_TYPE_LIVEPHOTO: String = js.native
  
  /**
    * Media type constant for photo media.
    */
  @JSGlobal("Titanium.Media.MEDIA_TYPE_PHOTO")
  @js.native
  val MEDIA_TYPE_PHOTO: String = js.native
  
  /**
    * Media type constant for video media.
    */
  @JSGlobal("Titanium.Media.MEDIA_TYPE_VIDEO")
  @js.native
  val MEDIA_TYPE_VIDEO: String = js.native
  
  /**
    * Constant for grouping query results by album.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_ALBUM")
  @js.native
  val MUSIC_MEDIA_GROUP_ALBUM: Double = js.native
  
  /**
    * Constant for grouping query results by album and artist.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_ALBUM_ARTIST")
  @js.native
  val MUSIC_MEDIA_GROUP_ALBUM_ARTIST: Double = js.native
  
  /**
    * Constant for grouping query results by artist.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_ARTIST")
  @js.native
  val MUSIC_MEDIA_GROUP_ARTIST: Double = js.native
  
  /**
    * Constant for grouping query results by composer.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_COMPOSER")
  @js.native
  val MUSIC_MEDIA_GROUP_COMPOSER: Double = js.native
  
  /**
    * Constant for grouping query results by genre.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_GENRE")
  @js.native
  val MUSIC_MEDIA_GROUP_GENRE: Double = js.native
  
  /**
    * Constant for grouping query results by playlist.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_PLAYLIST")
  @js.native
  val MUSIC_MEDIA_GROUP_PLAYLIST: Double = js.native
  
  /**
    * Constant for grouping query results by podcast title.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_PODCAST_TITLE")
  @js.native
  val MUSIC_MEDIA_GROUP_PODCAST_TITLE: Double = js.native
  
  /**
    * Constant for grouping query results by title.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_GROUP_TITLE")
  @js.native
  val MUSIC_MEDIA_GROUP_TITLE: Double = js.native
  
  /**
    * Music library media containing any type of content.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_TYPE_ALL")
  @js.native
  val MUSIC_MEDIA_TYPE_ALL: Double = js.native
  
  /**
    * Music library media containing any type of audio content.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_TYPE_ANY_AUDIO")
  @js.native
  val MUSIC_MEDIA_TYPE_ANY_AUDIO: Double = js.native
  
  /**
    * Music library media containing audiobook content.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_TYPE_AUDIOBOOK")
  @js.native
  val MUSIC_MEDIA_TYPE_AUDIOBOOK: Double = js.native
  
  /**
    * Music library media containing music content.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_TYPE_MUSIC")
  @js.native
  val MUSIC_MEDIA_TYPE_MUSIC: Double = js.native
  
  /**
    * Music library media containing podcast content.
    */
  @JSGlobal("Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST")
  @js.native
  val MUSIC_MEDIA_TYPE_PODCAST: Double = js.native
  
  /**
    * Constant for "Repeat All" setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_REPEAT_ALL")
  @js.native
  val MUSIC_PLAYER_REPEAT_ALL: Double = js.native
  
  /**
    * Constant for user's default repeat setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_REPEAT_DEFAULT")
  @js.native
  val MUSIC_PLAYER_REPEAT_DEFAULT: Double = js.native
  
  /**
    * Constant for "No Repeat" setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_REPEAT_NONE")
  @js.native
  val MUSIC_PLAYER_REPEAT_NONE: Double = js.native
  
  /**
    * Constant for "Repeat one item" setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_REPEAT_ONE")
  @js.native
  val MUSIC_PLAYER_REPEAT_ONE: Double = js.native
  
  /**
    * Constant for shuffling complete albums setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_SHUFFLE_ALBUMS")
  @js.native
  val MUSIC_PLAYER_SHUFFLE_ALBUMS: Double = js.native
  
  /**
    * Constant for user's default shuffle setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_SHUFFLE_DEFAULT")
  @js.native
  val MUSIC_PLAYER_SHUFFLE_DEFAULT: Double = js.native
  
  /**
    * Constant for "no shuffle" setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_SHUFFLE_NONE")
  @js.native
  val MUSIC_PLAYER_SHUFFLE_NONE: Double = js.native
  
  /**
    * Constant for shuffling songs setting.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_SHUFFLE_SONGS")
  @js.native
  val MUSIC_PLAYER_SHUFFLE_SONGS: Double = js.native
  
  /**
    * Constant for interrupted state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_INTERRUPTED")
  @js.native
  val MUSIC_PLAYER_STATE_INTERRUPTED: Double = js.native
  
  /**
    * Constant for paused state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_PAUSED")
  @js.native
  val MUSIC_PLAYER_STATE_PAUSED: Double = js.native
  
  /**
    * Constant for playing state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_PLAYING")
  @js.native
  val MUSIC_PLAYER_STATE_PLAYING: Double = js.native
  
  /**
    * Constant for backward seek state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_SEEK_BACKWARD")
  @js.native
  val MUSIC_PLAYER_STATE_SEEK_BACKWARD: Double = js.native
  
  /**
    * Constant for forward seek state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_SEEK_FORWARD")
  @js.native
  val MUSIC_PLAYER_STATE_SEEK_FORWARD: Double = js.native
  
  /**
    * Constant for stopped state.
    */
  @JSGlobal("Titanium.Media.MUSIC_PLAYER_STATE_STOPPED")
  @js.native
  val MUSIC_PLAYER_STATE_STOPPED: Double = js.native
  
  /**
    * This object represents a music controller.
    */
  @JSGlobal("Titanium.Media.MusicPlayer")
  @js.native
  class MusicPlayer ()
    extends typings.titanium.Titanium.Media.MusicPlayer
  
  /**
    * Constant for media no camera error.
    */
  @JSGlobal("Titanium.Media.NO_CAMERA")
  @js.native
  val NO_CAMERA: Double = js.native
  
  /**
    * Constant for media no video error.
    */
  @JSGlobal("Titanium.Media.NO_VIDEO")
  @js.native
  val NO_VIDEO: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  /* static member */
  @JSGlobal("Titanium.Media.QUALITY_640x480")
  @js.native
  val QUALITY640x480: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  /* static member */
  @JSGlobal("Titanium.Media.QUALITY_IFRAME_1280x720")
  @js.native
  val QUALITYIFRAME1280x720: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  /* static member */
  @JSGlobal("Titanium.Media.QUALITY_IFRAME_960x540")
  @js.native
  val QUALITYIFRAME960x540: Double = js.native
  
  /**
    * Media type constant for high-quality video recording.
    */
  @JSGlobal("Titanium.Media.QUALITY_HIGH")
  @js.native
  val QUALITY_HIGH: Double = js.native
  
  /**
    * Media type constant for low-quality video recording.
    */
  @JSGlobal("Titanium.Media.QUALITY_LOW")
  @js.native
  val QUALITY_LOW: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  @JSGlobal("Titanium.Media.QUALITY_MEDIUM")
  @js.native
  val QUALITY_MEDIUM: Double = js.native
  
  /**
    * An object for playing basic audio resources.
    */
  @JSGlobal("Titanium.Media.Sound")
  @js.native
  class Sound ()
    extends typings.titanium.Titanium.Media.Sound
  
  /**
    * An object for playing system sounds.
    * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
    */
  @JSGlobal("Titanium.Media.SystemAlert")
  @js.native
  class SystemAlert ()
    extends typings.titanium.Titanium.Media.SystemAlert
  
  /**
    * Constant for unknown media error.
    */
  @JSGlobal("Titanium.Media.UNKNOWN_ERROR")
  @js.native
  val UNKNOWN_ERROR: Double = js.native
  
  /**
    * Constant for default video controls.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_DEFAULT")
  @js.native
  val VIDEO_CONTROL_DEFAULT: scala.Nothing = js.native
  
  /**
    * Constant for video controls for an embedded view.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_EMBEDDED")
  @js.native
  val VIDEO_CONTROL_EMBEDDED: scala.Nothing = js.native
  
  /**
    * Constant for fullscreen video controls.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_FULLSCREEN")
  @js.native
  val VIDEO_CONTROL_FULLSCREEN: scala.Nothing = js.native
  
  /**
    * Constant for video controls hidden.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_HIDDEN")
  @js.native
  val VIDEO_CONTROL_HIDDEN: Double = js.native
  
  /**
    * Constant for no video controls.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_NONE")
  @js.native
  val VIDEO_CONTROL_NONE: Double = js.native
  
  /**
    * Constant for video controls volume only.
    * @deprecated Use [Titanium.Media.VIDEO_CONTROL_EMBEDDED](Titanium.Media.VIDEO_CONTROL_EMBEDDED) instead.
    */
  @JSGlobal("Titanium.Media.VIDEO_CONTROL_VOLUME_ONLY")
  @js.native
  val VIDEO_CONTROL_VOLUME_ONLY: scala.Nothing = js.native
  
  /**
    * Video playback ended normally.
    */
  @JSGlobal("Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ENDED")
  @js.native
  val VIDEO_FINISH_REASON_PLAYBACK_ENDED: Double = js.native
  
  /**
    * Video playback ended abnormally.
    */
  @JSGlobal("Titanium.Media.VIDEO_FINISH_REASON_PLAYBACK_ERROR")
  @js.native
  val VIDEO_FINISH_REASON_PLAYBACK_ERROR: Double = js.native
  
  /**
    * Video playback ended by user action (such as clicking the `Done` button).
    */
  @JSGlobal("Titanium.Media.VIDEO_FINISH_REASON_USER_EXITED")
  @js.native
  val VIDEO_FINISH_REASON_USER_EXITED: Double = js.native
  
  /**
    * Indicates that the player can no longer play media items because of an error.
    */
  @JSGlobal("Titanium.Media.VIDEO_LOAD_STATE_FAILED")
  @js.native
  val VIDEO_LOAD_STATE_FAILED: Double = js.native
  
  /**
    * Current media is playable.
    */
  @JSGlobal("Titanium.Media.VIDEO_LOAD_STATE_PLAYABLE")
  @js.native
  val VIDEO_LOAD_STATE_PLAYABLE: Double = js.native
  
  /**
    * Playback will be automatically started in this state when `autoplay` is true.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_LOAD_STATE_PLAYTHROUGH_OK")
  @js.native
  val VIDEO_LOAD_STATE_PLAYTHROUGH_OK: scala.Nothing = js.native
  
  /**
    * Playback will be automatically paused in this state, if started.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_LOAD_STATE_STALLED")
  @js.native
  val VIDEO_LOAD_STATE_STALLED: scala.Nothing = js.native
  
  /**
    * Current load state is not known.
    */
  @JSGlobal("Titanium.Media.VIDEO_LOAD_STATE_UNKNOWN")
  @js.native
  val VIDEO_LOAD_STATE_UNKNOWN: Double = js.native
  
  /**
    * A audio type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_MEDIA_TYPE_AUDIO")
  @js.native
  val VIDEO_MEDIA_TYPE_AUDIO: scala.Nothing = js.native
  
  /**
    * An unknown type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_MEDIA_TYPE_NONE")
  @js.native
  val VIDEO_MEDIA_TYPE_NONE: scala.Nothing = js.native
  
  /**
    * A video type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_MEDIA_TYPE_VIDEO")
  @js.native
  val VIDEO_MEDIA_TYPE_VIDEO: scala.Nothing = js.native
  
  /**
    * Video playback has been interrupted.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_INTERRUPTED")
  @js.native
  val VIDEO_PLAYBACK_STATE_INTERRUPTED: Double = js.native
  
  /**
    * Video playback is paused.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_PAUSED")
  @js.native
  val VIDEO_PLAYBACK_STATE_PAUSED: Double = js.native
  
  /**
    * Video is being played.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_PLAYING")
  @js.native
  val VIDEO_PLAYBACK_STATE_PLAYING: Double = js.native
  
  /**
    * Video playback is rewinding.
    * @deprecated This constant has been removed on iOS by using the official Apple AVPlayer that does not expose this functionality so far.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD")
  @js.native
  val VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD: scala.Nothing = js.native
  
  /**
    * Video playback is seeking forward.
    * @deprecated This constant has been removed on iOS by using the official Apple AVPlayer that does not expose this functionality so far.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_SEEKING_FORWARD")
  @js.native
  val VIDEO_PLAYBACK_STATE_SEEKING_FORWARD: scala.Nothing = js.native
  
  /**
    * Video playback is stopped.
    */
  @JSGlobal("Titanium.Media.VIDEO_PLAYBACK_STATE_STOPPED")
  @js.native
  val VIDEO_PLAYBACK_STATE_STOPPED: Double = js.native
  
  /**
    * Constant for disabling repeat on video playback.
    */
  @JSGlobal("Titanium.Media.VIDEO_REPEAT_MODE_NONE")
  @js.native
  val VIDEO_REPEAT_MODE_NONE: Double = js.native
  
  /**
    * Constant for repeating one video (i.e., the one video will repeat constantly) during playback.
    */
  @JSGlobal("Titanium.Media.VIDEO_REPEAT_MODE_ONE")
  @js.native
  val VIDEO_REPEAT_MODE_ONE: Double = js.native
  
  /**
    * Scale video to fill the screen, clipping edges if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_ASPECT_FILL")
  @js.native
  val VIDEO_SCALING_ASPECT_FILL: scala.Nothing = js.native
  
  /**
    * Scale video to fit the screen, letterboxing if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_ASPECT_FIT")
  @js.native
  val VIDEO_SCALING_ASPECT_FIT: scala.Nothing = js.native
  
  /**
    * Video is scaled until both dimensions fit the screen exactly, stretching if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_MODE_FILL")
  @js.native
  val VIDEO_SCALING_MODE_FILL: scala.Nothing = js.native
  
  /**
    * Video scaling is disabled.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_NONE")
  @js.native
  val VIDEO_SCALING_NONE: scala.Nothing = js.native
  
  /**
    * Specifies that the video should be stretched to fill the bounds of layer.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_RESIZE")
  @js.native
  val VIDEO_SCALING_RESIZE: String = js.native
  
  /**
    * Specifies that the player should preserve the aspect ratio of video and fit the video within the bounds of layer.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_RESIZE_ASPECT")
  @js.native
  val VIDEO_SCALING_RESIZE_ASPECT: String = js.native
  
  /**
    * Specifies that the player should preserve the aspect ratio of video and fill the bounds of layer.
    */
  @JSGlobal("Titanium.Media.VIDEO_SCALING_RESIZE_ASPECT_FILL")
  @js.native
  val VIDEO_SCALING_RESIZE_ASPECT_FILL: String = js.native
  
  /**
    * Video source type is a file.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SOURCE_TYPE_FILE")
  @js.native
  val VIDEO_SOURCE_TYPE_FILE: scala.Nothing = js.native
  
  /**
    * Video source type is a remote stream.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SOURCE_TYPE_STREAMING")
  @js.native
  val VIDEO_SOURCE_TYPE_STREAMING: scala.Nothing = js.native
  
  /**
    * Video source type is unknown.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  @JSGlobal("Titanium.Media.VIDEO_SOURCE_TYPE_UNKNOWN")
  @js.native
  val VIDEO_SOURCE_TYPE_UNKNOWN: scala.Nothing = js.native
  
  /**
    * Use the closest sync (or key) frame at given the time.
    */
  @JSGlobal("Titanium.Media.VIDEO_TIME_OPTION_CLOSEST_SYNC")
  @js.native
  val VIDEO_TIME_OPTION_CLOSEST_SYNC: Double = js.native
  
  /**
    * Use the exact time.
    */
  @JSGlobal("Titanium.Media.VIDEO_TIME_OPTION_EXACT")
  @js.native
  val VIDEO_TIME_OPTION_EXACT: Double = js.native
  
  /**
    * Use the closest keyframe in the time.
    */
  @JSGlobal("Titanium.Media.VIDEO_TIME_OPTION_NEAREST_KEYFRAME")
  @js.native
  val VIDEO_TIME_OPTION_NEAREST_KEYFRAME: Double = js.native
  
  /**
    * Use the sync (or key) frame located right after or at given the time.
    */
  @JSGlobal("Titanium.Media.VIDEO_TIME_OPTION_NEXT_SYNC")
  @js.native
  val VIDEO_TIME_OPTION_NEXT_SYNC: Double = js.native
  
  /**
    * Use the sync (or key) frame located right before or at given the time.
    */
  @JSGlobal("Titanium.Media.VIDEO_TIME_OPTION_PREVIOUS_SYNC")
  @js.native
  val VIDEO_TIME_OPTION_PREVIOUS_SYNC: Double = js.native
  
  /**
    * A native control for playing videos.
    */
  @JSGlobal("Titanium.Media.VideoPlayer")
  @js.native
  class VideoPlayer ()
    extends typings.titanium.Titanium.Media.VideoPlayer
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Media.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Media.addEventListener")
  @js.native
  def addEventListener_cameraready(
    name: cameraready,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaCamerareadyEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Media.addEventListener")
  @js.native
  def addEventListener_routechange(
    name: routechange,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaRoutechangeEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Media.addEventListener")
  @js.native
  def addEventListener_volume(
    name: typings.titanium.titaniumStrings.volume,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaVolumeEvent, Unit]
  ): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Media.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * An instance of <Titanium.Media.MusicPlayer> representing the app-specific music player.
    */
  /* static member */
  @JSGlobal("Titanium.Media.appMusicPlayer")
  @js.native
  val appMusicPlayer: typings.titanium.Titanium.Media.MusicPlayer = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Media.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Returns the line type constant for the current line type.
    * @deprecated Use [Titanium.Media.currentRoute](Titanium.Media.currentRoute) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.audioLineType")
  @js.native
  val audioLineType: scala.Nothing = js.native
  
  /**
    * Returns `true` if the device is playing audio.
    */
  /* static member */
  @JSGlobal("Titanium.Media.audioPlaying")
  @js.native
  val audioPlaying: Boolean = js.native
  
  /**
    * A constant for the audio session category to be used.
    */
  /* static member */
  @JSGlobal("Titanium.Media.audioSessionCategory")
  @js.native
  def audioSessionCategory: String = js.native
  @scala.inline
  def audioSessionCategory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioSessionCategory")(x.asInstanceOf[js.Any])
  
  /**
    * A constant for the audio session mode to be used.
    * @deprecated Use [Titanium.Media.audioSessionCategory](Titanium.Media.audioSessionCategory) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.audioSessionMode")
  @js.native
  def audioSessionMode: scala.Nothing = js.native
  @scala.inline
  def audioSessionMode_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioSessionMode")(x.asInstanceOf[js.Any])
  
  /**
    * Array of media type constants supported for the camera.
    */
  /* static member */
  @JSGlobal("Titanium.Media.availableCameraMediaTypes")
  @js.native
  def availableCameraMediaTypes: js.Array[js.Any] = js.native
  @scala.inline
  def availableCameraMediaTypes_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableCameraMediaTypes")(x.asInstanceOf[js.Any])
  
  /**
    * Array indicating which cameras are available, `CAMERA_FRONT`, `CAMERA_REAR` or both.
    */
  /* static member */
  @JSGlobal("Titanium.Media.availableCameras")
  @js.native
  val availableCameras: js.Array[Double] = js.native
  
  /**
    * Array of media type constants supported for saving to the device's camera roll or saved images album.
    */
  /* static member */
  @JSGlobal("Titanium.Media.availablePhotoGalleryMediaTypes")
  @js.native
  def availablePhotoGalleryMediaTypes: js.Array[js.Any] = js.native
  @scala.inline
  def availablePhotoGalleryMediaTypes_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availablePhotoGalleryMediaTypes")(x.asInstanceOf[js.Any])
  
  /**
    * Array of media type constants supported for the photo library.
    */
  /* static member */
  @JSGlobal("Titanium.Media.availablePhotoMediaTypes")
  @js.native
  def availablePhotoMediaTypes: js.Array[js.Any] = js.native
  @scala.inline
  def availablePhotoMediaTypes_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availablePhotoMediaTypes")(x.asInstanceOf[js.Any])
  
  /**
    * Current average microphone level in dB or -1 if microphone monitoring is disabled.
    */
  /* static member */
  @JSGlobal("Titanium.Media.averageMicrophonePower")
  @js.native
  def averageMicrophonePower: Double = js.native
  @scala.inline
  def averageMicrophonePower_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("averageMicrophonePower")(x.asInstanceOf[js.Any])
  
  /**
    * Plays a device beep notification.
    */
  /* static member */
  @JSGlobal("Titanium.Media.beep")
  @js.native
  def beep(): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Media.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the authorization status for the camera.
    */
  /* static member */
  @JSGlobal("Titanium.Media.cameraAuthorization")
  @js.native
  val cameraAuthorization: Double = js.native
  
  /**
    * Returns the authorization status for the camera.
    * @deprecated Use [Titanium.Media.cameraAuthorization](Titanium.Media.cameraAuthorization) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.cameraAuthorizationStatus")
  @js.native
  val cameraAuthorizationStatus: scala.Nothing = js.native
  
  /**
    * Determines how the flash is fired when using the device's camera.
    */
  /* static member */
  @JSGlobal("Titanium.Media.cameraFlashMode")
  @js.native
  def cameraFlashMode: Double = js.native
  @scala.inline
  def cameraFlashMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cameraFlashMode")(x.asInstanceOf[js.Any])
  
  /**
    * `true` if the device has a recording input device available.
    */
  /* static member */
  @JSGlobal("Titanium.Media.canRecord")
  @js.native
  val canRecord: Boolean = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.AudioPlayer>.
    */
  /* static member */
  @JSGlobal("Titanium.Media.createAudioPlayer")
  @js.native
  def createAudioPlayer(): typings.titanium.Titanium.Media.AudioPlayer = js.native
  @JSGlobal("Titanium.Media.createAudioPlayer")
  @js.native
  def createAudioPlayer(parameters: Dictionary[typings.titanium.Titanium.Media.AudioPlayer]): typings.titanium.Titanium.Media.AudioPlayer = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.AudioRecorder>.
    */
  /* static member */
  @JSGlobal("Titanium.Media.createAudioRecorder")
  @js.native
  def createAudioRecorder(): typings.titanium.Titanium.Media.AudioRecorder = js.native
  @JSGlobal("Titanium.Media.createAudioRecorder")
  @js.native
  def createAudioRecorder(parameters: Dictionary[typings.titanium.Titanium.Media.AudioRecorder]): typings.titanium.Titanium.Media.AudioRecorder = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.Sound>.
    */
  /* static member */
  @JSGlobal("Titanium.Media.createSound")
  @js.native
  def createSound(): typings.titanium.Titanium.Media.Sound = js.native
  @JSGlobal("Titanium.Media.createSound")
  @js.native
  def createSound(parameters: Dictionary[typings.titanium.Titanium.Media.Sound]): typings.titanium.Titanium.Media.Sound = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.SystemAlert>.
    * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
    */
  /* static member */
  @JSGlobal("Titanium.Media.createSystemAlert")
  @js.native
  def createSystemAlert(): typings.titanium.Titanium.Media.SystemAlert = js.native
  @JSGlobal("Titanium.Media.createSystemAlert")
  @js.native
  def createSystemAlert(parameters: Dictionary[typings.titanium.Titanium.Media.SystemAlert]): typings.titanium.Titanium.Media.SystemAlert = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.VideoPlayer>.
    */
  /* static member */
  @JSGlobal("Titanium.Media.createVideoPlayer")
  @js.native
  def createVideoPlayer(): typings.titanium.Titanium.Media.VideoPlayer = js.native
  @JSGlobal("Titanium.Media.createVideoPlayer")
  @js.native
  def createVideoPlayer(parameters: Dictionary[typings.titanium.Titanium.Media.VideoPlayer]): typings.titanium.Titanium.Media.VideoPlayer = js.native
  
  /**
    * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
    */
  /* static member */
  @JSGlobal("Titanium.Media.currentRoute")
  @js.native
  val currentRoute: RouteDescription = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_cameraready(name: cameraready): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_cameraready(name: cameraready, event: MediaCamerareadyEvent): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_routechange(name: routechange): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_routechange(name: routechange, event: MediaRoutechangeEvent): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_volume(name: typings.titanium.titaniumStrings.volume): Unit = js.native
  @JSGlobal("Titanium.Media.fireEvent")
  @js.native
  def fireEvent_volume(name: typings.titanium.titaniumStrings.volume, event: MediaVolumeEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Media.apiName> property.
    * @deprecated Access <Titanium.Media.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.appMusicPlayer> property.
    * @deprecated Access <Titanium.Media.appMusicPlayer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAppMusicPlayer")
  @js.native
  def getAppMusicPlayer(): typings.titanium.Titanium.Media.MusicPlayer = js.native
  
  /**
    * Gets the value of the <Titanium.Media.audioLineType> property.
    * @deprecated Use [Titanium.Media.currentRoute](Titanium.Media.currentRoute) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAudioLineType")
  @js.native
  def getAudioLineType: scala.Nothing = js.native
  @scala.inline
  def getAudioLineType_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAudioLineType")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Media.audioPlaying> property.
    * @deprecated Access <Titanium.Media.audioPlaying> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAudioPlaying")
  @js.native
  def getAudioPlaying(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.audioSessionCategory> property.
    * @deprecated Access <Titanium.Media.audioSessionCategory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAudioSessionCategory")
  @js.native
  def getAudioSessionCategory(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Media.audioSessionMode> property.
    * @deprecated Use [Titanium.Media.audioSessionCategory](Titanium.Media.audioSessionCategory) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAudioSessionMode")
  @js.native
  def getAudioSessionMode: scala.Nothing = js.native
  @scala.inline
  def getAudioSessionMode_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAudioSessionMode")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Media.availableCameraMediaTypes> property.
    * @deprecated Access <Titanium.Media.availableCameraMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAvailableCameraMediaTypes")
  @js.native
  def getAvailableCameraMediaTypes(): js.Array[_] = js.native
  
  /**
    * Gets the value of the <Titanium.Media.availableCameras> property.
    * @deprecated Access <Titanium.Media.availableCameras> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAvailableCameras")
  @js.native
  def getAvailableCameras(): js.Array[Double] = js.native
  
  /**
    * Gets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
    * @deprecated Access <Titanium.Media.availablePhotoGalleryMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAvailablePhotoGalleryMediaTypes")
  @js.native
  def getAvailablePhotoGalleryMediaTypes(): js.Array[_] = js.native
  
  /**
    * Gets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
    * @deprecated Access <Titanium.Media.availablePhotoMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAvailablePhotoMediaTypes")
  @js.native
  def getAvailablePhotoMediaTypes(): js.Array[_] = js.native
  
  /**
    * Gets the value of the <Titanium.Media.averageMicrophonePower> property.
    * @deprecated Access <Titanium.Media.averageMicrophonePower> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getAverageMicrophonePower")
  @js.native
  def getAverageMicrophonePower(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.bubbleParent> property.
    * @deprecated Access <Titanium.Media.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.cameraAuthorization> property.
    * @deprecated Access <Titanium.Media.cameraAuthorization> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getCameraAuthorization")
  @js.native
  def getCameraAuthorization(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.cameraAuthorizationStatus> property.
    * @deprecated Use [Titanium.Media.cameraAuthorization](Titanium.Media.cameraAuthorization) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getCameraAuthorizationStatus")
  @js.native
  def getCameraAuthorizationStatus: scala.Nothing = js.native
  @scala.inline
  def getCameraAuthorizationStatus_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCameraAuthorizationStatus")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Media.cameraFlashMode> property.
    * @deprecated Access <Titanium.Media.cameraFlashMode> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getCameraFlashMode")
  @js.native
  def getCameraFlashMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.canRecord> property.
    * @deprecated Access <Titanium.Media.canRecord> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getCanRecord")
  @js.native
  def getCanRecord(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.currentRoute> property.
    * @deprecated Access <Titanium.Media.currentRoute> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getCurrentRoute")
  @js.native
  def getCurrentRoute(): RouteDescription = js.native
  
  /**
    * Gets the value of the <Titanium.Media.isCameraSupported> property.
    * @deprecated Access <Titanium.Media.isCameraSupported> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getIsCameraSupported")
  @js.native
  def getIsCameraSupported(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Media.lifecycleContainer> property.
    * @deprecated Access <Titanium.Media.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Media.peakMicrophonePower> property.
    * @deprecated Access <Titanium.Media.peakMicrophonePower> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getPeakMicrophonePower")
  @js.native
  def getPeakMicrophonePower(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.QUALITY_640x480> property.
    * @deprecated Access <Titanium.Media.QUALITY_640x480> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getQUALITY_640x480")
  @js.native
  def getQUALITY640x480(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.QUALITY_IFRAME_1280x720> property.
    * @deprecated Access <Titanium.Media.QUALITY_IFRAME_1280x720> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getQUALITY_IFRAME_1280x720")
  @js.native
  def getQUALITYIFRAME1280x720(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.QUALITY_IFRAME_960x540> property.
    * @deprecated Access <Titanium.Media.QUALITY_IFRAME_960x540> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getQUALITY_IFRAME_960x540")
  @js.native
  def getQUALITYIFRAME960x540(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Media.systemMusicPlayer> property.
    * @deprecated Access <Titanium.Media.systemMusicPlayer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getSystemMusicPlayer")
  @js.native
  def getSystemMusicPlayer(): typings.titanium.Titanium.Media.MusicPlayer = js.native
  
  /**
    * Gets the value of the <Titanium.Media.volume> property.
    * @deprecated Access <Titanium.Media.volume> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.getVolume")
  @js.native
  def getVolume(): Double = js.native
  
  /**
    * Returns `true` if the app has audio permissions.
    * @deprecated Use [Titanium.Media.hasAudioRecorderPermissions](Titanium.Media.hasAudioRecorderPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hasAudioPermissions")
  @js.native
  def hasAudioPermissions(): Boolean = js.native
  
  /**
    * Returns `true` if the app has audio permissions.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hasAudioRecorderPermissions")
  @js.native
  def hasAudioRecorderPermissions(): Boolean = js.native
  
  /**
    * Returns `true` if the app has camera access.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hasCameraPermissions")
  @js.native
  def hasCameraPermissions(): Boolean = js.native
  
  /**
    * Returns `true` if the app has music library access.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hasMusicLibraryPermissions")
  @js.native
  def hasMusicLibraryPermissions(): Boolean = js.native
  
  /**
    * Returns `true` if the app has photo gallery permissions.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hasPhotoGalleryPermissions")
  @js.native
  def hasPhotoGalleryPermissions(): Boolean = js.native
  
  /**
    * Hides the device camera UI.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hideCamera")
  @js.native
  def hideCamera(): Unit = js.native
  
  /**
    * Hides the music library.
    */
  /* static member */
  @JSGlobal("Titanium.Media.hideMusicLibrary")
  @js.native
  def hideMusicLibrary(): Unit = js.native
  
  /**
    * `true` if the device has camera support.
    */
  /* static member */
  @JSGlobal("Titanium.Media.isCameraSupported")
  @js.native
  val isCameraSupported: Boolean = js.native
  
  /**
    * Returns `true` if the source supports the specified media type.
    */
  /* static member */
  @JSGlobal("Titanium.Media.isMediaTypeSupported")
  @js.native
  def isMediaTypeSupported(source: String, `type`: String): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Media.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Shows the music library and allows the user to select one or more tracks.
    */
  /* static member */
  @JSGlobal("Titanium.Media.openMusicLibrary")
  @js.native
  def openMusicLibrary(options: MusicLibraryOptionsType): Unit = js.native
  
  /**
    * Opens the photo gallery image picker.
    */
  /* static member */
  @JSGlobal("Titanium.Media.openPhotoGallery")
  @js.native
  def openPhotoGallery(options: PhotoGalleryOptionsType): Unit = js.native
  
  /**
    * Current microphone level peak power in dB or -1 if microphone monitoring is disabled.
    */
  /* static member */
  @JSGlobal("Titanium.Media.peakMicrophonePower")
  @js.native
  val peakMicrophonePower: Double = js.native
  
  /**
    * Displays the given image.
    */
  /* static member */
  @JSGlobal("Titanium.Media.previewImage")
  @js.native
  def previewImage(options: Dictionary[PreviewImageOptions]): Unit = js.native
  
  /**
    * Searches the music library for items matching the specified search predicates.
    */
  /* static member */
  @JSGlobal("Titanium.Media.queryMusicLibrary")
  @js.native
  def queryMusicLibrary(query: MediaQueryType): js.Array[typings.titanium.Titanium.Media.Item] = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Media.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Media.removeEventListener")
  @js.native
  def removeEventListener_cameraready(
    name: cameraready,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaCamerareadyEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Media.removeEventListener")
  @js.native
  def removeEventListener_routechange(
    name: routechange,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaRoutechangeEvent, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Media.removeEventListener")
  @js.native
  def removeEventListener_volume(
    name: typings.titanium.titaniumStrings.volume,
    callback: js.ThisFunction1[/* this */ typings.titanium.Titanium.Media, /* event */ MediaVolumeEvent, Unit]
  ): Unit = js.native
  
  /**
    * Request the user's permission for audio recording.
    * @deprecated Use [Titanium.Media.requestAudioRecorderPermissions](Titanium.Media.requestAudioRecorderPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestAudioPermissions")
  @js.native
  def requestAudioPermissions: scala.Nothing = js.native
  @scala.inline
  def requestAudioPermissions_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAudioPermissions")(x.asInstanceOf[js.Any])
  
  /**
    * Request the user's permission for audio recording.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestAudioRecorderPermissions")
  @js.native
  def requestAudioRecorderPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, Unit]): Unit = js.native
  
  /**
    * Request the user's permission for audio recording.
    * @deprecated Use [Titanium.Media.requestAudioRecorderPermissions](Titanium.Media.requestAudioRecorderPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestAuthorization")
  @js.native
  def requestAuthorization: scala.Nothing = js.native
  @scala.inline
  def requestAuthorization_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestAuthorization")(x.asInstanceOf[js.Any])
  
  /**
    * Requests for camera access.
    * @deprecated Please use [Titanium.Media.requestCameraPermissions](Titanium.Media.requestCameraPermissions) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestCameraAccess")
  @js.native
  def requestCameraAccess: scala.Nothing = js.native
  @scala.inline
  def requestCameraAccess_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestCameraAccess")(x.asInstanceOf[js.Any])
  
  /**
    * Requests for camera access.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestCameraPermissions")
  @js.native
  def requestCameraPermissions(callback: js.Function1[/* param0 */ RequestCameraAccessResult, Unit]): Unit = js.native
  
  /**
    * Request permissions for the native music-library.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestMusicLibraryPermissions")
  @js.native
  def requestMusicLibraryPermissions(callback: js.Function1[/* param0 */ RequestMusicLibraryAccessResult, Unit]): Unit = js.native
  
  /**
    * Requests for photo gallery permissions.
    */
  /* static member */
  @JSGlobal("Titanium.Media.requestPhotoGalleryPermissions")
  @js.native
  def requestPhotoGalleryPermissions(callback: js.Function1[/* param0 */ RequestPhotoGalleryAccessResult, Unit]): Unit = js.native
  
  /**
    * Saves media to the device's photo gallery / camera roll.
    */
  /* static member */
  @JSGlobal("Titanium.Media.saveToPhotoGallery")
  @js.native
  def saveToPhotoGallery(media: typings.titanium.Titanium.Blob, callbacks: js.Any): Unit = js.native
  @JSGlobal("Titanium.Media.saveToPhotoGallery")
  @js.native
  def saveToPhotoGallery(media: File, callbacks: js.Any): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.audioSessionCategory> property.
    * @deprecated Set the value using <Titanium.Media.audioSessionCategory> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAudioSessionCategory")
  @js.native
  def setAudioSessionCategory(audioSessionCategory: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.audioSessionMode> property.
    * @deprecated Use [Titanium.Media.audioSessionCategory](Titanium.Media.audioSessionCategory) instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAudioSessionMode")
  @js.native
  def setAudioSessionMode: scala.Nothing = js.native
  @scala.inline
  def setAudioSessionMode_=(x: scala.Nothing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setAudioSessionMode")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the value of the <Titanium.Media.availableCameraMediaTypes> property.
    * @deprecated Set the value using <Titanium.Media.availableCameraMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAvailableCameraMediaTypes")
  @js.native
  def setAvailableCameraMediaTypes(availableCameraMediaTypes: js.Array[_]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
    * @deprecated Set the value using <Titanium.Media.availablePhotoGalleryMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAvailablePhotoGalleryMediaTypes")
  @js.native
  def setAvailablePhotoGalleryMediaTypes(availablePhotoGalleryMediaTypes: js.Array[_]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
    * @deprecated Set the value using <Titanium.Media.availablePhotoMediaTypes> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAvailablePhotoMediaTypes")
  @js.native
  def setAvailablePhotoMediaTypes(availablePhotoMediaTypes: js.Array[_]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.averageMicrophonePower> property.
    * @deprecated Set the value using <Titanium.Media.averageMicrophonePower> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setAverageMicrophonePower")
  @js.native
  def setAverageMicrophonePower(averageMicrophonePower: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Media.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Media.cameraFlashMode> property.
    * @deprecated Set the value using <Titanium.Media.cameraFlashMode> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setCameraFlashMode")
  @js.native
  def setCameraFlashMode(cameraFlashMode: Double): Unit = js.native
  
  @JSGlobal("Titanium.Media.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Media.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Overrides the default audio route when using the <Titanium.Media.AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD> session mode.
    */
  /* static member */
  @JSGlobal("Titanium.Media.setOverrideAudioRoute")
  @js.native
  def setOverrideAudioRoute(route: Double): Unit = js.native
  
  /**
    * Shows the camera.
    */
  /* static member */
  @JSGlobal("Titanium.Media.showCamera")
  @js.native
  def showCamera(options: CameraOptionsType): Unit = js.native
  
  /**
    * Starts monitoring the microphone sound level.
    */
  /* static member */
  @JSGlobal("Titanium.Media.startMicrophoneMonitor")
  @js.native
  def startMicrophoneMonitor(): Unit = js.native
  
  /**
    * Starts video capture using the camera specified.
    */
  /* static member */
  @JSGlobal("Titanium.Media.startVideoCapture")
  @js.native
  def startVideoCapture(): Unit = js.native
  
  /**
    * Stops monitoring the microphone sound level.
    */
  /* static member */
  @JSGlobal("Titanium.Media.stopMicrophoneMonitor")
  @js.native
  def stopMicrophoneMonitor(): Unit = js.native
  
  /**
    * Stops video capture using the camera specified.
    */
  /* static member */
  @JSGlobal("Titanium.Media.stopVideoCapture")
  @js.native
  def stopVideoCapture(): Unit = js.native
  
  /**
    * Switches between front and rear-facing cameras. Make sure to set one of the below constants to determine
    * the camera you want to switch to.
    */
  /* static member */
  @JSGlobal("Titanium.Media.switchCamera")
  @js.native
  def switchCamera(camera: Double): Unit = js.native
  
  /**
    * An instance of <Titanium.Media.MusicPlayer> representing the system-wide music player.
    */
  /* static member */
  @JSGlobal("Titanium.Media.systemMusicPlayer")
  @js.native
  val systemMusicPlayer: typings.titanium.Titanium.Media.MusicPlayer = js.native
  
  /**
    * Uses the device camera to capture a photo.
    */
  /* static member */
  @JSGlobal("Titanium.Media.takePicture")
  @js.native
  def takePicture(): Unit = js.native
  
  /**
    * Takes a screen shot of the visible UI on the device.
    */
  /* static member */
  @JSGlobal("Titanium.Media.takeScreenshot")
  @js.native
  def takeScreenshot(callback: js.Function1[/* param0 */ ScreenshotResult, Unit]): Unit = js.native
  
  /**
    * Makes the device vibrate.
    */
  /* static member */
  @JSGlobal("Titanium.Media.vibrate")
  @js.native
  def vibrate(): Unit = js.native
  @JSGlobal("Titanium.Media.vibrate")
  @js.native
  def vibrate(pattern: js.Array[Double]): Unit = js.native
  
  /**
    * Current volume of the playback device.
    */
  /* static member */
  @JSGlobal("Titanium.Media.volume")
  @js.native
  val volume: Double = js.native
}
