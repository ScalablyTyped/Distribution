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
/* static members */
@JSGlobal("Titanium.Media")
@js.native
object Media extends js.Object {
  
  /**
    * Audio file format 3GPP2.
    */
  val AUDIO_FILEFORMAT_3GP2: Double = js.native
  
  /**
    * Audio file format 3GPP.
    */
  val AUDIO_FILEFORMAT_3GPP: Double = js.native
  
  /**
    * Audio file format Audio Interchange File Format (AIFF).
    */
  val AUDIO_FILEFORMAT_AIFF: Double = js.native
  
  /**
    * Audio file format Adaptive Multi-Rate (AMR).
    */
  val AUDIO_FILEFORMAT_AMR: Double = js.native
  
  /**
    * Audio file format Apple Compressed Audio Format (CAF).
    */
  val AUDIO_FILEFORMAT_CAF: Double = js.native
  
  /**
    * Audio file format MP3.
    */
  val AUDIO_FILEFORMAT_MP3: Double = js.native
  
  /**
    * Audio file format MP4.
    */
  val AUDIO_FILEFORMAT_MP4: Double = js.native
  
  /**
    * Audio file format MP4A.
    */
  val AUDIO_FILEFORMAT_MP4A: Double = js.native
  
  /**
    * Audio file format WAVE.
    */
  val AUDIO_FILEFORMAT_WAVE: Double = js.native
  
  /**
    * Audio format MPEG4 AAC encoding.
    */
  val AUDIO_FORMAT_AAC: Double = js.native
  
  /**
    * Audio format 8-bit [aLaw encoding](https://en.wikipedia.org/wiki/A-law_algorithm).
    */
  val AUDIO_FORMAT_ALAW: Double = js.native
  
  /**
    * Audio format Apple lossless encoding.
    */
  val AUDIO_FORMAT_APPLE_LOSSLESS: Double = js.native
  
  /**
    * Audio format [iLBC encoding](https://en.wikipedia.org/wiki/Internet_Low_Bitrate_Codec).
    */
  val AUDIO_FORMAT_ILBC: Double = js.native
  
  /**
    * Audio format Apple IMA4 encoding.
    */
  val AUDIO_FORMAT_IMA4: Double = js.native
  
  /**
    * Audio format 16-bit, [linear PCM encoding](https://en.wikipedia.org/wiki/Pulse-code_modulation).
    */
  val AUDIO_FORMAT_LINEAR_PCM: Double = js.native
  
  /**
    * Audio format 8-bit [muLaw encoding](https://en.wikipedia.org/wiki/M-law_algorithm).
    */
  val AUDIO_FORMAT_ULAW: Double = js.native
  
  /**
    * Line-type constant for headphones.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_HEADPHONES: scala.Nothing = js.native
  
  /**
    * Line-type constant for headphones and microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_HEADPHONES_AND_MIC: scala.Nothing = js.native
  
  /**
    * Line-type constant for headset in/out.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_HEADSET_INOUT: scala.Nothing = js.native
  
  /**
    * Line-type constant for line-out.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_LINEOUT: scala.Nothing = js.native
  
  /**
    * Line-type constant for microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_MICROPHONE: scala.Nothing = js.native
  
  /**
    * Line-type constant indicated mute switch is on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_MUTED: scala.Nothing = js.native
  
  /**
    * Line-type constant indicating receiver and microphone.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_RECEIVER_AND_MIC: scala.Nothing = js.native
  
  /**
    * For long-duration sounds such as rain, car engine noise, and so on.
    */
  val AUDIO_SESSION_CATEGORY_AMBIENT: String = js.native
  
  /**
    * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
    */
  val AUDIO_SESSION_CATEGORY_PLAYBACK: String = js.native
  
  /**
    * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
    */
  val AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD: String = js.native
  
  /**
    * Session mode for recording audio; it silences playback audio.
    */
  val AUDIO_SESSION_CATEGORY_RECORD: String = js.native
  
  /**
    * Session mode for long-duration sounds such as rain, car engine noise, and so on.
    */
  val AUDIO_SESSION_CATEGORY_SOLO_AMBIENT: String = js.native
  
