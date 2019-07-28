package typings.titanium.TitaniumNs.MediaNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
		 */
trait AudioPlayer extends Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: Double
  /**
  			 * Boolean to indicate if audio should continue playing even if the associated
  			 * Android [Activity](Titanium.Android.Activity) is paused.
  			 */
  var allowBackground: Boolean
  /**
  			 * Indicates whether the player allows switching to "external playback" mode.
  			 */
  var allowsExternalPlayback: Boolean
  /**
  			 * Focuses on the current audio player and stops other audio playing.
  			 */
  var audioFocus: Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double
  /**
  			 * Bit rate of the current playback stream.
  			 */
  var bitRate: Double
  /**
  			 * Size of the buffer used for streaming, in milliseconds.
  			 */
  var bufferSize: Double
  /**
  			 * Estimated duration in milliseconds of the file being played.
  			 */
  val duration: Double
  /**
  			 * Indicates whether the player is currently playing video in "external playback" mode.
  			 */
  val externalPlaybackActive: Boolean
  /**
  			 * Boolean indicating if the player is idle.
  			 */
  val idle: Boolean
  /**
  			 * Indicates whether or not audio output of the player is muted.
  			 */
  var muted: Boolean
  /**
  			 * Boolean indicating if audio playback is paused.
  			 */
  var paused: Boolean
  /**
  			 * Boolean indicating if audio is currently playing.
  			 */
  val playing: Boolean
  /**
  			 * Current playback progress, in milliseconds.
  			 */
  val progress: Double
  /**
  			 * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a
  			 * desire to play at the natural rate of the current item. In addition, 2.0
  			 * would mean that the audio plays twice as fast.
  			 */
  var rate: Double
  /**
  			 * Current state of playback, specified using one of the `STATE` constants defined on this object.
  			 */
  val state: Double
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double
  /**
  			 * URL for the audio stream.
  			 */
  var url: String
  /**
  			 * Volume of the audio, from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double
  /**
  			 * Boolean indicating if the playback is waiting for audio data from the network.
  			 */
  val waiting: Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def getAllowBackground(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def getAllowsExternalPlayback(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def getAudioFocus(): Boolean
  /**
  			 * Returns the audio session id.
  			 */
  def getAudioSessionId(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def getAudioType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def getBitRate(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def getBufferSize(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.externalPlaybackActive> property.
  			 */
  def getExternalPlaybackActive(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.idle> property.
  			 */
  def getIdle(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def getMuted(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def getPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def getPlaying(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.progress> property.
  			 */
  def getProgress(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def getRate(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.state> property.
  			 */
  def getState(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def getTime(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def getVolume(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.waiting> property.
  			 */
  def getWaiting(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def isPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def isPlaying(): Boolean
  /**
  			 * Pauses audio playback.
  			 */
  def pause(): Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def play(): Unit
  /**
  			 * Stops buffering audio data and releases audio resources.
  			 */
  def release(): Unit
  /**
  			 * Restarts (stops and stars) audio playback.
  			 */
  def restart(): Unit
  /**
  			 * Moves the playback cursor and invokes the specified block when the seek
  			 * operation has either been completed or been interrupted.
  			 */
  def seekToTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def setAllowBackground(allowBackground: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def setAllowsExternalPlayback(allowsExternalPlayback: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def setAudioFocus(audioFocus: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def setAudioType(audioType: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def setBitRate(bitRate: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def setBufferSize(bufferSize: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def setMuted(muted: Boolean): Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def setPaused(paused: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def setRate(rate: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def setTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def setUrl(url: String): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def setVolume(volume: Double): Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def start(): Unit
  /**
  			 * Converts a [state](Titanium.Media.AudioPlayer.state) value into a text description
  			 * suitable for display.
  			 */
  def stateDescription(state: Double): String
  /**
  			 * Stops audio playback.
  			 */
  def stop(): Unit
}

object AudioPlayer {
  @scala.inline
  def apply(
    AUDIO_TYPE_ALARM: Double,
    AUDIO_TYPE_MEDIA: Double,
    AUDIO_TYPE_NOTIFICATION: Double,
    AUDIO_TYPE_RING: Double,
    AUDIO_TYPE_SIGNALLING: Double,
    AUDIO_TYPE_VOICE: Double,
    STATE_BUFFERING: Double,
    STATE_INITIALIZED: Double,
    STATE_PAUSED: Double,
    STATE_PLAYING: Double,
    STATE_STARTING: Double,
    STATE_STOPPED: Double,
    STATE_STOPPING: Double,
    STATE_WAITING_FOR_DATA: Double,
    STATE_WAITING_FOR_QUEUE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    allowBackground: Boolean,
    allowsExternalPlayback: Boolean,
    apiName: String,
    applyProperties: js.Any => Unit,
    audioFocus: Boolean,
    audioType: Double,
    bitRate: Double,
    bubbleParent: Boolean,
    bufferSize: Double,
    duration: Double,
    externalPlaybackActive: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getAllowBackground: () => Boolean,
    getAllowsExternalPlayback: () => Boolean,
    getApiName: () => String,
    getAudioFocus: () => Boolean,
    getAudioSessionId: () => Double,
    getAudioType: () => Double,
    getBitRate: () => Double,
    getBubbleParent: () => Boolean,
    getBufferSize: () => Double,
    getDuration: () => Double,
    getExternalPlaybackActive: () => Boolean,
    getIdle: () => Boolean,
    getMuted: () => Boolean,
    getPaused: () => Boolean,
    getPlaying: () => Boolean,
    getProgress: () => Double,
    getRate: () => Double,
    getState: () => Double,
    getTime: () => Double,
    getUrl: () => String,
    getVolume: () => Double,
    getWaiting: () => Boolean,
    idle: Boolean,
    isPaused: () => Boolean,
    isPlaying: () => Boolean,
    muted: Boolean,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    playing: Boolean,
    progress: Double,
    rate: Double,
    release: () => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    restart: () => Unit,
    seekToTime: Double => Unit,
    setAllowBackground: Boolean => Unit,
    setAllowsExternalPlayback: Boolean => Unit,
    setAudioFocus: Boolean => Unit,
    setAudioType: Double => Unit,
    setBitRate: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setBufferSize: Double => Unit,
    setMuted: Boolean => Unit,
    setPaused: Boolean => Unit,
    setRate: Double => Unit,
    setTime: Double => Unit,
    setUrl: String => Unit,
    setVolume: Double => Unit,
    start: () => Unit,
    state: Double,
    stateDescription: Double => String,
    stop: () => Unit,
    time: Double,
    url: String,
    volume: Double,
    waiting: Boolean,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AudioPlayer = {
    val __obj = js.Dynamic.literal(AUDIO_TYPE_ALARM = AUDIO_TYPE_ALARM, AUDIO_TYPE_MEDIA = AUDIO_TYPE_MEDIA, AUDIO_TYPE_NOTIFICATION = AUDIO_TYPE_NOTIFICATION, AUDIO_TYPE_RING = AUDIO_TYPE_RING, AUDIO_TYPE_SIGNALLING = AUDIO_TYPE_SIGNALLING, AUDIO_TYPE_VOICE = AUDIO_TYPE_VOICE, STATE_BUFFERING = STATE_BUFFERING, STATE_INITIALIZED = STATE_INITIALIZED, STATE_PAUSED = STATE_PAUSED, STATE_PLAYING = STATE_PLAYING, STATE_STARTING = STATE_STARTING, STATE_STOPPED = STATE_STOPPED, STATE_STOPPING = STATE_STOPPING, STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA, STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE, addEventListener = js.Any.fromFunction2(addEventListener), allowBackground = allowBackground, allowsExternalPlayback = allowsExternalPlayback, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), audioFocus = audioFocus, audioType = audioType, bitRate = bitRate, bubbleParent = bubbleParent, bufferSize = bufferSize, duration = duration, externalPlaybackActive = externalPlaybackActive, fireEvent = js.Any.fromFunction2(fireEvent), getAllowBackground = js.Any.fromFunction0(getAllowBackground), getAllowsExternalPlayback = js.Any.fromFunction0(getAllowsExternalPlayback), getApiName = js.Any.fromFunction0(getApiName), getAudioFocus = js.Any.fromFunction0(getAudioFocus), getAudioSessionId = js.Any.fromFunction0(getAudioSessionId), getAudioType = js.Any.fromFunction0(getAudioType), getBitRate = js.Any.fromFunction0(getBitRate), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getBufferSize = js.Any.fromFunction0(getBufferSize), getDuration = js.Any.fromFunction0(getDuration), getExternalPlaybackActive = js.Any.fromFunction0(getExternalPlaybackActive), getIdle = js.Any.fromFunction0(getIdle), getMuted = js.Any.fromFunction0(getMuted), getPaused = js.Any.fromFunction0(getPaused), getPlaying = js.Any.fromFunction0(getPlaying), getProgress = js.Any.fromFunction0(getProgress), getRate = js.Any.fromFunction0(getRate), getState = js.Any.fromFunction0(getState), getTime = js.Any.fromFunction0(getTime), getUrl = js.Any.fromFunction0(getUrl), getVolume = js.Any.fromFunction0(getVolume), getWaiting = js.Any.fromFunction0(getWaiting), idle = idle, isPaused = js.Any.fromFunction0(isPaused), isPlaying = js.Any.fromFunction0(isPlaying), muted = muted, pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), playing = playing, progress = progress, rate = rate, release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction2(removeEventListener), restart = js.Any.fromFunction0(restart), seekToTime = js.Any.fromFunction1(seekToTime), setAllowBackground = js.Any.fromFunction1(setAllowBackground), setAllowsExternalPlayback = js.Any.fromFunction1(setAllowsExternalPlayback), setAudioFocus = js.Any.fromFunction1(setAudioFocus), setAudioType = js.Any.fromFunction1(setAudioType), setBitRate = js.Any.fromFunction1(setBitRate), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setBufferSize = js.Any.fromFunction1(setBufferSize), setMuted = js.Any.fromFunction1(setMuted), setPaused = js.Any.fromFunction1(setPaused), setRate = js.Any.fromFunction1(setRate), setTime = js.Any.fromFunction1(setTime), setUrl = js.Any.fromFunction1(setUrl), setVolume = js.Any.fromFunction1(setVolume), start = js.Any.fromFunction0(start), state = state, stateDescription = js.Any.fromFunction1(stateDescription), stop = js.Any.fromFunction0(stop), time = time, url = url, volume = volume, waiting = waiting)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AudioPlayer]
  }
}

