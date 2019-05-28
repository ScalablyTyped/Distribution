package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMedia extends js.Object {
  /**
  		 * Audio file format 3GPP2.
  		 */
  val AUDIO_FILEFORMAT_3GP2: scala.Double = js.native
  /**
  		 * Audio file format 3GPP.
  		 */
  val AUDIO_FILEFORMAT_3GPP: scala.Double = js.native
  /**
  		 * Audio file format Audio Interchange File Format (AIFF).
  		 */
  val AUDIO_FILEFORMAT_AIFF: scala.Double = js.native
  /**
  		 * Audio file format Adaptive Multi-Rate (AMR).
  		 */
  val AUDIO_FILEFORMAT_AMR: scala.Double = js.native
  /**
  		 * Audio file format Apple Compressed Audio Format (CAF).
  		 */
  val AUDIO_FILEFORMAT_CAF: scala.Double = js.native
  /**
  		 * Audio file format MP3.
  		 */
  val AUDIO_FILEFORMAT_MP3: scala.Double = js.native
  /**
  		 * Audio file format MP4.
  		 */
  val AUDIO_FILEFORMAT_MP4: scala.Double = js.native
  /**
  		 * Audio file format MP4A.
  		 */
  val AUDIO_FILEFORMAT_MP4A: scala.Double = js.native
  /**
  		 * Audio file format WAVE.
  		 */
  val AUDIO_FILEFORMAT_WAVE: scala.Double = js.native
  /**
  		 * Audio format MPEG4 AAC encoding.
  		 */
  val AUDIO_FORMAT_AAC: scala.Double = js.native
  /**
  		 * Audio format 8-bit [aLaw encoding](https://en.wikipedia.org/wiki/A-law_algorithm).
  		 */
  val AUDIO_FORMAT_ALAW: scala.Double = js.native
  /**
  		 * Audio format Apple lossless encoding.
  		 */
  val AUDIO_FORMAT_APPLE_LOSSLESS: scala.Double = js.native
  /**
  		 * Audio format [iLBC encoding](https://en.wikipedia.org/wiki/Internet_Low_Bitrate_Codec).
  		 */
  val AUDIO_FORMAT_ILBC: scala.Double = js.native
  /**
  		 * Audio format Apple IMA4 encoding.
  		 */
  val AUDIO_FORMAT_IMA4: scala.Double = js.native
  /**
  		 * Audio format 16-bit, [linear PCM encoding](https://en.wikipedia.org/wiki/Pulse-code_modulation).
  		 */
  val AUDIO_FORMAT_LINEAR_PCM: scala.Double = js.native
  /**
  		 * Audio format 8-bit [muLaw encoding](https://en.wikipedia.org/wiki/M-law_algorithm).
  		 */
  val AUDIO_FORMAT_ULAW: scala.Double = js.native
  /**
  		 * Line-type constant for headphones.
  		 */
  val AUDIO_HEADPHONES: scala.Double = js.native
  /**
  		 * Line-type constant for headphones and microphone.
  		 */
  val AUDIO_HEADPHONES_AND_MIC: scala.Double = js.native
  /**
  		 * Line-type constant for headset in/out.
  		 */
  val AUDIO_HEADSET_INOUT: scala.Double = js.native
  /**
  		 * Line-type constant for line-out.
  		 */
  val AUDIO_LINEOUT: scala.Double = js.native
  /**
  		 * Line-type constant for microphone.
  		 */
  val AUDIO_MICROPHONE: scala.Double = js.native
  /**
  		 * Line-type constant indicated mute switch is on.
  		 */
  val AUDIO_MUTED: scala.Double = js.native
  /**
  		 * Line-type constant indicating receiver and microphone.
  		 */
  val AUDIO_RECEIVER_AND_MIC: scala.Double = js.native
  /**
  		 * For long-duration sounds such as rain, car engine noise, and so on.
  		 */
  val AUDIO_SESSION_CATEGORY_AMBIENT: java.lang.String = js.native
  /**
  		 * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
  		 */
  val AUDIO_SESSION_CATEGORY_PLAYBACK: java.lang.String = js.native
  /**
  		 * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
  		 */
  val AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD: java.lang.String = js.native
  /**
  		 * Session mode for recording audio; it silences playback audio.
  		 */
  val AUDIO_SESSION_CATEGORY_RECORD: java.lang.String = js.native
  /**
  		 * Session mode for long-duration sounds such as rain, car engine noise, and so on.
  		 */
  val AUDIO_SESSION_CATEGORY_SOLO_AMBIENT: java.lang.String = js.native
  /**
  		 * For long-duration sounds such as rain, car engine noise, and so on.
  		 */
  val AUDIO_SESSION_MODE_AMBIENT: scala.Double = js.native
  /**
  		 * Session mode for playing recorded music or other sounds that are central to the successful use of your application.
  		 */
  val AUDIO_SESSION_MODE_PLAYBACK: scala.Double = js.native
  /**
  		 * Session mode for recording (input) and playback (output) of audio, such as for a VOIP (voice over IP) application.
  		 */
  val AUDIO_SESSION_MODE_PLAY_AND_RECORD: scala.Double = js.native
  /**
  		 * Session mode for recording audio; it silences playback audio.
  		 */
  val AUDIO_SESSION_MODE_RECORD: scala.Double = js.native
  /**
  		 * Session mode for long-duration sounds such as rain, car engine noise, and so on.
  		 */
  val AUDIO_SESSION_MODE_SOLO_AMBIENT: scala.Double = js.native
  /**
  		 * Constant that specifies audio should output to the default audio route. See <Titanium.Media.setOverrideAudioRoute> for more information.
  		 */
  val AUDIO_SESSION_OVERRIDE_ROUTE_NONE: scala.Double = js.native
  /**
  		 * Constant that specifies audio should output to the speaker. See <Titanium.Media.setOverrideAudioRoute> for more information.
  		 */
  val AUDIO_SESSION_OVERRIDE_ROUTE_SPEAKER: scala.Double = js.native
  /**
  		 * Constant for output on a remote Air Play device. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_AIRPLAY: java.lang.String = js.native
  /**
  		 * Constant for output on a Bluetooth A2DP device. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_BLUETOOTHA2DP: java.lang.String = js.native
  /**
  		 * Constant for input or output on a Bluetooth Hands-Free Profile device. This can be both an input and output port.
  		 */
  val AUDIO_SESSION_PORT_BLUETOOTHHFP: java.lang.String = js.native
  /**
  		 * Constant for output on a Bluetooth Low Energy device. This is an output port. This is available on iOS7 and later.
  		 */
  val AUDIO_SESSION_PORT_BLUETOOTHLE: java.lang.String = js.native
  /**
  		 * Constant for built-in microphone on an iOS device. This is an input port.
  		 */
  val AUDIO_SESSION_PORT_BUILTINMIC: java.lang.String = js.native
  /**
  		 * Constant for the speaker you hold to your ear when on a phone call. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_BUILTINRECEIVER: java.lang.String = js.native
  /**
  		 * Constant for built-in speaker on an iOS device. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_BUILTINSPEAKER: java.lang.String = js.native
  /**
  		 * Constant for Input or output via Car Audio. This can be both an input and output port. This is available on iOS7 and later.
  		 */
  val AUDIO_SESSION_PORT_CARAUDIO: java.lang.String = js.native
  /**
  		 * Constant for output via High-Definition Multimedia Interface. This is an output port
  		 */
  val AUDIO_SESSION_PORT_HDMI: java.lang.String = js.native
  /**
  		 * Constant for headphone or headset output. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_HEADPHONES: java.lang.String = js.native
  /**
  		 * Constant for microphone on a wired headset. This is an input port.
  		 */
  val AUDIO_SESSION_PORT_HEADSETMIC: java.lang.String = js.native
  /**
  		 * Constant for line level input on a dock connector. This is an input port.
  		 */
  val AUDIO_SESSION_PORT_LINEIN: java.lang.String = js.native
  /**
  		 * Constant for line level output on a dock connector. This is an output port.
  		 */
  val AUDIO_SESSION_PORT_LINEOUT: java.lang.String = js.native
  /**
  		 * Constant for input or output on a Universal Serial Bus device. This can be both an input and output port.
  		 */
  val AUDIO_SESSION_PORT_USBAUDIO: java.lang.String = js.native
  /**
  		 * Line-type constant for speaker output.
  		 */
  val AUDIO_SPEAKER: scala.Double = js.native
  /**
  		 * Audio data is being buffered from the network.
  		 */
  val AUDIO_STATE_BUFFERING: scala.Double = js.native
  /**
  		 * Audio playback is being initialized.
  		 */
  val AUDIO_STATE_INITIALIZED: scala.Double = js.native
  /**
  		 * Playback is paused.
  		 */
  val AUDIO_STATE_PAUSED: scala.Double = js.native
  /**
  		 * Audio playback is active.
  		 */
  val AUDIO_STATE_PLAYING: scala.Double = js.native
  /**
  		 * Audio playback is starting.
  		 */
  val AUDIO_STATE_STARTING: scala.Double = js.native
  /**
  		 * Audio playback is stopped.
  		 */
  val AUDIO_STATE_STOPPED: scala.Double = js.native
  /**
  		 * Audio playback is stopping.
  		 */
  val AUDIO_STATE_STOPPING: scala.Double = js.native
  /**
  		 * Player is waiting for audio data from the network.
  		 */
  val AUDIO_STATE_WAITING_FOR_DATA: scala.Double = js.native
  /**
  		 * Player is waiting for audio data to fill the queue.
  		 */
  val AUDIO_STATE_WAITING_FOR_QUEUE: scala.Double = js.native
  /**
  		 * Line-type constant indicating that audio is unavailable.
  		 */
  val AUDIO_UNAVAILABLE: scala.Double = js.native
  /**
  		 * Line-type constant indicating that line-type is unknown or not determined.
  		 */
  val AUDIO_UNKNOWN: scala.Double = js.native
  /**
  		 * Android-specific media-related functionality.
  		 */
  val AndroidNs: TypeofAndroidAddEventListenerApiName = js.native
  /**
  		 * Constant specifying that app is authorized to use camera. This is available on iOS7 and later.
  		 */
  val CAMERA_AUTHORIZATION_AUTHORIZED: scala.Double = js.native
  /**
  		 * Constant specifying that app is denied usage of camera. This is available on iOS7 and later.
  		 */
  val CAMERA_AUTHORIZATION_DENIED: scala.Double = js.native
  /**
  		 * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
  		 */
  val CAMERA_AUTHORIZATION_NOT_DETERMINED: scala.Double = js.native
  /**
  		 * Constant specifying that app is restricted from using camera. This is available on iOS7 and later.
  		 */
  val CAMERA_AUTHORIZATION_RESTRICTED: scala.Double = js.native
  /**
  		 * Constant specifying that app is not yet authorized to use camera. This is available on iOS7 and later.
  		 */
  val CAMERA_AUTHORIZATION_UNKNOWN: scala.Double = js.native
  /**
  		 * Constant specifying to have the device determine to use the flash or not.
  		 */
  val CAMERA_FLASH_AUTO: scala.Double = js.native
  /**
  		 * Constant specifying to never fire the flash.
  		 */
  val CAMERA_FLASH_OFF: scala.Double = js.native
  /**
  		 * Constant specifying to always fire the flash.
  		 */
  val CAMERA_FLASH_ON: scala.Double = js.native
  /**
  		 * Constant specifying the front camera.
  		 */
  val CAMERA_FRONT: scala.Double = js.native
  /**
  		 * Constant indicating the rear camera.
  		 */
  val CAMERA_REAR: scala.Double = js.native
  /**
  		 * Constant for media device busy error.
  		 */
  val DEVICE_BUSY: scala.Double = js.native
  /**
  		 * Media type constant for live photo media.
  		 */
  val MEDIA_TYPE_LIVEPHOTO: java.lang.String = js.native
  /**
  		 * Media type constant for photo media.
  		 */
  val MEDIA_TYPE_PHOTO: java.lang.String = js.native
  /**
  		 * Media type constant for video media.
  		 */
  val MEDIA_TYPE_VIDEO: java.lang.String = js.native
  /**
  		 * Constant for grouping query results by album.
  		 */
  val MUSIC_MEDIA_GROUP_ALBUM: scala.Double = js.native
  /**
  		 * Constant for grouping query results by album and artist.
  		 */
  val MUSIC_MEDIA_GROUP_ALBUM_ARTIST: scala.Double = js.native
  /**
  		 * Constant for grouping query results by artist.
  		 */
  val MUSIC_MEDIA_GROUP_ARTIST: scala.Double = js.native
  /**
  		 * Constant for grouping query results by composer.
  		 */
  val MUSIC_MEDIA_GROUP_COMPOSER: scala.Double = js.native
  /**
  		 * Constant for grouping query results by genre.
  		 */
  val MUSIC_MEDIA_GROUP_GENRE: scala.Double = js.native
  /**
  		 * Constant for grouping query results by playlist.
  		 */
  val MUSIC_MEDIA_GROUP_PLAYLIST: scala.Double = js.native
  /**
  		 * Constant for grouping query results by podcast title.
  		 */
  val MUSIC_MEDIA_GROUP_PODCAST_TITLE: scala.Double = js.native
  /**
  		 * Constant for grouping query results by title.
  		 */
  val MUSIC_MEDIA_GROUP_TITLE: scala.Double = js.native
  /**
  		 * Music library media containing any type of content.
  		 */
  val MUSIC_MEDIA_TYPE_ALL: scala.Double = js.native
  /**
  		 * Music library media containing any type of audio content.
  		 */
  val MUSIC_MEDIA_TYPE_ANY_AUDIO: scala.Double = js.native
  /**
  		 * Music library media containing audiobook content.
  		 */
  val MUSIC_MEDIA_TYPE_AUDIOBOOK: scala.Double = js.native
  /**
  		 * Music library media containing music content.
  		 */
  val MUSIC_MEDIA_TYPE_MUSIC: scala.Double = js.native
  /**
  		 * Music library media containing podcast content.
  		 */
  val MUSIC_MEDIA_TYPE_PODCAST: scala.Double = js.native
  /**
  		 * Constant for "Repeat All" setting.
  		 */
  val MUSIC_PLAYER_REPEAT_ALL: scala.Double = js.native
  /**
  		 * Constant for user's default repeat setting.
  		 */
  val MUSIC_PLAYER_REPEAT_DEFAULT: scala.Double = js.native
  /**
  		 * Constant for "No Repeat" setting.
  		 */
  val MUSIC_PLAYER_REPEAT_NONE: scala.Double = js.native
  /**
  		 * Constant for "Repeat one item" setting.
  		 */
  val MUSIC_PLAYER_REPEAT_ONE: scala.Double = js.native
  /**
  		 * Constant for shuffling complete albums setting.
  		 */
  val MUSIC_PLAYER_SHUFFLE_ALBUMS: scala.Double = js.native
  /**
  		 * Constant for user's default shuffle setting.
  		 */
  val MUSIC_PLAYER_SHUFFLE_DEFAULT: scala.Double = js.native
  /**
  		 * Constant for "no shuffle" setting.
  		 */
  val MUSIC_PLAYER_SHUFFLE_NONE: scala.Double = js.native
  /**
  		 * Constant for shuffling songs setting.
  		 */
  val MUSIC_PLAYER_SHUFFLE_SONGS: scala.Double = js.native
  /**
  		 * Constant for interrupted state.
  		 */
  val MUSIC_PLAYER_STATE_INTERRUPTED: scala.Double = js.native
  /**
  		 * Constant for paused state.
  		 */
  val MUSIC_PLAYER_STATE_PAUSED: scala.Double = js.native
  /**
  		 * Constant for playing state.
  		 */
  val MUSIC_PLAYER_STATE_PLAYING: scala.Double = js.native
  /**
  		 * Constant for backward seek state.
  		 */
  val MUSIC_PLAYER_STATE_SEEK_BACKWARD: scala.Double = js.native
  /**
  		 * Constant for forward seek state.
  		 */
  val MUSIC_PLAYER_STATE_SEEK_FORWARD: scala.Double = js.native
  /**
  		 * Constant for stopped state.
  		 */
  val MUSIC_PLAYER_STATE_STOPPED: scala.Double = js.native
  /**
  		 * Constant for media no camera error.
  		 */
  val NO_CAMERA: scala.Double = js.native
  /**
  		 * Constant for media no video error.
  		 */
  val NO_VIDEO: scala.Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_640x480: scala.Double = js.native
  /**
  		 * Media type constant for high-quality video recording.
  		 */
  val QUALITY_HIGH: scala.Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_IFRAME_1280x720: scala.Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_IFRAME_960x540: scala.Double = js.native
  /**
  		 * Media type constant for low-quality video recording.
  		 */
  val QUALITY_LOW: scala.Double = js.native
  /**
  		 * Media type constant for medium-quality video recording.
  		 */
  val QUALITY_MEDIUM: scala.Double = js.native
  /**
  		 * Constant for unknown media error.
  		 */
  val UNKNOWN_ERROR: scala.Double = js.native
  /**
  		 * Constant for default video controls.
  		 */
  val VIDEO_CONTROL_DEFAULT: scala.Double = js.native
  /**
  		 * Constant for video controls for an embedded view.
  		 */
  val VIDEO_CONTROL_EMBEDDED: scala.Double = js.native
  /**
  		 * Constant for fullscreen video controls.
  		 */
  val VIDEO_CONTROL_FULLSCREEN: scala.Double = js.native
  /**
  		 * Constant for video controls hidden.
  		 */
  val VIDEO_CONTROL_HIDDEN: scala.Double = js.native
  /**
  		 * Constant for no video controls.
  		 */
  val VIDEO_CONTROL_NONE: scala.Double = js.native
  /**
  		 * Constant for video controls volume only.
  		 */
  val VIDEO_CONTROL_VOLUME_ONLY: scala.Double = js.native
  /**
  		 * Video playback ended normally.
  		 */
  val VIDEO_FINISH_REASON_PLAYBACK_ENDED: scala.Double = js.native
  /**
  		 * Video playback ended abnormally.
  		 */
  val VIDEO_FINISH_REASON_PLAYBACK_ERROR: scala.Double = js.native
  /**
  		 * Video playback ended by user action (such as clicking the `Done` button).
  		 */
  val VIDEO_FINISH_REASON_USER_EXITED: scala.Double = js.native
  /**
  		 * Indicates that the player can no longer play media items because of an error.
  		 */
  val VIDEO_LOAD_STATE_FAILED: scala.Double = js.native
  /**
  		 * Current media is playable.
  		 */
  val VIDEO_LOAD_STATE_PLAYABLE: scala.Double = js.native
  /**
  		 * Playback will be automatically started in this state when `autoplay` is true.
  		 */
  val VIDEO_LOAD_STATE_PLAYTHROUGH_OK: scala.Double = js.native
  /**
  		 * Playback will be automatically paused in this state, if started.
  		 */
  val VIDEO_LOAD_STATE_STALLED: scala.Double = js.native
  /**
  		 * Current load state is not known.
  		 */
  val VIDEO_LOAD_STATE_UNKNOWN: scala.Double = js.native
  /**
  		 * A audio type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_AUDIO: scala.Double = js.native
  /**
  		 * An unknown type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_NONE: scala.Double = js.native
  /**
  		 * A video type of media in the movie returned by <Titanium.Media.VideoPlayer> `mediaTypes` property.
  		 */
  val VIDEO_MEDIA_TYPE_VIDEO: scala.Double = js.native
  /**
  		 * Video playback has been interrupted.
  		 */
  val VIDEO_PLAYBACK_STATE_INTERRUPTED: scala.Double = js.native
  /**
  		 * Video playback is paused.
  		 */
  val VIDEO_PLAYBACK_STATE_PAUSED: scala.Double = js.native
  /**
  		 * Video is being played.
  		 */
  val VIDEO_PLAYBACK_STATE_PLAYING: scala.Double = js.native
  /**
  		 * Video playback is rewinding.
  		 */
  val VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD: scala.Double = js.native
  /**
  		 * Video playback is seeking forward.
  		 */
  val VIDEO_PLAYBACK_STATE_SEEKING_FORWARD: scala.Double = js.native
  /**
  		 * Video playback is stopped.
  		 */
  val VIDEO_PLAYBACK_STATE_STOPPED: scala.Double = js.native
  /**
  		 * Constant for disabling repeat on video playback.
  		 */
  val VIDEO_REPEAT_MODE_NONE: scala.Double = js.native
  /**
  		 * Constant for repeating one video (i.e., the one video will repeat constantly) during playback.
  		 */
  val VIDEO_REPEAT_MODE_ONE: scala.Double = js.native
  /**
  		 * Scale video to fill the screen, clipping edges if necessary.
  		 */
  val VIDEO_SCALING_ASPECT_FILL: scala.Double = js.native
  /**
  		 * Scale video to fit the screen, letterboxing if necessary.
  		 */
  val VIDEO_SCALING_ASPECT_FIT: scala.Double = js.native
  /**
  		 * Video is scaled until both dimensions fit the screen exactly, stretching if necessary.
  		 */
  val VIDEO_SCALING_MODE_FILL: scala.Double = js.native
  /**
  		 * Video scaling is disabled.
  		 */
  val VIDEO_SCALING_NONE: scala.Double = js.native
  /**
  		 * Specifies that the video should be stretched to fill the bounds of layer.
  		 */
  val VIDEO_SCALING_RESIZE: java.lang.String = js.native
  /**
  		 * Specifies that the player should preserve the aspect ratio of video and fit the video within the bounds of layer.
  		 */
  val VIDEO_SCALING_RESIZE_ASPECT: java.lang.String = js.native
  /**
  		 * Specifies that the player should preserve the aspect ratio of video and fill the bounds of layer.
  		 */
  val VIDEO_SCALING_RESIZE_ASPECT_FILL: java.lang.String = js.native
  /**
  		 * Video source type is a file.
  		 */
  val VIDEO_SOURCE_TYPE_FILE: scala.Double = js.native
  /**
  		 * Video source type is a remote stream.
  		 */
  val VIDEO_SOURCE_TYPE_STREAMING: scala.Double = js.native
  /**
  		 * Video source type is unknown.
  		 */
  val VIDEO_SOURCE_TYPE_UNKNOWN: scala.Double = js.native
  /**
  		 * Use the closest sync (or key) frame at given the time.
  		 */
  val VIDEO_TIME_OPTION_CLOSEST_SYNC: scala.Double = js.native
  /**
  		 * Use the exact time.
  		 */
  val VIDEO_TIME_OPTION_EXACT: scala.Double = js.native
  /**
  		 * Use the closest keyframe in the time.
  		 */
  val VIDEO_TIME_OPTION_NEAREST_KEYFRAME: scala.Double = js.native
  /**
  		 * Use the sync (or key) frame located right after or at given the time.
  		 */
  val VIDEO_TIME_OPTION_NEXT_SYNC: scala.Double = js.native
  /**
  		 * Use the sync (or key) frame located right before or at given the time.
  		 */
  val VIDEO_TIME_OPTION_PREVIOUS_SYNC: scala.Double = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * An instance of <Titanium.Media.MusicPlayer> representing the app-specific music player.
  		 */
  val appMusicPlayer: titaniumLib.TitaniumNs.MediaNs.MusicPlayer = js.native
  /**
  		 * Returns the line type constant for the current line type.
  		 */
  val audioLineType: scala.Double = js.native
  /**
  		 * Returns `true` if the device is playing audio.
  		 */
  val audioPlaying: scala.Boolean = js.native
  /**
  		 * A constant for the audio session category to be used.
  		 */
  var audioSessionCategory: scala.Double = js.native
  /**
  		 * A constant for the audio session mode to be used.
  		 */
  var audioSessionMode: scala.Double = js.native
  /**
  		 * Array of media type constants supported for the camera.
  		 */
  var availableCameraMediaTypes: js.Array[_] = js.native
  /**
  		 * Array indicating which cameras are available, `CAMERA_FRONT`, `CAMERA_REAR` or both.
  		 */
  val availableCameras: js.Array[scala.Double] = js.native
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
  var averageMicrophonePower: scala.Double = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * Returns the authorization status for the camera.
  		 */
  val cameraAuthorization: scala.Double = js.native
  /**
  		 * Returns the authorization status for the camera.
  		 */
  val cameraAuthorizationStatus: scala.Double = js.native
  /**
  		 * Determines how the flash is fired when using the device's camera.
  		 */
  var cameraFlashMode: scala.Double = js.native
  /**
  		 * `true` if the device has a recording input device available.
  		 */
  val canRecord: scala.Boolean = js.native
  /**
  		 * Returns a description of the current route, consisting of zero or more input ports and zero or more output ports.
  		 */
  val currentRoute: RouteDescription = js.native
  /**
  		 * `true` if the device has camera support.
  		 */
  val isCameraSupported: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Current microphone level peak power in dB or -1 if microphone monitoring is disabled.
  		 */
  val peakMicrophonePower: scala.Double = js.native
  /**
  		 * An instance of <Titanium.Media.MusicPlayer> representing the system-wide music player.
  		 */
  val systemMusicPlayer: titaniumLib.TitaniumNs.MediaNs.MusicPlayer = js.native
  /**
  		 * Current volume of the playback device.
  		 */
  val volume: scala.Double = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Plays a device beep notification.
  		 */
  def beep(): scala.Unit = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.AudioPlayer>.
  		 */
  def createAudioPlayer(): titaniumLib.TitaniumNs.MediaNs.AudioPlayer = js.native
  def createAudioPlayer(parameters: js.Any): titaniumLib.TitaniumNs.MediaNs.AudioPlayer = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.AudioRecorder>.
  		 */
  def createAudioRecorder(): titaniumLib.TitaniumNs.MediaNs.AudioRecorder = js.native
  def createAudioRecorder(parameters: js.Any): titaniumLib.TitaniumNs.MediaNs.AudioRecorder = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.Sound>.
  		 */
  def createSound(): titaniumLib.TitaniumNs.MediaNs.Sound = js.native
  def createSound(parameters: js.Any): titaniumLib.TitaniumNs.MediaNs.Sound = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.SystemAlert>.
  		 */
  def createSystemAlert(): titaniumLib.TitaniumNs.MediaNs.SystemAlert = js.native
  def createSystemAlert(parameters: js.Any): titaniumLib.TitaniumNs.MediaNs.SystemAlert = js.native
  /**
  		 * Creates and returns an instance of <Titanium.Media.VideoPlayer>.
  		 */
  def createVideoPlayer(): titaniumLib.TitaniumNs.MediaNs.VideoPlayer = js.native
  def createVideoPlayer(parameters: js.Any): titaniumLib.TitaniumNs.MediaNs.VideoPlayer = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Media.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Media.appMusicPlayer> property.
  		 */
  def getAppMusicPlayer(): titaniumLib.TitaniumNs.MediaNs.MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioLineType> property.
  		 */
  def getAudioLineType(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioPlaying> property.
  		 */
  def getAudioPlaying(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioSessionCategory> property.
  		 */
  def getAudioSessionCategory(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.audioSessionMode> property.
  		 */
  def getAudioSessionMode(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 */
  def getAvailableCameraMediaTypes(): js.Array[_] = js.native
  /**
  		 * Gets the value of the <Titanium.Media.availableCameras> property.
  		 */
  def getAvailableCameras(): js.Array[scala.Double] = js.native
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
  def getAverageMicrophonePower(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraAuthorization> property.
  		 */
  def getCameraAuthorization(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraAuthorizationStatus> property.
  		 */
  def getCameraAuthorizationStatus(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.cameraFlashMode> property.
  		 */
  def getCameraFlashMode(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.canRecord> property.
  		 */
  def getCanRecord(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.currentRoute> property.
  		 */
  def getCurrentRoute(): RouteDescription = js.native
  /**
  		 * Gets the value of the <Titanium.Media.isCameraSupported> property.
  		 */
  def getIsCameraSupported(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Media.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Media.peakMicrophonePower> property.
  		 */
  def getPeakMicrophonePower(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_640x480> property.
  		 */
  def getQUALITY_640x480(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_1280x720> property.
  		 */
  def getQUALITY_IFRAME_1280x720(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.QUALITY_IFRAME_960x540> property.
  		 */
  def getQUALITY_IFRAME_960x540(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Media.systemMusicPlayer> property.
  		 */
  def getSystemMusicPlayer(): titaniumLib.TitaniumNs.MediaNs.MusicPlayer = js.native
  /**
  		 * Gets the value of the <Titanium.Media.volume> property.
  		 */
  def getVolume(): scala.Double = js.native
  /**
  		 * Returns `true` if the app has audio permissions.
  		 */
  def hasAudioPermissions(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has audio permissions.
  		 */
  def hasAudioRecorderPermissions(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has camera access.
  		 */
  def hasCameraPermissions(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has music library access.
  		 */
  def hasMusicLibraryPermissions(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has photo gallery permissions.
  		 */
  def hasPhotoGalleryPermissions(): scala.Boolean = js.native
  /**
  		 * Hides the device camera UI.
  		 */
  def hideCamera(): scala.Unit = js.native
  /**
  		 * Hides the music library.
  		 */
  def hideMusicLibrary(): scala.Unit = js.native
  /**
  		 * Returns `true` if the source supports the specified media type.
  		 */
  def isMediaTypeSupported(source: java.lang.String, `type`: java.lang.String): scala.Boolean = js.native
  /**
  		 * Shows the music library and allows the user to select one or more tracks.
  		 */
  def openMusicLibrary(options: MusicLibraryOptionsType): scala.Unit = js.native
  /**
  		 * Opens the photo gallery image picker.
  		 */
  def openPhotoGallery(options: PhotoGalleryOptionsType): scala.Unit = js.native
  /**
  		 * Displays the given image.
  		 */
  def previewImage(options: js.Any): scala.Unit = js.native
  /**
  		 * Searches the music library for items matching the specified search predicates.
  		 */
  def queryMusicLibrary(query: MediaQueryType): js.Array[titaniumLib.TitaniumNs.MediaNs.Item] = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAudioPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAudioRecorderPermissions(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Request the user's permission for audio recording.
  		 */
  def requestAuthorization(callback: js.Function1[/* param0 */ MediaAuthorizationResponse, _]): scala.Unit = js.native
  /**
  		 * Requests for camera access.
  		 */
  def requestCameraAccess(callback: js.Function1[/* param0 */ RequestCameraAccessResult, _]): scala.Unit = js.native
  /**
  		 * Requests for camera access.
  		 */
  def requestCameraPermissions(callback: js.Function1[/* param0 */ RequestCameraAccessResult, _]): scala.Unit = js.native
  /**
  		 * Request permissions for the native music-library.
  		 */
  def requestMusicLibraryPermissions(callback: js.Function1[/* param0 */ RequestMusicLibraryAccessResult, _]): scala.Unit = js.native
  /**
  		 * Requests for photo gallery permissions.
  		 */
  def requestPhotoGalleryPermissions(callback: js.Function1[/* param0 */ RequestPhotoGalleryAccessResult, _]): scala.Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def saveToPhotoGallery(media: titaniumLib.TitaniumNs.Blob, callbacks: js.Any): scala.Unit = js.native
  /**
  		 * Saves media to the device's photo gallery / camera roll.
  		 */
  def saveToPhotoGallery(media: titaniumLib.TitaniumNs.FilesystemNs.File, callbacks: js.Any): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.audioSessionCategory> property.
  		 */
  def setAudioSessionCategory(audioSessionCategory: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.audioSessionMode> property.
  		 */
  def setAudioSessionMode(audioSessionMode: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availableCameraMediaTypes> property.
  		 */
  def setAvailableCameraMediaTypes(availableCameraMediaTypes: js.Array[_]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoGalleryMediaTypes> property.
  		 */
  def setAvailablePhotoGalleryMediaTypes(availablePhotoGalleryMediaTypes: js.Array[_]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.availablePhotoMediaTypes> property.
  		 */
  def setAvailablePhotoMediaTypes(availablePhotoMediaTypes: js.Array[_]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.averageMicrophonePower> property.
  		 */
  def setAverageMicrophonePower(averageMicrophonePower: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.cameraFlashMode> property.
  		 */
  def setCameraFlashMode(cameraFlashMode: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Media.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Overrides the default audio route when using the <Titanium.Media.AUDIO_SESSION_CATEGORY_PLAY_AND_RECORD> session mode.
  		 */
  def setOverrideAudioRoute(route: scala.Double): scala.Unit = js.native
  /**
  		 * Shows the camera.
  		 */
  def showCamera(options: CameraOptionsType): scala.Unit = js.native
  /**
  		 * Starts monitoring the microphone sound level.
  		 */
  def startMicrophoneMonitor(): scala.Unit = js.native
  /**
  		 * Starts video capture using the camera specified.
  		 */
  def startVideoCapture(): scala.Unit = js.native
  /**
  		 * Stops monitoring the microphone sound level.
  		 */
  def stopMicrophoneMonitor(): scala.Unit = js.native
  /**
  		 * Stops video capture using the camera specified.
  		 */
  def stopVideoCapture(): scala.Unit = js.native
  /**
  		 * Switches between front and rear-facing cameras. Make sure to set one of the below constants to determine
  		 * the camera you want to switch to.
  		 */
  def switchCamera(camera: scala.Double): scala.Unit = js.native
  /**
  		 * Uses the device camera to capture a photo.
  		 */
  def takePicture(): scala.Unit = js.native
  /**
  		 * Takes a screen shot of the visible UI on the device.
  		 */
  def takeScreenshot(callback: js.Function1[/* param0 */ ScreenshotResult, _]): scala.Unit = js.native
  /**
  		 * Makes the device vibrate.
  		 */
  def vibrate(): scala.Unit = js.native
  def vibrate(pattern: js.Array[scala.Double]): scala.Unit = js.native
}