  /**
    * For long-duration sounds such as rain, car engine noise, and so on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SESSION_MODE_AMBIENT: scala.Nothing = js.native
  
  /**
    * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SESSION_MODE_PLAYBACK: scala.Nothing = js.native
  
  /**
    * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SESSION_MODE_PLAY_AND_RECORD: scala.Nothing = js.native
  
  /**
    * Session mode for recording audio; it silences playback audio.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY_*` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SESSION_MODE_RECORD: scala.Nothing = js.native
  
  /**
    * Session mode for long-duration sounds such as rain, car engine noise, and so on.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_CATEGORY` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SESSION_MODE_SOLO_AMBIENT: scala.Nothing = js.native
  
  /**
    * Constant that specifies audio should output to the default audio route. See <Titanium.Media.setOverrideAudioRoute> for more information.
    */
  val AUDIO_SESSION_OVERRIDE_ROUTE_NONE: Double = js.native
  
  /**
    * Constant that specifies audio should output to the speaker. See <Titanium.Media.setOverrideAudioRoute> for more information.
    */
  val AUDIO_SESSION_OVERRIDE_ROUTE_SPEAKER: Double = js.native
  
  /**
    * Constant for output on a remote Air Play device. This is an output port.
    */
  val AUDIO_SESSION_PORT_AIRPLAY: String = js.native
  
  /**
    * Constant for output on a Bluetooth A2DP device. This is an output port.
    */
  val AUDIO_SESSION_PORT_BLUETOOTHA2DP: String = js.native
  
  /**
    * Constant for input or output on a Bluetooth Hands-Free Profile device. This can be both an input and output port.
    */
  val AUDIO_SESSION_PORT_BLUETOOTHHFP: String = js.native
  
  /**
    * Constant for output on a Bluetooth Low Energy device. This is an output port. This is available on iOS7 and later.
    */
  val AUDIO_SESSION_PORT_BLUETOOTHLE: String = js.native
  
  /**
    * Constant for built-in microphone on an iOS device. This is an input port.
    */
  val AUDIO_SESSION_PORT_BUILTINMIC: String = js.native
  
  /**
    * Constant for the speaker you hold to your ear when on a phone call. This is an output port.
    */
  val AUDIO_SESSION_PORT_BUILTINRECEIVER: String = js.native
  
  /**
    * Constant for built-in speaker on an iOS device. This is an output port.
    */
  val AUDIO_SESSION_PORT_BUILTINSPEAKER: String = js.native
  
  /**
    * Constant for Input or output via Car Audio. This can be both an input and output port. This is available on iOS7 and later.
    */
  val AUDIO_SESSION_PORT_CARAUDIO: String = js.native
  
  /**
    * Constant for output via High-Definition Multimedia Interface. This is an output port
    */
  val AUDIO_SESSION_PORT_HDMI: String = js.native
  
  /**
    * Constant for headphone or headset output. This is an output port.
    */
  val AUDIO_SESSION_PORT_HEADPHONES: String = js.native
  
  /**
    * Constant for microphone on a wired headset. This is an input port.
    */
  val AUDIO_SESSION_PORT_HEADSETMIC: String = js.native
  
  /**
    * Constant for line level input on a dock connector. This is an input port.
    */
  val AUDIO_SESSION_PORT_LINEIN: String = js.native
  
  /**
    * Constant for line level output on a dock connector. This is an output port.
    */
  val AUDIO_SESSION_PORT_LINEOUT: String = js.native
  
  /**
    * Constant for input or output on a Universal Serial Bus device. This can be both an input and output port.
    */
  val AUDIO_SESSION_PORT_USBAUDIO: String = js.native
  
  /**
    * Line-type constant for speaker output.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_SPEAKER: scala.Nothing = js.native
  
  /**
    * Audio data is being buffered from the network.
    */
  val AUDIO_STATE_BUFFERING: Double = js.native
  
  /**
    * Audio playback is being initialized.
    */
  val AUDIO_STATE_INITIALIZED: Double = js.native
  
