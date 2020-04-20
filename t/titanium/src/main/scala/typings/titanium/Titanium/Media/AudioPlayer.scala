package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.complete
import typings.titanium.titaniumStrings.error
import typings.titanium.titaniumStrings.metadata
import typings.titanium.titaniumStrings.seek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
		 */
@JSGlobal("Titanium.Media.AudioPlayer")
@js.native
class AudioPlayer () extends Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: Double = js.native
  /**
  			 * Audio data is being buffered from the network.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_BUFFERING](Titanium.Media.AUDIO_STATE_BUFFERING) instead.
  			 */
  val STATE_BUFFERING: Double = js.native
  /**
  			 * Audio playback is being initialized.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_INITIALIZED](Titanium.Media.AUDIO_STATE_INITIALIZED) instead.
  			 */
  val STATE_INITIALIZED: Double = js.native
  /**
  			 * Playback is paused.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_PAUSED](Titanium.Media.AUDIO_STATE_PAUSED) instead.
  			 */
  val STATE_PAUSED: Double = js.native
  /**
  			 * Audio playback is active.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_PLAYING](Titanium.Media.AUDIO_STATE_PLAYING) instead.
  			 */
  val STATE_PLAYING: Double = js.native
  /**
  			 * Audio playback is starting.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_STARTING](Titanium.Media.AUDIO_STATE_STARTING) instead.
  			 */
  val STATE_STARTING: Double = js.native
  /**
  			 * Audio playback is stopped.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_STOPPED](Titanium.Media.AUDIO_STATE_STOPPED) instead.
  			 */
  val STATE_STOPPED: Double = js.native
  /**
  			 * Audio playback is stopping.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_STOPPING](Titanium.Media.AUDIO_STATE_STOPPING) instead.
  			 */
  val STATE_STOPPING: Double = js.native
  /**
  			 * Player is waiting for audio data from the network.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_WAITING_FOR_DATA](Titanium.Media.AUDIO_STATE_WAITING_FOR_DATA) instead.
  			 */
  val STATE_WAITING_FOR_DATA: Double = js.native
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 * @deprecated Use [Titanium.Media.AUDIO_STATE_WAITING_FOR_QUEUE](Titanium.Media.AUDIO_STATE_WAITING_FOR_QUEUE) instead.
  			 */
  val STATE_WAITING_FOR_QUEUE: Double = js.native
  /**
  			 * Boolean to indicate if audio should continue playing even if the associated
  			 * Android [Activity](Titanium.Android.Activity) is paused.
  			 */
  var allowBackground: Boolean = js.native
  /**
  			 * Indicates whether the player allows switching to "external playback" mode.
  			 */
  var allowsExternalPlayback: Boolean = js.native
  /**
  			 * Focuses on the current audio player and stops other audio playing.
  			 */
  var audioFocus: Boolean = js.native
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double = js.native
  /**
  			 * Bit rate of the current playback stream.
  			 */
  var bitRate: Double = js.native
  /**
  			 * Size of the buffer used for streaming, in milliseconds.
  			 */
  var bufferSize: Double = js.native
  /**
  			 * Estimated duration in milliseconds of the file being played.
  			 */
  val duration: Double = js.native
  /**
  			 * Indicates whether the player is currently playing video in "external playback" mode.
  			 */
  val externalPlaybackActive: Boolean = js.native
  /**
  			 * Boolean indicating if the player is idle.
  			 */
  val idle: Boolean = js.native
  /**
  			 * Indicates whether or not audio output of the player is muted.
  			 */
  var muted: Boolean = js.native
  /**
  			 * Boolean indicating if audio playback is paused.
  			 */
  var paused: Boolean = js.native
  /**
  			 * Boolean indicating if audio is currently playing.
  			 */
  val playing: Boolean = js.native
  /**
  			 * Current playback progress, in milliseconds.
  			 */
  val progress: Double = js.native
  /**
  			 * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a
  			 * desire to play at the natural rate of the current item. In addition, 2.0
  			 * would mean that the audio plays twice as fast.
  			 */
  var rate: Double = js.native
  /**
  			 * Current state of playback, specified using one of the `STATE` constants defined on this object.
  			 */
  val state: Double = js.native
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double = js.native
  /**
  			 * URL for the audio stream.
  			 */
  var url: String = js.native
  /**
  			 * Volume of the audio, from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double = js.native
  /**
  			 * Boolean indicating if the playback is waiting for audio data from the network.
  			 */
  val waiting: Boolean = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerErrorEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_metadata(
    name: metadata,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerMetadataEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    name: typings.titanium.titaniumStrings.progress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerProgressEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seek(
    name: seek,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerSeekEvent, Unit]
  ): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: AudioPlayerChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete, event: AudioPlayerCompleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error, event: AudioPlayerErrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_metadata(name: metadata): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_metadata(name: metadata, event: AudioPlayerMetadataEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_progress(name: typings.titanium.titaniumStrings.progress): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_progress(name: typings.titanium.titaniumStrings.progress, event: AudioPlayerProgressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_seek(name: seek): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_seek(name: seek, event: AudioPlayerSeekEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.allowBackground> instead.
  			 */
  def getAllowBackground(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.allowsExternalPlayback> instead.
  			 */
  def getAllowsExternalPlayback(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.audioFocus> instead.
  			 */
  def getAudioFocus(): Boolean = js.native
  /**
  			 * Returns the audio session id.
  			 */
  def getAudioSessionId(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.audioType> instead.
  			 */
  def getAudioType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.bitRate> instead.
  			 */
  def getBitRate(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.bufferSize> instead.
  			 */
  def getBufferSize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.duration> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.duration> instead.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.externalPlaybackActive> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.externalPlaybackActive> instead.
  			 */
  def getExternalPlaybackActive(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.idle> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.idle> instead.
  			 */
  def getIdle(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.muted> instead.
  			 */
  def getMuted(): Boolean = js.native
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def getPaused(): Boolean = js.native
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def getPlaying(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.progress> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.progress> instead.
  			 */
  def getProgress(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.rate> instead.
  			 */
  def getRate(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.state> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.state> instead.
  			 */
  def getState(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.time> instead.
  			 */
  def getTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.url> instead.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.volume> instead.
  			 */
  def getVolume(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.waiting> property.
  			 * @deprecated Access <Titanium.Media.AudioPlayer.waiting> instead.
  			 */
  def getWaiting(): Boolean = js.native
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def isPaused(): Boolean = js.native
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def isPlaying(): Boolean = js.native
  /**
  			 * Pauses audio playback.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Starts or resumes audio playback.
  			 * @deprecated Use the cross-platform API [Titanium.Media.AudioPlayer.start](Titanium.Media.AudioPlayer.start) instead.
  			 */
  def play(): Unit = js.native
  /**
  			 * Stops buffering audio data and releases audio resources.
  			 */
  def release(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    name: error,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerErrorEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_metadata(
    name: metadata,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerMetadataEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    name: typings.titanium.titaniumStrings.progress,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerProgressEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seek(
    name: seek,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ AudioPlayerSeekEvent, Unit]
  ): Unit = js.native
  /**
  			 * Restarts (stops and stars) audio playback.
  			 */
  def restart(): Unit = js.native
  /**
  			 * Moves the playback cursor and invokes the specified block when the seek
  			 * operation has either been completed or been interrupted.
  			 */
  def seekToTime(time: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.allowBackground> instead.
  			 */
  def setAllowBackground(allowBackground: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.allowsExternalPlayback> instead.
  			 */
  def setAllowsExternalPlayback(allowsExternalPlayback: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.audioFocus> instead.
  			 */
  def setAudioFocus(audioFocus: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.audioType> instead.
  			 */
  def setAudioType(audioType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.bitRate> instead.
  			 */
  def setBitRate(bitRate: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.bufferSize> instead.
  			 */
  def setBufferSize(bufferSize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.muted> instead.
  			 */
  def setMuted(muted: Boolean): Unit = js.native
  /**
  			 * Sets the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 * @deprecated Use the cross-platform API [Titanium.Media.AudioPlayer.pause](Titanium.Media.AudioPlayer.pause) instead.
  			 */
  def setPaused(paused: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.rate> instead.
  			 */
  def setRate(rate: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.time> instead.
  			 */
  def setTime(time: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.url> instead.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 * @deprecated Set the value using <Titanium.Media.AudioPlayer.volume> instead.
  			 */
  def setVolume(volume: Double): Unit = js.native
  /**
  			 * Starts or resumes audio playback.
  			 */
  def start(): Unit = js.native
  /**
  			 * Converts a [state](Titanium.Media.AudioPlayer.state) value into a text description
  			 * suitable for display.
  			 */
  def stateDescription(state: Double): String = js.native
  /**
  			 * Stops audio playback.
  			 */
  def stop(): Unit = js.native
}

