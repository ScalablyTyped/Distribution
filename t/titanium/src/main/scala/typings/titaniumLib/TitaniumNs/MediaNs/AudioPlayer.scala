package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
		 */
trait AudioPlayer
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: scala.Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: scala.Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: scala.Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: scala.Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: scala.Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: scala.Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: scala.Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: scala.Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: scala.Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: scala.Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: scala.Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: scala.Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: scala.Double
  /**
  			 * Boolean to indicate if audio should continue playing even if the associated
  			 * Android [Activity](Titanium.Android.Activity) is paused.
  			 */
  var allowBackground: scala.Boolean
  /**
  			 * Indicates whether the player allows switching to "external playback" mode.
  			 */
  var allowsExternalPlayback: scala.Boolean
  /**
  			 * Focuses on the current audio player and stops other audio playing.
  			 */
  var audioFocus: scala.Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: scala.Double
  /**
  			 * Bit rate of the current playback stream.
  			 */
  var bitRate: scala.Double
  /**
  			 * Size of the buffer used for streaming, in milliseconds.
  			 */
  var bufferSize: scala.Double
  /**
  			 * Estimated duration in milliseconds of the file being played.
  			 */
  val duration: scala.Double
  /**
  			 * Indicates whether the player is currently playing video in "external playback" mode.
  			 */
  val externalPlaybackActive: scala.Boolean
  /**
  			 * Boolean indicating if the player is idle.
  			 */
  val idle: scala.Boolean
  /**
  			 * Indicates whether or not audio output of the player is muted.
  			 */
  var muted: scala.Boolean
  /**
  			 * Boolean indicating if audio playback is paused.
  			 */
  var paused: scala.Boolean
  /**
  			 * Boolean indicating if audio is currently playing.
  			 */
  val playing: scala.Boolean
  /**
  			 * Current playback progress, in milliseconds.
  			 */
  val progress: scala.Double
  /**
  			 * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a
  			 * desire to play at the natural rate of the current item. In addition, 2.0
  			 * would mean that the audio plays twice as fast.
  			 */
  var rate: scala.Double
  /**
  			 * Current state of playback, specified using one of the `STATE` constants defined on this object.
  			 */
  val state: scala.Double
  /**
  			 * Current playback position of the audio.
  			 */
  var time: scala.Double
  /**
  			 * URL for the audio stream.
  			 */
  var url: java.lang.String
  /**
  			 * Volume of the audio, from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: scala.Double
  /**
  			 * Boolean indicating if the playback is waiting for audio data from the network.
  			 */
  val waiting: scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def getAllowBackground(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def getAllowsExternalPlayback(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def getAudioFocus(): scala.Boolean
  /**
  			 * Returns the audio session id.
  			 */
  def getAudioSessionId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def getAudioType(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def getBitRate(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def getBufferSize(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.duration> property.
  			 */
  def getDuration(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.externalPlaybackActive> property.
  			 */
  def getExternalPlaybackActive(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.idle> property.
  			 */
  def getIdle(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def getMuted(): scala.Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def getPaused(): scala.Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def getPlaying(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.progress> property.
  			 */
  def getProgress(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def getRate(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.state> property.
  			 */
  def getState(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def getTime(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def getVolume(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.waiting> property.
  			 */
  def getWaiting(): scala.Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def isPaused(): scala.Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def isPlaying(): scala.Boolean
  /**
  			 * Pauses audio playback.
  			 */
  def pause(): scala.Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def play(): scala.Unit
  /**
  			 * Stops buffering audio data and releases audio resources.
  			 */
  def release(): scala.Unit
  /**
  			 * Restarts (stops and stars) audio playback.
  			 */
  def restart(): scala.Unit
  /**
  			 * Moves the playback cursor and invokes the specified block when the seek
  			 * operation has either been completed or been interrupted.
  			 */
  def seekToTime(time: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def setAllowBackground(allowBackground: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def setAllowsExternalPlayback(allowsExternalPlayback: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def setAudioFocus(audioFocus: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def setAudioType(audioType: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def setBitRate(bitRate: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def setBufferSize(bufferSize: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def setMuted(muted: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def setPaused(paused: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def setRate(rate: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def setTime(time: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def setVolume(volume: scala.Double): scala.Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def start(): scala.Unit
  /**
  			 * Converts a [state](Titanium.Media.AudioPlayer.state) value into a text description
  			 * suitable for display.
  			 */
  def stateDescription(state: scala.Double): java.lang.String
  /**
  			 * Stops audio playback.
  			 */
  def stop(): scala.Unit
}

object AudioPlayer {
  @scala.inline
  def apply(
    AUDIO_TYPE_ALARM: scala.Double,
    AUDIO_TYPE_MEDIA: scala.Double,
    AUDIO_TYPE_NOTIFICATION: scala.Double,
    AUDIO_TYPE_RING: scala.Double,
    AUDIO_TYPE_SIGNALLING: scala.Double,
    AUDIO_TYPE_VOICE: scala.Double,
    STATE_BUFFERING: scala.Double,
    STATE_INITIALIZED: scala.Double,
    STATE_PAUSED: scala.Double,
    STATE_PLAYING: scala.Double,
    STATE_STARTING: scala.Double,
    STATE_STOPPED: scala.Double,
    STATE_STOPPING: scala.Double,
    STATE_WAITING_FOR_DATA: scala.Double,
    STATE_WAITING_FOR_QUEUE: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    allowBackground: scala.Boolean,
    allowsExternalPlayback: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    audioFocus: scala.Boolean,
    audioType: scala.Double,
    bitRate: scala.Double,
    bubbleParent: scala.Boolean,
    bufferSize: scala.Double,
    duration: scala.Double,
    externalPlaybackActive: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getAllowBackground: js.Function0[scala.Boolean],
    getAllowsExternalPlayback: js.Function0[scala.Boolean],
    getApiName: js.Function0[java.lang.String],
    getAudioFocus: js.Function0[scala.Boolean],
    getAudioSessionId: js.Function0[scala.Double],
    getAudioType: js.Function0[scala.Double],
    getBitRate: js.Function0[scala.Double],
    getBubbleParent: js.Function0[scala.Boolean],
    getBufferSize: js.Function0[scala.Double],
    getDuration: js.Function0[scala.Double],
    getExternalPlaybackActive: js.Function0[scala.Boolean],
    getIdle: js.Function0[scala.Boolean],
    getMuted: js.Function0[scala.Boolean],
    getPaused: js.Function0[scala.Boolean],
    getPlaying: js.Function0[scala.Boolean],
    getProgress: js.Function0[scala.Double],
    getRate: js.Function0[scala.Double],
    getState: js.Function0[scala.Double],
    getTime: js.Function0[scala.Double],
    getUrl: js.Function0[java.lang.String],
    getVolume: js.Function0[scala.Double],
    getWaiting: js.Function0[scala.Boolean],
    idle: scala.Boolean,
    isPaused: js.Function0[scala.Boolean],
    isPlaying: js.Function0[scala.Boolean],
    muted: scala.Boolean,
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    play: js.Function0[scala.Unit],
    playing: scala.Boolean,
    progress: scala.Double,
    rate: scala.Double,
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    restart: js.Function0[scala.Unit],
    seekToTime: js.Function1[scala.Double, scala.Unit],
    setAllowBackground: js.Function1[scala.Boolean, scala.Unit],
    setAllowsExternalPlayback: js.Function1[scala.Boolean, scala.Unit],
    setAudioFocus: js.Function1[scala.Boolean, scala.Unit],
    setAudioType: js.Function1[scala.Double, scala.Unit],
    setBitRate: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setBufferSize: js.Function1[scala.Double, scala.Unit],
    setMuted: js.Function1[scala.Boolean, scala.Unit],
    setPaused: js.Function1[scala.Boolean, scala.Unit],
    setRate: js.Function1[scala.Double, scala.Unit],
    setTime: js.Function1[scala.Double, scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    setVolume: js.Function1[scala.Double, scala.Unit],
    start: js.Function0[scala.Unit],
    state: scala.Double,
    stateDescription: js.Function1[scala.Double, java.lang.String],
    stop: js.Function0[scala.Unit],
    time: scala.Double,
    url: java.lang.String,
    volume: scala.Double,
    waiting: scala.Boolean,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): AudioPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AUDIO_TYPE_ALARM")(AUDIO_TYPE_ALARM)
    __obj.updateDynamic("AUDIO_TYPE_MEDIA")(AUDIO_TYPE_MEDIA)
    __obj.updateDynamic("AUDIO_TYPE_NOTIFICATION")(AUDIO_TYPE_NOTIFICATION)
    __obj.updateDynamic("AUDIO_TYPE_RING")(AUDIO_TYPE_RING)
    __obj.updateDynamic("AUDIO_TYPE_SIGNALLING")(AUDIO_TYPE_SIGNALLING)
    __obj.updateDynamic("AUDIO_TYPE_VOICE")(AUDIO_TYPE_VOICE)
    __obj.updateDynamic("STATE_BUFFERING")(STATE_BUFFERING)
    __obj.updateDynamic("STATE_INITIALIZED")(STATE_INITIALIZED)
    __obj.updateDynamic("STATE_PAUSED")(STATE_PAUSED)
    __obj.updateDynamic("STATE_PLAYING")(STATE_PLAYING)
    __obj.updateDynamic("STATE_STARTING")(STATE_STARTING)
    __obj.updateDynamic("STATE_STOPPED")(STATE_STOPPED)
    __obj.updateDynamic("STATE_STOPPING")(STATE_STOPPING)
    __obj.updateDynamic("STATE_WAITING_FOR_DATA")(STATE_WAITING_FOR_DATA)
    __obj.updateDynamic("STATE_WAITING_FOR_QUEUE")(STATE_WAITING_FOR_QUEUE)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("allowBackground")(allowBackground)
    __obj.updateDynamic("allowsExternalPlayback")(allowsExternalPlayback)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("audioFocus")(audioFocus)
    __obj.updateDynamic("audioType")(audioType)
    __obj.updateDynamic("bitRate")(bitRate)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("bufferSize")(bufferSize)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("externalPlaybackActive")(externalPlaybackActive)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getAllowBackground")(getAllowBackground)
    __obj.updateDynamic("getAllowsExternalPlayback")(getAllowsExternalPlayback)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getAudioFocus")(getAudioFocus)
    __obj.updateDynamic("getAudioSessionId")(getAudioSessionId)
    __obj.updateDynamic("getAudioType")(getAudioType)
    __obj.updateDynamic("getBitRate")(getBitRate)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getBufferSize")(getBufferSize)
    __obj.updateDynamic("getDuration")(getDuration)
    __obj.updateDynamic("getExternalPlaybackActive")(getExternalPlaybackActive)
    __obj.updateDynamic("getIdle")(getIdle)
    __obj.updateDynamic("getMuted")(getMuted)
    __obj.updateDynamic("getPaused")(getPaused)
    __obj.updateDynamic("getPlaying")(getPlaying)
    __obj.updateDynamic("getProgress")(getProgress)
    __obj.updateDynamic("getRate")(getRate)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("getVolume")(getVolume)
    __obj.updateDynamic("getWaiting")(getWaiting)
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("isPaused")(isPaused)
    __obj.updateDynamic("isPlaying")(isPlaying)
    __obj.updateDynamic("muted")(muted)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playing")(playing)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("rate")(rate)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("restart")(restart)
    __obj.updateDynamic("seekToTime")(seekToTime)
    __obj.updateDynamic("setAllowBackground")(setAllowBackground)
    __obj.updateDynamic("setAllowsExternalPlayback")(setAllowsExternalPlayback)
    __obj.updateDynamic("setAudioFocus")(setAudioFocus)
    __obj.updateDynamic("setAudioType")(setAudioType)
    __obj.updateDynamic("setBitRate")(setBitRate)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setBufferSize")(setBufferSize)
    __obj.updateDynamic("setMuted")(setMuted)
    __obj.updateDynamic("setPaused")(setPaused)
    __obj.updateDynamic("setRate")(setRate)
    __obj.updateDynamic("setTime")(setTime)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.updateDynamic("setVolume")(setVolume)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("stateDescription")(stateDescription)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("volume")(volume)
    __obj.updateDynamic("waiting")(waiting)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AudioPlayer]
  }
}