  /**
    * Playback is paused.
    */
  val AUDIO_STATE_PAUSED: Double = js.native
  
  /**
    * Audio playback is active.
    */
  val AUDIO_STATE_PLAYING: Double = js.native
  
  /**
    * Audio playback is starting.
    */
  val AUDIO_STATE_STARTING: Double = js.native
  
  /**
    * Audio playback is stopped.
    */
  val AUDIO_STATE_STOPPED: Double = js.native
  
  /**
    * Audio playback is stopping.
    */
  val AUDIO_STATE_STOPPING: Double = js.native
  
  /**
    * Player is waiting for audio data from the network.
    */
  val AUDIO_STATE_WAITING_FOR_DATA: Double = js.native
  
  /**
    * Player is waiting for audio data to fill the queue.
    */
  val AUDIO_STATE_WAITING_FOR_QUEUE: Double = js.native
  
  /**
    * Line-type constant indicating that audio is unavailable.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_UNAVAILABLE: scala.Nothing = js.native
  
  /**
    * Line-type constant indicating that line-type is unknown or not determined.
    * @deprecated Deprecated in favor of the `AUDIO_SESSION_PORT` constants defined in [Titanium.Media](Titanium.Media).
    */
  val AUDIO_UNKNOWN: scala.Nothing = js.native
  
  /**
    * Constant specifying that app is authorized to use camera. This is available on iOS7 and later.
    */
  val CAMERA_AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * Constant specifying that app is denied usage of camera. This is available on iOS7 and later.
    */
  val CAMERA_AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
    * @deprecated Use [Titanium.Media.CAMERA_AUTHORIZATION_UNKNOWN](Titanium.Media.CAMERA_AUTHORIZATION_UNKNOWN) instead.
    */
  val CAMERA_AUTHORIZATION_NOT_DETERMINED: scala.Nothing = js.native
  
  /**
    * Constant specifying that app is restricted from using camera. This is available on iOS7 and later.
    */
  val CAMERA_AUTHORIZATION_RESTRICTED: Double = js.native
  
  /**
    * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
    */
  val CAMERA_AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * Constant specifying to have the device determine to use the flash or not.
    */
  val CAMERA_FLASH_AUTO: Double = js.native
  
  /**
    * Constant specifying to never fire the flash.
    */
  val CAMERA_FLASH_OFF: Double = js.native
  
  /**
    * Constant specifying to always fire the flash.
    */
  val CAMERA_FLASH_ON: Double = js.native
  
  /**
    * Constant specifying the front camera.
    */
  val CAMERA_FRONT: Double = js.native
  
  /**
    * Constant indicating the rear camera.
    */
  val CAMERA_REAR: Double = js.native
  
  /**
    * Constant for media device busy error.
    */
  val DEVICE_BUSY: Double = js.native
  
  /**
    * Media type constant for live photo media.
    */
  val MEDIA_TYPE_LIVEPHOTO: String = js.native
  
  /**
    * Media type constant for photo media.
    */
  val MEDIA_TYPE_PHOTO: String = js.native
  
  /**
    * Media type constant for video media.
    */
  val MEDIA_TYPE_VIDEO: String = js.native
  
  /**
    * Constant for grouping query results by album.
    */
  val MUSIC_MEDIA_GROUP_ALBUM: Double = js.native
  
  /**
    * Constant for grouping query results by album and artist.
    */
  val MUSIC_MEDIA_GROUP_ALBUM_ARTIST: Double = js.native
  
  /**
    * Constant for grouping query results by artist.
    */
  val MUSIC_MEDIA_GROUP_ARTIST: Double = js.native
  
  /**
    * Constant for grouping query results by composer.
    */
  val MUSIC_MEDIA_GROUP_COMPOSER: Double = js.native
  
  /**
    * Constant for grouping query results by genre.
    */
  val MUSIC_MEDIA_GROUP_GENRE: Double = js.native
  
  /**
    * Constant for grouping query results by playlist.
    */
  val MUSIC_MEDIA_GROUP_PLAYLIST: Double = js.native
  
