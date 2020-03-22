package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Media.AudioPlayer
import typings.titanium.Titanium.Media.AudioRecorder
import typings.titanium.Titanium.Media.Item
import typings.titanium.Titanium.Media.MusicPlayer
import typings.titanium.Titanium.Media.Sound
import typings.titanium.Titanium.Media.SystemAlert
import typings.titanium.Titanium.Media.VideoPlayer
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMedia extends js.Object {
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
  		 */
  val AUDIO_HEADPHONES: Double = js.native
  /**
  		 * Line-type constant for headphones and microphone.
  		 */
  val AUDIO_HEADPHONES_AND_MIC: Double = js.native
  /**
  		 * Line-type constant for headset in/out.
  		 */
  val AUDIO_HEADSET_INOUT: Double = js.native
  /**
  		 * Line-type constant for line-out.
  		 */
  val AUDIO_LINEOUT: Double = js.native
  /**
  		 * Line-type constant for microphone.
  		 */
  val AUDIO_MICROPHONE: Double = js.native
  /**
  		 * Line-type constant indicated mute switch is on.
  		 */
  val AUDIO_MUTED: Double = js.native
  /**
  		 * Line-type constant indicating receiver and microphone.
  		 */
  val AUDIO_RECEIVER_AND_MIC: Double = js.native
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
  		 */
  val AUDIO_SESSION_MODE_AMBIENT: Double = js.native
  /**
  		 * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
  		 */
  val AUDIO_SESSION_MODE_PLAYBACK: Double = js.native
  /**
  		 * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
  		 */
  val AUDIO_SESSION_MODE_PLAY_AND_RECORD: Double = js.native
  /**
  		 * Session mode for recording audio; it silences playback audio.
  		 */
  val AUDIO_SESSION_MODE_RECORD: Double = js.native
  /**
  		 * Session mode for long-duration sounds such as rain, car engine noise, and so on.
  		 */
  val AUDIO_SESSION_MODE_SOLO_AMBIENT: Double = js.native
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
  		 */
  val AUDIO_SPEAKER: Double = js.native
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
  		 */
  val AUDIO_UNAVAILABLE: Double = js.native
  /**
  		 * Line-type constant indicating that line-type is unknown or not determined.
  		 */
  val AUDIO_UNKNOWN: Double = js.native
  /**
  		 * Android-specific media-related functionality.
  		 */
  val Android: TypeofAndroidApiName = js.native
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
  		 */
  val CAMERA_AUTHORIZATION_NOT_DETERMINED: Double = js.native
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
  		 */
  val VIDEO_CONTROL_DEFAULT: Double = js.native
  /**
  		 * Constant for video controls for an embedded view.
  		 */
  val VIDEO_CONTROL_EMBEDDED: Double = js.native
  /**
  		 * Constant for fullscreen video controls.
  		 */
  val VIDEO_CONTROL_FULLSCREEN: Double = js.native
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
  		 */
  val VIDEO_CONTROL_VOLUME_ONLY: Double = js.native
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
  		 */
  val VIDEO_LOAD_STATE_PLAYTHROUGH_OK: Double = js.native
  /**
  		 * Playback will be automatically paused in this state, if started.
  		 */
  val VIDEO_LOAD_STATE_STALLED: Double = js.native
  /**
  		 * Current load state is not known.
  		 */
  val VIDEO_LOAD_STATE_UNKNOWN: Double = js.native
  /**
  		 * A audio type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_AUDIO: Double = js.native
  /**
  		 * An unknown type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_NONE: Double = js.native
  /**
  		 * A video type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_VIDEO: Double = js.native
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
  		 */
  val VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD: Double = js.native
  /**
  		 * Video playback is seeking forward.
  		 */
  val VIDEO_PLAYBACK_STATE_SEEKING_FORWARD: Double = js.native
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
  		 */
  val VIDEO_SCALING_ASPECT_FILL: Double = js.native
  /**
  		 * Scale video to fit the screen, letterboxing if necessary.
  		 */
  val VIDEO_SCALING_ASPECT_FIT: Double = js.native
  /**
  		 * Video is scaled until both dimensions fit the screen exactly, stretching if necessary.
  		 */
  val VIDEO_SCALING_MODE_FILL: Double = js.native
  /**
  		 * Video scaling is disabled.
  		 */
  val VIDEO_SCALING_NONE: Double = js.native
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
  		 */
  val VIDEO_SOURCE_TYPE_FILE: Double = js.native
  /**
  		 * Video source type is a remote stream.
  		 */
  val VIDEO_SOURCE_TYPE_STREAMING: Double = js.native
  /**
  		 * Video source type is unknown.
  		 */
  val VIDEO_SOURCE_TYPE_UNKNOWN: Double = js.native
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
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * An instance of <Titanium.Media.MusicPlayer> representing the app-specific music player.
  		 */
  val appMusicPlayer: MusicPlayer = js.native
  /**
  		 * Returns the line type constant for the current line type.
  		 */
  val audioLineType: Double = js.native
  /**
  		 * Returns `true` if the device is playing audio.
  		 */
  val audioPlaying: Boolean = js.native
  /**
  		 * A constant for the audio session category to be used.
  		 */
  var audioSessionCategory: Double = js.native
  /**
  		 * A constant for the audio session mode to be used.
  		 */
  var audioSessionMode: Double = js.native
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
  		 * Returns the authorization status for the camera.
  		 */
  val cameraAuthorizationStatus: Double = js.native
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
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
  def createAudioPlayer(parameters: js.Any): AudioPlayer = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.AudioRecorder>.
  		 */
  def createAudioRecorder(): AudioRecorder = js.native
  def createAudioRecorder(parameters: js.Any): AudioRecorder = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.Sound>.
  		 */
  def createSound(): Sound = js.native
  def createSound(parameters: js.Any): Sound = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.SystemAlert>.
  		 */
  def createSystemAlert(): SystemAlert = js.native
  def createSystemAlert(parameters: js.Any): SystemAlert = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.VideoPlayer>.
  		 */
  def createVideoPlayer(): VideoPlayer = js.native
  def createVideoPlayer(parameters: js.Any): VideoPlayer = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Media.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Media.appMusicPlayer> property.
  		 */
  def getAppMusicPlayer(): MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioLineType> property.
  		 */
  def getAudioLineType(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioPlaying> property.
  		 */
  def getAudioPlaying(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioSessionCategory> property.
  		 */
  def getAudioSessionCategory(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioSessionMode> property.
  		 */
  def getAudioSessionMode(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 */
  def getAvailableCameraMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameras> property.
  		 */
  def getAvailableCameras(): js.Array[Double] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
  		 */
  def getAvailablePhotoGalleryMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
  		 */
  def getAvailablePhotoMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.averageMicrophonePower> property.
  		 */
  def getAverageMicrophonePower(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraAuthorization> property.
  		 */
  def getCameraAuthorization(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraAuthorizationStatus> property.
  		 */
  def getCameraAuthorizationStatus(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraFlashMode> property.
  		 */
  def getCameraFlashMode(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.canRecord> property.
  		 */
  def getCanRecord(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.currentRoute> property.
  		 */
  def getCurrentRoute(): RouteDescription = js.native
  /**
  		 * Gets the value of the <Titanium.Media.isCameraSupported> property.
  		 */
  def getIsCameraSupported(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Media.peakMicrophonePower> property.
  		 */
  def getPeakMicrophonePower(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_640x480> property.
  		 */
  def getQUALITY_640x480(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_1280x720> property.
  		 */
  def getQUALITY_IFRAME_1280x720(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_960x540> property.
  		 */
  def getQUALITY_IFRAME_960x540(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.systemMusicPlayer> property.
  		 */
  def getSystemMusicPlayer(): MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.volume> property.
  		 */
  def getVolume(): Double = js.native
  /**
  		 * Returns `true` if the app has audio permissions.
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
  def previewImage(options: js.Any): Unit = js.native
  /**
  		 * Searches the music library for items matching the specified search predicates.
  		 */
  def queryMusicLibrary(query: MediaQueryType): js.Array[Item] = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAudioPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAudioRecorderPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAuthorization(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Requests for camera access.
  		 */
  def requestCameraAccess(callback: js.Function1[/* param0 */ RequestCameraAccessResult, _]): Unit = js.native
  /**
  		 * Requests for camera access.
  		 */
  def requestCameraPermissions(callback: js.Function1[/* param0 */ RequestCameraAccessResult, _]): Unit = js.native
  /**
  		 * Request permissions for the native music-library.
  		 */
  def requestMusicLibraryPermissions(callback: js.Function1[/* param0 */ RequestMusicLibraryAccessResult, _]): Unit = js.native
  /**
  		 * Requests for photo gallery permissions.
  		 */
  def requestPhotoGalleryPermissions(callback: js.Function1[/* param0 */ RequestPhotoGalleryAccessResult, _]): Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def saveToPhotoGallery(media: Blob, callbacks: js.Any): Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def saveToPhotoGallery(media: File, callbacks: js.Any): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.audioSessionCategory> property.
  		 */
  def setAudioSessionCategory(audioSessionCategory: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.audioSessionMode> property.
  		 */
  def setAudioSessionMode(audioSessionMode: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 */
  def setAvailableCameraMediaTypes(availableCameraMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
  		 */
  def setAvailablePhotoGalleryMediaTypes(availablePhotoGalleryMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
  		 */
  def setAvailablePhotoMediaTypes(availablePhotoMediaTypes: js.Array[_]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.averageMicrophonePower> property.
  		 */
  def setAverageMicrophonePower(averageMicrophonePower: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.cameraFlashMode> property.
  		 */
  def setCameraFlashMode(cameraFlashMode: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.lifecycleContainer> property.
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
  def takeScreenshot(callback: js.Function1[/* param0 */ ScreenshotResult, _]): Unit = js.native
  /**
  		 * Makes the device vibrate.
  		 */
  def vibrate(): Unit = js.native
  def vibrate(pattern: js.Array[Double]): Unit = js.native
}