  /**
    * Constant for grouping query results by podcast title.
    */
  val MUSIC_MEDIA_GROUP_PODCAST_TITLE: Double = js.native
  
  /**
    * Constant for grouping query results by title.
    */
  val MUSIC_MEDIA_GROUP_TITLE: Double = js.native
  
  /**
    * Music library media containing any type of content.
    */
  val MUSIC_MEDIA_TYPE_ALL: Double = js.native
  
  /**
    * Music library media containing any type of audio content.
    */
  val MUSIC_MEDIA_TYPE_ANY_AUDIO: Double = js.native
  
  /**
    * Music library media containing audiobook content.
    */
  val MUSIC_MEDIA_TYPE_AUDIOBOOK: Double = js.native
  
  /**
    * Music library media containing music content.
    */
  val MUSIC_MEDIA_TYPE_MUSIC: Double = js.native
  
  /**
    * Music library media containing podcast content.
    */
  val MUSIC_MEDIA_TYPE_PODCAST: Double = js.native
  
  /**
    * Constant for "Repeat All" setting.
    */
  val MUSIC_PLAYER_REPEAT_ALL: Double = js.native
  
  /**
    * Constant for user's default repeat setting.
    */
  val MUSIC_PLAYER_REPEAT_DEFAULT: Double = js.native
  
  /**
    * Constant for "No Repeat" setting.
    */
  val MUSIC_PLAYER_REPEAT_NONE: Double = js.native
  
  /**
    * Constant for "Repeat one item" setting.
    */
  val MUSIC_PLAYER_REPEAT_ONE: Double = js.native
  
  /**
    * Constant for shuffling complete albums setting.
    */
  val MUSIC_PLAYER_SHUFFLE_ALBUMS: Double = js.native
  
  /**
    * Constant for user's default shuffle setting.
    */
  val MUSIC_PLAYER_SHUFFLE_DEFAULT: Double = js.native
  
  /**
    * Constant for "no shuffle" setting.
    */
  val MUSIC_PLAYER_SHUFFLE_NONE: Double = js.native
  
  /**
    * Constant for shuffling songs setting.
    */
  val MUSIC_PLAYER_SHUFFLE_SONGS: Double = js.native
  
  /**
    * Constant for interrupted state.
    */
  val MUSIC_PLAYER_STATE_INTERRUPTED: Double = js.native
  
  /**
    * Constant for paused state.
    */
  val MUSIC_PLAYER_STATE_PAUSED: Double = js.native
  
  /**
    * Constant for playing state.
    */
  val MUSIC_PLAYER_STATE_PLAYING: Double = js.native
  
  /**
    * Constant for backward seek state.
    */
  val MUSIC_PLAYER_STATE_SEEK_BACKWARD: Double = js.native
  
  /**
    * Constant for forward seek state.
    */
  val MUSIC_PLAYER_STATE_SEEK_FORWARD: Double = js.native
  
  /**
    * Constant for stopped state.
    */
  val MUSIC_PLAYER_STATE_STOPPED: Double = js.native
  
  /**
    * Constant for media no camera error.
    */
  val NO_CAMERA: Double = js.native
  
  /**
    * Constant for media no video error.
    */
  val NO_VIDEO: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  val QUALITY_640x480: Double = js.native
  
  /**
    * Media type constant for high-quality video recording.
    */
  val QUALITY_HIGH: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  val QUALITY_IFRAME_1280x720: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  val QUALITY_IFRAME_960x540: Double = js.native
  
  /**
    * Media type constant for low-quality video recording.
    */
  val QUALITY_LOW: Double = js.native
  
  /**
    * Media type constant for medium-quality video recording.
    */
  val QUALITY_MEDIUM: Double = js.native
  
  /**
    * Constant for unknown media error.
    */
  val UNKNOWN_ERROR: Double = js.native
  
  /**
    * Constant for default video controls.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_CONTROL_DEFAULT: scala.Nothing = js.native
  
  /**
    * Constant for video controls for an embedded view.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_CONTROL_EMBEDDED: scala.Nothing = js.native
  
  /**
    * Constant for fullscreen video controls.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_CONTROL_FULLSCREEN: scala.Nothing = js.native
  
  /**
    * Constant for video controls hidden.
    */
  val VIDEO_CONTROL_HIDDEN: Double = js.native
  
  /**
    * Constant for no video controls.
    */
  val VIDEO_CONTROL_NONE: Double = js.native
  
  /**
    * Constant for video controls volume only.
    * @deprecated Use [Titanium.Media.VIDEO_CONTROL_EMBEDDED](Titanium.Media.VIDEO_CONTROL_EMBEDDED) instead.
    */
  val VIDEO_CONTROL_VOLUME_ONLY: scala.Nothing = js.native
  
  /**
    * Video playback ended normally.
    */
  val VIDEO_FINISH_REASON_PLAYBACK_ENDED: Double = js.native
  
  /**
    * Video playback ended abnormally.
    */
  val VIDEO_FINISH_REASON_PLAYBACK_ERROR: Double = js.native
  
  /**
    * Video playback ended by user action (such as clicking the `Done` button).
    */
  val VIDEO_FINISH_REASON_USER_EXITED: Double = js.native
  
  /**
    * Indicates that the player can no longer play media items because of an error.
    */
  val VIDEO_LOAD_STATE_FAILED: Double = js.native
  
  /**
    * Current media is playable.
    */
  val VIDEO_LOAD_STATE_PLAYABLE: Double = js.native
  
  /**
    * Playback will be automatically started in this state when `autoplay` is true.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_LOAD_STATE_PLAYTHROUGH_OK: scala.Nothing = js.native
  
  /**
    * Playback will be automatically paused in this state, if started.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_LOAD_STATE_STALLED: scala.Nothing = js.native
  
  /**
    * Current load state is not known.
    */
  val VIDEO_LOAD_STATE_UNKNOWN: Double = js.native
  
  /**
    * A audio type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_MEDIA_TYPE_AUDIO: scala.Nothing = js.native
  
  /**
    * An unknown type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_MEDIA_TYPE_NONE: scala.Nothing = js.native
  
  /**
    * A video type of media in the movie returned by [Titanium.Media.VideoPlayer](Titanium.Media.VideoPlayer) `mediaTypes` property.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_MEDIA_TYPE_VIDEO: scala.Nothing = js.native
  
  /**
    * Video playback has been interrupted.
    */
  val VIDEO_PLAYBACK_STATE_INTERRUPTED: Double = js.native
  
  /**
    * Video playback is paused.
    */
  val VIDEO_PLAYBACK_STATE_PAUSED: Double = js.native
  
  /**
    * Video is being played.
    */
  val VIDEO_PLAYBACK_STATE_PLAYING: Double = js.native
  
  /**
    * Video playback is rewinding.
    * @deprecated This constant has been removed on iOS by using the official Apple AVPlayer that does not expose this functionality so far.
    */
  val VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD: scala.Nothing = js.native
  
  /**
    * Video playback is seeking forward.
    * @deprecated This constant has been removed on iOS by using the official Apple AVPlayer that does not expose this functionality so far.
    */
  val VIDEO_PLAYBACK_STATE_SEEKING_FORWARD: scala.Nothing = js.native
  
  /**
    * Video playback is stopped.
    */
  val VIDEO_PLAYBACK_STATE_STOPPED: Double = js.native
  
  /**
    * Constant for disabling repeat on video playback.
    */
  val VIDEO_REPEAT_MODE_NONE: Double = js.native
  
  /**
    * Constant for repeating one video (i.e., the one video will repeat constantly) during playback.
    */
  val VIDEO_REPEAT_MODE_ONE: Double = js.native
  
  /**
    * Scale video to fill the screen, clipping edges if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SCALING_ASPECT_FILL: scala.Nothing = js.native
  
  /**
    * Scale video to fit the screen, letterboxing if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SCALING_ASPECT_FIT: scala.Nothing = js.native
  
  /**
    * Video is scaled until both dimensions fit the screen exactly, stretching if necessary.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SCALING_MODE_FILL: scala.Nothing = js.native
  
  /**
    * Video scaling is disabled.
    * @deprecated This property has been removed for iOS in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SCALING_NONE: scala.Nothing = js.native
  
  /**
    * Specifies that the video should be stretched to fill the bounds of layer.
    */
  val VIDEO_SCALING_RESIZE: String = js.native
  
  /**
    * Specifies that the player should preserve the aspect ratio of video and fit the video within the bounds of layer.
    */
  val VIDEO_SCALING_RESIZE_ASPECT: String = js.native
  
  /**
    * Specifies that the player should preserve the aspect ratio of video and fill the bounds of layer.
    */
  val VIDEO_SCALING_RESIZE_ASPECT_FILL: String = js.native
  
  /**
    * Video source type is a file.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SOURCE_TYPE_FILE: scala.Nothing = js.native
  
  /**
    * Video source type is a remote stream.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SOURCE_TYPE_STREAMING: scala.Nothing = js.native
  
  /**
    * Video source type is unknown.
    * @deprecated This property has been removed in Titanium SDK 7.0.0 as of the official deprecation by Apple.
    */
  val VIDEO_SOURCE_TYPE_UNKNOWN: scala.Nothing = js.native
  
  /**
    * Use the closest sync (or key) frame at given the time.
    */
  val VIDEO_TIME_OPTION_CLOSEST_SYNC: Double = js.native
  
  /**
    * Use the exact time.
    */
  val VIDEO_TIME_OPTION_EXACT: Double = js.native
  
  /**
    * Use the closest keyframe in the time.
    */
  val VIDEO_TIME_OPTION_NEAREST_KEYFRAME: Double = js.native
  
  /**
    * Use the sync (or key) frame located right after or at given the time.
    */
  val VIDEO_TIME_OPTION_NEXT_SYNC: Double = js.native
  
  /**
    * Use the sync (or key) frame located right before or at given the time.
    */
  val VIDEO_TIME_OPTION_PREVIOUS_SYNC: Double = js.native
  
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
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  
  /**
    * An instance of <Titanium.Media.MusicPlayer> representing the app-specific music player.
    */
  val appMusicPlayer: typings.titanium.Titanium.Media.MusicPlayer = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  
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
    * Plays a device beep notification.
    */
  def beep(): Unit = js.native
  
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
    * Creates and returns an instance of <Titanium.Media.AudioPlayer>.
    */
  def createAudioPlayer(): typings.titanium.Titanium.Media.AudioPlayer = js.native
  def createAudioPlayer(parameters: Dictionary[typings.titanium.Titanium.Media.AudioPlayer]): typings.titanium.Titanium.Media.AudioPlayer = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.AudioRecorder>.
    */
  def createAudioRecorder(): typings.titanium.Titanium.Media.AudioRecorder = js.native
  def createAudioRecorder(parameters: Dictionary[typings.titanium.Titanium.Media.AudioRecorder]): typings.titanium.Titanium.Media.AudioRecorder = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.Sound>.
    */
  def createSound(): typings.titanium.Titanium.Media.Sound = js.native
  def createSound(parameters: Dictionary[typings.titanium.Titanium.Media.Sound]): typings.titanium.Titanium.Media.Sound = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.SystemAlert>.
    * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
    */
  def createSystemAlert(): typings.titanium.Titanium.Media.SystemAlert = js.native
  def createSystemAlert(parameters: Dictionary[typings.titanium.Titanium.Media.SystemAlert]): typings.titanium.Titanium.Media.SystemAlert = js.native
  
  /**
    * Creates and returns an instance of <Titanium.Media.VideoPlayer>.
    */
  def createVideoPlayer(): typings.titanium.Titanium.Media.VideoPlayer = js.native
  def createVideoPlayer(parameters: Dictionary[typings.titanium.Titanium.Media.VideoPlayer]): typings.titanium.Titanium.Media.VideoPlayer = js.native
  
  /**
    * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
    */
  val currentRoute: RouteDescription = js.native
  
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
  def getAppMusicPlayer(): typings.titanium.Titanium.Media.MusicPlayer = js.native
  
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
  def getSystemMusicPlayer(): typings.titanium.Titanium.Media.MusicPlayer = js.native
  
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
    * `true` if the device has camera support.
    */
  val isCameraSupported: Boolean = js.native
  
  /**
    * Returns `true` if the source supports the specified media type.
    */
  def isMediaTypeSupported(source: String, `type`: String): Boolean = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  
  /**
    * Shows the music library and allows the user to select one or more tracks.
    */
  def openMusicLibrary(options: MusicLibraryOptionsType): Unit = js.native
  
  /**
    * Opens the photo gallery image picker.
    */
  def openPhotoGallery(options: PhotoGalleryOptionsType): Unit = js.native
  
  /**
    * Current microphone level peak power in dB or -1 if microphone monitoring is disabled.
    */
  val peakMicrophonePower: Double = js.native
  
  /**
    * Displays the given image.
    */
  def previewImage(options: Dictionary[PreviewImageOptions]): Unit = js.native
  
  /**
    * Searches the music library for items matching the specified search predicates.
    */
  def queryMusicLibrary(query: MediaQueryType): js.Array[typings.titanium.Titanium.Media.Item] = js.native
  
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
  def saveToPhotoGallery(media: typings.titanium.Titanium.Blob, callbacks: js.Any): Unit = js.native
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
    * An instance of <Titanium.Media.MusicPlayer> representing the system-wide music player.
    */
  val systemMusicPlayer: typings.titanium.Titanium.Media.MusicPlayer = js.native
  
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
  
  /**
    * Current volume of the playback device.
    */
  val volume: Double = js.native
  
  /**
    * Android-specific media-related functionality.
    */
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  /* static members */
  @js.native
  object Android extends js.Object {
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.apiName> property.
      * @deprecated Access <Titanium.Media.Android.apiName> instead.
      */
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.bubbleParent> property.
      * @deprecated Access <Titanium.Media.Android.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Media.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.Media.Android.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Scans newly created or downloaded media files to make them available to other
      * Android media providers, such as the Gallery.
      */
    def scanMediaFiles(
      paths: js.Array[String],
      mimeTypes: js.Array[String],
      callback: js.Function1[/* param0 */ MediaScannerResponse, Unit]
    ): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Media.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Media.Android.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Media.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Media.Android.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * Set the system homescreen wallpaper.
      */
    def setSystemWallpaper(image: typings.titanium.Titanium.Blob, scale: Boolean): Unit = js.native
  }
  
  /**
    * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
    */
  @js.native
  class AudioPlayer ()
    extends typings.titanium.Titanium.Media.AudioPlayer
  
  /**
    * An audio recorder object used for recording audio from the device microphone.
    */
  @js.native
  class AudioRecorder ()
    extends typings.titanium.Titanium.Media.AudioRecorder
  
  /**
    * A representation of a media item returned by [openMusicLibrary](Titanium.Media.openMusicLibrary) or [queryMusicLibrary](Titanium.Media.queryMusicLibrary).
    */
  @js.native
  class Item ()
    extends typings.titanium.Titanium.Media.Item
  
  /**
    * This object represents a music controller.
    */
  @js.native
  class MusicPlayer ()
    extends typings.titanium.Titanium.Media.MusicPlayer
  
  /**
    * An object for playing basic audio resources.
    */
  @js.native
  class Sound ()
    extends typings.titanium.Titanium.Media.Sound
  
  /**
    * An object for playing system sounds.
    * @deprecated This iOS-only API has been deprecated and moved to the [Ti.SystemAlert](https://github.com/appcelerator-modules/ti.systemalert) module in 8.0.0.
    */
  @js.native
  class SystemAlert ()
    extends typings.titanium.Titanium.Media.SystemAlert
  
  /**
    * A native control for playing videos.
    */
  @js.native
  class VideoPlayer ()
    extends typings.titanium.Titanium.Media.VideoPlayer
}
